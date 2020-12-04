package com.jaisoft.bdtdd.infrastructure.springrest;

import com.jaisoft.bdtdd.infrastructure.springrest.openapi.UserOpenApi;
import com.jaisoft.bdtdd.infrastructure.springservice.UserSpringService;
import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTO;
import com.jaisoft.bdtdd.infrastructure.mapper.UserMapper;
import com.jaisoft.bdtdd.domain.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

import javax.validation.Valid;

@RestController
@RequestMapping("v1")
public class UserSpringControllerImpl implements UserController, UserOpenApi {

    @Autowired
    private UserSpringService userSpringService;

    @PostMapping(path = "/users", consumes = "application/json", produces = "application/json")
    public ResponseEntity<UserDTO> createUserRest(@Valid @RequestBody UserDTO userDTO){
        
        UserDomain userDomain = UserMapper.userDTOtoUserDomanin(userDTO);
        UserDTO userDTOResponse = UserMapper.userDomaintoUserDTO(createUser(userDomain));
        
       
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(userDTOResponse.getUserId())
                                    .toUri();
        
        return ResponseEntity.created(location).build();
        
       
    }
    
    @Override
    public UserDomain createUser(UserDomain user) {
       return  userSpringService.createUser(user);
    }
}
