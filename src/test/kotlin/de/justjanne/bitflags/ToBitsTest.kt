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

class ToBitsTest {
  @Test
  fun `treats null as none`() {
    val valueByte: Set<MessageFlagByte>? = null
    assertEquals(0, valueByte.toBits())

    val valueUByte: Set<MessageFlagUByte>? = null
    assertEquals(0u, valueUByte.toBits())

    val valueShort: Set<MessageFlagShort>? = null
    assertEquals(0, valueShort.toBits())

    val valueUShort: Set<MessageFlagUShort>? = null
    assertEquals(0u, valueUShort.toBits())

    val valueInt: Set<MessageFlagInt>? = null
    assertEquals(0, valueInt.toBits())

    val valueUInt: Set<MessageFlagUInt>? = null
    assertEquals(0u, valueUInt.toBits())

    val valueLong: Set<MessageFlagLong>? = null
    assertEquals(0, valueLong.toBits())

    val valueULong: Set<MessageFlagULong>? = null
    assertEquals(0u, valueULong.toBits())
  }

  @Test
  fun `contains all set bits`() {
    assertEquals(0x14, MessageFlagByte.of(MessageFlagByte.Redirected, MessageFlagByte.Backlog).toBits())
    assertEquals(0x14u, MessageFlagUByte.of(MessageFlagUByte.Redirected, MessageFlagUByte.Backlog).toBits())

    assertEquals(0x14, MessageFlagShort.of(MessageFlagShort.Redirected, MessageFlagShort.Backlog).toBits())
    assertEquals(0x14u, MessageFlagUShort.of(MessageFlagUShort.Redirected, MessageFlagUShort.Backlog).toBits())

    assertEquals(0x14, MessageFlagInt.of(MessageFlagInt.Redirected, MessageFlagInt.Backlog).toBits())
    assertEquals(0x14u, MessageFlagUInt.of(MessageFlagUInt.Redirected, MessageFlagUInt.Backlog).toBits())

    assertEquals(0x14, MessageFlagLong.of(MessageFlagLong.Redirected, MessageFlagLong.Backlog).toBits())
    assertEquals(0x14u, MessageFlagULong.of(MessageFlagULong.Redirected, MessageFlagULong.Backlog).toBits())
  }
}
