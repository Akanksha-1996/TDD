package com.qa.myntra.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.myntra.base.Baseclass;
import com.qa.myntra.pages.HomePage;
import com.qa.myntra.pages.LoginPage;
import com.qa.myntra.pages.MobileCover;
import com.qa.myntra.pages.WishlistPage;

public class WishlistPageTest extends Baseclass{
	
	LoginPage loginpage;
	HomePage homepage;
	MobileCover mobilecover;
	WishlistPage wishlistpage;
	
	public WishlistPageTest(){
		super();
	}
	
	@BeforeTest()
	public void setup() throws InterruptedException{
		initialisation();
		loginpage = new LoginPage();
		  homepage = new HomePage();
		  mobilecover = new MobileCover();
		  wishlistpage = new WishlistPage();
		 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));//without object creation calling a method??/
		  homepage.searchBar(prop.getProperty("product"));
		  mobilecover.color();
			mobilecover.wishlistbtn();
			mobilecover.wishlistpage();
	}
	
	@Test()
	public void wishlist(){
		wishlistpage.printproduct();
		wishlistpage.price();
		wishlistpage.addtopage();
		wishlistpage.bagPage();
		
	}
	
	/*@AfterTest()
	public void teardown(){
		driver.quit();
	}*/

}
