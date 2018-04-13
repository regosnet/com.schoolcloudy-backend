package com.schoolcloudy.web.mvc.controllers;
/*
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.schoolcloudy.model.shared.entities.School;
import com.schoolcloudy.repository.staff.AdministratorRepository;
import com.schoolcloudy.service.administrative.AdministrativeService;
import com.schoolcloudy.service.administrative.exception.AdministrativeServiceException;



@Controller
@RequestMapping(value="/schools")
@SessionAttributes("newSchoolFormObject")
public class SchoolController {

	@Autowired
	AdministrativeService administrativeService;
	@Autowired
	AdministratorRepository admministratorRepository;
	*/
	/*
	 * Here I indicate that this controller uses the 'SchoolValidator'
	 *//*
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		//dataBinder.setDisallowedFields("fieldName"); could be used to skip error binding for this field
		//dataBinder.addValidators(new SchoolValidator());
		
	}


	@RequestMapping(value="/create/new/school/form", method=RequestMethod.GET)
	public String newSchoolForm() {
		/*Person p = new Person();
		p.setFirstName("Chimac");
		p.setLastName("Ugonna");
		Person p2 = new Person();
		p2.setFirstName("Harrison");
		p2.setLastName("Sampsons");
		Person p3 = new Person();
		p3.setFirstName("Onyeka");
		p3.setLastName("Chidinma");
		
		admministratorRepository.addNewPerson(p);
		admministratorRepository.addNewPerson(p2);
		admministratorRepository.addNewPerson(p3);
	
		return "new_school";
	}

	@RequestMapping(value="/create/new/school/form/review", method=RequestMethod.POST)
	public String newSchoolFormPreview(@Valid @ModelAttribute("newSchoolFormObject") School school, Errors errors) throws AdministrativeServiceException {
		if(errors.hasErrors()) throw new AdministrativeServiceException("No field should be empty");
			System.out.println(school.getSchoolName());
			System.out.println(errors.hasErrors());
		return "new_school_form_review";
	}
	
	@RequestMapping(value="/create/new/school/form/add", method=RequestMethod.POST)
	public String addNewSchool(@ModelAttribute("newSchoolFormObject") School school) throws AdministrativeServiceException {
		//administrativeService.addNewSchool(school);
		return "redirect:/";
	}

	@ModelAttribute("newSchoolFormObject")
	public School getResource(){
		return new School();
	}


}*/
