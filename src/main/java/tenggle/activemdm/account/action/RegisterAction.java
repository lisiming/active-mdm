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
 *  @file    RegisterAction.java
 *  @date    2014-4-29
 */
package tenggle.activemdm.account.action;

import tenggle.activemdm.account.model.User;
import tenggle.activemdm.account.service.UserAlreadyExistsException;
import tenggle.activemdm.account.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
    private static final long serialVersionUID = 7021982816578678150L;

    private User user;

    private UserService userService;

    public String execute() throws Exception {
        try {
            userService.addUser(user);
        } catch (UserAlreadyExistsException e) {
            return INPUT;
        }
        return SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
