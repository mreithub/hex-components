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

package org.trypticon.hex.interpreters.primitives.signed;

import org.trypticon.hex.binary.Binary;
import org.trypticon.hex.interpreters.AbstractFixedLengthInterpreter;
import org.trypticon.hex.interpreters.primitives.BigEndian;

/**
 * Interpreter for signed int values.
 *
 * @author trejkaz
 */
public class SIntInterpreterBE extends AbstractFixedLengthInterpreter<SInt> {
    public SIntInterpreterBE() {
        super(SInt.class, 4);
    }

    @Override
    public SInt interpret(Binary binary, long position) {
        return new SInt(BigEndian.getInt(binary, position));
    }

    @Override
    public boolean equals(Object o) {
        return o == this || o instanceof SIntInterpreterBE;
    }

    @Override
    public int hashCode() {
        return 100321;
    }

    @Override
    public String toString() {
        return "sint4be";
    }
}
