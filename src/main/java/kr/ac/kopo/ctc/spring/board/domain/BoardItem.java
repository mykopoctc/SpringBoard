package kr.ac.kopo.ctc.spring.board.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BoardItem {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id; // 게시글 번호

	@Column
	private String author; // 게시글 작성자

	@Column
	private String subject; // 게시글 제목

	@Column
	private String content; // 게시글 본문

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
