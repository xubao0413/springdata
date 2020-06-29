package com.bjsxt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjsxt.pojo.Roles;
/**
 * 多对多关联关系讲解
 * @author Administrator
 *
 */
public interface RolesDao extends JpaRepository<Roles, Integer> {

}
