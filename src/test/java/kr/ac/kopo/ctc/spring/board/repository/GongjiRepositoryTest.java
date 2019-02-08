package kr.ac.kopo.ctc.spring.board.repository;

import java.text.SimpleDateFormat;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.ac.kopo.ctc.spring.board.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GongjiRepositoryTest {

	@Autowired
	private GongjiRepository gongjiRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@Test
	@Transactional
	public void findAll() {
		User first = new User("Jung");
		User second = new User("Dong");
		User third = new User("Min");
		
//		first.getGongjies().add(new Gongji("title1", sdf.parse("2019-02-08"), "hello world!"));
 
//		memberRepository.save(first);
//		memberRepository.save(second);
//		memberRepository.save(third);
// 
//		Gongji p = new Gongji("010-XXXX-YYYY");
//		p.setMember(first);
//		phoneRepository.save(p);
// 
//		List<Gongji> phones = phoneRepository.findAll();
// 
//		for( Gongji e : phones ){
//			System.out.println(e.toString() +" "+ e.getMember().toString());
//		}
// 
//		memberRepository.deleteAll();
//		phoneRepository.deleteAll();
	}
	
}
