package com.jaisoft.bdtdd.infrastructure.springrepository;

import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.domain.repository.UserDomainRepository;
import com.jaisoft.bdtdd.infrastructure.mapper.UserMapper;
import com.jaisoft.bdtdd.infrastructure.springrepository.data.UserDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserSpringDataMongoRepositoryImpl implements UserDomainRepository {
    
    @Autowired
    private UserSpringDataMongoRepository userSpringDataMongoRepository;

    
    @Override
    public UserDomain createUser(UserDomain userDomain) {
        UserDocument userDocument = UserMapper.userDomainToUserDocument(userDomain);
        UserDocument userDocumentCreated = userSpringDataMongoRepository.insert(userDocument);
       return UserMapper.userDocumentToUserDomain(userDocumentCreated);
    }

    @Override
    public UserDomain getUser(String userId) {
        Optional<UserDocument> OptionalUserDocumentFinded = userSpringDataMongoRepository.findById(userId);
        return UserMapper.userDocumentToUserDomain(OptionalUserDocumentFinded.get());
    }

}
