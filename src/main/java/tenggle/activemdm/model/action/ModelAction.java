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
 *  @package tenggle.activemdm.model.action
 *  @file    ModelAction.java
 *  @date    2014-5-12
 */
package tenggle.activemdm.model.action;

import java.util.List;

import tenggle.activemdm.model.model.Model;
import tenggle.activemdm.model.service.ModelService;

import com.opensymphony.xwork2.ActionSupport;

public class ModelAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4955492783489939720L;
	
	private Long modelId;
    private Model model;
    private List<Model> modelList;

    private ModelService modelService;

    public String list() throws Exception {
        /*if (modelList == null) {
            modelList = new ArrayList<Model>();
        }*/
        modelList = modelService.getModelList();
        return "list";
    }

    public String show() throws Exception {
        model = modelService.getModel(modelId);
        return "show";
    }

    public String input() throws Exception {
        if (modelId != null) {
        	model = modelService.getModel(modelId);
        }
        return INPUT;
    }

    public String saveOrUpdate() throws Exception {
        modelService.saveOrUpdateModel(model);
        return SUCCESS;
    }

    public String delete() throws Exception {
    	model = modelService.getModel(modelId);
        if (model != null) {
            modelService.deleteModel(modelId);
        }
        return SUCCESS;
    }

    public List<Model> getModelList() {
        return modelList;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

}
