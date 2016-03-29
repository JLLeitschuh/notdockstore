/*
 *    Copyright 2016 OICR
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.swagger.quay.client.model;

import io.swagger.quay.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Description of a new repository
 **/
@ApiModel(description = "Description of a new repository")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-23T15:13:48.378-04:00")
public class NewRepo   {
  
  private String namespace = null;

public enum VisibilityEnum {
  PUBLIC("public"),
  PRIVATE("private");

  private String value;

  VisibilityEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private VisibilityEnum visibility = null;
  private String repository = null;
  private String description = null;

  
  /**
   * Namespace in which the repository should be created. If omitted, the username of the caller is used
   **/
  @ApiModelProperty(value = "Namespace in which the repository should be created. If omitted, the username of the caller is used")
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  
  /**
   * Visibility which the repository will start with
   **/
  @ApiModelProperty(required = true, value = "Visibility which the repository will start with")
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }
  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  
  /**
   * Repository name
   **/
  @ApiModelProperty(required = true, value = "Repository name")
  @JsonProperty("repository")
  public String getRepository() {
    return repository;
  }
  public void setRepository(String repository) {
    this.repository = repository;
  }

  
  /**
   * Markdown encoded description for the repository
   **/
  @ApiModelProperty(required = true, value = "Markdown encoded description for the repository")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewRepo {\n");
    
    sb.append("    namespace: ").append(StringUtil.toIndentedString(namespace)).append("\n");
    sb.append("    visibility: ").append(StringUtil.toIndentedString(visibility)).append("\n");
    sb.append("    repository: ").append(StringUtil.toIndentedString(repository)).append("\n");
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
