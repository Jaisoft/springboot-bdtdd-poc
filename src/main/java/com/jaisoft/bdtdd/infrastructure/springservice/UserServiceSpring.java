package com.jaisoft.bdtdd.infrastructure.springservice;

import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.domain.repository.UserRepository;
import com.jaisoft.bdtdd.domain.service.UserServiceImpl;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserServiceSpring extends UserServiceImpl {

    private UserRepository userRepository;

     @Override
    public UserDomain saveUser(UserDomain user) {
        return userRepository.saveUser(user);

    }
    
}
