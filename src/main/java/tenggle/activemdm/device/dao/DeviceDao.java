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
 *  @package tenggle.activemdm.device.dao
 *  @file    DeviceDao.java
 *  @date    2014-5-2
 */
package tenggle.activemdm.device.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import tenggle.activemdm.device.model.Device;

public class DeviceDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Device> getDeviceList() {
        Session session = sessionFactory.openSession();
        try {
            Query query = session.createQuery("from Device d");
            List<Device> deviceList = query.list();
            return deviceList;
        } finally {
            session.close();
        }
    }

    public Device getDevice(Long deviceId) {
        Session session = sessionFactory.openSession();
        try {
            Query query = session.createQuery("from Device d where d.id = :id");
            query.setLong("id", deviceId);
            query.setMaxResults(1);
            return (Device)query.uniqueResult();
        } finally {
            session.close();
        }
    }

    public void saveOrUpdateDevice(Device device) {
        Session session = sessionFactory.openSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            session.saveOrUpdate(device);
            ts.commit();
        } finally {
            session.close();
        }
    }

    public void deleteDevice(Long deviceId) {
        Session session = sessionFactory.openSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            Device device = (Device)session.get(Device.class, deviceId);
            session.delete(device);
            ts.commit();
        } finally {
            session.close();
        }
    }


}
