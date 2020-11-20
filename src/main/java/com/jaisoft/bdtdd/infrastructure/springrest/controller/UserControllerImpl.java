package com.jaisoft.bdtdd.infrastructure.springrest.controller;

import lombok.AllArgsConstructor;
import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.domain.service.UserService;
import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTO;
import com.jaisoft.bdtdd.infrastructure.mapper.UserMapper;
import com.jaisoft.bdtdd.domain.controller.UserController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
public class UserControllerImpl implements UserController {

    UserService userService;

    @PostMapping("/user")
    ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO){
        var headers = new HttpHeaders();
        headers.add("Responded", "UserController");
        
        UserDomain userDomain = UserMapper.userDTOtoUserDomanin(userDTO);
        UserDTO UserDTOResponse = UserMapper.userDomaintoUserDTO(createUser(userDomain));
        return ResponseEntity.accepted().headers(headers).body(UserDTOResponse);
    }
    
    @Override
    public UserDomain createUser(UserDomain user) {
       return  userService.saveUser(user);
    }
}
