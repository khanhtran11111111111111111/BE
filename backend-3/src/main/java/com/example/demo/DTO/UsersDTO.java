package com.example.demo.DTO;

import java.util.Date;

import lombok.Data;

@Data
public class UsersDTO {
	private long id;
	private String Fullname;
	private Date Birth;
	private String Address;
	private String Email;
	private String Phone;
	private int Sex;
	private String Username;
	private String Password;
	private Boolean Is_delete= Boolean.FALSE;
	private long Role_id;
	 
	public UsersDTO() {
	
	}
	
	public long getRole_id() {
		return Role_id;
	}

	public void setRole_id(long role_id) {
		this.Role_id = role_id;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public Date getBirth() {
		return Birth;
	}
	public void setBirth(Date birth) {
		Birth = birth;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public int getSex() {
		return Sex;
	}
	public void setSex(int sex) {
		Sex = sex;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	public Boolean getIs_delete() {
		return Is_delete;
	}
	public void setIs_delete(Boolean is_delete) {
		Is_delete = is_delete;
	}

	public UsersDTO(String fullname, Date birth, String address, String email, String phone, int sex,
			String username, String password, Boolean is_delete, long role_id) {
		super();
		this.Fullname = fullname;
		this.Birth = birth;
		this.Address = address;
		this.Email = email;
		this.Phone = phone;
		this.Sex = sex;
		this.Username = username;
		this.Password = password;
		this.Is_delete = is_delete;
		this.Role_id = role_id;
	}
	
	
}
