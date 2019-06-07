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
 * Validates the payload of a message using the Schematron Library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class SchematronEndpoint {


    public static class SchematronCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        SchematronCommon(String path) {
            super("schematron", path);
        }
        /**
         * The path to the schematron rules file. Can either be in class path or
         * location in the file system. The option is a java.lang.String type.
         */
        public T path(String path) {
            this.properties.put("path", path);
            return (T) this;
        }
        /**
         * Flag to abort the route and throw a schematron validation exception.
         * The option is a boolean type.
         */
        public T abort(boolean abort) {
            this.properties.put("abort", abort);
            return (T) this;
        }
        /**
         * To use the given schematron rules instead of loading from the path.
         * The option is a javax.xml.transform.Templates type.
         */
        public T rules(Object rules) {
            this.properties.put("rules", rules);
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
        /**
         * Set the URIResolver to be used for resolving schematron includes in
         * the rules file. The option is a javax.xml.transform.URIResolver type.
         */
        public T uriResolver(Object uriResolver) {
            this.properties.put("uriResolver", uriResolver);
            return (T) this;
        }
    }

    public static class SchematronProducer
            extends
                SchematronCommon<SchematronProducer>
            implements
                EndpointDefinition.Producer {
        public SchematronProducer(String path) {
            super(path);
        }
    }
}