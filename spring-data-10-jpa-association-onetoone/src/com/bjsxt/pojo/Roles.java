package com.bjsxt.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_roles")
public class Roles {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="roleid")
	private Integer roleid;
	
	@Column(name="rolename")
	private String rolename;
	
	@OneToOne(mappedBy="roles")
	private Users users;
	
	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	@Override
	public String toString() {
		return "Roles [roleid=" + roleid + ", rolename=" + rolename + "]";
	}

	
	
}
