package com.jaisoft.bdtdd.infrastructure.springrest.openapi;

import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTORequest;
import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTOResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "User", description = "The User API with documentation")
public interface UserOpenApi {
    @Operation(summary = "Create User")
    ResponseEntity<UserDTOResponse> createUserRest(@RequestBody UserDTORequest userDTORequest);
    @Operation(summary = "Get User")
    ResponseEntity<UserDTOResponse> getUserRest(@PathVariable String userId);
}
