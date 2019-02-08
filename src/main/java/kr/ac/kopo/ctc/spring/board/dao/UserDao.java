package kr.ac.kopo.ctc.spring.board.dao;

import java.util.List;

import kr.ac.kopo.ctc.spring.board.domain.User;

public interface UserDao {
	User findById(int id);
	List<User> findAll();
	int save(User user);
	void delete(User user);
	int deleteAll();
	void flush();
}
