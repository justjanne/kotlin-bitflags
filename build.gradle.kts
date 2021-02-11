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

tasks.withType<KotlinCompile> {
  kotlinOptions {
    jvmTarget = "1.8"
    freeCompilerArgs = listOf(
      "-Xopt-in=kotlin.ExperimentalUnsignedTypes"
    )
  }
}

tasks {
  val sourcesJar by registering(Jar::class) {
    dependsOn(JavaPlugin.CLASSES_TASK_NAME)
    archiveClassifier.set("sources")
    from(sourceSets["main"].allSource)
  }

  val javadocJar by registering(Jar::class) {
    dependsOn("dokkaJavadoc")
    archiveClassifier.set("javadoc")
    from(javadoc)
  }

  artifacts {
    archives(sourcesJar)
    archives(javadocJar)
    archives(jar)
  }
}

publishing {
  publications {
    register<MavenPublication>("mavenJava") {
      from(components["java"])
      artifact(tasks["sourcesJar"])
      artifact(tasks["javadocJar"])

      groupId = "de.justjanne"
      artifactId = "kotlin-bitflags"
      version = "0.1.0"

      pom.withXml {
        asNode().apply {
          appendNode("description", "Simple Bitflags for Kotlin")
          appendNode("name", rootProject.name)
          appendNode("url", "https://git.kuschku.de/justJanne/kotlin-bitflags")
          appendNode("licenses").appendNode("license").apply {
            appendNode("name", "Mozilla Public License Version 2.0")
            appendNode("url", "https://www.mozilla.org/en-US/MPL/2.0/")
          }
          appendNode("developers").appendNode("developer").apply {
            appendNode("name", "Janne Mareike Koschinski")
            appendNode("email", "support@kuschku.de")
            appendNode("organizationUrl", "https://kuschku.de/")
          }
          appendNode("scm").apply {
            appendNode("connection", "scm:git:https://git.kuschku.de/justJanne/kotlin-bitflags.git")
            appendNode("developerConnection", "scm:git:ssh://git.kuschku.de:2222/justJanne/kotlin-bitflags.git")
            appendNode("url", "https://git.kuschku.de/justJanne/kotlin-bitflags")
          }
          appendNode("properties").apply {
            appendNode("project.build.sourceEncoding", "UTF-8")
          }
        }
      }
    }
  }
}
