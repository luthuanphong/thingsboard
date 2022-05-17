/**
 * Copyright © 2016-2022 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.service.entitiy.edge;

import org.thingsboard.server.common.data.Customer;
import org.thingsboard.server.common.data.edge.Edge;
import org.thingsboard.server.common.data.exception.ThingsboardException;
import org.thingsboard.server.common.data.id.EdgeId;
import org.thingsboard.server.common.data.id.RuleChainId;
import org.thingsboard.server.common.data.id.TenantId;
import org.thingsboard.server.common.data.rule.RuleChain;
import org.thingsboard.server.service.security.model.SecurityUser;

public interface TbEdgeService {
    Edge saveEdge(Edge edge, RuleChain edgeTemplateRootRuleChain, SecurityUser user) throws ThingsboardException;

    void deleteEdge(Edge edge, SecurityUser user) throws ThingsboardException;

    Edge assignEdgeToCustomer(TenantId tenantId, EdgeId edgeId, Customer customer, SecurityUser user) throws ThingsboardException;

    Edge unassignEdgeFromCustomer(Edge edge, Customer customer, SecurityUser user) throws ThingsboardException;

    Edge assignEdgeToPublicCustomer(TenantId tenantId, EdgeId edgeId, SecurityUser user) throws ThingsboardException;

    Edge setEdgeRootRuleChain(Edge edge, RuleChainId ruleChainId, SecurityUser user) throws ThingsboardException;
}