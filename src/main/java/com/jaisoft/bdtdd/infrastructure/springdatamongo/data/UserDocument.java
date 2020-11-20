package com.jaisoft.bdtdd.infrastructure.springdatamongo.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "users")
public class UserDocument {
    @Id        
    private String userId;
    private Integer userAge;
    private String userEmail;
    private String userName;
}
