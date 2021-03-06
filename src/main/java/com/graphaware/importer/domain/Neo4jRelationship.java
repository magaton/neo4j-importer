/*
 * Copyright (c) 2015 GraphAware
 *
 * This file is part of GraphAware Framework.
 *
 * GraphAware Framework is free software: you can redistribute it and/or modify it under the terms
 *  of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details. You should have received a copy of the
 * GNU General Public License along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.graphaware.importer.domain;

import java.util.Map;

/**
 * A relationship for the purposes of batch import.
 */
public interface Neo4jRelationship {

    /**
     * Get an identifier of the source node, typically a cache key.
     *
     * @return key.
     */
    Long sourceKey();

    /**
     * Get an identifier of the source node, typically a cache key.
     *
     * @return key.
     */
    Long targetKey();

    /**
     * Get the props of the relationship.
     *
     * @return props.
     */
    Map<String, Object> getProperties();

    /**
     * @return true iff directed.
     */
    boolean directed();
}
