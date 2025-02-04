package com.centerprise.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.centerprise.entity.PassportEntity;


@Repository
public interface PassportRepo extends JpaRepository<PassportEntity, Integer>{

}
