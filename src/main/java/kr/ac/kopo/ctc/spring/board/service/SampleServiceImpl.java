package kr.ac.kopo.ctc.spring.board.service;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.ctc.spring.board.domain.Sample;
import kr.ac.kopo.ctc.spring.board.repository.SampleRepository;

@Service
public class SampleServiceImpl implements SampleService {

	private static final Logger logger = LoggerFactory.getLogger(SampleServiceImpl.class);
	
	@Autowired
	private SampleRepository sampleRepository;
	
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
	
	@Override
	public String testNoTransactional() {
		Sample sample = sampleRepository.findById(1L).get();
		sample.setTitle("update1");
		sampleRepository.save(sample);
		
		throw new RuntimeException("Spring Boot No Transactional Test");
	}
	
	@Override
	@Transactional
	public String testTransactional() {
		Sample sample = sampleRepository.findById(1L).get();
		sample.setTitle("update1");
		sampleRepository.save(sample);
		
		throw new RuntimeException("Spring Boot Transactional Test");
	}
	
}
