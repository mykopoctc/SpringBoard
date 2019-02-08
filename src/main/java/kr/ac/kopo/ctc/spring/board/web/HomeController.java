package kr.ac.kopo.ctc.spring.board.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/")
	public String home(Model model) {
		model.addAttribute("name", "홍길동");
		return "home/hello";
	}

	@RequestMapping(value = "/hello")
	public String hello(Model model) {
		model.addAttribute("name", "홍길동");
		return "home/hello";
	}
	
	@RequestMapping(value = "/ajax")
	public String ajax() {
		return "home/ajax";
	}
	
//	@RequestMapping(value = "/login")
//	public String login() {
//		return "login";
//	}
	
//	public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/login").setViewName("login");
//    }

}
