package com.jaisoft.bdtdd.infrastructure.springdatajpa.dao;

import org.springframework.stereotype.Repository;

import com.jaisoft.bdtdd.infrastructure.springdatajpa.data.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserSpringDataJPARepository extends JpaRepository<UserEntity,String> {
    
}
