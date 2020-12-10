package com.jaisoft.bdtdd.infrastructure.springrest;

import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTO;

public class UserDTOBuilder {
    public static UserDTO buildUserDTO(){
        return UserDTO.builder().userAge(20).userEmail("jaime.gomez.moraleda@gmail.com").userName("Jaime").build();
    }
}
