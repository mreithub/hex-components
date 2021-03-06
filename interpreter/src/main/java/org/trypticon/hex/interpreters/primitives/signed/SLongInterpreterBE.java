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
 * Interpreter for signed long values.
 *
 * @author trejkaz
 */
public class SLongInterpreterBE extends AbstractFixedLengthInterpreter<SLong> {
    public SLongInterpreterBE() {
        super(SLong.class, 8);
    }

    @Override
    public Class<SLong> getType() {
        return SLong.class;
    }

    @Override
    public SLong interpret(Binary binary, long position) {
        return new SLong(BigEndian.getLong(binary, position));
    }

    @Override
    public boolean equals(Object o) {
        return o == this || o instanceof SLongInterpreterBE;
    }

    @Override
    public int hashCode() {
        return 100641;
    }

    @Override
    public String toString() {
        return "sint8be";
    }
}
