package com.aurum.struts.repository;

import java.util.HashMap;
import java.util.Map;

import com.aurum.struts.model.User;

public class UserRepository {
	
	private static Map<String, User> users = new HashMap<String,User>(); 
	
	public UserRepository() {
		users.put("1", new User("1", "Siva", "9842012345"));
		users.put("2" , new User("2", "Ilango", "7842012345"));
		users.put("3", new User("3", "Aurum", "8015726858"));
	}
	
	public Map<String, User> save(User user) {
		String id = String.valueOf(users.size() + 1);
		users.put(id, user);
		return users;
	}
	
	public Map<String, User> findAll() {
		return users;
	}
	
	public User get(String id) {
		return users.get(id);
	}
	
	public Map<String, User> remove(String id) {
		users.remove(id);
		return users;
	}

}
