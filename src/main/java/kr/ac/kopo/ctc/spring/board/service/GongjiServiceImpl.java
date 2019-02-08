package kr.ac.kopo.ctc.spring.board.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.ctc.spring.board.repository.GongjiRepository;

@Service
public class GongjiServiceImpl implements GongjiService {

	private static final Logger logger = LoggerFactory.getLogger(GongjiServiceImpl.class);
	
	@Autowired
	private GongjiRepository gongjiRepository;
	
}
