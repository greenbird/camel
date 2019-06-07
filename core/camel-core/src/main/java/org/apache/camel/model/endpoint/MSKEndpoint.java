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

import javax.annotation.Generated;
import org.apache.camel.model.EndpointDefinition;

/**
 * The aws-kms is used for managing Amazon KMS
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class MSKEndpoint {


    public static class MSKCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        MSKCommon(String path) {
            super("aws-msk", path);
        }
        /**
         * Logical name. The option is a java.lang.String type.
         */
        public T label(String label) {
            this.properties.put("label", label);
            return (T) this;
        }
        /**
         * The region in which MSK client needs to work. The option is a
         * java.lang.String type.
         */
        public T region(String region) {
            this.properties.put("region", region);
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
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
    }

    public static class MSKProducer
            extends
                MSKCommon<MSKProducer>
            implements
                EndpointDefinition.Producer {
        public MSKProducer(String path) {
            super(path);
        }
        /**
         * Amazon AWS Access Key. The option is a java.lang.String type.
         */
        public MSKProducer accessKey(String accessKey) {
            this.properties.put("accessKey", accessKey);
            return (MSKProducer) this;
        }
        /**
         * To use a existing configured AWS MSK as client. The option is a
         * com.amazonaws.services.kafka.AWSKafka type.
         */
        public MSKProducer mskClient(Object mskClient) {
            this.properties.put("mskClient", mskClient);
            return (MSKProducer) this;
        }
        /**
         * The operation to perform. The option is a
         * org.apache.camel.component.aws.msk.MSKOperations type.
         */
        public MSKProducer operation(MSKOperations operation) {
            this.properties.put("operation", operation);
            return (MSKProducer) this;
        }
        /**
         * To define a proxy host when instantiating the MSK client. The option
         * is a java.lang.String type.
         */
        public MSKProducer proxyHost(String proxyHost) {
            this.properties.put("proxyHost", proxyHost);
            return (MSKProducer) this;
        }
        /**
         * To define a proxy port when instantiating the MSK client. The option
         * is a java.lang.Integer type.
         */
        public MSKProducer proxyPort(Integer proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (MSKProducer) this;
        }
        /**
         * Amazon AWS Secret Key. The option is a java.lang.String type.
         */
        public MSKProducer secretKey(String secretKey) {
            this.properties.put("secretKey", secretKey);
            return (MSKProducer) this;
        }
    }

    public static enum MSKOperations {
        listClusters, createCluster, deleteCluster, describeCluster;
    }
}