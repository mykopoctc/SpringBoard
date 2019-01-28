package kr.ac.kopo.ctc.spring.board.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Member {
	
	@Id
	@GeneratedValue
	@Column
	private Integer id;
	
	@Column
	private String name;
	
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="memberId")
	private Collection<Phone> phones;
	
	public Member() {}
	
	public Member(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Phone> getPhones() {
		return phones;
	}

	public void setPhones(Collection<Phone> phones) {
		this.phones = phones;
	}

	public void addPhone(Phone p){
		if( phones == null ){
			phones = new ArrayList<Phone>();
		}
		phones.add(p);
	}
 
	@Override
	public String toString() {
		String result = "["+id+"] " + name;
		for( Phone p : phones ){
			result += "\n" + p.toString();
		}
		return result;
	}
	
}
