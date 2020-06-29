package com.bjsxt.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.bjsxt.pojo.Users;

/**
 * JpaSpecificationExecutor接口讲解
 * @author Administrator
 *注意：JpaSpecificationExecutor<Users>:不能单独使用，需要配合着jpa中的其他接口一起使用
 */
public interface UsersDao extends JpaRepository<Users, Integer>,JpaSpecificationExecutor<Users>{
	
}
