package com.javier.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/javier/cucumber/features"}, glue="com/javier/cucumber/bdd")
public class RunnerTest{

}
