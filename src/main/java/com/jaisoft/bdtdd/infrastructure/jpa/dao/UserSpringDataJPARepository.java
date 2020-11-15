package com.jaisoft.bdtdd.infrastructure.jpa.dao;

import org.springframework.stereotype.Repository;

import com.jaisoft.bdtdd.infrastructure.jpa.data.UserJPA;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserSpringDataJPARepository extends JpaRepository<UserJPA,String> {
    
}
