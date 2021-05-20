package com.ee.y1.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * =======================
 * JSP Controller
 * =======================
 */

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) {
		
		//model.addAttribute("message", "JSP Project");
		
		model.addAttribute("user", "iu");
		model.addAttribute("msg", "하루");
		
		return "index";
	}

}
