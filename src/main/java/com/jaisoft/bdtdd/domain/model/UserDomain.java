package com.jaisoft.bdtdd.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;




@Data
@Builder
public class UserDomain {
    private String userId;
    private Integer userAge;
    private String userEmail;
    private String userName;
}
