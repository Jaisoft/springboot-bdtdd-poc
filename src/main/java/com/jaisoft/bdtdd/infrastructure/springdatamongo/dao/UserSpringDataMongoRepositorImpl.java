package com.jaisoft.bdtdd.infrastructure.springdatamongo.dao;

import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.domain.repository.UserRepository;
import com.jaisoft.bdtdd.infrastructure.mapper.UserMapper;
import com.jaisoft.bdtdd.infrastructure.springdatamongo.data.UserDocument;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class UserSpringDataMongoRepositorImpl implements UserRepository {

    UserSpringDataMongoRepository userSpringDataMongoRepository;

    @Override
    public UserDomain saveUser(UserDomain userDomain) {
        UserDocument userDocument = UserMapper.userDomainToUserDocument(userDomain);
       return UserMapper.userDocumentToUserDomain(userSpringDataMongoRepository.insert(userDocument));
    }
    
}
