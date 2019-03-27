package com.hsun.login.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hsun.login.model.ContGroup;

@Repository
public interface ContGroupRepository extends CrudRepository<ContGroup, Long>{
	public ContGroup findByIdAndGroupname(Long id, String groupname);
}
