package com.jaisoft.bdtdd.domain.service;

import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.domain.repository.UserDomainRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserDomainServiceImpl implements UserDomainService {

    private UserDomainRepository userDomainRepository;

    @Override
    public UserDomain createUser(UserDomain user) {
        return userDomainRepository.createUser(user);
    }

    @Override
    public UserDomain getUser(String userId) {
        return userDomainRepository.getUser(userId);
    }

    @Override
    public List<UserDomain> getUsers() {
        return userDomainRepository.getUsers();
    }


}
