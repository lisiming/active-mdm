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
 *  @package tenggle.activemdm.device.service
 *  @file    DeviceService.java
 *  @date    2014-5-4
 */
package tenggle.activemdm.device.service;

import java.util.List;

import tenggle.activemdm.device.dao.DeviceDao;
import tenggle.activemdm.device.model.Device;

public class DeviceService {
	private DeviceDao deviceDao;
	
	public void setDeviceDao(DeviceDao deviceDao) {
        this.deviceDao = deviceDao;
    }

    public List<Device> getDeviceList() {
        return deviceDao.getDeviceList();
    }

    public Device getDevice(Long deviceId) {
        return deviceDao.getDevice(deviceId);
    }

    public void saveOrUpdateDevice(Device device) {
        deviceDao.saveOrUpdateDevice(device);
    }

    public void deleteDevice(Long deviceId) {
        deviceDao.deleteDevice(deviceId);
    }

}
