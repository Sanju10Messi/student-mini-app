package com.example.student_mini_app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.student_mini_app.entiites.Student;

@Controller
public class StudentController {

	@GetMapping("/")
	public String studentDetails(Model model) {
		
		model.addAttribute("std", new Student("Rahul", 21, "Java full Stack"));
		
		return "student";
	}
	
	@GetMapping("/register")
	public String studentRegister(Model model) {
		
		
		model.addAttribute("stdForm", new Student());
		
		return "register";
	}
	
	@PostMapping("/register")
	public String studentRegistered(
	        @ModelAttribute("stdForm") Student student,
	        Model model) {

	    model.addAttribute("std", student);
	   

	    return "view";
	}
	
}
