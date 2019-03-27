package com.hsun.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hsun.login.model.User;
import com.hsun.login.service.UserService;

@Controller

@RequestMapping("/front/*")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	// go to register page
	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	// after register go back to login page
	@RequestMapping("/doregister")
	public String register(HttpServletRequest request, User user) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		String email = request.getParameter("email");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		if (password.equals(password2)) {
			if (registerUser(username) == true) {
				User user1 = new User();
				user1.setUsername(username);
				user1.setPassword(password);
				user1.setEmail(email);
				user1.setFirstname(firstname);
				user1.setLastname(lastname);
				userService.save(user1);
				return "login";
			} else {
				return "register";
			}
		} else {
			return "register";
		}
	}

	public Boolean registerUser(String username) {
		Boolean a = true;
		if (userService.findByName(username).isEmpty()) {
			return a;
		} else {
			return false;
		}
	}

	// go to login
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	// do login
	@RequestMapping("/dologin")
	public String login(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(30*60);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = userService.findNameAndPsw(username, password);
//		session.setAttribute("username", username);
//		session.setAttribute("firstname", user.getFirstname());
		String str = "";
		if (user != null) {
			session.setAttribute("username", username);
			session.setAttribute("firstname", user.getFirstname());
			session.setAttribute("userid", user.getId());
			str = "welcome";
		} else {
			str = "login";
		}
		return str;
	}
	//do logout
	@RequestMapping("/dologout")
	public String logout(HttpSession session) {
		session.removeAttribute("username");
		session.removeAttribute("firstname");
		return "login";
	}
}
