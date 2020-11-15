package com.jaisoft.bdtdd.infrastructure.apirest;

import com.jaisoft.bdtdd.domain.model.UserDomain;

public interface UserController {

    UserDomain createUser(UserDomain user);
    
}
