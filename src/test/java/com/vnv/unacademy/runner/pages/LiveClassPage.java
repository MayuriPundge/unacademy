package com.vnv.unacademy.runner.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LiveClassPage {
	WebDriver driver;
	
	@FindBy(xpath="//div[contains(@class,'DrawingBoard__ScaledDrawingBoardContainer-sc-1r0ce6l-1 kYMTAf')]") 
	@CacheLookup
	WebElement Drawing_board;
	
	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiButton-root jss5 jss31 MuiButton-text')]") 
	@CacheLookup
	WebElement Fullscreen;
	
	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiButton-root jss5 jss11 MuiButton-text')]") 
	@CacheLookup
	WebElement Mute;
	
	
	//  /html/body/div/div/div/div[3]/div/div[2]/div[6]/div
	// //*[@id="clx-sidebar"]/div/div[2]/div[6]/div
	@FindBy(xpath="//div[contains(@class,'Tooltip__MainContainer-sc-1y3os0u-1 ldTBQr')]") 
	@CacheLookup
	WebElement Panel;
	
	@FindBy(xpath="//div[contains(@class,'SidebarInner__TooltipContainer-sc-1c4lm9n-4 bjekiA')]") 
	@CacheLookup
	WebElement Doubts;
	
	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiButton-root jss5 jss8 MuiButton-text')]") 
	@CacheLookup
	WebElement Rewind;
	
	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiButton-root jss5 jss10 MuiButton-text')]") 
	@CacheLookup
	WebElement Forward;
	
	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiButton-root jss5 jss9 MuiButton-text')]") 
	@CacheLookup
	WebElement Pause;
	
	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiButton-root jss5 jss28 MuiButton-text')]") 
	@CacheLookup
	WebElement Settings;
	
	@FindBy(xpath="//div[contains(@class,'Switch__ToggleOption-nhh88w-1 jawpXx')]") 
	@CacheLookup
	WebElement Educator_video;
	
	@FindBy(xpath="//div[contains(@class,'SettingsPanel__SettingsPanelWrapper-sc-1bg0wrd-0 jwSZqz')]/div[4]/div/div/div") 
	@CacheLookup
	WebElement dark_mode_on;
	
	//TODO
	@FindBy(xpath="//div[contains(@class,'SettingsPanel__SettingsPanelWrapper-sc-1bg0wrd-0 jwSZqz')]/div[4]/div/div/div[1]") 
	@CacheLookup
	WebElement dark_mode_off;
	
	@FindBy(xpath="//div[contains(@class,'SettingsPanel__SettingsPanelWrapper-sc-1bg0wrd-0 Smcdn')]/div[6]") 
	@CacheLookup
	WebElement Report_issue;
	
	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiButton-root jss5 jss7 MuiButton-text')]") 
	@CacheLookup
	WebElement Back;
	
	
	public WebElement get_drawing_board()
	{
		return Drawing_board;
	}
	
	public WebElement get_fullscreen()
	{
		return Fullscreen;
	}
	
	public WebElement get_mute()
	{
		return Mute;
	}
	
	public WebElement get_panel()
	{
		return Panel;
	}
	
	public WebElement get_doubts()
	{
		return Doubts;
	}
	
	public WebElement get_rewind()
	{
		return Rewind;
	}
	
	public WebElement get_forward()
	{
		return Forward;
	}
	
	public WebElement get_pause()
	{
		return Pause;
	}
	
	public WebElement get_settings()
	{
		return Settings;
	}
	
	public WebElement get_educator_video()
	{
		return Educator_video;
	}
	
	public WebElement get_dark_mode_on()
	{
		return dark_mode_on;
	}
	
	public WebElement get_dark_mode_off()
	{
		return dark_mode_off;
	}
	
	public WebElement get_back()
	{
		return Back;
	}
	
	public WebElement get_report_issue()
	{
		return Report_issue;
	}
	
	/*public LiveClassPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}*/
	
	/*public WebElement get_()
	{
		return ;
	}*/
	
	
}
