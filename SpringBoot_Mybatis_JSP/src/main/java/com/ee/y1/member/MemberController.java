package com.ee.y1.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	
	@GetMapping("join")
	public void join(Model model) throws Exception {
						//내용은 없는 빈 객체를 하나 보내줌
		model.addAttribute("memberVO", new MemberVO());
		
	}

}
