package kr.ac.kopo.ctc.spring.board.service;

import java.util.List;

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
	public List<Sample> findAll() {
		return sampleRepository.findAll();
	}
	
}
