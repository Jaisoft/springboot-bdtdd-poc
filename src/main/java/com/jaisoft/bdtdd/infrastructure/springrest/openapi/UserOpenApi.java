package com.jaisoft.bdtdd.infrastructure.springrest.openapi;

import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "User", description = "The User API with documentation")
public interface UserOpenApi {
    @Operation(summary = "Create User")
    ResponseEntity<UserDTO> createUserRest(@RequestBody UserDTO userDTO);
}
