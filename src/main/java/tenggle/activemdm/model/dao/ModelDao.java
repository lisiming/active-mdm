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
 *  @package tenggle.activemdm.model.dao
 *  @file    ModelDao.java
 *  @date    2014-5-10
 */
package tenggle.activemdm.model.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import tenggle.activemdm.model.model.Model;

public class ModelDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Model> getModelList() {
        Session session = sessionFactory.openSession();
        try {
            Query query = session.createQuery("from Model m");
            List<Model> modelList = query.list();
            return modelList;
        } finally {
            session.close();
        }
    }

    public Model getModel(Long modelId) {
        Session session = sessionFactory.openSession();
        try {
            Query query = session.createQuery("from Model m where m.id = :id");
            query.setLong("id", modelId);
            query.setMaxResults(1);
            return (Model)query.uniqueResult();
        } finally {
            session.close();
        }
    }

    public void saveOrUpdateModel(Model model) {
        Session session = sessionFactory.openSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            session.saveOrUpdate(model);
            ts.commit();
        } finally {
            session.close();
        }
    }

    public void deleteModel(Long modelId) {
        Session session = sessionFactory.openSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            Model model = (Model)session.get(Model.class, modelId);
            session.delete(model);
            ts.commit();
        } finally {
            session.close();
        }
    }


}
