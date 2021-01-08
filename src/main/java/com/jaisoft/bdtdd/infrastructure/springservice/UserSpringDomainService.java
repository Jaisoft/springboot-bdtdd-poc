package com.jaisoft.bdtdd.infrastructure.springservice;

import com.jaisoft.bdtdd.domain.service.UserDomainServiceImpl;
import com.jaisoft.bdtdd.infrastructure.springrepository.UserSpringDataMongoRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserSpringDomainService extends UserDomainServiceImpl {
    @Autowired
    public UserSpringDomainService(UserSpringDataMongoRepositoryImpl userSpringDataMongoRepositoryImpl){
        super(userSpringDataMongoRepositoryImpl);
    }

}
