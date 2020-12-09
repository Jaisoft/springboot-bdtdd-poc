package com.jaisoft.bdtdd;


import com.jaisoft.bdtdd.springrest.UserSpringControllerIntegrationTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class StepDefsUser extends UserSpringControllerIntegrationTest {

    @Given("^I create user with userAge (.*), userEmail (.*), userName (.*)$")
    public void i_create_user(Integer userAge, String userEmail, String userName) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I see my newly user created")
    public void i_see_my_newly_user_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
