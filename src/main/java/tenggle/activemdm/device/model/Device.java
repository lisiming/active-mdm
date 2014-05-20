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
 *  @package tenggle.activemdm.device.model
 *  @file    Device.java
 *  @date    2014-5-2
 */
package tenggle.activemdm.device.model;

import java.io.Serializable;
import java.sql.Timestamp;

import tenggle.activemdm.account.model.User;

public class Device implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7697826648894760698L;
	
	private Long id;
	private String equipment_id;
	private String mac_addr;
	private User user;
	private long devicemodel_id;
	private String dialing_number;
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
	public String getMac_addr() {
		return mac_addr;
	}
	public void setMac_addr(String mac_addr) {
		this.mac_addr = mac_addr;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public long getDevicemodel_id() {
		return devicemodel_id;
	}
	public void setDevicemodel_id(long devicemodel_id) {
		this.devicemodel_id = devicemodel_id;
	}
	public String getDialing_number() {
		return dialing_number;
	}
	public void setDialing_number(String dialing_number) {
		this.dialing_number = dialing_number;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}

}
