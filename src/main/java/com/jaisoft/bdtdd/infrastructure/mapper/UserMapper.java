package com.jaisoft.bdtdd.infrastructure.mapper;

import com.jaisoft.bdtdd.domain.model.UserDomain;
//import com.jaisoft.bdtdd.infrastructure.springdatajpa.data.UserEntity;
import com.jaisoft.bdtdd.infrastructure.springrepository.data.UserDocument;
import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTO;

public class UserMapper {

    public static UserDomain userDTOtoUserDomanin (UserDTO userDTO){

        return UserDomain.builder()
        .userId(userDTO.getUserId())
        .userAge(userDTO.getUserAge())
        .userEmail(userDTO.getUserEmail())
        .userName(userDTO.getUserEmail()).build();
    }

    public static UserDTO userDomaintoUserDTO (UserDomain userDomain){

        return UserDTO.builder()
        .userId(userDomain.getUserId())
        .userAge(userDomain.getUserAge())
        .userEmail(userDomain.getUserEmail())
        .userName(userDomain.getUserEmail()).build();
    }


    public static UserDocument userDomainToUserDocument (UserDomain userDomain){

        return UserDocument.builder()
        .userId(userDomain.getUserId())
        .userAge(userDomain.getUserAge())
        .userEmail(userDomain.getUserEmail())
        .userName(userDomain.getUserEmail()).build();
    }

    public static UserDomain userDocumentToUserDomain (UserDocument userDocument){

        return UserDomain.builder()
        .userId(userDocument.getUserId())
        .userAge(userDocument.getUserAge())
        .userEmail(userDocument.getUserEmail())
        .userName(userDocument.getUserEmail()).build();
    }


    /*public static UserEntity userDomainToUserEntity (UserDomain userDomain){

        return UserEntity.builder()
        .userId(userDomain.getUserId())
        .userAge(userDomain.getUserAge())
        .userEmail(userDomain.getUserEmail())
        .userName(userDomain.getUserEmail()).build();
    }*/

    /*public static UserDomain userEntityToUserDomain (UserEntity userEntity){

        return UserDomain.builder()
        .userId(userEntity.getUserId())
        .userAge(userEntity.getUserAge())
        .userEmail(userEntity.getUserEmail())
        .userName(userEntity.getUserEmail()).build();
    }*/
    
}
