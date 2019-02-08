package kr.ac.kopo.ctc.spring.board.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.ctc.spring.board.domain.Gongji;

@Repository
public interface GongjiRepository extends JpaRepository<Gongji, Integer> {
//	Page<Gongji> findAll(Pageable pageable);
//	Page<Gongji> findAllByOrderByIdDesc(Pageable pageable);
//	Page<Gongji> findAllByAuthor(String author, Pageable pageable);
//
//	@Query("select t from Gongji t where content like concat('%', :searchString ,'%')")
//	Page<Gongji> findAllSearch(@Param("searchString") String searchString, Pageable pageable);
}
