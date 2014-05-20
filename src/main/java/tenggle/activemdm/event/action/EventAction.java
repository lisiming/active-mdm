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
 *  @package tenggle.activemdm.event.action
 *  @file    EventAction.java
 *  @date    2014-5-15
 */
package tenggle.activemdm.event.action;

import java.util.List;

import tenggle.activemdm.event.model.Event;
import tenggle.activemdm.event.service.EventService;

import com.opensymphony.xwork2.ActionSupport;

public class EventAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 665773018345958658L;
	
	private Long eventId;
    private Event event;
    private List<Event> eventList;

    private EventService eventService;

    public String list() throws Exception {
        
        eventList = eventService.getEventList();
        return "list";
    }

    public String show() throws Exception {
        event = eventService.getEvent(eventId);
        return "show";
    }

    public String input() throws Exception {
        if (eventId != null) {
            event = eventService.getEvent(eventId);
        }
        return INPUT;
    }

    public String saveOrUpdate() throws Exception {
        eventService.saveOrUpdateEvent(event);
        return SUCCESS;
    }

    public String delete() throws Exception {
        Event event = eventService.getEvent(eventId);
        if (event != null) {
            eventService.deleteEvent(eventId);
        }
        return SUCCESS;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

}
