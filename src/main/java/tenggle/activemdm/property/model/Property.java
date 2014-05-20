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
 *  @package tenggle.activemdm.property.model
 *  @file    Property.java
 *  @date    2014-5-15
 */
package tenggle.activemdm.property.model;

import java.io.Serializable;

public class Property implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3887701827849286601L;
	
	private Long id;
	private String equipment_id;
	private String property_name;
	private String property_value;
	
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
	public String getProperty_name() {
		return property_name;
	}
	public void setProperty_name(String property_name) {
		this.property_name = property_name;
	}
	public String getProperty_value() {
		return property_value;
	}
	public void setProperty_value(String property_value) {
		this.property_value = property_value;
	}
	

}
