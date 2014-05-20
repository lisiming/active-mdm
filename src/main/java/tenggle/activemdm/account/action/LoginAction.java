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
 *  @file    LoginAction.java
 *  @date    2014-4-28
 */
package tenggle.activemdm.account.action;

import tenggle.activemdm.account.model.User;
import tenggle.activemdm.account.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private static final long serialVersionUID = -389833745243649130L;

    private String username;
    private String password;

    private UserService userService;

    public String execute() throws Exception {
        User u = userService.authenticate(username, password);
        if (u == null) {
            return INPUT;
        }

        ActionContext.getContext().getSession().put(User.SESSION_KEY, u);
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
