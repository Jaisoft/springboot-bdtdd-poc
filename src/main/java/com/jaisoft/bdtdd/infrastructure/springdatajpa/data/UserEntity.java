package com.jaisoft.bdtdd.infrastructure.springdatajpa.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class UserEntity {
    @Id
    private String userId;
    private Integer userAge;
    private String userEmail;
    private String userName;
    
}
