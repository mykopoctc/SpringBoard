package kr.ac.kopo.ctc.spring.board.service;

import kr.ac.kopo.ctc.spring.board.domain.User;

public interface UserService {
	User findByUsername(String username);
}
