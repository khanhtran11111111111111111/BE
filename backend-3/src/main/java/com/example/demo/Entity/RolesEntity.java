package com.example.demo.Entity;

import java.util.ArrayList;
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

@Entity
@Table(name="roles")
public class RolesEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="code")
	private String Code;
	@Column(name="name")
	private String Name;
	@Column(name="description")
	private String Description;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="role_id",referencedColumnName = "id")
	List<UsersEntity> usersEntities=new ArrayList<>();
	public List<UsersEntity> getUsersEntities() {
		return usersEntities;
	}
	public void setUsersEntities(List<UsersEntity> usersEntities) {
		this.usersEntities = usersEntities;
	}
	public RolesEntity() {}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public RolesEntity(String code, String name, String description) {
		super();
		Code = code;
		Name = name;
		Description = description;
	}
	
}
