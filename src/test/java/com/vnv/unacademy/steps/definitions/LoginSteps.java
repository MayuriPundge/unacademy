package com.vnv.unacademy.steps.definitions;

import com.vnv.unacademy.runner.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.*;
public class LoginSteps {

    public static LoginPage login = new LoginPage();

    @Given("User is on Login Page of Unacademy application")
    public void userIsOnLoginPageOfUnacademyApplication() throws InterruptedException {
        login.launchApplication();
        Thread.sleep(4000);
    }
    @When("I Click on the Login button on Login Page of Unacademy application")
    public void i_Click_on_the_button_on_Login_Page_of_Unacademy_application() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    	 login.clickButton();
    	 Thread.sleep(2000);
    }
    

    @When("I enter the {string} as {string} on Login Page of Unacademy application")
    public void iEnterTheAsOnLoginPageOfUnacademyApplication(String field, String input) {
        login.enterInput(field,input);
    }
    
    @When("I Click on the Login button after input on Unacademy application")
    public void i_Click_on_the_button_after_input_on_Unacademy_application() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    	 login.clickButtonAfterInput();
    	 Thread.sleep(15000);
    }
    
    @When("I click on {string} after entering OTP on Unacademy application")
    public void i_click_on_after_entering_OTP_on_Unacademy_application(String string) throws InterruptedException {
    	login.verifyOTP();
   	 	Thread.sleep(2000);
    }
    
    
    @Then("User should navigate to the Home page of Unacademy application")
    public void  User_should_navigate_to_the_Home_page_of_Unacademy_application()
    {
    	login.verifyHomePage();
    }
    
    /*@When("I I enter the {string} on enter OTP page of Unacademy application")
    public void i_enter_OTP_on_Unacademy_application() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    	//Scanner sc=new Scanner(System.in);
    	//String otp=sc.next();
    	//Thread.sleep(10000);
    	// login.enterInput("OTP",otp);
    	//login.enterOTP();
    	 Thread.sleep(10000);
    }*/
    
    


}
