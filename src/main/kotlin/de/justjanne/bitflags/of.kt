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

/**
 * Construct a bitfield out of discrete flags
 * @return bitfield
 */
inline fun <reified T> Flags<*, T>.of(vararg values: T): EnumSet<T>
  where T : Flag<*>, T : Enum<T> = values.toEnumSet()

/**
 * Construct a bitfield out of a collection of flags
 * @return bitfield
 */
inline fun <reified T> Flags<*, T>.of(values: Collection<T>): EnumSet<T>
  where T : Flag<*>, T : Enum<T> = values.toEnumSet()
