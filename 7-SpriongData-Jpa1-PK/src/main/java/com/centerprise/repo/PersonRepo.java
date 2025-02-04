package com.centerprise.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centerprise.entity.PersonEntity;
import com.centerprise.entity.PersonPKEntity;

public interface PersonRepo extends JpaRepository<PersonEntity, PersonPKEntity> {

}
