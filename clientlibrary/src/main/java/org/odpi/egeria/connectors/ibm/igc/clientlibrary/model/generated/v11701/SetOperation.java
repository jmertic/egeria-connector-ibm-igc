/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.generated.v11701;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.annotation.Generated;
import org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.common.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * POJO for the {@code set_operation} asset type in IGC, displayed as '{@literal Set Operation}' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@Generated("org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.IGCRestModelGenerator")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeName("set_operation")
public class SetOperation extends Reference {

    public static String getIgcTypeDisplayName() { return "Set Operation"; }

    /**
     * The {@code infoset} property, displayed as '{@literal InfoSet}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Infoset} object.
     */
    protected Reference infoset;

    /**
     * The {@code type} property, displayed as '{@literal Set Operation}' in the IGC UI.
     * <br><br>
     * Can be one of the following values:
     * <ul>
     *     <li>Union (displayed in the UI as 'Union')</li>
     *     <li>Intersection (displayed in the UI as 'Intersection')</li>
     *     <li>Difference (displayed in the UI as 'Difference')</li>
     *     <li>Subtraction (displayed in the UI as 'Subtraction')</li>
     * </ul>
     */
    protected String type;

    /**
     * The {@code primary_input} property, displayed as '{@literal Primary Input}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Infoset} object.
     */
    protected Reference primary_input;

    /**
     * The {@code secondary_input} property, displayed as '{@literal Secondary Input}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Infoset} object.
     */
    protected Reference secondary_input;

    /**
     * The {@code additional_inputs} property, displayed as '{@literal Additional Inputs}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Infoset} objects.
     */
    protected ReferenceList additional_inputs;

    /**
     * The {@code created_by} property, displayed as '{@literal Created By}' in the IGC UI.
     */
    protected String created_by;

    /**
     * The {@code created_on} property, displayed as '{@literal Created On}' in the IGC UI.
     */
    protected Date created_on;

    /**
     * The {@code modified_by} property, displayed as '{@literal Modified By}' in the IGC UI.
     */
    protected String modified_by;

    /**
     * The {@code modified_on} property, displayed as '{@literal Modified On}' in the IGC UI.
     */
    protected Date modified_on;


    /** @see #infoset */ @JsonProperty("infoset")  public Reference getInfoset() { return this.infoset; }
    /** @see #infoset */ @JsonProperty("infoset")  public void setInfoset(Reference infoset) { this.infoset = infoset; }

    /** @see #type */ @JsonProperty("type")  public String getTheType() { return this.type; }
    /** @see #type */ @JsonProperty("type")  public void setTheType(String type) { this.type = type; }

    /** @see #primary_input */ @JsonProperty("primary_input")  public Reference getPrimaryInput() { return this.primary_input; }
    /** @see #primary_input */ @JsonProperty("primary_input")  public void setPrimaryInput(Reference primary_input) { this.primary_input = primary_input; }

    /** @see #secondary_input */ @JsonProperty("secondary_input")  public Reference getSecondaryInput() { return this.secondary_input; }
    /** @see #secondary_input */ @JsonProperty("secondary_input")  public void setSecondaryInput(Reference secondary_input) { this.secondary_input = secondary_input; }

    /** @see #additional_inputs */ @JsonProperty("additional_inputs")  public ReferenceList getAdditionalInputs() { return this.additional_inputs; }
    /** @see #additional_inputs */ @JsonProperty("additional_inputs")  public void setAdditionalInputs(ReferenceList additional_inputs) { this.additional_inputs = additional_inputs; }

    /** @see #created_by */ @JsonProperty("created_by")  public String getCreatedBy() { return this.created_by; }
    /** @see #created_by */ @JsonProperty("created_by")  public void setCreatedBy(String created_by) { this.created_by = created_by; }

    /** @see #created_on */ @JsonProperty("created_on")  public Date getCreatedOn() { return this.created_on; }
    /** @see #created_on */ @JsonProperty("created_on")  public void setCreatedOn(Date created_on) { this.created_on = created_on; }

    /** @see #modified_by */ @JsonProperty("modified_by")  public String getModifiedBy() { return this.modified_by; }
    /** @see #modified_by */ @JsonProperty("modified_by")  public void setModifiedBy(String modified_by) { this.modified_by = modified_by; }

    /** @see #modified_on */ @JsonProperty("modified_on")  public Date getModifiedOn() { return this.modified_on; }
    /** @see #modified_on */ @JsonProperty("modified_on")  public void setModifiedOn(Date modified_on) { this.modified_on = modified_on; }

    public static Boolean canBeCreated() { return false; }
    public static Boolean includesModificationDetails() { return true; }
    private static final List<String> NON_RELATIONAL_PROPERTIES = Arrays.asList(
        "type",
        "created_by",
        "created_on",
        "modified_by",
        "modified_on"
    );
    private static final List<String> STRING_PROPERTIES = Arrays.asList(
        "created_by",
        "modified_by"
    );
    private static final List<String> PAGED_RELATIONAL_PROPERTIES = Arrays.asList(
        "additional_inputs"
    );
    private static final List<String> ALL_PROPERTIES = Arrays.asList(
        "infoset",
        "type",
        "primary_input",
        "secondary_input",
        "additional_inputs",
        "created_by",
        "created_on",
        "modified_by",
        "modified_on"
    );
    public static List<String> getNonRelationshipProperties() { return NON_RELATIONAL_PROPERTIES; }
    public static List<String> getStringProperties() { return STRING_PROPERTIES; }
    public static List<String> getPagedRelationshipProperties() { return PAGED_RELATIONAL_PROPERTIES; }
    public static List<String> getAllProperties() { return ALL_PROPERTIES; }
    public static Boolean isSetOperation(Object obj) { return (obj.getClass() == SetOperation.class); }

}
