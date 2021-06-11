package com.qa.javaminiproject.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.javaminiproject.blog.service.BlogService;

@RestController
@RequestMapping("blog")
public class JournalController {

	private JournalService service;

	public JournalController(JournalService service) {
		this.service = service;
	}
	
	
	
	
}
