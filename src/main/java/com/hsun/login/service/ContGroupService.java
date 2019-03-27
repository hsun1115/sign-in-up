package com.hsun.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsun.login.model.ContGroup;
import com.hsun.login.repository.ContGroupRepository;

@Service
public class ContGroupService {
	@Autowired
	private ContGroupRepository contGroupRepository;
	//save
	public void save(ContGroup group1) {
		contGroupRepository.save(group1);
	}
	//find by group id and group name
	public ContGroup findIdAndGrpname(Long id, String groupname) {
		return contGroupRepository.findByIdAndGroupname(id, groupname);
	}

}
