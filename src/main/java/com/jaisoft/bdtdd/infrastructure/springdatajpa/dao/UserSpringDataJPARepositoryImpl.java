package com.jaisoft.bdtdd.infrastructure.springdatajpa.dao;

import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.domain.repository.UserRepository;
import com.jaisoft.bdtdd.infrastructure.mapper.UserMapper;
import com.jaisoft.bdtdd.infrastructure.springdatajpa.data.UserEntity;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class UserSpringDataJPARepositoryImpl implements UserRepository {

    UserSpringDataJPARepository userSpringDataJPARepository;

    @Override
    public UserDomain saveUser(UserDomain userDomain) {
        UserEntity userEntity = UserMapper.userDomainToUserEntity(userDomain);
        UserDomain userDomainInserted = UserMapper.userEntityToUserDomain(userSpringDataJPARepository.save(userEntity));
        return userDomainInserted;
    }
}
