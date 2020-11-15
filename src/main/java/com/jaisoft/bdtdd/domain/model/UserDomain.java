package com.jaisoft.bdtdd.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDomain {
    private String userId;
    private Integer userAge;
    private String userEmail;
    private String userName;
}
