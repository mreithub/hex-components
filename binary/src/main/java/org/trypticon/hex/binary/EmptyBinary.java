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

package org.trypticon.hex.binary;

import java.nio.ByteBuffer;

/**
 * A binary with 0 bytes of content.
 *
 * @author trejkaz
 */
public class EmptyBinary extends AbstractBinary {
    @Override
    public long length() {
        return 0;
    }

    @Override
    protected byte readSpi(long position) {
        throw new IllegalStateException("position should have been checked");
    }

    @Override
    protected void readSpi(long position, ByteBuffer buffer) {
        throw new IllegalStateException("range should have been checked");
    }
}
