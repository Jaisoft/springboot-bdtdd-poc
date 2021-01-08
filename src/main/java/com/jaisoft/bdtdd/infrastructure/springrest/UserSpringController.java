package com.jaisoft.bdtdd.infrastructure.springrest;

import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTORequest;
import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTOResponse;
import com.jaisoft.bdtdd.infrastructure.springrest.openapi.UserOpenApi;
import com.jaisoft.bdtdd.infrastructure.springservice.UserSpringService;
import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.infrastructure.mapper.UserMapper;
import com.jaisoft.bdtdd.domain.apidomain.UserDomainAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("v1")
public class UserSpringController implements UserDomainAPI, UserOpenApi {

    @Autowired
    private UserSpringService userSpringService;

    @PostMapping(path = "/user", consumes = "application/json", produces = "application/json")
    public ResponseEntity<UserDTOResponse> createUserRest(@Valid @RequestBody UserDTORequest userDTORequest){
        UserDomain userDomain = UserMapper.userDTOtoUserDomain(userDTORequest);
        UserDTOResponse userDTOResponse = UserMapper.userDomaintoUserDTO(createUser(userDomain));
        return ResponseEntity.ok(userDTOResponse);
    }
    
    @Override
    public UserDomain createUser(UserDomain user) {
       return  userSpringService.createUser(user);
    }


    @GetMapping(path = "/user/{userId}" , produces = "application/json" )
    public ResponseEntity<UserDTOResponse> getUserRest(@PathVariable("userId") String userId){
        UserDTOResponse userDTOResponse = UserMapper.userDomaintoUserDTO(getUser(userId));
        if (userDTOResponse == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(userDTOResponse);
        }
    }

    @Override
    public UserDomain getUser(String userId) {
        return  userSpringService.getUser(userId);
    }
}
