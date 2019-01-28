package kr.ac.kopo.ctc.spring.board.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Phone {
	
	@Id
	@GeneratedValue
	@Column
	private Integer id;
	
	@Column
	private int memberId;
	
	@Column
	private String no;
	
	public Phone() {}
	
	public Phone(String no){
		this.no = no;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	
	@Override
	public String toString() {
		String result = "[phone_"+id+"] " + no;
		return result;
	}

}
