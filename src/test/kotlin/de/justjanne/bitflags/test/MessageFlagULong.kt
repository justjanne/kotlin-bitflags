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

enum class MessageFlagULong(
  override val value: ULong,
) : Flag<ULong> {
  Unknown(0x00u),
  Self(0x01u),
  Highlight(0x02u),
  Redirected(0x04u),
  ServerMsg(0x08u),
  Backlog(0x10u);

  companion object : Flags<ULong, MessageFlagULong> {
    override val all: Set<MessageFlagULong> = values().toEnumSet()
  }
}
