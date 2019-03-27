//package com.hsun.login.controller;
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.hsun.login.model.Contact;
//import com.hsun.login.model.User;
//import com.hsun.login.service.ContactService;
//import com.hsun.login.service.UserService;
//
//@RestController
//@RequestMapping("/list/*")
//public class ContactController {
//
//	public ContactService contactService;
//	public UserService userService;
//	
//	public ContactController(ContactService contactService, UserService userService) {
//		// TODO Auto-generated constructor stub
//		this.contactService=contactService;
//		this.userService=userService;
//	}
//	@RequestMapping("/")
//	public String allcontact() {
//		return "all-contact";
//	}
//	
////	@GetMapping("/addcontact")
////	public String showSignUpForm(Contact contact) {
////		return "add-contact";
////	}
////
////	@GetMapping("/operation/{userId}/contacts")
////	public List<Contact> getAllContactsByUserId(@PathVariable(value = "userId") Long userId) {
////		return contactService.findByUserId(userId);
////	}
////
////	@PostMapping("/operation/{userId}/addcontact")
////	public String addContact(@PathVariable(value = "userId") Long userId, @Valid @RequestBody Contact contact,
////			BindingResult result, Model model) {
////		if (result.hasErrors()) {
////			return "add-contact";
////		}
////		User user1 = userService.findByUId(userId);
////		contact.setUser(user1);
////		contactService.save(contact);
////		model.addAttribute("contacts", contactService.findByUserId(userId));
////		return "contact-list";
////	}
////	
////	@GetMapping("/operation/{userId}/contacts/{id}")
////	public String deleteContact(@PathVariable(value="userId") Long userId,@PathVariable(value="contactId") Long contactId, Model model) {
////		Contact contact1=contactService.findByIdAndUId(contactId, userId);
////		contactService.delete(contact1);
////		model.addAttribute("contacts", contactService.findByUserId(userId));
////		return "contact-list";
////	}
//	
//	
//	//=============================================
//	////// to do update
//
////	@GetMapping("/addcontactform")
////	public String showAddContactForm(Contact contact) {
////		return "add-contact";
////	}
////
////	@PostMapping("/addcontact")
////	public String addUser(@Valid Contact contact, BindingResult result, Model model) {
////		if (result.hasErrors()) {
////			return "add-contact";
////		}
////
////		contactRepository.save(contact);
////		model.addAttribute("contacts", contactRepository.findAll());
////		return "dashboard";
////	}
////
////	@GetMapping("/edit/{id}")
////	public String showUpdateForm(@PathVariable("id") Long id, Model model) {
////		Contact contact = contactRepository.findById(id)
////				.orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
////		model.addAttribute("contact", contact);
////		return "update-contact";
////	}
////
////	@PostMapping("/update/{id}")
////	public String updateUser(@PathVariable("id") Long id, @Valid Contact contact, BindingResult result, Model model) {
////		if (result.hasErrors()) {
////			contact.setId(id);
////			return "update-contact";
////		}
////
////		contactRepository.save(contact);
////		model.addAttribute("contacts", contactRepository.findAll());
////		return "dashboard";
////	}
//
////	@GetMapping("/operation/{userId}/contacts/{id}")
////	public String deleteContact(@PathVariable(value="userId") Long userId,@PathVariable(value="contactId") Long contactId, Model model) {
////		Contact contact = contactRepository.findBy
////				.orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
////		contactRepository.delete(contact);
////		model.addAttribute("contacts", contactRepository.findAll());
////		return "dashboard";
////	}
//}
