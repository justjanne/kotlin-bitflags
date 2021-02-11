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
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ValidValuesTest {
  @Test
  fun `contains known good values`() {
    assertTrue(MessageFlagByte.validValues().contains(MessageFlagByte.Self))
    assertTrue(MessageFlagByte.validValues().contains(MessageFlagByte.Highlight))
    assertTrue(MessageFlagByte.validValues().contains(MessageFlagByte.ServerMsg))
    assertTrue(MessageFlagByte.validValues().contains(MessageFlagByte.Redirected))
    assertTrue(MessageFlagByte.validValues().contains(MessageFlagByte.Backlog))

    assertTrue(MessageFlagUByte.validValues().contains(MessageFlagUByte.Self))
    assertTrue(MessageFlagUByte.validValues().contains(MessageFlagUByte.Highlight))
    assertTrue(MessageFlagUByte.validValues().contains(MessageFlagUByte.ServerMsg))
    assertTrue(MessageFlagUByte.validValues().contains(MessageFlagUByte.Redirected))
    assertTrue(MessageFlagUByte.validValues().contains(MessageFlagUByte.Backlog))

    assertTrue(MessageFlagShort.validValues().contains(MessageFlagShort.Self))
    assertTrue(MessageFlagShort.validValues().contains(MessageFlagShort.Highlight))
    assertTrue(MessageFlagShort.validValues().contains(MessageFlagShort.ServerMsg))
    assertTrue(MessageFlagShort.validValues().contains(MessageFlagShort.Redirected))
    assertTrue(MessageFlagShort.validValues().contains(MessageFlagShort.Backlog))

    assertTrue(MessageFlagUShort.validValues().contains(MessageFlagUShort.Self))
    assertTrue(MessageFlagUShort.validValues().contains(MessageFlagUShort.Highlight))
    assertTrue(MessageFlagUShort.validValues().contains(MessageFlagUShort.ServerMsg))
    assertTrue(MessageFlagUShort.validValues().contains(MessageFlagUShort.Redirected))
    assertTrue(MessageFlagUShort.validValues().contains(MessageFlagUShort.Backlog))

    assertTrue(MessageFlagInt.validValues().contains(MessageFlagInt.Self))
    assertTrue(MessageFlagInt.validValues().contains(MessageFlagInt.Highlight))
    assertTrue(MessageFlagInt.validValues().contains(MessageFlagInt.ServerMsg))
    assertTrue(MessageFlagInt.validValues().contains(MessageFlagInt.Redirected))
    assertTrue(MessageFlagInt.validValues().contains(MessageFlagInt.Backlog))

    assertTrue(MessageFlagUInt.validValues().contains(MessageFlagUInt.Self))
    assertTrue(MessageFlagUInt.validValues().contains(MessageFlagUInt.Highlight))
    assertTrue(MessageFlagUInt.validValues().contains(MessageFlagUInt.ServerMsg))
    assertTrue(MessageFlagUInt.validValues().contains(MessageFlagUInt.Redirected))
    assertTrue(MessageFlagUInt.validValues().contains(MessageFlagUInt.Backlog))

    assertTrue(MessageFlagLong.validValues().contains(MessageFlagLong.Self))
    assertTrue(MessageFlagLong.validValues().contains(MessageFlagLong.Highlight))
    assertTrue(MessageFlagLong.validValues().contains(MessageFlagLong.ServerMsg))
    assertTrue(MessageFlagLong.validValues().contains(MessageFlagLong.Redirected))
    assertTrue(MessageFlagLong.validValues().contains(MessageFlagLong.Backlog))

    assertTrue(MessageFlagULong.validValues().contains(MessageFlagULong.Self))
    assertTrue(MessageFlagULong.validValues().contains(MessageFlagULong.Highlight))
    assertTrue(MessageFlagULong.validValues().contains(MessageFlagULong.ServerMsg))
    assertTrue(MessageFlagULong.validValues().contains(MessageFlagULong.Redirected))
    assertTrue(MessageFlagULong.validValues().contains(MessageFlagULong.Backlog))
  }

  @Test
  fun `does not contain known bad values`() {
    assertFalse(MessageFlagByte.validValues().contains(MessageFlagByte.Unknown))
    assertFalse(MessageFlagUByte.validValues().contains(MessageFlagUByte.Unknown))

    assertFalse(MessageFlagByte.validValues().contains(MessageFlagByte.Unknown))
    assertFalse(MessageFlagUByte.validValues().contains(MessageFlagUByte.Unknown))

    assertFalse(MessageFlagShort.validValues().contains(MessageFlagShort.Unknown))
    assertFalse(MessageFlagUShort.validValues().contains(MessageFlagUShort.Unknown))

    assertFalse(MessageFlagShort.validValues().contains(MessageFlagShort.Unknown))
    assertFalse(MessageFlagUShort.validValues().contains(MessageFlagUShort.Unknown))

    assertFalse(MessageFlagInt.validValues().contains(MessageFlagInt.Unknown))
    assertFalse(MessageFlagUInt.validValues().contains(MessageFlagUInt.Unknown))

    assertFalse(MessageFlagInt.validValues().contains(MessageFlagInt.Unknown))
    assertFalse(MessageFlagUInt.validValues().contains(MessageFlagUInt.Unknown))

    assertFalse(MessageFlagLong.validValues().contains(MessageFlagLong.Unknown))
    assertFalse(MessageFlagULong.validValues().contains(MessageFlagULong.Unknown))

    assertFalse(MessageFlagLong.validValues().contains(MessageFlagLong.Unknown))
    assertFalse(MessageFlagULong.validValues().contains(MessageFlagULong.Unknown))
  }
}
