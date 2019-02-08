package kr.ac.kopo.ctc.spring.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.ctc.spring.board.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);
//	List<User> findByNameAndAgeLessThan(String name, int age);
//	
//	@Query("select t from Member t where name=:name and age < :age")
//	List<User> findByNameAndAgeLessThanSQL(@Param("name") String name, @Param("age") int age);
//	
//	List<User> findByNameAndAgeLessThanOrderByAgeDesc(String name, int age);
}
