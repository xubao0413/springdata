package com.bjsxt.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.bjsxt.dao.UsersDao;
import com.bjsxt.pojo.Users;

@Repository
public class UsersDaoImpl  implements UsersDao {

	@PersistenceContext(name="entityManagerFactory")
	private EntityManager entityManager;
	
	@Override
	public void insertUsers(Users users) {
		this.entityManager.persist(users);
	}

	@Override
	public void updateUsers(Users users) {
		this.entityManager.merge(users);
	}

	@Override
	public void deleteUsers(Users users) {
		Users  u = this.selectUsersById(users.getUserid());
		this.entityManager.remove(u);
	}

	@Override
	public Users selectUsersById(Integer userid) {
		return this.entityManager.find(Users.class, userid);
	}

	@Override
	public List<Users> selectUserByName(String username) {
		return null;
	}

	@Override
	public List<Users> selectUserByNameUseSQL(String username) {
		return null;
	}

	@Override
	public List<Users> selectUserByNameUseCriteria(String username) {
		return null;
	}


}
