package kr.ac.kopo.ctc.spring.board.di;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.ac.kopo.ctc.spring.board.service.SampleService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleMajorServiceTest {

	@Autowired
	private SampleService sampleService;
	
	@Ignore
	@Test
	public void findAll() {
		sampleService.findAll();
	}
	
}