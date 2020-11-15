package com.jaisoft.bdtdd.domain.service;

import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.domain.repository.UserRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

     @Override
    public UserDomain saveUser(UserDomain user) {
        return userRepository.saveUser(user);

    }
    
}
