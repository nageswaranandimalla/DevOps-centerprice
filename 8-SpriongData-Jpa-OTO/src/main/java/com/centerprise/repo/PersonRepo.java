package com.centerprise.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.centerprise.entity.PersonEntity;

@Repository
public interface PersonRepo extends JpaRepository<PersonEntity, Integer>{

}
