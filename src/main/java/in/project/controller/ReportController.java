package in.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.project.request.SearchRequest;
import in.project.service.ReportService;

public class ReportController {
	@Autowired
	private ReportService service;
	@GetMapping("/")
	public String indexPage(Model model) { // To send the data from controller to UI
		
		SearchRequest searchObj=new SearchRequest();
		
		model.addAttribute("search", searchObj);
		
		return "index";
		
	}

}
