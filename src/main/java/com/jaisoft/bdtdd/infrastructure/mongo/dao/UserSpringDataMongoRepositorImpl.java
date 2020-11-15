package com.jaisoft.bdtdd.infrastructure.mongo;

import java.util.Optional;

import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.domain.repository.UserRepository;
import com.jaisoft.bdtdd.infrastructure.mongo.data.UserDB;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class UserSpringDataMongoRepositorImpl implements UserRepository {

    UserSpringDataMongoRepository userSpringDataMongoRepository;

    @Override
    public UserDomain saveUser(UserDomain user) {
        UserDB userDB = new UserDB(user.getUserId(),user.getUserAge(), user.getUserEmail(), user.getUserName());
        UserDB userDBInserted = userSpringDataMongoRepository.insert(userDB);
        UserDomain userDomainInserted = new UserDomain(userDBInserted.getUserId(), userDBInserted.getUserAge(), userDBInserted.getUserEmail(), userDBInserted.getUserName());
        return userDomainInserted;
    }
    
}
