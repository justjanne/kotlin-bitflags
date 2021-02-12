/*
 * Kotlin Bitflags
 *
 * Copyright (c) 2021 Janne Mareike Koschinski
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at https://mozilla.org/MPL/2.0/.
 */

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "1.4.21"
  id("org.jlleitschuh.gradle.ktlint") version "10.0.0"
  id("org.jetbrains.dokka") version "1.4.20"
  id("maven-publish")
  id("jacoco")
  id("com.vanniktech.maven.publish") version "0.13.0"
}

repositories {
  mavenCentral()
  exclusiveContent {
    forRepository {
      maven {
        name = "JCenter"
        setUrl("https://jcenter.bintray.com/")
      }
    }
    filter {
      // Required for Dokka
      includeModule("com.soywiz.korlibs.korte", "korte-jvm")
      includeModule("org.jetbrains.kotlinx", "kotlinx-html-jvm")
      includeGroup("org.jetbrains.dokka")
      includeModule("org.jetbrains", "markdown")
    }
  }
}

dependencies {
  testImplementation(kotlin("test-junit5"))

  val junit5Version: String by project
  testImplementation("org.junit.jupiter", "junit-jupiter-api", junit5Version)
  testRuntimeOnly("org.junit.jupiter", "junit-jupiter-engine", junit5Version)
}

tasks.test {
  useJUnitPlatform()
}

jacoco {
  toolVersion = "0.8.3"
}

tasks.getByName<JacocoReport>("jacocoTestReport") {
  reports {
    sourceDirectories.from(fileTree("src/main/kotlin"))
    xml.destination = File("$buildDir/reports/jacoco/report.xml")
    html.isEnabled = true
    xml.isEnabled = true
    csv.isEnabled = false
  }
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    jvmTarget = "1.8"
    freeCompilerArgs = listOf(
      "-Xopt-in=kotlin.ExperimentalUnsignedTypes"
    )
  }
}
