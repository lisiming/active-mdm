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
 *  @package tenggle.activemdm.account.dao
 *  @file    UserDao.java
 *  @date    2014-4-28
 */
package tenggle.activemdm.account.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import tenggle.activemdm.account.model.User;

public class UserDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public User getUser(String username) {
        Session session = sessionFactory.openSession();
        try {
            Query query = session.createQuery("from User u where u.username = :username");
            query.setString("username", username);
            query.setMaxResults(1);
            return (User)query.uniqueResult();
        } finally {
            session.close();
        }
    }

    public void addUser(User user) {
        Session session = sessionFactory.openSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            session.save(user);
            ts.commit();
        } finally {
            session.close();
        }
    }
}
