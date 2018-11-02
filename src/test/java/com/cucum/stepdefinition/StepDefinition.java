package com.cucum.stepdefinition;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	static WebDriver driver;
	
	@When("^launch the browser$")
	public void launch_the_browser() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "D:\\selenium\\CUCUMBER_DEMO\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();	
		
	}

	@When("^give url to launch browser$")
	public void give_url_to_launch_browser() throws Throwable {
		driver.get("https://www.facebook.com/");
	    
	}

	@Then("^wait some time$")
	public void wait_some_time() throws Throwable {
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("^Quit the browser$")
	public void quit_the_browser() throws Throwable {
		driver.quit();
	    
	}

}
