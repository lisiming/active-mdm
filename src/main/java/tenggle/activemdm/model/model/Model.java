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
 *  @package tenggle.activemdm.model.model
 *  @file    Model.java
 *  @date    2014-5-10
 */
package tenggle.activemdm.model.model;

import java.io.Serializable;
import java.sql.Timestamp;

// TODO: Auto-generated Javadoc
/**
 * The Class Model.
 */
public class Model implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7712528016573129946L;
	
	/** The id. */
	private long id;
	
	/** The make_name. */
	private String make_name;
	
	/** The model_name. */
	private String model_name;
	
	/** The create_time. */
	private Timestamp create_time;
	
	/** The image_url. */
	private String image_url;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * Gets the make_name.
	 *
	 * @return the make_name
	 */
	public String getMake_name() {
		return make_name;
	}
	
	/**
	 * Sets the make_name.
	 *
	 * @param make_name the new make_name
	 */
	public void setMake_name(String make_name) {
		this.make_name = make_name;
	}
	
	/**
	 * Gets the model_name.
	 *
	 * @return the model_name
	 */
	public String getModel_name() {
		return model_name;
	}
	
	/**
	 * Sets the model_name.
	 *
	 * @param model_name the new model_name
	 */
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	
	/**
	 * Gets the create_time.
	 *
	 * @return the create_time
	 */
	public Timestamp getCreate_time() {
		return create_time;
	}
	
	/**
	 * Sets the create_time.
	 *
	 * @param create_time the new create_time
	 */
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	
	/**
	 * Gets the image_url.
	 *
	 * @return the image_url
	 */
	public String getImage_url() {
		return image_url;
	}
	
	/**
	 * Sets the image_url.
	 *
	 * @param image_url the new image_url
	 */
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	

}
