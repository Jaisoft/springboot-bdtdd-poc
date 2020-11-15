package com.jaisoft.bdtdd.infrastructure.mongo.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "users")
public class UserDB {
    @Id        
    private String userId;
    private Integer userAge;
    private String userEmail;
    private String userName;
}
