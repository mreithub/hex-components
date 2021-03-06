/*
 * Hex - a hex viewer and annotator
 * Copyright (C) 2009-2014  Trejkaz, Hex Project
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.trypticon.hex.interpreters.strings;

import org.junit.Test;
import org.trypticon.hex.binary.Binary;
import org.trypticon.hex.binary.BinaryFactory;

import static org.junit.Assert.assertEquals;

/**
 * Tests for {@link BinaryStringInterpreter}.
 *
 * @author trejkaz
 */
public class BinaryStringInterpreterTest {
    @Test
    public void testInterpreting() throws Exception {
        Binary binary = BinaryFactory.wrap("This is a test".getBytes("UTF-8"));
        assertEquals("Wrong value interpreted", "This",
                     new BinaryStringInterpreter().interpret(binary, 0, 4).toString());
    }

    @Test
    public void testInterpretingOverNullTerminator() throws Exception {
        Binary binary = BinaryFactory.wrap("Th\0is is a test".getBytes("UTF-8"));
        assertEquals("Wrong value interpreted", "Th\0i",
                     new BinaryStringInterpreter().interpret(binary, 0, 4).toString());
    }
}
