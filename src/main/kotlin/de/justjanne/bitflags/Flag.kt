/*
 * Kotlin Bitflags
 * Copyright (c) 2021 Janne Mareike Koschinski
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at https://mozilla.org/MPL/2.0/.
 */

package de.justjanne.bitflags

/**
 * Interface for a single flag which can be part of a bitfield
 */
interface Flag<T> {
  /**
   * Binary value of the flag
   */
  val value: T
}
