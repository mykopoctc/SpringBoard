package kr.ac.kopo.ctc.spring.board.dao;

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
public class UserDaoTest {

	@Autowired
	private UserDao userDao;
	
	@Before
	public void before() {
//		User first = new User("나연");
//		User second = new User("정연");
//		User third = new User("모모");
//		
//		userDao.save(first);
//		userDao.save(second);
//		userDao.save(third);
	}
	
	@After
	public void after() {
//		userDao.deleteAll();
//		userDao.flush();
	}
	
	@Test
	@Transactional
	public void findAll() {
		List<User> list = userDao.findAll();
 
		for(User u : list ){
			System.out.println(u.getName());
		}
		
//		assertEquals(3, userRepository.findAll().size());
//		userRepository.deleteAll();
//		userRepository.flush();
//		assertEquals(0, userRepository.findAll().size());
	}
	
	
}
