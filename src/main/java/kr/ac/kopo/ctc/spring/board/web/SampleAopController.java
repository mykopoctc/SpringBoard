package kr.ac.kopo.ctc.spring.board.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.ctc.spring.board.service.SampleAopService;

@Controller
public class SampleAopController {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleAopController.class);

	@Autowired
	private SampleAopService sampleAopService;
	
	@RequestMapping(value = "/sample/noAop")
	@ResponseBody
	public String noAop(){
		return sampleAopService.testNoAop();
	}
	
	@RequestMapping(value = "/sample/aop")
	@ResponseBody
	public String aop(){
		return sampleAopService.testAop();
	}
	
}
