package com.qa.myntra.testcases;

//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.myntra.base.Baseclass;
import com.qa.myntra.pages.HomePage;
import com.qa.myntra.pages.LoginPage;
import com.qa.myntra.pages.MobileCover;

public class MobileCoverTest extends Baseclass {
	
	LoginPage loginpage;
	HomePage homepage;
	MobileCover mobilecover;
	
	
	public MobileCoverTest(){
		super();
	}
	
	@BeforeMethod()
	 public void setup() throws InterruptedException{
		  initialisation();
		  loginpage = new LoginPage();
		  homepage = new HomePage();
		  mobilecover = new MobileCover();
		  homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));//without object creation calling a method??/
		  homepage.searchBar(prop.getProperty("product"));
	 }
	
	@Test()
	public void filtercover() throws InterruptedException{
		mobilecover.color();
		Thread.sleep(5);
		mobilecover.wishlistbtn();
		System.out.println("wishlist clicked");
		mobilecover.wishlistpage();
	}
	
	//@AfterTest()
	//public void teardown(){
		//System.out.println("Logged in successfully");
		//driver.quit();
	//}

}
