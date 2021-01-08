package com.jaisoft.bdtdd.domain.repository;
import com.jaisoft.bdtdd.domain.model.UserDomain;

public interface UserDomainRepository {
    UserDomain createUser(UserDomain user);
    UserDomain getUser(String userId);
    
}
