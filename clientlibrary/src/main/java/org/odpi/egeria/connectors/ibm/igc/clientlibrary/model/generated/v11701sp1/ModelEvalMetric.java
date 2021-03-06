/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.generated.v11701sp1;

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
 * POJO for the {@code model_eval_metric} asset type in IGC, displayed as '{@literal Model Eval Metric}' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@Generated("org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.IGCRestModelGenerator")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeName("model_eval_metric")
public class ModelEvalMetric extends Reference {

    public static String getIgcTypeDisplayName() { return "Model Eval Metric"; }

    /**
     * The {@code of_model} property, displayed as '{@literal Of Model}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link AnalyticsModel} object.
     */
    protected Reference of_model;

    /**
     * The {@code metric_type} property, displayed as '{@literal Metric Type}' in the IGC UI.
     */
    protected String metric_type;

    /**
     * The {@code value} property, displayed as '{@literal Value}' in the IGC UI.
     */
    protected String value;

    /**
     * The {@code eval_date} property, displayed as '{@literal Eval Date}' in the IGC UI.
     */
    protected Date eval_date;

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


    /** @see #of_model */ @JsonProperty("of_model")  public Reference getOfModel() { return this.of_model; }
    /** @see #of_model */ @JsonProperty("of_model")  public void setOfModel(Reference of_model) { this.of_model = of_model; }

    /** @see #metric_type */ @JsonProperty("metric_type")  public String getMetricType() { return this.metric_type; }
    /** @see #metric_type */ @JsonProperty("metric_type")  public void setMetricType(String metric_type) { this.metric_type = metric_type; }

    /** @see #value */ @JsonProperty("value")  public String getValue() { return this.value; }
    /** @see #value */ @JsonProperty("value")  public void setValue(String value) { this.value = value; }

    /** @see #eval_date */ @JsonProperty("eval_date")  public Date getEvalDate() { return this.eval_date; }
    /** @see #eval_date */ @JsonProperty("eval_date")  public void setEvalDate(Date eval_date) { this.eval_date = eval_date; }

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
        "metric_type",
        "value",
        "eval_date",
        "created_by",
        "created_on",
        "modified_by",
        "modified_on"
    );
    private static final List<String> STRING_PROPERTIES = Arrays.asList(
        "metric_type",
        "value",
        "created_by",
        "modified_by"
    );
    private static final List<String> PAGED_RELATIONAL_PROPERTIES = new ArrayList<>();
    private static final List<String> ALL_PROPERTIES = Arrays.asList(
        "of_model",
        "metric_type",
        "value",
        "eval_date",
        "created_by",
        "created_on",
        "modified_by",
        "modified_on"
    );
    public static List<String> getNonRelationshipProperties() { return NON_RELATIONAL_PROPERTIES; }
    public static List<String> getStringProperties() { return STRING_PROPERTIES; }
    public static List<String> getPagedRelationshipProperties() { return PAGED_RELATIONAL_PROPERTIES; }
    public static List<String> getAllProperties() { return ALL_PROPERTIES; }
    public static Boolean isModelEvalMetric(Object obj) { return (obj.getClass() == ModelEvalMetric.class); }

}
