/*
 * Copyright (c) 2022, WSO2 LLC. (https://www.wso2.com) All Rights Reserved.
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.handler.event.account.lock.service;

import org.wso2.carbon.identity.handler.event.account.lock.exception.AccountDisableServiceException;

/**
 * Service interface that returns account disable state.
 */
public interface AccountDisableService {

    /**
     * Returns if account is disabled or not.
     *
     * @param username          Username without user store domain.
     * @param tenantDomain      Tenant domain of the user.
     * @param userStoreDomain   User store domain of the user.
     * @return                  True if the account is disabled. False otherwise.
     */
    boolean isAccountDisabled(String username, String tenantDomain, String userStoreDomain)
            throws AccountDisableServiceException;
}
