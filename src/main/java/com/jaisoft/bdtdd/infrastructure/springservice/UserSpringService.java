package com.jaisoft.bdtdd.infrastructure.springservice;

import com.jaisoft.bdtdd.domain.service.UserServiceImpl;
import com.jaisoft.bdtdd.infrastructure.springrepository.UserSpringDataMongoRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserSpringService extends UserServiceImpl {
    @Autowired
    public UserSpringService(UserSpringDataMongoRepositoryImpl userSpringDataMongoRepositoryImpl){
        super(userSpringDataMongoRepositoryImpl);
    }

}
