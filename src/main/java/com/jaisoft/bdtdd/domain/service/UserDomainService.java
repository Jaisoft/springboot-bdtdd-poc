package com.jaisoft.bdtdd.domain.service;

import com.jaisoft.bdtdd.domain.model.UserDomain;

    public interface UserDomainService {
    
    UserDomain createUser(UserDomain user);
    UserDomain getUser(String userId);
    
}
