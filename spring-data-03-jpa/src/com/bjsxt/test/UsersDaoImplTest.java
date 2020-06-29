package com.bjsxt.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.bjsxt.dao.UsersDao;
import com.bjsxt.pojo.Users;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UsersDaoImplTest {

	@Autowired
	private UsersDao usersDao;
	
	
	/**
	 * 添加用户
	 */
	@Test
	@Transactional// 在测试类对于事务提交方式默认的是回滚。
	@Rollback(false)//取消自动回滚
	public void testInsertUsers(){
		Users users = new Users();
		users.setUserage(24);
		users.setUsername("张三");
		this.usersDao.save(users);
	}
	
}
