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
 *  @package tenggle.activemdm.property.dao
 *  @file    PropertyDao.java
 *  @date    2014-5-15
 */
package tenggle.activemdm.property.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import tenggle.activemdm.property.model.Property;

public class PropertyDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Property> getPropertyList(String equipmentId) {
        Session session = sessionFactory.openSession();
        try {
            Query query = session.createQuery("from Property p where p.equipment_id = :id");
            query.setString("id", equipmentId);
            List<Property> propertyList = query.list();
            return propertyList;
        } finally {
            session.close();
        }
    }
    
    public Property getProperty(String equipmentId, String propertyName) {
    	Session session = sessionFactory.openSession();
    	try {
    		Query query = session.createQuery("from Property p where p.equipment_id = ? and p.property_name = ?");
    		query.setString(0, equipmentId);
    		query.setString(1, propertyName);
    		List<Property> propertyList = query.list();
    		return propertyList.size() > 0 ? propertyList.get(0) : null;
    	} finally {
    		session.close();
    	}
    }

    public void saveOrUpdateProperty(Property property) {
        Session session = sessionFactory.openSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            session.saveOrUpdate(property);
            ts.commit();
        } finally {
            session.close();
        }
    }

    /**
     * delete all properties belonging to a device
     * @param equipmentId
     */
    public void deletePropertiesByEquipmentId(String equipmentId) {
        Session session = sessionFactory.openSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            Query query = session.createQuery("delete Property p where p.equipment_id = :id");
            query.setString("id", equipmentId);
            query.executeUpdate();
            ts.commit();
        } finally {
            session.close();
        }
    }
    
    /**
     * delete a device property by its name
     * @param equipmentId
     * @param propertyName
     */
    public void deleteProperty(String equipmentId, String propertyName) {
        Session session = sessionFactory.openSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            Query query = session.createQuery("delete Property p where p.equipment_id = ? and p.property_name = ?");
            query.setString(0, equipmentId);
            query.setString(1, propertyName);
            query.executeUpdate();
            ts.commit();
        } finally {
            session.close();
        }
    }


}
