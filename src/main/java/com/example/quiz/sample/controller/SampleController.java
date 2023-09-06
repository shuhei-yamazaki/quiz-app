package com.example.quiz.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {
	@GetMapping
	public String sample(Model model) {
		model.addAttribute("title", "SamplePage2");
		model.addAttribute("message", "これはサンプルページです。2");
		return "sample";
	}
}
