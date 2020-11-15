package com.jaisoft.bdtdd.application;

import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.domain.service.UserService;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class CreateNewUserAccount {

    private UserService userService;

    public UserDomain newUser(UserDomain user){
        return userService.saveUser(user);
    }
}
