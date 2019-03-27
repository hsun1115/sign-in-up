package com.hsun.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsun.login.model.User;
import com.hsun.login.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	//this function for login
	public User findNameAndPsw(String username, String password) {
		return userRepository.findByUsernameAndPassword(username, password);
	}
	//save
	public void save(User user1) {
		userRepository.save(user1);
	}
	//find byname
	public List<User> findByName(String username){
		return userRepository.findByUsername(username);
	}
//	public User findByUId(Long id){
//		return userRepository.findByUserId(id);
//	}
}
