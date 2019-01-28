package kr.ac.kopo.ctc.spring.board.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.ac.kopo.ctc.spring.board.domain.Member;
import kr.ac.kopo.ctc.spring.board.domain.Phone;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhoneRepositoryTest {

	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private PhoneRepository phoneRepository;
	
	@Test
	@Transactional
	public void manyToOne_OneWay() {
		Member first = new Member("Jung");
		Member second = new Member("Dong");
		Member third = new Member("Min");
 
		memberRepository.save(first);
		memberRepository.save(second);
		memberRepository.save(third);
 
		Phone p = new Phone("010-XXXX-YYYY");
		p.setMember(first);
		phoneRepository.save(p);
 
		List<Phone> phones = phoneRepository.findAll();
 
		for( Phone e : phones ){
			System.out.println(e.toString() +" "+ e.getMember().toString());
		}
 
		memberRepository.deleteAll();
		phoneRepository.deleteAll();
	}
	
}
