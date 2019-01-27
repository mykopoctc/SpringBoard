package kr.ac.kopo.ctc.spring.board.service;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.ctc.spring.board.domain.Sample;
import kr.ac.kopo.ctc.spring.board.repository.SampleRepository;

@Service
public class SampleTransactionalServiceImpl implements SampleTransactionalService {

	private static final Logger logger = LoggerFactory.getLogger(SampleTransactionalServiceImpl.class);
	
	@Autowired
	private SampleRepository sampleRepository;
	
	@Override
	public String testNoTransactional() {
		Sample sample = sampleRepository.findById(1L).get();
		sample.setTitle("update1");
		sampleRepository.save(sample);
		
		throw new RuntimeException("Spring Boot No Transactional");
	}
	
	@Override
	@Transactional
	public String testTransactional() {
		Sample sample = sampleRepository.findById(1L).get();
		sample.setTitle("update1");
		sampleRepository.save(sample);
		
		throw new RuntimeException("Spring Boot Transactional");
	}
	
}
