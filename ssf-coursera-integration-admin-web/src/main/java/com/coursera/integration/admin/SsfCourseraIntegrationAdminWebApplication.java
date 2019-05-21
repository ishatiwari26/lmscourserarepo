package com.coursera.integration.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SsfCourseraIntegrationAdminWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsfCourseraIntegrationAdminWebApplication.class, args);
	}

}
