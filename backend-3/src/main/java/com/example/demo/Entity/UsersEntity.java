package com.example.demo.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
@SQLDelete(sql = "UPDATE users SET is_delete = true WHERE id=?")
@Where(clause = "is_delete=false")
public class UsersEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="fullname")
	private String Fullname;
	@Column(name="birth")
	private Date Birth;
	@Column(name="address")
	private String Address;
	@Column(name="email")
	private String Email;
	@Column(name="phone")
	private String Phone;
	@Column(name="sex")
	private int Sex;
	@Column(name="username")
	private String Username;
	@Column(name="password")
	private String Password;
	@Column(name="created_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date Created_date=new Date();
	@Column(name="update_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date Update_date=new Date();
	@Column(name="is_delete")
	private Boolean Is_delete= Boolean.FALSE;
	@Column(name="role_id")
	private long Role_id;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id",referencedColumnName = "id")
	List<Detail_borrowEntity> borrowEntities=new ArrayList<>();
	public UsersEntity() {
	
		
	}
	
	public long getRole_id() {
		return Role_id;
	}

	public void setRole_id(long role_id) {
		Role_id = role_id;
	}

	public List<Detail_borrowEntity> getBorrowEntities() {
		return borrowEntities;
	}

	public void setBorrowEntities(List<Detail_borrowEntity> borrowEntities) {
		this.borrowEntities = borrowEntities;
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
	public Date getCreated_date() {
		return Created_date;
	}
	public void setCreated_date(Date created_date) {
		Created_date = created_date;
	}
	public Date getUpdate_date() {
		return Update_date;
	}
	public void setUpdate_date(Date update_date) {
		Update_date = update_date;
	}
	public Boolean getIs_delete() {
		return Is_delete;
	}
	public void setIs_delete(Boolean is_delete) {
		Is_delete = is_delete;
	}

	public UsersEntity(String fullname, Date birth, String address, String email, String phone, int sex,
			String username, String password, Date created_date, Date update_date, Boolean is_delete, long role_id) {
		super();
		this.Fullname = fullname;
		this.Birth = birth;
		this.Address = address;
		this.Email = email;
		this.Phone = phone;
		this.Sex = sex;
		this.Username = username;
		this.Password = password;
		this.Created_date = created_date;
		this.Update_date = update_date;
		this.Is_delete = is_delete;
		this.Role_id = role_id;
		
	}
	
	
	
	
	
}
