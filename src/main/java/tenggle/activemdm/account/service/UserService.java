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
 *  @package tenggle.activemdm.account.service
 *  @file    UserService.java
 *  @date    2014-4-28
 */
package tenggle.activemdm.account.service;

import tenggle.activemdm.account.dao.UserDao;
import tenggle.activemdm.account.model.User;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User authenticate(String username, String password) {
        User u = getUser(username);
        if (u != null && password.equals(u.getPassword())) {
            return u;
        }
        return null;
    }

    public User getUser(String username) {
        return userDao.getUser(username);
    }

    public void addUser(User user) throws UserAlreadyExistsException {
        User u = getUser(user.getUsername());
        if (u != null) {
            //register.user.already.exists
            throw new UserAlreadyExistsException();
        }
        userDao.addUser(user);
    }
}
