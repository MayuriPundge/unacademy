package com.vnv.unacademy.runner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.vnv.unacademy.runner.utils.SetupDriver;

public class signupPage {

	WebDriver driver = SetupDriver.chromeDriver();

    public static final By VerifyOTP = By.xpath("/html/body/div[3]/div[3]/div[2]/div[2]/button");
    public static final By OTP = By.xpath("/html/body/div[3]/div[3]/div[2]/form/div/input");
    public static final By MOBILE_NO = By.xpath("/html/body/div[3]/div[3]/div[2]/div[2]/div/input");
    public static final By LOGIN_BUTTON = By.xpath("/html/body/div[1]/header/div/div/button");
    public static final By LOGIN_BUTTON_After_input = By.xpath("/html/body/div[3]/div[3]/div[2]/div[3]/button");

    public void launchApplication() {
        driver.get("https://unacademy.com/");
    }

    public void enterInput(String field, String input) {
        switch (field) {
           
        case "Mobile no.":
        	driver.findElement(MOBILE_NO).sendKeys(input);
        	break;
        case "OTP":
        	driver.findElement(OTP).sendKeys(input);
        	break;
        default:
               System.out.println("Unexpected value: " + field);
        }
    }

    public void clickButton(){
        
            driver.findElement(LOGIN_BUTTON).click();
       // }
    }
    
    public void clickButtonAfterInput(){
       
            driver.findElement(LOGIN_BUTTON_After_input).click();
    }
    
   
    
    public void verifyOTP()
    {
    	driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div[2]/button")).click();
    }

    @Test
	public void verifyHomePage() {
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[3]/picture/img")).isDisplayed();
	}
   
}	
	
	
	
	
	
	
	
	
	
}
