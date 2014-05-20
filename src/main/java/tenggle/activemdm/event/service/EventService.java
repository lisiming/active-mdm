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
 *  @package tenggle.activemdm.event.service
 *  @file    EventService.java
 *  @date    2014-5-15
 */
package tenggle.activemdm.event.service;

import java.util.List;

import tenggle.activemdm.event.dao.EventDao;
import tenggle.activemdm.event.model.Event;

public class EventService {

    private EventDao eventDao;

    public void setEventDao(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    public List<Event> getEventList() {
        return eventDao.getEventList();
    }

    public Event getEvent(Long eventId) {
        return eventDao.getEvent(eventId);
    }

    public void saveOrUpdateEvent(Event event) {
        eventDao.saveOrUpdateEvent(event);
    }

    public void deleteEvent(Long eventId) {
        eventDao.deleteEvent(eventId);
    }


}
