package com.jaisoft.bdtdd.infrastructure.springservice;

import com.jaisoft.bdtdd.domain.service.UserServiceImpl;
//import com.jaisoft.bdtdd.infrastructure.springdatajpa.dao.UserSpringDataJPARepositoryImpl;
import com.jaisoft.bdtdd.infrastructure.springdatamongo.dao.UserSpringDataMongoRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserSpringService extends UserServiceImpl {

    //@Autowired
    /*public UserSpringService(UserSpringDataJPARepositoryImpl userSpringDataJPARepositoryImpl){
        super(userSpringDataJPARepositoryImpl);
    }*/
    
    @Autowired
    public UserSpringService(UserSpringDataMongoRepositoryImpl userSpringDataMongoRepositoryImpl){
        super(userSpringDataMongoRepositoryImpl);
    }

}
