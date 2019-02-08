package kr.ac.kopo.ctc.spring.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.ctc.spring.board.domain.Gongji;
import kr.ac.kopo.ctc.spring.board.repository.GongjiRepository;
import kr.ac.kopo.ctc.spring.board.service.GongjiService;

@Controller
public class GongjiController {
	
	@Autowired
	GongjiService gongjiService;
	
	@Autowired
	GongjiRepository gongjiRepository;
	
	@RequestMapping(value = "/gongji/findAll")
	public String findAll(Model model) {
		List<Gongji> list = gongjiRepository.findAll();
		model.addAttribute("gongjies", list);
		return "gongji/findAll";
	}

}
