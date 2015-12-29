package com.aurum.struts.rest;

import java.util.Map;

import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.aurum.struts.model.User;
import com.aurum.struts.repository.UserRepository;
import com.opensymphony.xwork2.ModelDriven;

public class UserController implements ModelDriven<Object> {
	
	public User user = new User();
	
	private String id;
	
	private Object users;
	
	private UserRepository repository = new UserRepository();
	
	// GET	/api/users
	public HttpHeaders index() {
		users = repository.findAll();
		System.out.println("GET \t /user");
		return new DefaultHttpHeaders("index");
	}
	
	// GET	/api/users/1
	public HttpHeaders show() {
		users = repository.get(getId());
		System.out.println("GET \t /user/{id}");
		return new DefaultHttpHeaders("show");
	}
	
	// POST	/api/users
	public HttpHeaders create() {
		users = repository.save(user);
		System.out.println("POST \t /user" + user.getEmail());
		return new DefaultHttpHeaders("create");
	}
	
	// PUT	/api/users
	public HttpHeaders update() {
		users = repository.save(user);
		System.out.println("PUT \t /user");
		return new DefaultHttpHeaders("update");
	}
	
	// DELETE	/api/users/1
	public HttpHeaders destroy() {
		users = repository.remove(getId());
		System.out.println("DELETE \t /user/{id}");
		return new DefaultHttpHeaders("destroy");
	}
	
	// GET	/api/users/1/edit
	public HttpHeaders edit() {
		users = repository.get(getId());
		System.out.println("GET \t /user/{id}");
		return new DefaultHttpHeaders("edit");
	}

	public UserRepository getRepository() {
		return repository;
	}

	public void setRepository(UserRepository repository) {
		this.repository = repository;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUsers(Map<String, User> users) {
		this.users = users;
	}
	
	public Object getModel() {
		if(users == null) {
			return user;	
		} else {
			return users;
		}
	}

}
