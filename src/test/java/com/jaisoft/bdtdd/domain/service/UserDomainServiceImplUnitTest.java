package com.jaisoft.bdtdd.domain.service;

import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.domain.repository.UserDomainRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class UserDomainServiceImplUnitTest {
    UserDomainServiceImpl userServiceImpl;
    UserDomainRepository userDomainRepository;
    UserDomain userDomain;

    @BeforeEach
    void init(@Mock UserDomainRepository userDomainRepository) {
        userServiceImpl = new UserDomainServiceImpl(userDomainRepository);
        this.userDomainRepository = userDomainRepository;
    }

    @Test
    void givenValidUser_whenSaveUser_thenSucceed() {
        // Given
        userDomain = UserDomain.builder().userId("userId").userAge(20).userEmail("userEmail").userName("userName").
                build();
        when(userDomainRepository.createUser(any(UserDomain.class))).then(new Answer<UserDomain>() {
            @Override
            public UserDomain answer(InvocationOnMock invocationOnMock) throws Throwable {
                UserDomain user = (UserDomain) invocationOnMock.getArgument(0);
                user.setUserId(sequence);
                return user;
            }

            String sequence = "20";
        });

        userServiceImpl = new UserDomainServiceImpl(userDomainRepository);

        // When
        UserDomain insertedUser = userServiceImpl.createUser(userDomain);

        // Then
        verify(userDomainRepository).createUser(userDomain);
        Assertions.assertNotNull(userDomain.getUserId());

    }
}
