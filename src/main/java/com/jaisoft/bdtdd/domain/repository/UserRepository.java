package com.jaisoft.bdtdd.domain.repository;

import com.jaisoft.bdtdd.domain.model.UserDomain;

public interface UserRepository {
    
    UserDomain saveUser(UserDomain user);
    
}