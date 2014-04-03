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

package org.trypticon.hex.anno;

import java.util.Collections;
import java.util.List;

/**
 * An annotation collection with nothing in it.
 *
 * @author trejkaz
 */
public class EmptyAnnotationCollection extends AbstractAnnotationCollection {
    @Override
    public GroupAnnotation getRootGroup() {
        return new SimpleMutableGroupAnnotation(0, 1, null);
    }

    @Override
    public List<Annotation> getTopLevel() {
        return Collections.emptyList();
    }

    @Override
    public List<Annotation> getAnnotationPathAt(long position) {
        return null;
    }

    @Override
    public void add(Annotation annotation) throws OverlappingAnnotationException {

    }

    @Override
    public void remove(Annotation annotation) {

    }
}