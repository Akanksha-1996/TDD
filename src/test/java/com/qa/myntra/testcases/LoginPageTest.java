package com.qa.myntra.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.myntra.base.Baseclass;
import com.qa.myntra.pages.HomePage;
import com.qa.myntra.pages.LoginPage;

public class LoginPageTest extends Baseclass {
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest(){
		super();
	}
  @BeforeMethod()
  public void setup()throws InterruptedException{
	  initialisation();
	  loginpage = new LoginPage();
  }
  @Test()
  public void loginTest() throws InterruptedException{
	  homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
  }
  @AfterMethod()
  public void teardown(){
	  System.out.println("Logged in Successfully");
	  driver.quit();
  }

}
