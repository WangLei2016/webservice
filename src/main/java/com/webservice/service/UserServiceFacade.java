package com.webservice.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.webservice.dao.User;



@WebService
public interface UserServiceFacade {

	public User getUserByName( String name);

	public void setUser(User user);
}
