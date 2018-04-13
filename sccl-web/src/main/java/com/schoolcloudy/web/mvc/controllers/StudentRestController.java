package com.schoolcloudy.web.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysql.fabric.xmlrpc.base.Array;
import com.schoolcloudy.model.entities.Administrator;
import com.schoolcloudy.model.entities.Student;
import com.schoolcloudy.service.administrative.AdministrativeService;

@Controller
@RequestMapping("/school/students")
public class StudentRestController {

	@Autowired
	private AdministrativeService administrativeService;
	
	
}
