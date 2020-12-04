package com.jaisoft.bdtdd.springrest;

import java.net.URI;
import java.net.URISyntaxException;
import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class UserSpringControllerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;
     
    @LocalServerPort
    int randomServerPort;

    @Test
    public void givenUser__whenCreateUser__thenResponse201() throws URISyntaxException 
    {
        final String baseUrl = "http://localhost:"+randomServerPort+"/v1/users";
        URI uri = new URI(baseUrl);
        HttpEntity<UserDTO> request = new HttpEntity<>(UserDTOBuilder.buildUserDTO());
        ResponseEntity<UserDTO> result = this.restTemplate.postForEntity(uri, request, UserDTO.class);
         //Verify request succeed
        Assert.assertEquals(201, result.getStatusCodeValue());
    }
    
}
