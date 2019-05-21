package com.coursera.integration.admin.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coursera.integration.admin.model.LmsCourseraConfigModel;

@Repository
public interface AdminDao extends CrudRepository<LmsCourseraConfigModel, Integer>{
	

}
