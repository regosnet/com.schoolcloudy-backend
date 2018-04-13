package com.schoolcloudy.web.mvc.controllers;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

import com.mysql.fabric.xmlrpc.base.Array;
import com.schoolcloudy.model.entities.Administrator;
import com.schoolcloudy.model.entities.Student;
import com.schoolcloudy.model.shared.entities.Contact;
import com.schoolcloudy.model.shared.entities.Gender;
import com.schoolcloudy.model.shared.entities.User;
import com.schoolcloudy.service.administrative.AdministrativeService;


@Controller
@RequestMapping("/school/administrator")
public class AdministratorRestController {

	@Autowired
	private AdministrativeService administrativeService;

	// gets one Administrator
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/get/administrators", method = RequestMethod.POST)
	public ResponseEntity<Administrator> getAdministrator(@RequestBody Object admin){
		System.out.println(admin);
		Administrator administrator = null;
		return new ResponseEntity<Administrator>(administrator, HttpStatus.OK);
	}

	// gets one Administrators
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/get/all/administrators", method = RequestMethod.GET)
	public ResponseEntity<List<Administrator>> getAdministrators(){
		List<Administrator> administrator = this.administrativeService.getAdministrators();
		return new ResponseEntity<List<Administrator>>(administrator, HttpStatus.OK);
	}


	// Add Administrator
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/roll-on/new/administrator", method = RequestMethod.POST)
	public ResponseEntity<List<Administrator>> addAdministrator(@RequestBody Administrator st, UriComponentsBuilder builder) {
		System.out.println(st);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/st/{internalId}").buildAndExpand(st.getInternalId()).toUri());
		return new ResponseEntity<List<Administrator>>(headers, HttpStatus.CREATED);
	}

	// gets all students
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/get/all/students", method = RequestMethod.GET)
	public ResponseEntity<List<Student>> getStudents(){
		HttpHeaders headers = new HttpHeaders();
		List<Student> students = this.administrativeService.getStudents();
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}


	public Student addNewStudent() {
		User student = new Student();
		student.setFirstName("Raphel");
		student.setLastName("Igwenna");
		student.setMiddleName("Green");
		student.setGender(Gender.Male);
		student.setContact(this.addContact());
		student.setDateOfBirth(new Date());
		student.setStartDate(new Date());
		student.setEndDate(new Date());
		student.setLanguage("English");
		student.setStatus("student");
		return (Student) student;
	}

	public Contact addContact() {
		Contact contact = new Contact();
		contact.setCity("Riga");
		contact.setEmail("ralphel@gmail.com");
		contact.setHouseNumber(102);
		contact.setMobilePhoneNumber("+3717876373");
		contact.setState("Latvia");
		contact.setStreet("Mega Street");
		contact.setZipCode("LV-8890");
		return contact;
	}

}
