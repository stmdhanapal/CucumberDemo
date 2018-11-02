package com.cucum.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\cucum\\feature\\" ,glue="com.cucum.stepdefinition")
public class RunnerClass {
	
	}







