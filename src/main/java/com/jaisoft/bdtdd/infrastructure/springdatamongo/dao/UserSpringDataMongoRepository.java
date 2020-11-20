package com.jaisoft.bdtdd.infrastructure.springdatamongo.dao;

import com.jaisoft.bdtdd.infrastructure.springdatamongo.data.UserDocument;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSpringDataMongoRepository extends MongoRepository<UserDocument, String> {
    }

