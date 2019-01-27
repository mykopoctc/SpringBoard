package kr.ac.kopo.ctc.spring.board.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.ctc.spring.board.service.SampleTransactionalService;

@Controller
public class SampleTransactionalController {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleTransactionalController.class);

	@Autowired
	private SampleTransactionalService sampleTransactionalService;
	
	@RequestMapping(value = "/sample/noTransactional")
	@ResponseBody
	public String noTransactional(){
		return sampleTransactionalService.testNoTransactional();
	}
	
	@RequestMapping(value = "/sample/transactional")
	@ResponseBody
	public String transactional(){
		return sampleTransactionalService.testTransactional();
	}
	
}
