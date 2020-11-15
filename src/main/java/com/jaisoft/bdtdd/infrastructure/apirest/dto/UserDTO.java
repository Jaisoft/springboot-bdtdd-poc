package com.jaisoft.bdtdd.infrastructure.apirest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private String userId;
    private Integer userAge;
    private String userEmail;
    private String userName;
}
