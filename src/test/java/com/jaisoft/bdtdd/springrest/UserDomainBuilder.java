package com.jaisoft.bdtdd.springrest;

import com.jaisoft.bdtdd.domain.model.UserDomain;

public class UserDomainBuilder {

    public static UserDomain buildUserDomain(){
        return UserDomain.builder().userAge(20).userEmail("jaime.gomez.moraleda@gmail.com").userName("Jaime").build();
    }
}
