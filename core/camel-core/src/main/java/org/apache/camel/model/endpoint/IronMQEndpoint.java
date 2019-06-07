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
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.PollingConsumerPollStrategy;
import org.apache.camel.spi.ScheduledPollConsumerScheduler;

/**
 * The ironmq provides integration with IronMQ an elastic and durable hosted
 * message queue as a service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class IronMQEndpoint {


    public static class IronMQCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        IronMQCommon(String path) {
            super("ironmq", path);
        }
        /**
         * The name of the IronMQ queue. The option is a java.lang.String type.
         */
        public T queueName(String queueName) {
            this.properties.put("queueName", queueName);
            return (T) this;
        }
        /**
         * Reference to a io.iron.ironmq.Client in the Registry. The option is a
         * io.iron.ironmq.Client type.
         */
        public T client(Object client) {
            this.properties.put("client", client);
            return (T) this;
        }
        /**
         * IronMq Cloud url. Urls for public clusters:
         * https://mq-aws-us-east-1-1.iron.io (US) and
         * https://mq-aws-eu-west-1-1.iron.io (EU). The option is a
         * java.lang.String type.
         */
        public T ironMQCloud(String ironMQCloud) {
            this.properties.put("ironMQCloud", ironMQCloud);
            return (T) this;
        }
        /**
         * Should message headers be preserved when publishing messages. This
         * will add the Camel headers to the Iron MQ message as a json payload
         * with a header list, and a message body. Useful when Camel is both
         * consumer and producer. The option is a boolean type.
         */
        public T preserveHeaders(boolean preserveHeaders) {
            this.properties.put("preserveHeaders", preserveHeaders);
            return (T) this;
        }
        /**
         * IronMQ projectId. The option is a java.lang.String type.
         */
        public T projectId(String projectId) {
            this.properties.put("projectId", projectId);
            return (T) this;
        }
        /**
         * IronMQ token. The option is a java.lang.String type.
         */
        public T token(String token) {
            this.properties.put("token", token);
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

    public static class IronMQConsumer
            extends
                IronMQCommon<IronMQConsumer>
            implements
                EndpointDefinition.Consumer {
        public IronMQConsumer(String path) {
            super(path);
        }
        /**
         * Should messages be deleted in one batch. This will limit the number
         * of api requests since messages are deleted in one request, instead of
         * one pr. exchange. If enabled care should be taken that the consumer
         * is idempotent when processing exchanges. The option is a boolean
         * type.
         */
        public IronMQConsumer batchDelete(boolean batchDelete) {
            this.properties.put("batchDelete", batchDelete);
            return (IronMQConsumer) this;
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
        public IronMQConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (IronMQConsumer) this;
        }
        /**
         * The number of concurrent consumers. The option is a int type.
         */
        public IronMQConsumer concurrentConsumers(int concurrentConsumers) {
            this.properties.put("concurrentConsumers", concurrentConsumers);
            return (IronMQConsumer) this;
        }
        /**
         * Number of messages to poll pr. call. Maximum is 100. The option is a
         * int type.
         */
        public IronMQConsumer maxMessagesPerPoll(int maxMessagesPerPoll) {
            this.properties.put("maxMessagesPerPoll", maxMessagesPerPoll);
            return (IronMQConsumer) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * boolean type.
         */
        public IronMQConsumer sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (IronMQConsumer) this;
        }
        /**
         * After timeout (in seconds), item will be placed back onto the queue.
         * The option is a int type.
         */
        public IronMQConsumer timeout(int timeout) {
            this.properties.put("timeout", timeout);
            return (IronMQConsumer) this;
        }
        /**
         * Time in seconds to wait for a message to become available. This
         * enables long polling. Default is 0 (does not wait), maximum is 30.
         * The option is a int type.
         */
        public IronMQConsumer wait(int wait) {
            this.properties.put("wait", wait);
            return (IronMQConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public IronMQConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (IronMQConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public IronMQConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (IronMQConsumer) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * org.apache.camel.spi.PollingConsumerPollStrategy type.
         */
        public IronMQConsumer pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (IronMQConsumer) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * is a int type.
         */
        public IronMQConsumer backoffErrorThreshold(int backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (IronMQConsumer) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option is a int type.
         */
        public IronMQConsumer backoffIdleThreshold(int backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (IronMQConsumer) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option is a int type.
         */
        public IronMQConsumer backoffMultiplier(int backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (IronMQConsumer) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        public IronMQConsumer delay(long delay) {
            this.properties.put("delay", delay);
            return (IronMQConsumer) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option is a boolean type.
         */
        public IronMQConsumer greedy(boolean greedy) {
            this.properties.put("greedy", greedy);
            return (IronMQConsumer) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        public IronMQConsumer initialDelay(long initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (IronMQConsumer) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * is a org.apache.camel.LoggingLevel type.
         */
        public IronMQConsumer runLoggingLevel(LoggingLevel runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (IronMQConsumer) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option is a java.util.concurrent.ScheduledExecutorService
         * type.
         */
        public IronMQConsumer scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (IronMQConsumer) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option is a
         * org.apache.camel.spi.ScheduledPollConsumerScheduler type.
         */
        public IronMQConsumer scheduler(ScheduledPollConsumerScheduler scheduler) {
            this.properties.put("scheduler", scheduler);
            return (IronMQConsumer) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        public IronMQConsumer schedulerProperties(
                Map<String, Object> schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (IronMQConsumer) this;
        }
        /**
         * Whether the scheduler should be auto started. The option is a boolean
         * type.
         */
        public IronMQConsumer startScheduler(boolean startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (IronMQConsumer) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option is a
         * java.util.concurrent.TimeUnit type.
         */
        public IronMQConsumer timeUnit(TimeUnit timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (IronMQConsumer) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option is a boolean
         * type.
         */
        public IronMQConsumer useFixedDelay(boolean useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (IronMQConsumer) this;
        }
    }

    public static class IronMQProducer
            extends
                IronMQCommon<IronMQProducer>
            implements
                EndpointDefinition.Producer {
        public IronMQProducer(String path) {
            super(path);
        }
        /**
         * The item will not be available on the queue until this many seconds
         * have passed. Default is 0 seconds. The option is a int type.
         */
        public IronMQProducer visibilityDelay(int visibilityDelay) {
            this.properties.put("visibilityDelay", visibilityDelay);
            return (IronMQProducer) this;
        }
    }
}