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
 * Function to obtain an empty bitfield for a certain flag type
 * @return empty bitfield
 */
@Suppress("unused")
inline fun <reified T> Flags<*, T>.none(): EnumSet<T>
  where T : Flag<*>, T : Enum<T> = EnumSet.noneOf(T::class.java)
