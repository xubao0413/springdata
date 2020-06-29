package com.bjsxt.dao;



import org.springframework.data.repository.CrudRepository;

import com.bjsxt.pojo.Users;

/**
 * CrudRepository接口讲解
 * @author Administrator
 *
 */
public interface UsersDao extends CrudRepository<Users, Integer> {
	
}
