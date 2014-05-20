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
 *  @package tenggle.activemdm.account.action
 *  @file    LogoutAction.java
 *  @date    2014-4-29
 */
package tenggle.activemdm.account.action;

import tenggle.activemdm.account.model.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport {
    private static final long serialVersionUID = -518996422060716751L;

    public String execute() throws Exception {
        ActionContext.getContext().getSession().remove(User.SESSION_KEY);
        return SUCCESS;
    }
}
