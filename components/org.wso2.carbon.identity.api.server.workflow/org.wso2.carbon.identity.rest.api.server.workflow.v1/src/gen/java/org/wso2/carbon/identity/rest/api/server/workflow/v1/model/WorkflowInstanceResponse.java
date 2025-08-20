/*
 * Copyright (c) 2025, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.rest.api.server.workflow.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import org.wso2.carbon.identity.rest.api.server.workflow.v1.model.InstanceStatus;
import org.wso2.carbon.identity.rest.api.server.workflow.v1.model.Operation;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class WorkflowInstanceResponse {
  
    private String workflowInstanceId;
    private Operation eventType;
    private String requestInitiator;
    private String createdAt;
    private String updatedAt;
    private InstanceStatus status;
    private Object requestParameters;

    /**
    **/
    public WorkflowInstanceResponse workflowInstanceId(String workflowInstanceId) {

        this.workflowInstanceId = workflowInstanceId;
        return this;
    }

    @ApiModelProperty(value = "")
    @JsonProperty("workflowInstanceId")
    @Valid
    public String getWorkflowInstanceId() {

        return workflowInstanceId;
    }

    public void setWorkflowInstanceId(String workflowInstanceId) {

        this.workflowInstanceId = workflowInstanceId;
    }

    /**
    **/
    public WorkflowInstanceResponse eventType(Operation eventType) {

        this.eventType = eventType;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("eventType")
    @Valid
    public Operation getEventType() {

        return eventType;
    }

    public void setEventType(Operation eventType) {

        this.eventType = eventType;
    }

    /**
    **/
    public WorkflowInstanceResponse createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("createdAt")
    public String getCreatedAt() {

        return createdAt;
    }

    public void setCreatedAt(String createdAt) {

        this.createdAt = createdAt;
    }

    /**
    **/
    public WorkflowInstanceResponse updatedAt(String updatedAt) {

        this.updatedAt = updatedAt;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("updatedAt")
    public String getUpdatedAt() {

        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {

        this.updatedAt = updatedAt;
    }

    /**
    **/
    public WorkflowInstanceResponse status(InstanceStatus status) {

        this.status = status;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("status")
    @Valid
    public InstanceStatus getStatus() {

        return status;
    }

    public void setStatus(InstanceStatus status) {

        this.status = status;
    }

    /**
    **/
    public WorkflowInstanceResponse requestParameters(Object requestParameters) {

        this.requestParameters = requestParameters;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("requestParameters")
    @Valid
    public Object getRequestParameters() {

        return requestParameters;
    }

    public void setRequestParameters(Object requestParameters) {

        this.requestParameters = requestParameters;
    }

    /**
    **/
    public WorkflowInstanceResponse requestInitiator(String requestInitiator) {

        this.requestInitiator = requestInitiator;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("requestInitiator")
    public String getRequestInitiator() {

        return requestInitiator;
    }

    public void setRequestInitiator(String requestInitiator) {

        this.requestInitiator = requestInitiator;
    }

    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowInstanceResponse workflowInstanceResponse = (WorkflowInstanceResponse) o;
        return Objects.equals(this.eventType, workflowInstanceResponse.eventType) &&
            Objects.equals(this.createdAt, workflowInstanceResponse.createdAt) &&
            Objects.equals(this.updatedAt, workflowInstanceResponse.updatedAt) &&
            Objects.equals(this.status, workflowInstanceResponse.status) &&
            Objects.equals(this.requestParameters, workflowInstanceResponse.requestParameters);
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(eventType, createdAt, updatedAt, status, requestParameters);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowInstanceResponse {\n");
        
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    requestParameters: ").append(toIndentedString(requestParameters)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

