/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.repositoryconnector.mapping.relationships;

/**
 * Singleton to map the OMRS "ConnectionConnectorType" relationship between IGC "data_connection" and "connector" assets.
 */
public class ConnectionConnectorTypeMapper extends RelationshipMapping {

    private static class Singleton {
        private static final ConnectionConnectorTypeMapper INSTANCE = new ConnectionConnectorTypeMapper();
    }
    public static ConnectionConnectorTypeMapper getInstance() {
        return Singleton.INSTANCE;
    }

    private ConnectionConnectorTypeMapper() {
        super(
                "data_connection",
                "connector",
                "data_connectors",
                "data_connections",
                "ConnectionConnectorType",
                "connections",
                "connectorType"
        );
    }

}
