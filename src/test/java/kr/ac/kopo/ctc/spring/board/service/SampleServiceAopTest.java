package kr.ac.kopo.ctc.spring.board.service;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleServiceAopTest {

	@Autowired
	private SampleAopService sampleAopService;
	
	@Ignore
	@Test
	public void testNoAop() {
		sampleAopService.testNoAop();
	}
	
	@Test
	public void testAop() {
		sampleAopService.testAop();
	}
	
}
