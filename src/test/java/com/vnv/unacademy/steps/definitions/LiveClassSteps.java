package com.vnv.unacademy.steps.definitions;
import com.vnv.unacademy.runner.pages.HomePage;
import com.vnv.unacademy.runner.pages.LiveClassPage;
import com.vnv.unacademy.runner.utils.SetupDriver;

import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LiveClassSteps {
	
	public static LiveClassPage live;
	WebDriver driver = SetupDriver.chromeDriver();
	WebDriverWait wait;
	
	Actions action=new Actions(driver);
	
	
	@Before
	public void openBrowser()
	{
		live=new LiveClassPage();
		live = PageFactory.initElements(driver,LiveClassPage.class );
	}
	@When("user clicks on mute")
	public void user_clicks_on_mute() {
	     
	      
	}
	@Then("mute should toggle")
	public void mute_should_toggle() {
	     
	      
	}
	
	@When("user slides the volume slider")
	public void user_slides_the_volume_slider() {
	     
	      
	}
	
	@Then("volume should mirror the actions")
	public void volume_should_mirror_the_actions() {
	     
	      
	}
	
	
	@When("user clicks on rewind button")
	public void user_clicks_on_rewind_button() {
	     
	      
	}
	@Then("video should go back ten seconds")
	public void video_should_go_back_seconds() {
	     
	      
	}
	
	@Then("Go live button should be clickable")
	public void go_live_button_should_be_clickable() {
	     
	      
	}
	@When("user clicks on go live button user should be synced up with the teacher")
	public void user_clicks_on_go_live_button_user_should_be_synced_up_with_the_teacher() {
	     
	      
	}
	
	
	@When("user clicks on forward button")
	public void user_clicks_on_forward_button() {
	     
	      
	}
	@Then("video should go forward ten seconds")
	public void video_should_go_forward_seconds() {
	     
	      
	}

	
	
	@When("user clicks on pause button")
	public void user_clicks_on_pause_button() {
	     
	      
	}
	@Then("video should pause")
	public void video_should_pause() {
	     
	      
	}
	
	@When("user clicks on Raise Hand icon")
	public void user_clicks_on_Raise_Hand_icon() {
	     
	      
	}

	@When("user clicks on Raise Hand button")
	public void user_clicks_on_Raise_Hand_button() {
	     
	      
	}
	
	@Then("user should get a message that they need to be subscribed")
	public void user_should_get_a_message_that_they_need_to_be_subscribed() {
	     
	      
	}
	
	@When("user clicks on Ask doubts button")
	public void user_clicks_on_Ask_doubts_button() {
	     
	      
	}

	@When("user clicks on comment box")
	public void user_clicks_on_comment_box() {
	     
	      
	}

	@When("message is shorter than thirty characters")
	public void message_is_shorter_than_characters() {
	     
	      
	}

	@Then("user should get a message saying that minimum thirty characters are needed")
	public void user_should_get_a_message_saying_that_minimum_characters_are_needed() {
	     
	      
	}
	
	@When("types their doubt and sends it")
	public void types_their_doubt_and_sends_it() {
	     
	      
	}

	@Then("their doubt should be sent")
	public void their_doubt_should_be_sent() {
	     
	      
	}

	@When("user clicks on attach image")
	public void user_clicks_on_attach_image() {
	     
	      
	}

	@Then("user should be able to attach an image and send it")
	public void user_should_be_able_to_attach_an_image_and_send_it() {
	     
	      
	}
	
	@When("user clicks on hide panel button")
	public void user_clicks_on_hide_panel_button() throws InterruptedException {
		driver.get("https://unacademy.com/class/discussion-on-ugee-bitsat-2022-linguistics/ZCMYK0UQ");
		Thread.sleep(15000);
		wait=new WebDriverWait(driver,20) ;
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@class,'css-2jxrdp-Wrapper e17o3ezx0')]")));
		System.out.println("frame switched");
	     live.get_panel().click();
	      
	}

	@Then("panel should be toggled shown|not shown")
	public void panel_should_be_toggled_shown_not_shown() {
		live.get_panel().click();
	      
	}
	
	
	

	@When("user clicks on Chat button")
	public void user_clicks_on_Chat_button() {
	     
	      
	}
	@When("user types a message and send it")
	public void user_types_a_message_and_send_it() {
	     
	      
	}
	@Then("their message should be sent")
	public void their_message_should_be_sent() {
	     
	      
	}
	
	@When("user clicks on someone's profile")
	public void user_clicks_on_someone_s_profile() {
	     
	      
	}
	@Then("their details should be displayed")
	public void their_details_should_be_displayed() {
	     
	      
	}
	@When("user clicks on Emojis")
	public void user_clicks_on_Emojis() {
	     
	      
	}
	@When("user clicks on multiple emojis")
	public void user_clicks_on_multiple_emojis() {
	     
	      
	}

	@Then("they should be sent in chat")
	public void they_should_be_sent_in_chat() {
	     
	      
	}
	@When("user scrolls up in chat")
	public void user_scrolls_up_in_chat() {
	     
	      
	}

	@Then("a Jump to latest button should appear")
	public void a_Jump_to_latest_button_should_appear() {
	     
	      
	}
	
	@When("user clicks on settings")
	public void user_clicks_on_settings() {
	     
	      
	}

	@When("user clicks on dark theme")
	public void user_clicks_on_dark_theme() {
	     
	      
	}
	@Then("dark theme should toggle")
	public void dark_theme_should_toggle() {
	     
	      
	}
	
	@When("user clicks on educator video")
	public void user_clicks_on_educator_video() {
	     
	      
	}

	@Then("educator video should toggle")
	public void educator_video_should_toggle() {
	     
	      
	}
	
	@When("user clicks on report an issue")
	public void user_clicks_on_report_an_issue() {
	     
	      
	}
	@When("user selects image")
	public void user_selects_image() {
	     
	      
	}
	@When("user types text")
	public void user_types_text() {
	     
	      
	}
	@When("user selects predefined issues")
	public void user_selects_predefined_issues() {
	     
	      
	}
	
	@Then("their report should be sent")
	public void their_report_should_be_sent() {
	     
	      
	}

	
	
	
	
	
	@When("user presses M on keyboard")
	public void user_presses_M_on_keyboard() {
	     
	      
	}
	
	@Then("mute should be toggled_shortcuts")
	public void mute_should_be_toggled_shortcuts() {
	     
	      
	}


	
	@When("user presses D on keyboard")
	public void user_presses_D_on_keyboard() {
	     
	      
	}
	@Then("doubt panel should open_shortcuts")
	public void doubt_panel_should_open_shortcuts() {
	     
	      
	}
	@When("user presses T on keyboard")
	public void user_presses_T_on_keyboard() {
	     
	      
	}
	@Then("chat box should be shown_shortcuts")
	public void chat_box_should_be_shown_shortcuts() {
	     
	      
	}
	
	@When("user presses G on keyboard")
	public void user_presses_G_on_keyboard() {
	     
	      
	}
	@Then("Then Raise hand panel should open_shortcuts")
	public void Then_Raise_hand_panel_should_open_shortcuts() {
	     
	      
	}
	
	
	@When("user presses Space bar on keyboard")
	public void user_presses_space_bar_on_keyboard() {
	     
	      
	}
	@Then("video should pause_shortcuts")
	public void video_should_pause_shortcuts() {
	     
	      
	}
	@When("user presses Esc on keyboard while in fullscreen mode")
	public void user_presses_Esc_on_keyboard_while_in_fullscreen_mode() {
	     
	      
	}

	@Then("Fullscreen should be exited_shortcuts")
	public void fullscreen_should_be_exited_shortcuts() {
	     
	      
	}
	
	@When("user presses back button")
	public void user_presses_back_button() {
	     
	      
	}
	
	@Then("user should goto feedback page")
	public void user_should_goto_feedback_page() {
	     
	      
	}
	@When("user user clicks on an emoji_feedback")
	public void user_clicks_on_an_emoji_feedback() {
	     
	      
	}
	@Then("user should be able to type their feedback")
	public void user_should_be_able_to_type_their_feedback() {
	     
	      
	}
	@Then("user should be able to select predefined feedbacks")
	public void user_should_be_able_to_select_predefined_feedbacks() {
	     
	      
	}

	@Then("user should be able to submit feedback")
	public void user_should_be_able_to_submit_feedback() {
	     
	      
	}
	
	@When("user clicks fullscreen button")
	public void user_clicks_fullscreen_button() throws InterruptedException {
		live = PageFactory.initElements(driver,LiveClassPage.class );
		driver.get("https://unacademy.com/class/discussion-on-ugee-bitsat-2022-linguistics/ZCMYK0UQ");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@class,'css-2jxrdp-Wrapper e17o3ezx0')]")));
		action.moveToElement(live.get_drawing_board()).contextClick().build().perform();
		//action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'Tooltip__MainContainer-sc-1y3os0u-1 dVFksi')]") )).build().perform();
		live.get_fullscreen().click();
	}
	@When("user clicks on exit fullscreen button")
	public void user_clicks_on_exit_fullscreen_button() {
		live.get_fullscreen().click();
	      
	}
	
	/*
	 Actions action=new Actions(driver);
   	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
   	//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("nativeIframeOne")));
   	
   	//driver.switchTo().defaultContent();
   	//Thread.sleep(2000);
   	//List<WebElement> f = driver.findElements(By.tagName("iframe"));
       //System.out.println("Total number " + f.size());
       
   	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'css-2jxrdp-Wrapper e17o3ezx0')]")));
   	//driver.switchTo().frame("nativeIframeOne"); //"nativeIframeOne"
   	
   	//action.contextClick().build().perform();
   	//action.moveToElement(driver.findElement(By.xpath( " " )));
   	//driver.close();
   	System.out.println("done");
   	
   	action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'DrawingBoard__ScaledDrawingBoardContainer-sc-1r0ce6l-1 kYMTAf')]") )).build().perform();
   	//action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'Tooltip__MainContainer-sc-1y3os0u-1 dVFksi')]") )).build().perform();
   	//Thread.sleep(1000);
   	
   	/*final By FullScreen=By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root jss5 jss31 MuiButton-text')]");
		driver.findElement(FullScreen).click();
		Thread.sleep(1000);
		driver.findElement(FullScreen).click(); //exit fullscreen*/
		
		/*Thread.sleep(2000);
		final By Mute=By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root jss5 jss11 MuiButton-text')]");
		driver.findElement(Mute).click();
		Thread.sleep(1000);
		driver.findElement(Mute).click(); //unmute
		//switching out of mute
		action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'DrawingBoard__ScaledDrawingBoardContainer-sc-1r0ce6l-1 kYMTAf')]") )).build().perform();
		*/
   	
   	
   	/*final By Panel=By.xpath("//div[contains(@class,'Tooltip__MainContainer-sc-1y3os0u-1 ldTBQr')]");
		driver.findElement(Panel).click();
		Thread.sleep(1000);
		driver.findElement(Panel).click();*/
		
   	/*action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'SidebarInner__TooltipContainer-sc-1c4lm9n-4 bjekiA')]") )).build().perform();
   	
   	final By Doubts=By.xpath("//div[contains(@class,'SidebarInner__TooltipContainer-sc-1c4lm9n-4 bjekiA')]");
		driver.findElement(Doubts).click();
		Thread.sleep(1000);
		driver.findElement(Doubts).click();*/
   	
   	
		
		/*final By Rewind=By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root jss5 jss8 MuiButton-text')]");
		driver.findElement(Rewind).click();
		Thread.sleep(2000);
		
		
		final By Forward=By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root jss5 jss10 MuiButton-text')]");
		driver.findElement(Forward).click();
		Thread.sleep(2000);
		
		final By Pause=By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root jss5 jss9 MuiButton-text')]");
		driver.findElement(Pause).click();
		Thread.sleep(1000);
		driver.findElement(Pause).click(); //play
		
		
		final By Settings=By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root jss5 jss28 MuiButton-text')]");
		driver.findElement(Settings).click();
		
		/*final By Educator_video=By.xpath("//div[contains(@class,'Switch__ToggleOption-nhh88w-1 jawpXx')]");
		driver.findElement(Educator_video).click();
		Thread.sleep(1000);
		driver.findElement(Educator_video).click(); // switching back on
		

//TODO
		
		//final By dark_mode_on=By.xpath("//div[contains(@class,'SettingsPanel__SettingsPanelWrapper-sc-1bg0wrd-0 jwSZqz')]/div[4]/div/div/div");
		//driver.findElement(dark_mode_on).click();
		//Thread.sleep(1000);
		//final By dark_mode_off=By.xpath("//div[contains(@class,'SettingsPanel__SettingsPanelWrapper-sc-1bg0wrd-0 jwSZqz')]/div[4]/div/div/div[1]");
		//Thread.sleep(1000);
		//driver.findElement(dark_mode_off).click(); // switching back on
		//driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div/div[4]/div/div/div[2]")).click();
		
		
		final By report_issue=By.xpath("//div[contains(@class,'SettingsPanel__SettingsPanelWrapper-sc-1bg0wrd-0 Smcdn')]/div[6]");
		driver.findElement(report_issue).click();
		Thread.sleep(1000);
		
		//close settings pop up
		action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'DrawingBoard__ScaledDrawingBoardContainer-sc-1r0ce6l-1 kYMTAf')]") )).click().build().perform(); 
		
		// final By Back=By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root jss5 jss7 MuiButton-text')]");
		// driver.findElement(Back).click();
	 
	 
	 */

}
