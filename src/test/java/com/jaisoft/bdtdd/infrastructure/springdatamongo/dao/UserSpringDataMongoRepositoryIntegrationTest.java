package com.jaisoft.bdtdd.infrastructure.springdatamongo.dao;

import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.infrastructure.springdatamongo.dao.UserSpringDataMongoRepositoryImpl;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
@RunWith(SpringRunner.class)
public class UserSpringDataMongoRepositoryIntegrationTest {

    @Autowired
    private UserSpringDataMongoRepositoryImpl userSpringDataMongoRepositoryImpl;

    @BeforeEach
    public void dataSetup() {}

    @Test
    public void givenUser__whenCreateUser__thenFindUserNotNull() {

        UserDomain userDomain = UserDomain.builder()
        .userAge(30)
        .userEmail("jaime.gomez.moraleda@gmail.com")
        .userName("Jaime").build();

        UserDomain userDomainCreated = userSpringDataMongoRepositoryImpl.createUser(userDomain);

        assertThat(userDomainCreated).isNotNull();

    }



}
