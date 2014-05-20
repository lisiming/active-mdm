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
 *  @package tenggle.activemdm.device.action
 *  @file    DeviceAction.java
 *  @date    2014-5-2
 */
package tenggle.activemdm.device.action;

import java.util.ArrayList;
import java.util.List;

import tenggle.activemdm.account.model.User;
import tenggle.activemdm.device.model.Device;
import tenggle.activemdm.device.service.DeviceService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DeviceAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1466506801815380808L;
	
	private Long deviceId;
    private Device device;
    private List<Device> deviceList;

    private DeviceService deviceService;

    public String list() throws Exception {
        if (deviceList == null) {
            deviceList = new ArrayList<Device>();
        }
        deviceList.addAll(getCurrentUser().getDevices());
        return "list";
    }

    public String show() throws Exception {
        device = getCurrentUser().getDevice(deviceId);
        return "show";
    }

    public String input() throws Exception {
        if (deviceId != null) {
            device = getCurrentUser().getDevice(deviceId);
        }
        return INPUT;
    }

    public String saveOrUpdate() throws Exception {
        device.setUser(getCurrentUser());
        deviceService.saveOrUpdateDevice(device);
        getCurrentUser().saveOrUpdateDevice(device);
        return SUCCESS;
    }

    public String delete() throws Exception {
        Device device = getCurrentUser().getDevice(deviceId);
        if (device != null) {
            deviceService.deleteDevice(deviceId);
            getCurrentUser().getDevices().remove(device);
        }
        return SUCCESS;
    }

    public List<Device> getDeviceList() {
        return deviceList;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public void setDeviceService(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    private User getCurrentUser() {
        return (User)ActionContext.getContext().getSession().get(User.SESSION_KEY);
    }

}
