package kr.ac.kopo.ctc.spring.board.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.ctc.spring.board.domain.Sample;
import kr.ac.kopo.ctc.spring.board.repository.SampleRepository;
import kr.ac.kopo.ctc.spring.board.service.SampleService;

@Controller
public class SampleController {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

	@Autowired
	private SampleRepository sampleRepository;
	
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping(value = "/sample/noAop")
	@ResponseBody
	public String noAop(){
		return sampleService.test();
	}
	
	@RequestMapping(value = "/sample/aop")
	@ResponseBody
	public String aop(){
		return sampleService.testAop();
	}
	
	@RequestMapping(value = "/sample/findAll")
	@ResponseBody
	public List<Sample> findAll(Model model) {
		return sampleRepository.findAll();
//		return sampleRepository.findAllByTitle("t2");
//		return sampleRepository.findAllByTitleContaining("t2");
	}
	
}
