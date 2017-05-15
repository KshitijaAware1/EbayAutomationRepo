package com.automation.EbayAutomation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(format = {"pretty", "html:target/cucumber-html-report","json:target/Destination/cucumber.json"}) 

public class RunTest {

}
