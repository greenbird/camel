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
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The direct component provides direct, synchronous call to another endpoint
 * from the same CamelContext.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class DirectEndpoint {


    public static class DirectCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        DirectCommon(String path) {
            super("direct", path);
        }
        /**
         * Name of direct endpoint. The option is a java.lang.String type.
         */
        public T name(String name) {
            this.properties.put("name", name);
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

    public static class DirectConsumer
            extends
                DirectCommon<DirectConsumer>
            implements
                EndpointDefinition.Consumer {
        public DirectConsumer(String path) {
            super(path);
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a boolean type.
         */
        public DirectConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (DirectConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public DirectConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (DirectConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public DirectConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (DirectConsumer) this;
        }
    }

    public static class DirectProducer
            extends
                DirectCommon<DirectProducer>
            implements
                EndpointDefinition.Producer {
        public DirectProducer(String path) {
            super(path);
        }
        /**
         * If sending a message to a direct endpoint which has no active
         * consumer, then we can tell the producer to block and wait for the
         * consumer to become active. The option is a boolean type.
         */
        public DirectProducer block(boolean block) {
            this.properties.put("block", block);
            return (DirectProducer) this;
        }
        /**
         * Whether the producer should fail by throwing an exception, when
         * sending to a DIRECT endpoint with no active consumers. The option is
         * a boolean type.
         */
        public DirectProducer failIfNoConsumers(boolean failIfNoConsumers) {
            this.properties.put("failIfNoConsumers", failIfNoConsumers);
            return (DirectProducer) this;
        }
        /**
         * The timeout value to use if block is enabled. The option is a long
         * type.
         */
        public DirectProducer timeout(long timeout) {
            this.properties.put("timeout", timeout);
            return (DirectProducer) this;
        }
    }
}