/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.repositoryconnector.mapping.entities;

import org.odpi.egeria.connectors.ibm.igc.repositoryconnector.mapping.relationships.ContactThroughMapper_Team;
import org.odpi.egeria.connectors.ibm.igc.repositoryconnector.IGCOMRSRepositoryConnector;

/**
 * Defines the mapping to the OMRS "Team" entity.
 */
public class TeamMapper extends ReferenceableMapper {

    public TeamMapper(IGCOMRSRepositoryConnector igcomrsRepositoryConnector, String userId) {

        // Start by calling the superclass's constructor to initialise the Mapper
        super(
                igcomrsRepositoryConnector,
                "group",
                "Group",
                "Team",
                userId,
                null,
                false
        );

        // The list of properties that should be mapped
        addSimplePropertyMapping("principal_id", "name");
        addSimplePropertyMapping("group_name", "description");

        // The classes to use for mapping any relationships
        addRelationshipMapper(ContactThroughMapper_Team.getInstance());

    }

}
