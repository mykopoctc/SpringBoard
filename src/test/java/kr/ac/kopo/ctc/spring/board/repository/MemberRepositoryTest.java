package kr.ac.kopo.ctc.spring.board.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.ac.kopo.ctc.spring.board.domain.Member;
import kr.ac.kopo.ctc.spring.board.domain.Phone;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {

	@Autowired
	private MemberRepository memberRepository;
	
	@Test
	public void findAll() {
		Member first = new Member("Jung");
		first.addPhone(new Phone("010-XXXX-XXXX"));
		first.addPhone(new Phone("010-YYYY-YYYY"));
 
		Member second = new Member("Dong");
		second.addPhone(new Phone("010-ZZZZ-ZZZZ"));
 
		Member third = new Member("Min");
 
		memberRepository.save(first);
		memberRepository.save(second);
		memberRepository.save(third);
 
		List<Member> list = memberRepository.findAll();
 
		for( Member m : list ){
			System.out.println(m.toString());
		}
 
		memberRepository.deleteAll();
	}
	
}
