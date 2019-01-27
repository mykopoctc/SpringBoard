package kr.ac.kopo.ctc.spring.board.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SampleAopServiceImpl implements SampleAopService {

	private static final Logger logger = LoggerFactory.getLogger(SampleAopServiceImpl.class);
	
	@Override
	public String testNoAop() {
		String msg = "Hello, Spring Boot No AOP";
		logger.info(msg);
		return msg;
	}
	
	@Override
	public String testAop() {
		String msg = "Hello, Spring Boot AOP";
		logger.info(msg);
		return msg;
	}
	
}
