package com.jaisoft.bdtdd.infrastructure.jpa.data;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class UserJPA {
    @Id
    private String userId;
    private Integer userAge;
    private String userEmail;
    private String userName;
    
}
