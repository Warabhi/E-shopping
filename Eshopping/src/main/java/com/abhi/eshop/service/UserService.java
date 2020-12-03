package com.abhi.eshop.service;

import com.abhi.eshop.entities.User;

public interface UserService {
	

    User validateUser(String email, String password) ;

    User registerUser(String firstName, String lastName, String email, String password);


}
