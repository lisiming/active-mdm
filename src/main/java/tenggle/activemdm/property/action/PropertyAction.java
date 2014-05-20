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
 *  @package tenggle.activemdm.property.action
 *  @file    PropertyAction.java
 *  @date    2014-5-15
 */
package tenggle.activemdm.property.action;

import java.util.List;

import tenggle.activemdm.property.model.Property;
import tenggle.activemdm.property.service.PropertyService;

import com.opensymphony.xwork2.ActionSupport;

public class PropertyAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3135851239673575823L;
	
	private String equipmentId;
	private String propertyName;
    private Property property;
    private List<Property> propertyList;

    private PropertyService propertyService;

    public String list() throws Exception {
        
        propertyList = propertyService.getPropertyList(equipmentId);
        return "list";
    }

    public String show() throws Exception {
        property = propertyService.getProperty(equipmentId, propertyName);
        return "show";
    }

    public String input() throws Exception {
        if (equipmentId != null && propertyName != null) {
            property = propertyService.getProperty(equipmentId, propertyName);
        }
        return INPUT;
    }

    public String saveOrUpdate() throws Exception {
        propertyService.saveOrUpdateProperty(property);
        return SUCCESS;
    }

    public String delete() throws Exception {
        Property property = propertyService.getProperty(equipmentId, propertyName);
        if (property != null) {
            propertyService.deleteProperty(equipmentId, propertyName);
        }
        return SUCCESS;
    }

    public List<Property> getPropertyList() {
        return propertyList;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public String getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

    public void setPropertyService(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

	
}
