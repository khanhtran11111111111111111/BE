package com.example.demo.Service.IMPL;

import java.util.Date;
import java.util.List;


import org.springframework.stereotype.Service;

import com.example.demo.Entity.UsersEntity;
import com.example.demo.Repository.UsersRepository;
import com.example.demo.Service.UsersService;
import com.example.demo.exception.ResourceNotFoundException;


@Service
public class UsersServiceimpl implements UsersService{
	private UsersRepository usersRepository;
	public UsersServiceimpl(UsersRepository usersRepository) {
		super();
		this.usersRepository=usersRepository;
	}
	@Override
	public UsersEntity saveUser(UsersEntity user) {
		user.setRole_id(1);
		user.setIs_delete(false);
		user.setCreated_date(new Date());
		return usersRepository.save(user);
	}

	@Override
	public List<UsersEntity> getAllUser() {
		return usersRepository.findAll();
	}
	@Override
	public UsersEntity getUserById(long id) {
		return usersRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User", "Id", id));
	}
	@Override
	public UsersEntity updateUser(UsersEntity user, long id) {
		UsersEntity existingUser=usersRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User", "Id", id));
		existingUser.setFullname(user.getFullname());
		existingUser.setAddress(user.getAddress());
		existingUser.setBirth(user.getBirth());
		existingUser.setPhone(user.getPhone());
		existingUser.setSex(user.getSex());
		existingUser.setUsername(user.getUsername());
		existingUser.setPassword(user.getPassword());
		existingUser.setRole_id(user.getRole_id());
		existingUser.setUpdate_date(new Date());
		
		
		//save toDB
		usersRepository.save(existingUser);
		
		return existingUser;
	}
	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		usersRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User", "Id", id));
		usersRepository.deleteById(id);
	}
	

}
