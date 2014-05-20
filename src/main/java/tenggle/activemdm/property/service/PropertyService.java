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
 *  @package tenggle.activemdm.property.service
 *  @file    PropertyService.java
 *  @date    2014-5-15
 */
package tenggle.activemdm.property.service;

import java.util.List;

import tenggle.activemdm.property.dao.PropertyDao;
import tenggle.activemdm.property.model.Property;

public class PropertyService {

    private PropertyDao propertyDao;

    public void setPropertyDao(PropertyDao propertyDao) {
        this.propertyDao = propertyDao;
    }

    public List<Property> getPropertyList(String equipmentId) {
        return propertyDao.getPropertyList(equipmentId);
    }

    public Property getProperty(String equipmentId, String propertyName) {
        return propertyDao.getProperty(equipmentId, propertyName);
    }

    public void saveOrUpdateProperty(Property property) {
        propertyDao.saveOrUpdateProperty(property);
    }

    public void deletePropertiesByEquipmentId(String equipmentId) {
        propertyDao.deletePropertiesByEquipmentId(equipmentId);
    }
    
    public void deleteProperty(String equipmentId, String propertyName) {
        propertyDao.deleteProperty(equipmentId, propertyName);
    }

}
