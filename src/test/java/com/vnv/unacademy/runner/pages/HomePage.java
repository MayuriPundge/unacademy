package com.vnv.unacademy.runner.pages;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.*;


import com.vnv.unacademy.runner.utils.SetupDriver;



public class HomePage {
	
	//WebDriver driver;
	@FindBy(xpath="/html/body/div/div[2]/section[4]/div[1]/div/a") 
	@CacheLookup
	WebElement ViewAllLiveClasses;
	
	@FindBy(xpath="//span[contains(@class,'css-1jos5cc-Tags-StyledTag e1rkrhuw1')and contains(text(), 'Live')]") 
	@CacheLookup
	WebElement liveclass;
	
	//public static final By ViewAllLiveClasses = By.xpath("/html/body/div/div[2]/section[4]/div[1]/div/a");
	//public static final By liveclass = By.xpath("/html/body/div/div[1]/div[1]/div[2]/div[5]/div/div[1]/div/a/div/span[2]");
	
	
	public WebElement getViewAllLiveClasses()
	{
		return  ViewAllLiveClasses;
	}
	
	public WebElement getLiveClass()
	{
		return  liveclass;
	}
	
	/*public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}*/
	
	
	/*public void launchUnacademy() throws InterruptedException
	{
		driver.get("https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD");
	}
	
	public void viewAllLiveClasses()
	{
		wait.until(ExpectedConditions.elementToBeClickable(ViewAllLiveClasses));
		driver.findElement(ViewAllLiveClasses).click();
	}

	public void openLiveClass() {
		//WebDriverWait wait1=new WebDriverWait(driver,20) ;
		//wait.until(ExpectedConditions.visibilityOf(liveclass));
		WebElement actionBtn=driver.findElement(By.xpath("//span[contains(@class,'css-1jos5cc-Tags-StyledTag e1rkrhuw1')and contains(text(), 'Live')]"));
		actionBtn.click();
		//driver.findElement(liveclass).click();
		
	}

	public void live_class() {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@class,'css-2jxrdp-Wrapper e17o3ezx0')]")));
	}*/
}
