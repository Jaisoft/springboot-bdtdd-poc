package com.jaisoft.bdtdd.infrastructure.springrest.dto;

import lombok.Builder;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
public class UserDTO {
    private String userId;
    @NotEmpty(message = "No empty")
    private Integer userAge;
    @NotBlank(message = "No blank")
    private String userEmail;
    @NotNull(message = "No null")
    private String userName;
}
