package kr.ac.kopo.ctc.spring.board.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Phone {
	
	@Id
	@GeneratedValue
	@Column
	private Integer id;
	
	@Column
	private String no;
	
//	@Column
//	private int memberId;
	
//	@ManyToOne(targetEntity=Member.class, fetch=FetchType.LAZY)
//	@JoinColumn(name="member_id")
//	private Member member;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="member_id")
	private Member member;
	
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

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	
//	public int getMemberId() {
//		return memberId;
//	}
//
//	public void setMemberId(int memberId) {
//		this.memberId = memberId;
//	}
	
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	@Override
	public String toString() {
		String result = "[phone_"+id+"] " + no;
		return result;
	}

}
