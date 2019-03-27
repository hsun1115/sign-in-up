//package com.hsun.login.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.hsun.login.model.Contact;
//import com.hsun.login.model.User;
//import com.hsun.login.repository.ContactRepository;
//
//@Service
//public class ContactService {
//	@Autowired
//	private ContactRepository contactRepository;
//
//	public void save(Contact contact1) {
//		contactRepository.save(contact1);
//	}
//
//	public List<Contact> findByUserId(User ownerId) {
//		return contactRepository.findByUser(ownerId);
//	}
////	public List<Contact> findAll(){
////		return contactRepository.findAll();
////	}
//	public Contact findByIdAndUId(Long id, User ownerId){
//		return contactRepository.findByIdAndUserId(id, ownerId);
//	}
//	public void delete(Contact contact1) {
//		contactRepository.delete(contact1);
//	}
//}
