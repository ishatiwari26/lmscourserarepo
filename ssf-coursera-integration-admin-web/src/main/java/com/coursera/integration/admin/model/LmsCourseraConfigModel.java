package com.coursera.integration.admin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "CONFIG", schema = "COURSERAINTEGRATION_SCHEMA")
public class LmsCourseraConfigModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer clientOrgId;
	private String clientOrgName;
	private String courseraApiClientSecret;
	private String courseraApiClientId;
	private String lmsApiClientSecret;
	private String lmsApiClientId;
	private String courseraContactPerson;
	private String email;
	private String courseraApiHost;
	private String lmsApiHost;
	private String ftpHost;
	private String ftpUser;
	private String ftpPassword;
	private Long phone;

}
