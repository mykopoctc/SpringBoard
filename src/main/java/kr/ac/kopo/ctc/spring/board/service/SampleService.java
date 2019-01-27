package kr.ac.kopo.ctc.spring.board.service;

public interface SampleService {
	// aop
	String testNoAop();
	String testAop();
	
	// transactional
	String testNoTransactional();
	String testTransactional();
}
