/*
 * Kotlin Bitflags
 * Copyright (c) 2021 Janne Mareike Koschinski
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at https://mozilla.org/MPL/2.0/.
 */

package de.justjanne.bitflags.test

import de.justjanne.bitflags.Flag
import de.justjanne.bitflags.Flags
import de.justjanne.bitflags.toEnumSet

enum class MessageFlagInt(
  override val value: Int,
) : Flag<Int> {
  Unknown(0x00),
  Self(0x01),
  Highlight(0x02),
  Redirected(0x04),
  ServerMsg(0x08),
  Backlog(0x10);

  companion object : Flags<Int, MessageFlagInt> {
    override val all: Set<MessageFlagInt> = values().toEnumSet()
  }
}
