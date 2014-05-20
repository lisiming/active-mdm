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
 *  @package tenggle.activemdm.model.service
 *  @file    ModelService.java
 *  @date    2014-5-12
 */
package tenggle.activemdm.model.service;

import java.util.List;

import tenggle.activemdm.model.dao.ModelDao;
import tenggle.activemdm.model.model.Model;

public class ModelService {

	private ModelDao modelDao;
	
	public void setModelDao(ModelDao modelDao) {
        this.modelDao = modelDao;
    }

    public List<Model> getModelList() {
        return modelDao.getModelList();
    }

    public Model getModel(Long modelId) {
        return modelDao.getModel(modelId);
    }

    public void saveOrUpdateModel(Model model) {
        modelDao.saveOrUpdateModel(model);
    }

    public void deleteModel(Long modelId) {
        modelDao.deleteModel(modelId);
    }



}
