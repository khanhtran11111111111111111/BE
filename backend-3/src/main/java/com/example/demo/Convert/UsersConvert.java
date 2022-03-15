package com.example.demo.Convert;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.DTO.UsersDTO;
import com.example.demo.Entity.UsersEntity;



@Component
public class UsersConvert {
	 public UsersDTO entityToDto(UsersEntity user)
	 {
		 
		 UsersDTO dto= new UsersDTO();
		 dto.setId(user.getId());
		 dto.setFullname(user.getFullname());
		 dto.setBirth(user.getBirth());
		 dto.setAddress(user.getAddress());
		 dto.setPhone(user.getPhone());
		 dto.setEmail(user.getEmail());
		 dto.setSex(user.getSex());
		 dto.setUsername(user.getUsername());
		 dto.setPassword(user.getPassword());
		 dto.setIs_delete(user.getIs_delete());
		 dto.setRole_id(user.getRole_id());
		 
		return dto;
		 
	 }
	 public List<UsersDTO> entityToDto(List<UsersEntity> alluser){
		 return alluser.stream().map(x-> entityToDto(x)).collect(Collectors.toList());
	 }
	 public UsersEntity DtoToEntity(UsersDTO dto)
	 {	
		 UsersEntity user=new UsersEntity();
		 user.setId(dto.getId());
		 user.setFullname(dto.getFullname());
		 user.setBirth(dto.getBirth());
		 user.setAddress(dto.getAddress());
		 user.setPhone(dto.getPhone());
		 user.setEmail(dto.getEmail());
		 user.setSex(dto.getSex());
		 user.setUsername(dto.getUsername());
		 user.setPassword(dto.getPassword());
		 user.setIs_delete(dto.getIs_delete());
		 user.setRole_id(dto.getRole_id());
		 
		 return user;
	
	 }
	 public List<UsersEntity> DtoToEntity(List<UsersDTO> dto)
	 {
		 return dto.stream().map(x->DtoToEntity(x)).collect(Collectors.toList());
	 }
}
