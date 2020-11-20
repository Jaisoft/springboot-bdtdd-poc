package com.jaisoft.bdtdd.infrastructure.springrest.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {
    private String userId;
    private Integer userAge;
    private String userEmail;
    private String userName;
}