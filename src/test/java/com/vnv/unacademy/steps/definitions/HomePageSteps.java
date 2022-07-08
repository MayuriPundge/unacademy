package com.vnv.unacademy.steps.definitions;

import com.vnv.unacademy.runner.pages.HomePage;
import com.vnv.unacademy.runner.utils.SetupDriver;

import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageSteps {
	
	public static HomePage home;
	WebDriver driver = SetupDriver.chromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,20) ;
	
	@Before
	public void open_browser()
	{
		home = PageFactory.initElements(driver,HomePage.class );
	}
	
	@Given("User is on homepage of Unacademy application")
    public void userIsOnLoginPageOfUnacademyApplication() throws InterruptedException {
        
		
		//home.launchUnacademy();
    	driver.get("https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD");
    	//Assert.assertEquals(0, 1);
	}
    
    
    @When("user clicks on view all live classes on home page of Unacademy")
    public void i_click_on_view_all_live_classes_on_home_page_of_Unacademy() throws InterruptedException {
    	//home.viewAllLiveClasses();
    	
    	wait.until(ExpectedConditions.elementToBeClickable(home.getViewAllLiveClasses()));
		home.getViewAllLiveClasses().click();
    	Thread.sleep(4000);
    }

    @When("user clicks on a live class on Unacademy")
    public void i_click_on_a_live_class_on_Unacademy() throws InterruptedException {
    	home.getLiveClass().click();
        Thread.sleep(20000);
       
    }

    @Then("live class should open on Unacademy")
    public void live_class_should_open_on_Unacademy() throws InterruptedException {
       //home.live_class();
    	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@class,'css-2jxrdp-Wrapper e17o3ezx0')]")));
    }

}
