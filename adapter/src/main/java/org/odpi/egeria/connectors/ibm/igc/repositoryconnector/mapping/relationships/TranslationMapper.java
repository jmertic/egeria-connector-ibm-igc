/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.repositoryconnector.mapping.relationships;

/**
 * Singleton to map the OMRS "Translation" relationship for IGC "term" assets.
 */
public class TranslationMapper extends RelationshipMapping {

    private static class Singleton {
        private static final TranslationMapper INSTANCE = new TranslationMapper();
    }
    public static TranslationMapper getInstance() {
        return Singleton.INSTANCE;
    }

    private static final String P_TRANSLATIONS = "translations";

    private TranslationMapper() {
        super(
                "term",
                "term",
                P_TRANSLATIONS,
                P_TRANSLATIONS,
                "Translation",
                P_TRANSLATIONS,
                P_TRANSLATIONS
        );
    }

}
