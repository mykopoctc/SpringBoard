package kr.ac.kopo.ctc.spring.board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.ctc.spring.board.domain.Sample;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long> {
	List<Sample> findAllByTitle(String title);
	List<Sample> findAllByTitleContaining(String title);
}
