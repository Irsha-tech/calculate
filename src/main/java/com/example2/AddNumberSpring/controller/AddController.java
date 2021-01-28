package com.example2.AddNumberSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example2.AddNumberSpring.domain.Add;

@Controller
public class AddController {
	@GetMapping("/index")
 public String ViewForm(Model model) {
	 model.addAttribute("Addition",new Add());
	 return "index";
	
}
	@PostMapping("/add")
	public String addForm(@ModelAttribute Add add,BindingResult result,Model model) {
		model.addAttribute("add",add);
			return "calculate";
	}
}