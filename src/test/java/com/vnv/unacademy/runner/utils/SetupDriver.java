package com.vnv.unacademy.runner.utils;

//import com.microsoft.edge.seleniumtools.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.microsoft.edge.seleniumtools.EdgeDriver;

public class SetupDriver {

    public static WebDriver driver;

    public static WebDriver chromeDriver() {
    	//String userProfile= "C:\\Users\\Raman\\AppData\\Local\\Google\\Chrome\\User Data\\";
    	System.setProperty("webdriver.chrome.driver","C:\\UN\\unacademy\\resources\\Drivers99\\chromedriver.exe");
		// driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
    	//String userProfile= "C:\\Users\\Dell\\AppData\\Local\\Google\\Chrome\\User Data\\";
    	//System.setProperty("webdriver.chrome.driver", "src/resources/Drivers99/chromedriver.exe");
    	//ChromeOptions options = new ChromeOptions();
    	//options.addArguments("--user-data-dir="+userProfile);
    	//options.addArguments("--profile-directory=Default");
    	//options.addArguments("--start-maximized");
    	//options.addArguments("--disable-notifications");
    	//driver = new ChromeDriver(options);
    	System.out.println("Launching Chrome Browser");
        return driver;
    }

    public static WebDriver edgeDriver() {
        System.setProperty("webdriver.edge.driver", "C:\\UN\\unacademy\\resources\\Drivers99\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        System.out.println("Launching Edge Browser");
        return driver;
    }

    public static void teardown() throws Exception {
    	System.out.println("i m in teardown");
    	Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}
