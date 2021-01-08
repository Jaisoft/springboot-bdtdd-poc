package com.jaisoft.bdtdd.domain.apidomain;
import com.jaisoft.bdtdd.domain.model.UserDomain;

public interface UserDomainAPI {

    UserDomain createUser(UserDomain user);
    UserDomain getUser(String userId);
}
