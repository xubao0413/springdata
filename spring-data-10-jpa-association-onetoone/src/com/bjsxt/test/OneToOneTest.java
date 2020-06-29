package com.bjsxt.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bjsxt.dao.UsersDao;
import com.bjsxt.pojo.Roles;
import com.bjsxt.pojo.Users;

/**
 * 一对一关联关系测试
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class OneToOneTest {

	@Autowired
	private UsersDao usersDao;
	
	/**
	 * 添加用户同时添加角色
	 */
	@Test
	public void test1(){
		//创建角色
		Roles roles = new Roles();
		roles.setRolename("管理员");
		
		//创建用户
		Users users = new Users();
		users.setUserage(30);
		users.setUsername("赵小刚");
		
		//建立关系
		users.setRoles(roles);
		roles.setUsers(users);
		
		//保存数据
		this.usersDao.save(users);
	}
	
	/**
	 * 根据用户ID查询用户，同时查询用户角色
	 */
	@Test
	public void test2(){
		Users users = this.usersDao.findOne(13);
		System.out.println("用户信息："+users);
		Roles roles = users.getRoles();
		System.out.println(roles);
	}
}
