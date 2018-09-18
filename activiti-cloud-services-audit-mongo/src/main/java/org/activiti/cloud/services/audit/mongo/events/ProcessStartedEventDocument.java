/*
 * Copyright 2018 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.cloud.services.audit.mongo.events;

import org.activiti.api.process.model.ProcessInstance;
import org.activiti.api.process.model.events.ProcessRuntimeEvent;

import com.querydsl.core.annotations.QueryEntity;

@QueryEntity
public class ProcessStartedEventDocument extends ProcessAuditEventDocument {

    protected static final String PROCESS_STARTED_EVENT = "ProcessStartedEvent";

    public ProcessStartedEventDocument() {
    }

    public ProcessStartedEventDocument(String eventId,
                                       Long timestamp) {
        super(eventId,
              timestamp,
              ProcessRuntimeEvent.ProcessEvents.PROCESS_STARTED.name());
    }

    public ProcessStartedEventDocument(String eventId,
                                       Long timestamp,
                                       String appName,
                                       String appVersion,
                                       String serviceName,
                                       String serviceFullName,
                                       String serviceType,
                                       String serviceVersion,
                                       ProcessInstance processInstance,
                                       String nestedProcessDefinitionId,
                                       String nestedProcessInstanceId) {
        super(eventId,
              timestamp,
              ProcessRuntimeEvent.ProcessEvents.PROCESS_STARTED.name(),
              appName,
              appVersion,
              serviceName,
              serviceFullName,
              serviceType,
              serviceVersion,
              processInstance,
              nestedProcessDefinitionId,
              nestedProcessInstanceId);
    }
}