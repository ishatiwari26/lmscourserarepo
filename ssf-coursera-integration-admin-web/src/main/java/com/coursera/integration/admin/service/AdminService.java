package com.coursera.integration.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coursera.integration.admin.dao.AdminDao;
import com.coursera.integration.admin.model.LmsCourseraConfigModel;

@Component
public class AdminService {
	
	@Autowired
	AdminDao adminDao;
	
	public List<LmsCourseraConfigModel> getListOfClientConfig(){
		return (List<LmsCourseraConfigModel>) adminDao.findAll();
	}
}
