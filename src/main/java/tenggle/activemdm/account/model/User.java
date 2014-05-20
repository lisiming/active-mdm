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
 *  @package tenggle.activemdm.account.model
 *  @file    User.java
 *  @date    2014-4-28
 */
package tenggle.activemdm.account.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import tenggle.activemdm.device.model.Device;

public class User implements Serializable {
    private static final long serialVersionUID = -101885742532588984L;

    public static final String SESSION_KEY = "user_session_key";

    private Long id;
    private String username;
    private String password;
    private String confirmPassword;
    private Timestamp create_time;
    private Set<Device> devices = new HashSet<Device>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
    public Timestamp getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}

	public Set<Device> getDevices() {
        return devices;
    }

    public void setDevices(Set<Device> devices) {
        this.devices = devices;
    }

    public Device getDevice(Long deviceId) {
        for (Device device : devices) {
            if (deviceId != null && deviceId.equals(device.getId())) {
                return device;
            }
        }
        return null;
    }
    
    public void saveOrUpdateDevice(Device device) {
    	Long deviceId = device.getId();
    	for (Device dev : devices) {
    		if (deviceId != null && deviceId.equals(dev.getId())) {
    			devices.remove(dev);
    		}
    	}
    	devices.add(device);
    }
}
