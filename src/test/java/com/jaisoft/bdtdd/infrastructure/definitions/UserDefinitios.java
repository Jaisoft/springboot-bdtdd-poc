package com.jaisoft.bdtdd.infrastructure.definitions;


import com.jaisoft.bdtdd.infrastructure.springrest.UserDTOBuilder;
import com.jaisoft.bdtdd.infrastructure.springrest.UserSpringControllerIntegrationTest;
import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.rsocket.context.LocalRSocketServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

//@RunWith(SpringRunner.class)
//@ExtendWith(SpringExtension.class)
//@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserDefinitios extends UserSpringControllerIntegrationTest {

    @Given("a unregistered user")
    public void a_unregistered_user() throws URISyntaxException {
        givenUser__whenCreateUser__thenResponse201();

    }
}
