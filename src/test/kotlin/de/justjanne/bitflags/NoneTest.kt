/*
 * Kotlin Bitflags
 * Copyright (c) 2021 Janne Mareike Koschinski
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at https://mozilla.org/MPL/2.0/.
 */

package de.justjanne.bitflags

import de.justjanne.bitflags.test.MessageFlagByte
import de.justjanne.bitflags.test.MessageFlagInt
import de.justjanne.bitflags.test.MessageFlagLong
import de.justjanne.bitflags.test.MessageFlagShort
import de.justjanne.bitflags.test.MessageFlagUByte
import de.justjanne.bitflags.test.MessageFlagUInt
import de.justjanne.bitflags.test.MessageFlagULong
import de.justjanne.bitflags.test.MessageFlagUShort
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class NoneTest {
  @Test
  fun `has no set bits`() {
    assertEquals(0, MessageFlagByte.none().toBits())
    assertEquals(0u, MessageFlagUByte.none().toBits())
    assertEquals(0, MessageFlagShort.none().toBits())
    assertEquals(0u, MessageFlagUShort.none().toBits())
    assertEquals(0, MessageFlagInt.none().toBits())
    assertEquals(0u, MessageFlagUInt.none().toBits())
    assertEquals(0, MessageFlagLong.none().toBits())
    assertEquals(0u, MessageFlagULong.none().toBits())
  }

  @Test
  fun `has no entries`() {
    assertEquals(0, MessageFlagByte.none().size)
    assertEquals(0, MessageFlagUByte.none().size)
    assertEquals(0, MessageFlagShort.none().size)
    assertEquals(0, MessageFlagUShort.none().size)
    assertEquals(0, MessageFlagInt.none().size)
    assertEquals(0, MessageFlagUInt.none().size)
    assertEquals(0, MessageFlagLong.none().size)
    assertEquals(0, MessageFlagULong.none().size)
  }

  @Test
  fun `has no flag set`() {
    assertFalse(MessageFlagByte.none().contains(MessageFlagByte.Self))
    assertFalse(MessageFlagByte.none().contains(MessageFlagByte.Highlight))
    assertFalse(MessageFlagByte.none().contains(MessageFlagByte.ServerMsg))
    assertFalse(MessageFlagByte.none().contains(MessageFlagByte.Redirected))
    assertFalse(MessageFlagByte.none().contains(MessageFlagByte.Backlog))

    assertFalse(MessageFlagUByte.none().contains(MessageFlagUByte.Self))
    assertFalse(MessageFlagUByte.none().contains(MessageFlagUByte.Highlight))
    assertFalse(MessageFlagUByte.none().contains(MessageFlagUByte.ServerMsg))
    assertFalse(MessageFlagUByte.none().contains(MessageFlagUByte.Redirected))
    assertFalse(MessageFlagUByte.none().contains(MessageFlagUByte.Backlog))

    assertFalse(MessageFlagShort.none().contains(MessageFlagShort.Self))
    assertFalse(MessageFlagShort.none().contains(MessageFlagShort.Highlight))
    assertFalse(MessageFlagShort.none().contains(MessageFlagShort.ServerMsg))
    assertFalse(MessageFlagShort.none().contains(MessageFlagShort.Redirected))
    assertFalse(MessageFlagShort.none().contains(MessageFlagShort.Backlog))

    assertFalse(MessageFlagUShort.none().contains(MessageFlagUShort.Self))
    assertFalse(MessageFlagUShort.none().contains(MessageFlagUShort.Highlight))
    assertFalse(MessageFlagUShort.none().contains(MessageFlagUShort.ServerMsg))
    assertFalse(MessageFlagUShort.none().contains(MessageFlagUShort.Redirected))
    assertFalse(MessageFlagUShort.none().contains(MessageFlagUShort.Backlog))

    assertFalse(MessageFlagInt.none().contains(MessageFlagInt.Self))
    assertFalse(MessageFlagInt.none().contains(MessageFlagInt.Highlight))
    assertFalse(MessageFlagInt.none().contains(MessageFlagInt.ServerMsg))
    assertFalse(MessageFlagInt.none().contains(MessageFlagInt.Redirected))
    assertFalse(MessageFlagInt.none().contains(MessageFlagInt.Backlog))

    assertFalse(MessageFlagUInt.none().contains(MessageFlagUInt.Self))
    assertFalse(MessageFlagUInt.none().contains(MessageFlagUInt.Highlight))
    assertFalse(MessageFlagUInt.none().contains(MessageFlagUInt.ServerMsg))
    assertFalse(MessageFlagUInt.none().contains(MessageFlagUInt.Redirected))
    assertFalse(MessageFlagUInt.none().contains(MessageFlagUInt.Backlog))

    assertFalse(MessageFlagLong.none().contains(MessageFlagLong.Self))
    assertFalse(MessageFlagLong.none().contains(MessageFlagLong.Highlight))
    assertFalse(MessageFlagLong.none().contains(MessageFlagLong.ServerMsg))
    assertFalse(MessageFlagLong.none().contains(MessageFlagLong.Redirected))
    assertFalse(MessageFlagLong.none().contains(MessageFlagLong.Backlog))

    assertFalse(MessageFlagULong.none().contains(MessageFlagULong.Self))
    assertFalse(MessageFlagULong.none().contains(MessageFlagULong.Highlight))
    assertFalse(MessageFlagULong.none().contains(MessageFlagULong.ServerMsg))
    assertFalse(MessageFlagULong.none().contains(MessageFlagULong.Redirected))
    assertFalse(MessageFlagULong.none().contains(MessageFlagULong.Backlog))
  }
}
