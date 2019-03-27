package com.hsun.login.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hsun.login.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {

}
