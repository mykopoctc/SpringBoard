package kr.ac.kopo.ctc.spring.board.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.ctc.spring.board.domain.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public UserDaoImpl(EntityManagerFactory factory) {
		this.sessionFactory = factory.unwrap(SessionFactory.class);
	}
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public User findById(int id) {
		String hql = "FROM User u WHERE u.id = " + id;
		Query query = getSession().createQuery(hql);
		return (User) query.uniqueResult();
	}
	
	@Override
	public List<User> findAll() {
		String hql = "FROM User";
		Query query = getSession().createQuery(hql);
		return query.list();
	}

	@Override
	public int save(User user) {
		return (int) getSession().save(user);
	}

	@Override
	public void delete(User user) {
		getSession().delete(user);
	}
	
	@Override
	public int deleteAll() {
		String hql = "DELETE FROM User";
		Query query = getSession().createQuery(hql);
		return query.executeUpdate();
	}

	@Override
	public void flush() {
		getSession().flush();
	}
}
