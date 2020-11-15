package com.jaisoft.bdtdd.infrastructure.mongo.dao;

import com.jaisoft.bdtdd.infrastructure.mongo.data.UserDB;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSpringDataMongoRepository extends MongoRepository<UserDB, String> {
    }

