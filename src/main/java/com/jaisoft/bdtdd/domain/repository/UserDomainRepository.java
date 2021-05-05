package com.jaisoft.bdtdd.domain.repository;
import com.jaisoft.bdtdd.domain.model.UserDomain;

import java.util.List;

public interface UserDomainRepository {
    UserDomain createUser(UserDomain user);
    UserDomain getUser(String userId);
    List<UserDomain> getUsers();
    
}
