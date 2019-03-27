package com.hsun.login.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hsun.login.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public User findByUsernameAndPassword(String username, String password);

	public List<User> findByUsername(String username);
	
}
