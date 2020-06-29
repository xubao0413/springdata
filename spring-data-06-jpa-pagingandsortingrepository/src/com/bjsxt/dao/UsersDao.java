package com.bjsxt.dao;



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.bjsxt.pojo.Users;

/**
 * PagingAndSortingRepository接口讲解
 * @author Administrator
 *
 */
public interface UsersDao extends PagingAndSortingRepository<Users, Integer>{
	
}
