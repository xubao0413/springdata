package com.bjsxt.dao;

import com.bjsxt.pojo.Users;

public interface UsersRepository {

	public Users findUserById(Integer userid);
}
