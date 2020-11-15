package com.jaisoft.bdtdd.infrastructure.jpa.dao;

import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.domain.repository.UserRepository;
import com.jaisoft.bdtdd.infrastructure.jpa.data.UserJPA;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class UserSpringDataJPARepositoryImpl implements UserRepository {

    UserSpringDataJPARepository userSpringDataJPARepository;

    @Override
    public UserDomain saveUser(UserDomain user) {
        UserJPA userJPA = new UserJPA(user.getUserId(),user.getUserAge(), user.getUserEmail(),user.getUserName());
        UserJPA userJPAInserted = userSpringDataJPARepository.save(userJPA);
        UserDomain userDomainInserted = new UserDomain(userJPAInserted.getUserId(), userJPAInserted.getUserAge(), userJPAInserted.getUserEmail(), userJPAInserted.getUserName());
        return userDomainInserted;
    }
}
