package kr.ac.kopo.ctc.spring.board.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Gongji {
	
	@Id
	@GeneratedValue
	@Column
	private Integer id;
	
	@Column
	private String title;
	
	@Column
	private Date date;
	
	@Column
	private String content;
	
	@Column
	private int hits;
	
	@ManyToOne(optional=false, fetch=FetchType.EAGER)
	@JoinColumn(name="user_id")
	private User user;
	
	public Gongji() {}
	
	public Gongji(String title, Date created, String content){
		this.title = title;
		this.date = created;
		this.content = content;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public User getUser() {
		if( user == null ){
			user = new User();
		}
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
//	@Override
//	public String toString() {
//		String result = "[phone_"+id+"] " + no;
//		return result;
//	}

}
