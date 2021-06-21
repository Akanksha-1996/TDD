package com.qa.myntra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.myntra.base.Baseclass;

public class LoginPage extends Baseclass {
	
//profile xpath- 
	//login/signup xpath- 
	//username xpath-
	//continue button xpath- 
	//password button xpath- 
	//password xpath- 
	//continue button xpath- 
	
	@FindBy(xpath="//*[@id='desktop-header-cnt']/div[2]/div[2]/div/div[1]/span[2]")
	WebElement profilebtn;
	
	@FindBy(xpath="//*[@id='desktop-header-cnt']/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/a")
	WebElement loginbtn;
	
	@FindBy(xpath="//*[@id='reactPageContent']/div/div/div[2]/div[2]/div[1]/input")
	WebElement username;
	
	@FindBy(xpath="//*[@id='reactPageContent']/div/div/div[2]/div[2]/div[3]")
	WebElement continuebtn1;
	
	@FindBy(xpath="//*[@id='reactPageContent']/div/div[3]/span")
	WebElement passwordbtn;
	
	@FindBy(xpath="//*[@id='reactPageContent']/div/div/form/div/div[2]/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id='reactPageContent']/div/div/form/div/div[3]/button")
	WebElement continuebtn2;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public HomePage login(String un, String pwd) throws InterruptedException{
		System.out.println("hello");
		profilebtn.click();
		loginbtn.click();
		username.sendKeys(un);
		Thread.sleep(3);
		continuebtn1.click();
		passwordbtn.click();
		password.sendKeys(pwd);
		Thread.sleep(3);
		continuebtn2.click();
		return new HomePage();
		
		
	}
	
	
	
}
