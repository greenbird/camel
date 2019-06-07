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
import org.apache.camel.LoggingLevel;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * The sjms2 component (simple jms) allows messages to be sent to (or consumed
 * from) a JMS Queue or Topic (uses JMS 2.x API).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class Sjms2Endpoint {


    public static class Sjms2Common<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        Sjms2Common(String path) {
            super("sjms2", path);
        }
        /**
         * The kind of destination to use. The option is a java.lang.String
         * type.
         */
        public T destinationType(String destinationType) {
            this.properties.put("destinationType", destinationType);
            return (T) this;
        }
        /**
         * DestinationName is a JMS queue or topic name. By default, the
         * destinationName is interpreted as a queue name. The option is a
         * java.lang.String type.
         */
        public T destinationName(String destinationName) {
            this.properties.put("destinationName", destinationName);
            return (T) this;
        }
        /**
         * The JMS acknowledgement name, which is one of: SESSION_TRANSACTED,
         * CLIENT_ACKNOWLEDGE, AUTO_ACKNOWLEDGE, DUPS_OK_ACKNOWLEDGE. The option
         * is a org.apache.camel.component.sjms.jms.SessionAcknowledgementType
         * type.
         */
        public T acknowledgementMode(
                SessionAcknowledgementType acknowledgementMode) {
            this.properties.put("acknowledgementMode", acknowledgementMode);
            return (T) this;
        }
        /**
         * Whether to startup the consumer message listener asynchronously, when
         * starting a route. For example if a JmsConsumer cannot get a
         * connection to a remote JMS broker, then it may block while retrying
         * and/or failover. This will cause Camel to block while starting
         * routes. By setting this option to true, you will let routes startup,
         * while the JmsConsumer connects to the JMS broker using a dedicated
         * thread in asynchronous mode. If this option is used, then beware that
         * if the connection could not be established, then an exception is
         * logged at WARN level, and the consumer will not be able to receive
         * messages; You can then restart the route to retry. The option is a
         * boolean type.
         */
        public T asyncStartListener(boolean asyncStartListener) {
            this.properties.put("asyncStartListener", asyncStartListener);
            return (T) this;
        }
        /**
         * Whether to stop the consumer message listener asynchronously, when
         * stopping a route. The option is a boolean type.
         */
        public T asyncStopListener(boolean asyncStopListener) {
            this.properties.put("asyncStopListener", asyncStopListener);
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
         * The maximum number of connections available to this endpoint. The
         * option is a java.lang.Integer type.
         */
        public T connectionCount(Integer connectionCount) {
            this.properties.put("connectionCount", connectionCount);
            return (T) this;
        }
        /**
         * Initializes the connectionFactory for the endpoint, which takes
         * precedence over the component's connectionFactory, if any. The option
         * is a javax.jms.ConnectionFactory type.
         */
        public T connectionFactory(Object connectionFactory) {
            this.properties.put("connectionFactory", connectionFactory);
            return (T) this;
        }
        /**
         * Initializes the connectionResource for the endpoint, which takes
         * precedence over the component's connectionResource, if any. The
         * option is a org.apache.camel.component.sjms.jms.ConnectionResource
         * type.
         */
        public T connectionResource(Object connectionResource) {
            this.properties.put("connectionResource", connectionResource);
            return (T) this;
        }
        /**
         * To use a custom DestinationCreationStrategy. The option is a
         * org.apache.camel.component.sjms.jms.DestinationCreationStrategy type.
         */
        public T destinationCreationStrategy(Object destinationCreationStrategy) {
            this.properties.put("destinationCreationStrategy", destinationCreationStrategy);
            return (T) this;
        }
        /**
         * Specifies the JMS Exception Listener that is to be notified of any
         * underlying JMS exceptions. The option is a
         * javax.jms.ExceptionListener type.
         */
        public T exceptionListener(Object exceptionListener) {
            this.properties.put("exceptionListener", exceptionListener);
            return (T) this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message. The option is a
         * org.apache.camel.spi.HeaderFilterStrategy type.
         */
        public T headerFilterStrategy(HeaderFilterStrategy headerFilterStrategy) {
            this.properties.put("headerFilterStrategy", headerFilterStrategy);
            return (T) this;
        }
        /**
         * Whether to include all JMSXxxx properties when mapping from JMS to
         * Camel Message. Setting this to true will include properties such as
         * JMSXAppID, and JMSXUserID etc. Note: If you are using a custom
         * headerFilterStrategy then this option does not apply. The option is a
         * boolean type.
         */
        public T includeAllJMSXProperties(boolean includeAllJMSXProperties) {
            this.properties.put("includeAllJMSXProperties", includeAllJMSXProperties);
            return (T) this;
        }
        /**
         * Pluggable strategy for encoding and decoding JMS keys so they can be
         * compliant with the JMS specification. Camel provides two
         * implementations out of the box: default and passthrough. The default
         * strategy will safely marshal dots and hyphens (. and -). The
         * passthrough strategy leaves the key as is. Can be used for JMS
         * brokers which do not care whether JMS header keys contain illegal
         * characters. You can provide your own implementation of the
         * org.apache.camel.component.jms.JmsKeyFormatStrategy and refer to it
         * using the # notation. The option is a
         * org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy type.
         */
        public T jmsKeyFormatStrategy(Object jmsKeyFormatStrategy) {
            this.properties.put("jmsKeyFormatStrategy", jmsKeyFormatStrategy);
            return (T) this;
        }
        /**
         * Specifies whether Camel should auto map the received JMS message to a
         * suited payload type, such as javax.jms.TextMessage to a String etc.
         * See section about how mapping works below for more details. The
         * option is a boolean type.
         */
        public T mapJmsMessage(boolean mapJmsMessage) {
            this.properties.put("mapJmsMessage", mapJmsMessage);
            return (T) this;
        }
        /**
         * To use the given MessageCreatedStrategy which are invoked when Camel
         * creates new instances of javax.jms.Message objects when Camel is
         * sending a JMS message. The option is a
         * org.apache.camel.component.sjms.jms.MessageCreatedStrategy type.
         */
        public T messageCreatedStrategy(Object messageCreatedStrategy) {
            this.properties.put("messageCreatedStrategy", messageCreatedStrategy);
            return (T) this;
        }
        /**
         * Sets the commit strategy. The option is a
         * org.apache.camel.component.sjms.TransactionCommitStrategy type.
         */
        public T transactionCommitStrategy(Object transactionCommitStrategy) {
            this.properties.put("transactionCommitStrategy", transactionCommitStrategy);
            return (T) this;
        }
        /**
         * Specifies whether to share JMS session with other SJMS endpoints.
         * Turn this off if your route is accessing to multiple JMS providers.
         * If you need transaction against multiple JMS providers, use jms
         * component to leverage XA transaction. The option is a boolean type.
         */
        public T sharedJMSSession(boolean sharedJMSSession) {
            this.properties.put("sharedJMSSession", sharedJMSSession);
            return (T) this;
        }
    }

    public static class Sjms2Consumer
            extends
                Sjms2Common<Sjms2Consumer>
            implements
                EndpointDefinition.Consumer {
        public Sjms2Consumer(String path) {
            super(path);
        }
        /**
         * Sets topic consumer to durable. The option is a boolean type.
         */
        public Sjms2Consumer durable(boolean durable) {
            this.properties.put("durable", durable);
            return (Sjms2Consumer) this;
        }
        /**
         * Sets the consumer to shared. The option is a boolean type.
         */
        public Sjms2Consumer shared(boolean shared) {
            this.properties.put("shared", shared);
            return (Sjms2Consumer) this;
        }
        /**
         * Sets the subscription Id, required for durable or shared topics. The
         * option is a java.lang.String type.
         */
        public Sjms2Consumer subscriptionId(String subscriptionId) {
            this.properties.put("subscriptionId", subscriptionId);
            return (Sjms2Consumer) this;
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
        public Sjms2Consumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (Sjms2Consumer) this;
        }
        /**
         * Sets the number of consumer listeners used for this endpoint. The
         * option is a int type.
         */
        public Sjms2Consumer consumerCount(int consumerCount) {
            this.properties.put("consumerCount", consumerCount);
            return (Sjms2Consumer) this;
        }
        /**
         * Sets the durable subscription Id required for durable topics. The
         * option is a java.lang.String type.
         */
        public Sjms2Consumer durableSubscriptionId(String durableSubscriptionId) {
            this.properties.put("durableSubscriptionId", durableSubscriptionId);
            return (Sjms2Consumer) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public Sjms2Consumer synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (Sjms2Consumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public Sjms2Consumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (Sjms2Consumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public Sjms2Consumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (Sjms2Consumer) this;
        }
        /**
         * Sets the JMS Message selector syntax. The option is a
         * java.lang.String type.
         */
        public Sjms2Consumer messageSelector(String messageSelector) {
            this.properties.put("messageSelector", messageSelector);
            return (Sjms2Consumer) this;
        }
        /**
         * Allows to configure the default errorHandler logging level for
         * logging uncaught exceptions. The option is a
         * org.apache.camel.LoggingLevel type.
         */
        public Sjms2Consumer errorHandlerLoggingLevel(
                LoggingLevel errorHandlerLoggingLevel) {
            this.properties.put("errorHandlerLoggingLevel", errorHandlerLoggingLevel);
            return (Sjms2Consumer) this;
        }
        /**
         * Allows to control whether stacktraces should be logged or not, by the
         * default errorHandler. The option is a boolean type.
         */
        public Sjms2Consumer errorHandlerLogStackTrace(
                boolean errorHandlerLogStackTrace) {
            this.properties.put("errorHandlerLogStackTrace", errorHandlerLogStackTrace);
            return (Sjms2Consumer) this;
        }
        /**
         * Specifies whether to use transacted mode. The option is a boolean
         * type.
         */
        public Sjms2Consumer transacted(boolean transacted) {
            this.properties.put("transacted", transacted);
            return (Sjms2Consumer) this;
        }
        /**
         * If transacted sets the number of messages to process before
         * committing a transaction. The option is a int type.
         */
        public Sjms2Consumer transactionBatchCount(int transactionBatchCount) {
            this.properties.put("transactionBatchCount", transactionBatchCount);
            return (Sjms2Consumer) this;
        }
        /**
         * Sets timeout (in millis) for batch transactions, the value should be
         * 1000 or higher. The option is a long type.
         */
        public Sjms2Consumer transactionBatchTimeout(
                long transactionBatchTimeout) {
            this.properties.put("transactionBatchTimeout", transactionBatchTimeout);
            return (Sjms2Consumer) this;
        }
    }

    public static class Sjms2Producer
            extends
                Sjms2Common<Sjms2Producer>
            implements
                EndpointDefinition.Producer {
        public Sjms2Producer(String path) {
            super(path);
        }
        /**
         * Sets the reply to destination name used for InOut producer endpoints.
         * The type of the reply to destination can be determined by the
         * starting prefix (topic: or queue:) in its name. The option is a
         * java.lang.String type.
         */
        public Sjms2Producer namedReplyTo(String namedReplyTo) {
            this.properties.put("namedReplyTo", namedReplyTo);
            return (Sjms2Producer) this;
        }
        /**
         * Flag used to enable/disable message persistence. The option is a
         * boolean type.
         */
        public Sjms2Producer persistent(boolean persistent) {
            this.properties.put("persistent", persistent);
            return (Sjms2Producer) this;
        }
        /**
         * Sets the number of producers used for this endpoint. The option is a
         * int type.
         */
        public Sjms2Producer producerCount(int producerCount) {
            this.properties.put("producerCount", producerCount);
            return (Sjms2Producer) this;
        }
        /**
         * Flag used to adjust the Time To Live value of produced messages. The
         * option is a long type.
         */
        public Sjms2Producer ttl(long ttl) {
            this.properties.put("ttl", ttl);
            return (Sjms2Producer) this;
        }
        /**
         * Whether to allow sending messages with no body. If this option is
         * false and the message body is null, then an JMSException is thrown.
         * The option is a boolean type.
         */
        public Sjms2Producer allowNullBody(boolean allowNullBody) {
            this.properties.put("allowNullBody", allowNullBody);
            return (Sjms2Producer) this;
        }
        /**
         * Whether to prefill the producer connection pool on startup, or create
         * connections lazy when needed. The option is a boolean type.
         */
        public Sjms2Producer prefillPool(boolean prefillPool) {
            this.properties.put("prefillPool", prefillPool);
            return (Sjms2Producer) this;
        }
        /**
         * Sets the amount of time we should wait before timing out a InOut
         * response. The option is a long type.
         */
        public Sjms2Producer responseTimeOut(long responseTimeOut) {
            this.properties.put("responseTimeOut", responseTimeOut);
            return (Sjms2Producer) this;
        }
    }

    public static enum SessionAcknowledgementType {
        SESSION_TRANSACTED, CLIENT_ACKNOWLEDGE, AUTO_ACKNOWLEDGE, DUPS_OK_ACKNOWLEDGE;
    }
}