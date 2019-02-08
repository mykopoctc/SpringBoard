package kr.ac.kopo.ctc.spring.board.web;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.ctc.spring.board.domain.User;
import kr.ac.kopo.ctc.spring.board.repository.UserRepository;
import kr.ac.kopo.ctc.spring.board.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository userRepository;
	
	@Transactional
	private void aaa() {
		User first = new User("나연");
		User second = new User("정연");
		User third = new User("모모");
 
		userRepository.save(first);
		userRepository.save(second);
		userRepository.save(third);
 
		userRepository.deleteAll();
	}
	
	@RequestMapping(value = "/user/findAll")
	public String findAll(Model model) {
		
		aaa();
		
		
		List<User> list = userRepository.findAll();
		model.addAttribute("users", list);
		return "user/findAll";
	}
	
	@RequestMapping(value = "/login")
	public String login(Model model) {
		return "login";
	}

}
