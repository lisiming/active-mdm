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
 *  @package tenggle.activemdm.event.model
 *  @file    Event.java
 *  @date    2014-5-15
 */
package tenggle.activemdm.event.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Event implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1498853689095533152L;
	
	private Long id;
	private String equipment_id;
	private String devicemodel_id;
	private String event_name;
	private String event_category;
	private String event_message;
	private Timestamp create_time;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEquipment_id() {
		return equipment_id;
	}
	public void setEquipment_id(String equipment_id) {
		this.equipment_id = equipment_id;
	}
	public String getDevicemodel_id() {
		return devicemodel_id;
	}
	public void setDevicemodel_id(String devicemodel_id) {
		this.devicemodel_id = devicemodel_id;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public String getEvent_category() {
		return event_category;
	}
	public void setEvent_category(String event_category) {
		this.event_category = event_category;
	}
	public String getEvent_message() {
		return event_message;
	}
	public void setEvent_message(String event_message) {
		this.event_message = event_message;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}

}
