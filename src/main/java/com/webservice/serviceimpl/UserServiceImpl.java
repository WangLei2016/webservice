package com.webservice.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import com.webservice.dao.User;
import com.webservice.service.UserServiceFacade;



@WebService
public class UserServiceImpl implements UserServiceFacade {

	private static Map<String,User> users = null;
	
	private static void init(){
		users = new HashMap<String,User>();
		users.put("张三", new User(1,"张三","上海浦东","zs@163.com"));
		users.put("李斯", new User(2,"李斯","上海浦东","ls@163.com"));
		users.put("王五", new User(3,"王五","上海浦东","ww@163.com"));
	}
	
	@Override
	public User getUserByName(String name) {
		if(users == null){
			init();
		}
		return users.get(name);
	}

	@Override
	public void setUser(User user) {
		// TODO Auto-generated method stub

	}

}
