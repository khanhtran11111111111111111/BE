package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.UsersEntity;
public interface UsersService {
	UsersEntity saveUser(UsersEntity user);
	List<UsersEntity> getAllUser();
	UsersEntity getUserById(long id);
	UsersEntity updateUser(UsersEntity user, long id);
	void deleteUser(long id);
	
	 
}
