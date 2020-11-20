package com.jaisoft.bdtdd;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber-report.json"}, features = {"src/test/resources"}, glue={"stepdefs"})
public class CucumberRunnerTest {
    
}
