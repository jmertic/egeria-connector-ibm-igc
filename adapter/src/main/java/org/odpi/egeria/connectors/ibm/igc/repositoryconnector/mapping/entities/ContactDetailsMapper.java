/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.repositoryconnector.mapping.entities;

import org.odpi.egeria.connectors.ibm.igc.repositoryconnector.mapping.attributes.ContactMethodTypeMapper;
import org.odpi.egeria.connectors.ibm.igc.repositoryconnector.mapping.relationships.ContactThroughMapper_Team;
import org.odpi.egeria.connectors.ibm.igc.repositoryconnector.IGCOMRSMetadataCollection;
import org.odpi.egeria.connectors.ibm.igc.repositoryconnector.IGCOMRSRepositoryConnector;
import org.odpi.egeria.connectors.ibm.igc.repositoryconnector.mapping.relationships.ContactThroughMapper_Person;
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.EnumPropertyValue;
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.InstanceProperties;

/**
 * Defines the mapping to the OMRS "ContactDetails" entity.
 */
public class ContactDetailsMapper extends ReferenceableMapper {

    public static final String IGC_RID_PREFIX = IGCOMRSMetadataCollection.generateTypePrefix("CD");

    public ContactDetailsMapper(IGCOMRSRepositoryConnector igcomrsRepositoryConnector, String userId) {

        // Start by calling the superclass's constructor to initialise the Mapper
        super(
                igcomrsRepositoryConnector,
                "user",
                "User",
                "ContactDetails",
                userId,
                IGC_RID_PREFIX
        );
        addOtherIGCAssetType("group");

        // The list of properties that should be mapped (only email_address is common across both users and groups)
        addComplexIgcProperty("email_address");
        addComplexOmrsProperty("contactMethodType");
        addComplexOmrsProperty("contactMethodValue");

        // The list of relationships that should be mapped
        addRelationshipMapper(ContactThroughMapper_Team.getInstance());
        addRelationshipMapper(ContactThroughMapper_Person.getInstance());

    }

    /**
     * Implement any complex property mappings that cannot be simply mapped one-to-one.
     */
    @Override
    protected void complexPropertyMappings(InstanceProperties instanceProperties) {

        final String methodName = "complexPropertyMappings";

        // Set the email address as a contact method (only if there is one present)
        String emailAddress = (String) igcEntity.getPropertyByName("email_address");
        if (emailAddress != null && !emailAddress.equals("")) {
            EnumPropertyValue contactMethod = ContactMethodTypeMapper.getInstance().getEnumMappingByIgcValue("email");
            instanceProperties.setProperty("contactMethodType", contactMethod);
            instanceProperties = igcomrsRepositoryConnector.getRepositoryHelper().addStringPropertyToInstance(
                    igcomrsRepositoryConnector.getRepositoryName(),
                    instanceProperties,
                    "contactMethodValue",
                    emailAddress,
                    methodName
            );
        }

    }

}
