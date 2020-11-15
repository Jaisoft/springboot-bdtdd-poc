package com.jaisoft.bdtdd.infrastructure.apirest;

import com.jaisoft.bdtdd.application.CreateNewUserAccount;
import lombok.AllArgsConstructor;
import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.infrastructure.apirest.dto.UserDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class UserControllerImpl implements UserController {

    CreateNewUserAccount createNewUser;

    @PostMapping("/user")
    ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO){
        var headers = new HttpHeaders();
        headers.add("Responded", "UserController");
        UserDomain userDomain = new UserDomain(userDTO.getUserId(), userDTO.getUserAge(), userDTO.getUserEmail(), userDTO.getUserName());
        UserDomain userDomainCreated = createUser(userDomain);
        UserDTO UserDTOResponse = new UserDTO(userDomainCreated.getUserId(), userDomainCreated.getUserAge(),userDomainCreated.getUserEmail(), userDomainCreated.getUserName());
        return ResponseEntity.accepted().headers(headers).body(UserDTOResponse);
    }
    
    @Override
    public UserDomain createUser(UserDomain user) {
       return  createNewUser.newUser(user);
    }
}
