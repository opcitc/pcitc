package com.org.cbs.dao;

import com.org.cbs.model.User;

public interface UserDao {
	int insert();
	User select();
}
