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
import java.util.EnumSet
import kotlin.test.assertEquals

class ToEnumSetTest {
  @Test
  fun `contains same values`() {
    val listByte = listOf(MessageFlagByte.Redirected, MessageFlagByte.Backlog)
    assertEquals(EnumSet.copyOf(listByte), listByte.toEnumSet())
    val arrayByte = arrayOf(MessageFlagByte.Redirected, MessageFlagByte.Backlog)
    assertEquals(EnumSet.copyOf(arrayByte.toList()), listByte.toEnumSet())

    val listUByte = listOf(MessageFlagUByte.Redirected, MessageFlagUByte.Backlog)
    assertEquals(EnumSet.copyOf(listUByte), listUByte.toEnumSet())
    val arrayUByte = arrayOf(MessageFlagUByte.Redirected, MessageFlagUByte.Backlog)
    assertEquals(EnumSet.copyOf(arrayUByte.toList()), listUByte.toEnumSet())

    val listShort = listOf(MessageFlagShort.Redirected, MessageFlagShort.Backlog)
    assertEquals(EnumSet.copyOf(listShort), listShort.toEnumSet())
    val arrayShort = arrayOf(MessageFlagShort.Redirected, MessageFlagShort.Backlog)
    assertEquals(EnumSet.copyOf(arrayShort.toList()), listShort.toEnumSet())

    val listUShort = listOf(MessageFlagUShort.Redirected, MessageFlagUShort.Backlog)
    assertEquals(EnumSet.copyOf(listUShort), listUShort.toEnumSet())
    val arrayUShort = arrayOf(MessageFlagUShort.Redirected, MessageFlagUShort.Backlog)
    assertEquals(EnumSet.copyOf(arrayUShort.toList()), listUShort.toEnumSet())

    val listInt = listOf(MessageFlagInt.Redirected, MessageFlagInt.Backlog)
    assertEquals(EnumSet.copyOf(listInt), listInt.toEnumSet())
    val arrayInt = arrayOf(MessageFlagInt.Redirected, MessageFlagInt.Backlog)
    assertEquals(EnumSet.copyOf(arrayInt.toList()), listInt.toEnumSet())

    val listUInt = listOf(MessageFlagUInt.Redirected, MessageFlagUInt.Backlog)
    assertEquals(EnumSet.copyOf(listUInt), listUInt.toEnumSet())
    val arrayUInt = arrayOf(MessageFlagUInt.Redirected, MessageFlagUInt.Backlog)
    assertEquals(EnumSet.copyOf(arrayUInt.toList()), listUInt.toEnumSet())

    val listLong = listOf(MessageFlagLong.Redirected, MessageFlagLong.Backlog)
    assertEquals(EnumSet.copyOf(listLong), listLong.toEnumSet())
    val arrayLong = arrayOf(MessageFlagLong.Redirected, MessageFlagLong.Backlog)
    assertEquals(EnumSet.copyOf(arrayLong.toList()), listLong.toEnumSet())

    val listULong = listOf(MessageFlagULong.Redirected, MessageFlagULong.Backlog)
    assertEquals(EnumSet.copyOf(listULong), listULong.toEnumSet())
    val arrayULong = arrayOf(MessageFlagULong.Redirected, MessageFlagULong.Backlog)
    assertEquals(EnumSet.copyOf(arrayULong.toList()), listULong.toEnumSet())
  }
}
