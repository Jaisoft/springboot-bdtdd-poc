package com.jaisoft.bdtdd.infrastructure.springrest;

import java.net.URI;
import java.net.URISyntaxException;
import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTO;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@CucumberContextConfiguration
public class UserAcceptationTest {

    @Autowired
    private RestTemplate restTemplate;

    public void givenUser__whenCreateUser__thenResponse201() throws URISyntaxException
    {
        final String baseUrl = "http://localhost:8080/v1/users";
        URI uri = new URI(baseUrl);
        HttpEntity<UserDTO> request = new HttpEntity<>(UserDTOBuilder.buildUserDTO());
        ResponseEntity<UserDTO> result = this.restTemplate.postForEntity(uri, request, UserDTO.class);
         //Verify request succeed
        Assert.assertEquals(201, result.getStatusCodeValue());
    }
}
