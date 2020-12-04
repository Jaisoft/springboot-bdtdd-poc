package com.jaisoft.bdtdd.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Builder
public class UserDomain {
    @Id
    private String userId;
    private Integer userAge;
    private String userEmail;
    private String userName;
}
