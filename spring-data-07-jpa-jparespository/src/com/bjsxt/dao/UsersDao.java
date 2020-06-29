package com.bjsxt.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.bjsxt.pojo.Users;

/**
 * JpaRepository接口讲解
 * @author Administrator
 *
 */
public interface UsersDao extends JpaRepository<Users, Integer>{
	
}
