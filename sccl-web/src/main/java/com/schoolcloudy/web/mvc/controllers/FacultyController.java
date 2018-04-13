package com.schoolcloudy.web.mvc.controllers;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.schoolcloudy.model.shared.entities.Faculty;
import com.schoolcloudy.service.administrative.AdministrativeService;



@Controller
@RequestMapping("/faculties")
@SessionAttributes("newFaculty")
public class FacultyController {
	
	
	@Autowired
	private AdministrativeService administrativeService;
	
	@RequestMapping(value="/create/new/faculty/form", method=RequestMethod.GET)
	public String createNewFacultyForm(@ModelAttribute Faculty newFaculty, Model model) {
		model.addAttribute("createNewFaculty", newFaculty);
		return "create_new_faculty_form";
	}
	
	@RequestMapping(value="/create/new/faculty/add", method=RequestMethod.POST)
	public String createNewFacultyAdd(@ModelAttribute Faculty newFaculty) {
		System.out.println(newFaculty.getFacultyName());
		return "redirect:/faculties/list/of/faculties";
	}
	
	@RequestMapping(value="/create/new/faculty/preview", method=RequestMethod.POST)
	public String createNewFacultyPreview(@ModelAttribute("newFaculty") Faculty newFaculty) {
		System.out.println(newFaculty.getFacultyName());
		return "file";
	}
	
	@RequestMapping(value="/list/of/faculties", method=RequestMethod.GET)
	public String facultyList() {
		return "faculty_list";
	}
	
	@ModelAttribute("newFaculty")
	public Faculty getFaculty() {
		return new Faculty();
	}
	
}*/
