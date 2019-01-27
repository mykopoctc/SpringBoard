package kr.ac.kopo.ctc.spring.board.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello")
	public String hello(Model model) {
		model.addAttribute("name", "홍길동");
		return "hello";
	}
	
	@RequestMapping(value = "/ajax")
	public String ajax() {
		return "ajax";
	}

}
