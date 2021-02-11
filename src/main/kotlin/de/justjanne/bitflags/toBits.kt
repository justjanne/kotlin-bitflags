/*
 * Kotlin Bitflags
 *
 * Copyright (c) 2021 Janne Mareike Koschinski
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at https://mozilla.org/MPL/2.0/.
 */

package de.justjanne.bitflags

import kotlin.experimental.or

/**
 * Obtain the binary value of the bitfield
 * @return binary value
 */
@JvmName("toByteFlag")
fun Set<Flag<Byte>>?.toBits(): Byte = this?.fold(0.toByte()) { acc, el ->
  acc or el.value
} ?: 0.toByte()

/**
 * Obtain the binary value of the bitfield
 * @return binary value
 */
@ExperimentalUnsignedTypes
@JvmName("toUByteFlag")
fun Set<Flag<UByte>>?.toBits(): UByte = this?.fold(0.toUByte()) { acc, el ->
  acc or el.value
} ?: 0.toUByte()

/**
 * Obtain the binary value of the bitfield
 * @return binary value
 */
@JvmName("toShortFlag")
fun Set<Flag<Short>>?.toBits(): Short = this?.fold(0.toShort()) { acc, el ->
  acc or el.value
} ?: 0.toShort()

/**
 * Obtain the binary value of the bitfield
 * @return binary value
 */
@ExperimentalUnsignedTypes
@JvmName("toUShortFlag")
fun Set<Flag<UShort>>?.toBits(): UShort = this?.fold(0.toUShort()) { acc, el ->
  acc or el.value
} ?: 0.toUShort()

/**
 * Obtain the binary value of the bitfield
 * @return binary value
 */
@JvmName("toIntFlag")
fun Set<Flag<Int>>?.toBits(): Int = this?.fold(0) { acc, el ->
  acc or el.value
} ?: 0

/**
 * Obtain the binary value of the bitfield
 * @return binary value
 */
@ExperimentalUnsignedTypes
@JvmName("toUIntFlag")
fun Set<Flag<UInt>>?.toBits(): UInt = this?.fold(0.toUInt()) { acc, el ->
  acc or el.value
} ?: 0u

/**
 * Obtain the binary value of the bitfield
 * @return binary value
 */
@JvmName("toLongFlag")
fun Set<Flag<Long>>?.toBits(): Long = this?.fold(0.toLong()) { acc, el ->
  acc or el.value
} ?: 0L

/**
 * Obtain the binary value of the bitfield
 * @return binary value
 */
@ExperimentalUnsignedTypes
@JvmName("toULongFlag")
fun Set<Flag<ULong>>?.toBits(): ULong = this?.fold(0.toULong()) { acc, el ->
  acc or el.value
} ?: 0uL
