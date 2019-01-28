package kr.ac.kopo.ctc.spring.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.ctc.spring.board.domain.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer> {
}
