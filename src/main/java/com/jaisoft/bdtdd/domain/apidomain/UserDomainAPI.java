package com.jaisoft.bdtdd.domain.apidomain;
import com.jaisoft.bdtdd.domain.model.UserDomain;

import java.util.List;

public interface UserDomainAPI {

    UserDomain createUser(UserDomain user);
    UserDomain getUser(String userId);
    List<UserDomain> getUsers ();
}
