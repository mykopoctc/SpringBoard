package kr.ac.kopo.ctc.spring.board.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.ac.kopo.ctc.spring.board.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;
	
	@Before
	public void before() {
	}
	
	@After
	public void after() {
	}
	
	@Test
	@Transactional
	public void findAll() {
		User first = new User("나연");
		User second = new User("정연");
		User third = new User("모모");
 
		userRepository.save(first);
		userRepository.save(second);
		userRepository.save(third);
 
		List<User> list = userRepository.findAll();
 
		for(User u : list ){
			System.out.println(u.getName());
		}
		
//		assertEquals(3, userRepository.findAll().size());
//		userRepository.deleteAll();
//		userRepository.flush();
//		assertEquals(0, userRepository.findAll().size());
	}
	
	
}
