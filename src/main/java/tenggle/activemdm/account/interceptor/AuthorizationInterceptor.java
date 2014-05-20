/*************************************************************************
 * 
 * TENGGLE CONFIDENTIAL
 * __________________
 * 
 * Copyright (c) 2013-2014 Tenggle Technologies.
 * All Rights Reserved.
 * 
 * NOTICE:  All information contained herein is, and remains
 * the property of Tenggle Technologies and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Tenggle Technologies
 * and its suppliers and may be covered by China and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Tenggle Technologies.
 * 
 *  @package tenggle.activemdm.account.interceptor
 *  @file    AuthorizationInterceptor.java
 *  @date    2014-5-3
 */
package tenggle.activemdm.account.interceptor;

import java.util.Collections;
import java.util.Set;

import tenggle.activemdm.account.model.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.util.TextParseUtil;

public class AuthorizationInterceptor extends AbstractInterceptor {
    private static final long serialVersionUID = -5140884040684756043L;

    protected Set<String> skipActions = Collections.emptySet();

    public void setSkipActions(String skipActions) {
        this.skipActions = TextParseUtil.commaDelimitedStringToSet(skipActions);
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        User user = (User)invocation.getInvocationContext()
                .getSession().get(User.SESSION_KEY);

        boolean isLogined = user != null;
        String action = invocation.getProxy().getActionName();
        if (isLogined || skipActions.contains(action)) {
            return invocation.invoke();
        } else {
            return Action.LOGIN;
        }
    }
}
