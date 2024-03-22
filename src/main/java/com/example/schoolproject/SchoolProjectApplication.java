package com.example.schoolproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolProjectApplication.class, args);
	}

}

//APIs
//GET /school
//GET /school/{school-name}/classes
//GET /school/{school-name}/class/{class-name}/subjects
//GET /school/{school-name}/class/{class-name}/subject/{subject-name}


// models -- school, class, subjects --- java objects -- controller to service
// dto -- data transfer obj - controller to service
// entities - school, class, subject, student --- service to repo