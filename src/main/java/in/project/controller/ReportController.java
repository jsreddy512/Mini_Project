package in.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import in.project.service.ReportService;

public class ReportController {
	@Autowired
	private ReportService service;
	@GetMapping("/")
	public String indexPage() {
		return "index";
		
	}

}
