package com.example.student_mini_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.student_mini_app.entiites.Student;

@Controller
public class StudentController {

	@GetMapping("/")
	public String studentDetails(Model model) {
		
		model.addAttribute("std", new Student("Rahul", 21, "Java full Stack"));
		
		return "student";
	}
}
