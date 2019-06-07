/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.endpoint;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.model.EndpointDefinition;

/**
 * The servicenow component is used to integrate Camel with ServiceNow cloud
 * services.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class ServiceNowEndpoint {


    public static class ServiceNowCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        ServiceNowCommon(String path) {
            super("servicenow", path);
        }
        /**
         * The ServiceNow instance name. The option is a java.lang.String type.
         */
        public T instanceName(String instanceName) {
            this.properties.put("instanceName", instanceName);
            return (T) this;
        }
        /**
         * Set this parameter to true to return only scorecards where the
         * indicator Display field is selected. Set this parameter to all to
         * return scorecards with any Display field value. This parameter is
         * true by default. The option is a java.lang.String type.
         */
        public T display(String display) {
            this.properties.put("display", display);
            return (T) this;
        }
        /**
         * Return the display value (true), actual value (false), or both (all)
         * for reference fields (default: false). The option is a
         * java.lang.String type.
         */
        public T displayValue(String displayValue) {
            this.properties.put("displayValue", displayValue);
            return (T) this;
        }
        /**
         * True to exclude Table API links for reference fields (default:
         * false). The option is a java.lang.Boolean type.
         */
        public T excludeReferenceLink(Boolean excludeReferenceLink) {
            this.properties.put("excludeReferenceLink", excludeReferenceLink);
            return (T) this;
        }
        /**
         * Set this parameter to true to return only scorecards that are
         * favorites of the querying user. The option is a java.lang.Boolean
         * type.
         */
        public T favorites(Boolean favorites) {
            this.properties.put("favorites", favorites);
            return (T) this;
        }
        /**
         * Set this parameter to true to always return all available aggregates
         * for an indicator, including when an aggregate has already been
         * applied. If a value is not specified, this parameter defaults to
         * false and returns no aggregates. The option is a java.lang.Boolean
         * type.
         */
        public T includeAggregates(Boolean includeAggregates) {
            this.properties.put("includeAggregates", includeAggregates);
            return (T) this;
        }
        /**
         * Set this parameter to true to return all available aggregates for an
         * indicator when no aggregate has been applied. If a value is not
         * specified, this parameter defaults to false and returns no
         * aggregates. The option is a java.lang.Boolean type.
         */
        public T includeAvailableAggregates(Boolean includeAvailableAggregates) {
            this.properties.put("includeAvailableAggregates", includeAvailableAggregates);
            return (T) this;
        }
        /**
         * Set this parameter to true to return all available breakdowns for an
         * indicator. If a value is not specified, this parameter defaults to
         * false and returns no breakdowns. The option is a java.lang.Boolean
         * type.
         */
        public T includeAvailableBreakdowns(Boolean includeAvailableBreakdowns) {
            this.properties.put("includeAvailableBreakdowns", includeAvailableBreakdowns);
            return (T) this;
        }
        /**
         * Set this parameter to true to return all notes associated with the
         * score. The note element contains the note text as well as the author
         * and timestamp when the note was added. The option is a
         * java.lang.Boolean type.
         */
        public T includeScoreNotes(Boolean includeScoreNotes) {
            this.properties.put("includeScoreNotes", includeScoreNotes);
            return (T) this;
        }
        /**
         * Set this parameter to true to return all scores for a scorecard. If a
         * value is not specified, this parameter defaults to false and returns
         * only the most recent score value. The option is a java.lang.Boolean
         * type.
         */
        public T includeScores(Boolean includeScores) {
            this.properties.put("includeScores", includeScores);
            return (T) this;
        }
        /**
         * True to set raw value of input fields (default: false). The option is
         * a java.lang.Boolean type.
         */
        public T inputDisplayValue(Boolean inputDisplayValue) {
            this.properties.put("inputDisplayValue", inputDisplayValue);
            return (T) this;
        }
        /**
         * Set this parameter to true to return only scorecards for key
         * indicators. The option is a java.lang.Boolean type.
         */
        public T key(Boolean key) {
            this.properties.put("key", key);
            return (T) this;
        }
        /**
         * Defines both request and response models. The option is a
         * java.lang.String type.
         */
        public T models(Map<String, Class<Object>> models) {
            this.properties.put("models", models);
            return (T) this;
        }
        /**
         * Enter the maximum number of scorecards each query can return. By
         * default this value is 10, and the maximum is 100. The option is a
         * java.lang.Integer type.
         */
        public T perPage(Integer perPage) {
            this.properties.put("perPage", perPage);
            return (T) this;
        }
        /**
         * The ServiceNow release to target, default to Helsinki See
         * https://docs.servicenow.com. The option is a
         * org.apache.camel.component.servicenow.ServiceNowRelease type.
         */
        public T release(ServiceNowRelease release) {
            this.properties.put("release", release);
            return (T) this;
        }
        /**
         * Defines the request model. The option is a java.lang.String type.
         */
        public T requestModels(Map<String, Class<Object>> requestModels) {
            this.properties.put("requestModels", requestModels);
            return (T) this;
        }
        /**
         * The default resource, can be overridden by header
         * CamelServiceNowResource. The option is a java.lang.String type.
         */
        public T resource(String resource) {
            this.properties.put("resource", resource);
            return (T) this;
        }
        /**
         * Defines the response model. The option is a java.lang.String type.
         */
        public T responseModels(Map<String, Class<Object>> responseModels) {
            this.properties.put("responseModels", responseModels);
            return (T) this;
        }
        /**
         * Specify the value to use when sorting results. By default, queries
         * sort records by value. The option is a java.lang.String type.
         */
        public T sortBy(String sortBy) {
            this.properties.put("sortBy", sortBy);
            return (T) this;
        }
        /**
         * Specify the sort direction, ascending or descending. By default,
         * queries sort records in descending order. Use sysparm_sortdir=asc to
         * sort in ascending order. The option is a java.lang.String type.
         */
        public T sortDir(String sortDir) {
            this.properties.put("sortDir", sortDir);
            return (T) this;
        }
        /**
         * True to suppress auto generation of system fields (default: false).
         * The option is a java.lang.Boolean type.
         */
        public T suppressAutoSysField(Boolean suppressAutoSysField) {
            this.properties.put("suppressAutoSysField", suppressAutoSysField);
            return (T) this;
        }
        /**
         * Set this value to true to remove the Link header from the response.
         * The Link header allows you to request additional pages of data when
         * the number of records matching your query exceeds the query limit.
         * The option is a java.lang.Boolean type.
         */
        public T suppressPaginationHeader(Boolean suppressPaginationHeader) {
            this.properties.put("suppressPaginationHeader", suppressPaginationHeader);
            return (T) this;
        }
        /**
         * The default table, can be overridden by header CamelServiceNowTable.
         * The option is a java.lang.String type.
         */
        public T table(String table) {
            this.properties.put("table", table);
            return (T) this;
        }
        /**
         * Set this parameter to true to return only scorecards that have a
         * target. The option is a java.lang.Boolean type.
         */
        public T target(Boolean target) {
            this.properties.put("target", target);
            return (T) this;
        }
        /**
         * Gets only those categories whose parent is a catalog. The option is a
         * java.lang.Boolean type.
         */
        public T topLevelOnly(Boolean topLevelOnly) {
            this.properties.put("topLevelOnly", topLevelOnly);
            return (T) this;
        }
        /**
         * The ServiceNow REST API version, default latest. The option is a
         * java.lang.String type.
         */
        public T apiVersion(String apiVersion) {
            this.properties.put("apiVersion", apiVersion);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        public T basicPropertyBinding(boolean basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * The date format used for Json serialization/deserialization. The
         * option is a java.lang.String type.
         */
        public T dateFormat(String dateFormat) {
            this.properties.put("dateFormat", dateFormat);
            return (T) this;
        }
        /**
         * The date-time format used for Json serialization/deserialization. The
         * option is a java.lang.String type.
         */
        public T dateTimeFormat(String dateTimeFormat) {
            this.properties.put("dateTimeFormat", dateTimeFormat);
            return (T) this;
        }
        /**
         * To configure http-client. The option is a
         * org.apache.cxf.transports.http.configuration.HTTPClientPolicy type.
         */
        public T httpClientPolicy(Object httpClientPolicy) {
            this.properties.put("httpClientPolicy", httpClientPolicy);
            return (T) this;
        }
        /**
         * Sets Jackson's ObjectMapper to use for request/reply. The option is a
         * com.fasterxml.jackson.databind.ObjectMapper type.
         */
        public T mapper(Object mapper) {
            this.properties.put("mapper", mapper);
            return (T) this;
        }
        /**
         * To configure proxy authentication. The option is a
         * org.apache.cxf.configuration.security.ProxyAuthorizationPolicy type.
         */
        public T proxyAuthorizationPolicy(Object proxyAuthorizationPolicy) {
            this.properties.put("proxyAuthorizationPolicy", proxyAuthorizationPolicy);
            return (T) this;
        }
        /**
         * Set this parameter to true to retrieve the target record when using
         * import set api. The import set result is then replaced by the target
         * record. The option is a java.lang.Boolean type.
         */
        public T retrieveTargetRecordOnImport(
                Boolean retrieveTargetRecordOnImport) {
            this.properties.put("retrieveTargetRecordOnImport", retrieveTargetRecordOnImport);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
        /**
         * The time format used for Json serialization/deserialization. The
         * option is a java.lang.String type.
         */
        public T timeFormat(String timeFormat) {
            this.properties.put("timeFormat", timeFormat);
            return (T) this;
        }
        /**
         * The proxy host name. The option is a java.lang.String type.
         */
        public T proxyHost(String proxyHost) {
            this.properties.put("proxyHost", proxyHost);
            return (T) this;
        }
        /**
         * The proxy port number. The option is a java.lang.Integer type.
         */
        public T proxyPort(Integer proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (T) this;
        }
        /**
         * The ServiceNow REST API url. The option is a java.lang.String type.
         */
        public T apiUrl(String apiUrl) {
            this.properties.put("apiUrl", apiUrl);
            return (T) this;
        }
        /**
         * OAuth2 ClientID. The option is a java.lang.String type.
         */
        public T oauthClientId(String oauthClientId) {
            this.properties.put("oauthClientId", oauthClientId);
            return (T) this;
        }
        /**
         * OAuth2 ClientSecret. The option is a java.lang.String type.
         */
        public T oauthClientSecret(String oauthClientSecret) {
            this.properties.put("oauthClientSecret", oauthClientSecret);
            return (T) this;
        }
        /**
         * OAuth token Url. The option is a java.lang.String type.
         */
        public T oauthTokenUrl(String oauthTokenUrl) {
            this.properties.put("oauthTokenUrl", oauthTokenUrl);
            return (T) this;
        }
        /**
         * ServiceNow account password, MUST be provided. The option is a
         * java.lang.String type.
         */
        public T password(String password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * Password for proxy authentication. The option is a java.lang.String
         * type.
         */
        public T proxyPassword(String proxyPassword) {
            this.properties.put("proxyPassword", proxyPassword);
            return (T) this;
        }
        /**
         * Username for proxy authentication. The option is a java.lang.String
         * type.
         */
        public T proxyUserName(String proxyUserName) {
            this.properties.put("proxyUserName", proxyUserName);
            return (T) this;
        }
        /**
         * To configure security using SSLContextParameters. See
         * http://camel.apache.org/camel-configuration-utilities.html. The
         * option is a org.apache.camel.support.jsse.SSLContextParameters type.
         */
        public T sslContextParameters(Object sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (T) this;
        }
        /**
         * ServiceNow user account name, MUST be provided. The option is a
         * java.lang.String type.
         */
        public T userName(String userName) {
            this.properties.put("userName", userName);
            return (T) this;
        }
    }

    public static class ServiceNowProducer
            extends
                ServiceNowCommon<ServiceNowProducer>
            implements
                EndpointDefinition.Producer {
        public ServiceNowProducer(String path) {
            super(path);
        }
    }

    public static enum ServiceNowRelease {
        FUJI, GENEVA, HELSINKI;
    }
}