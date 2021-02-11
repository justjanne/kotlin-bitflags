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

import java.util.EnumSet
import kotlin.experimental.and

/**
 * Construct a bitfield out of discrete flags
 * @return bitfield
 */
@Suppress("unused")
inline fun <reified T> Flags<*, T>.of(vararg values: T): EnumSet<T>
  where T : Flag<*>, T : Enum<T> = values.toEnumSet()

/**
 * Construct a bitfield out of a collection of flags
 * @return bitfield
 */
@Suppress("unused")
inline fun <reified T> Flags<*, T>.of(values: Collection<T>): EnumSet<T>
  where T : Flag<*>, T : Enum<T> = values.toEnumSet()

/**
 * Construct a bitfield out of a binary value
 * @return bitfield
 */
inline fun <reified T> Flags<Byte, T>.of(value: Byte?): EnumSet<T> where T : Flag<Byte>, T : Enum<T> {
  if (value == null) return emptyList<T>().toEnumSet()
  return all.filter { (value and it.value) != 0.toByte() }.toEnumSet()
}

/**
 * Construct a bitfield out of a binary value
 * @return bitfield
 */
@ExperimentalUnsignedTypes
inline fun <reified T> Flags<UByte, T>.of(value: UByte?): EnumSet<T> where T : Flag<UByte>, T : Enum<T> {
  if (value == null) return emptyList<T>().toEnumSet()
  return all.filter { (value and it.value) != 0.toUByte() }.toEnumSet()
}

/**
 * Construct a bitfield out of a binary value
 * @return bitfield
 */
inline fun <reified T> Flags<Short, T>.of(value: Short?): EnumSet<T> where T : Flag<Short>, T : Enum<T> {
  if (value == null) return emptyList<T>().toEnumSet()
  return all.filter { (value and it.value) != 0.toShort() }.toEnumSet()
}

/**
 * Construct a bitfield out of a binary value
 * @return bitfield
 */
@ExperimentalUnsignedTypes
inline fun <reified T> Flags<UShort, T>.of(value: UShort?): EnumSet<T> where T : Flag<UShort>, T : Enum<T> {
  if (value == null) return emptyList<T>().toEnumSet()
  return all.filter { (value and it.value) != 0.toUShort() }.toEnumSet()
}

/**
 * Construct a bitfield out of a binary value
 * @return bitfield
 */
inline fun <reified T> Flags<Int, T>.of(value: Int?): EnumSet<T> where T : Flag<Int>, T : Enum<T> {
  if (value == null) return emptyList<T>().toEnumSet()
  return all.filter { (value and it.value) != 0 }.toEnumSet()
}

/**
 * Construct a bitfield out of a binary value
 * @return bitfield
 */
@ExperimentalUnsignedTypes
inline fun <reified T> Flags<UInt, T>.of(value: UInt?): EnumSet<T> where T : Flag<UInt>, T : Enum<T> {
  if (value == null) return emptyList<T>().toEnumSet()
  return all.filter { (value and it.value) != 0u }.toEnumSet()
}

/**
 * Construct a bitfield out of a binary value
 * @return bitfield
 */
inline fun <reified T> Flags<Long, T>.of(value: Long?): EnumSet<T> where T : Flag<Long>, T : Enum<T> {
  if (value == null) return emptyList<T>().toEnumSet()
  return all.filter { (value and it.value) != 0L }.toEnumSet()
}

/**
 * Construct a bitfield out of a binary value
 * @return bitfield
 */
@ExperimentalUnsignedTypes
inline fun <reified T> Flags<ULong, T>.of(value: ULong?): EnumSet<T> where T : Flag<ULong>, T : Enum<T> {
  if (value == null) return emptyList<T>().toEnumSet()
  return all.filter { (value and it.value) != 0uL }.toEnumSet()
}
