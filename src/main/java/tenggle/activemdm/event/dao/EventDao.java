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
 *  @package tenggle.activemdm.event.dao
 *  @file    EventDao.java
 *  @date    2014-5-15
 */
package tenggle.activemdm.event.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import tenggle.activemdm.event.model.Event;

public class EventDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Event> getEventList() {
        Session session = sessionFactory.openSession();
        try {
            Query query = session.createQuery("from Event e");
            List<Event> eventList = query.list();
            return eventList;
        } finally {
            session.close();
        }
    }

    public Event getEvent(Long eventId) {
        Session session = sessionFactory.openSession();
        try {
            Query query = session.createQuery("from Event e where e.id = :id");
            query.setLong("id", eventId);
            query.setMaxResults(1);
            return (Event)query.uniqueResult();
        } finally {
            session.close();
        }
    }

    public void saveOrUpdateEvent(Event event) {
        Session session = sessionFactory.openSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            session.saveOrUpdate(event);
            ts.commit();
        } finally {
            session.close();
        }
    }

    public void deleteEvent(Long eventId) {
        Session session = sessionFactory.openSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            Event event = (Event)session.get(Event.class, eventId);
            session.delete(event);
            ts.commit();
        } finally {
            session.close();
        }
    }


}
