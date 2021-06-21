package com.qa.myntra.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.myntra.base.Baseclass;
import com.qa.myntra.pages.BagPage;
import com.qa.myntra.pages.HomePage;
import com.qa.myntra.pages.LoginPage;
import com.qa.myntra.pages.MobileCover;
import com.qa.myntra.pages.WishlistPage;

public class BagPageTest extends Baseclass {
	
	LoginPage loginpage;
	HomePage homepage;
	MobileCover mobilecover;
	WishlistPage wishlistpage;
	BagPage bagpagetest;
	
	public BagPageTest(){
		super();
	}
	
	@BeforeTest
	public void setup() throws InterruptedException{
		initialisation();
		loginpage = new LoginPage();
		  homepage = new HomePage();
		  mobilecover = new MobileCover();
		  wishlistpage = new WishlistPage();
		  bagpagetest = new BagPage();
		 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));//without object creation calling a method??/
		  homepage.searchBar(prop.getProperty("product"));
		  mobilecover.color();
			mobilecover.wishlistbtn();
			mobilecover.wishlistpage();
			wishlistpage.printproduct();
			wishlistpage.price();
			wishlistpage.addtopage();
			wishlistpage.bagPage();
	}
	
	@Test
	public void bagpage(){
		bagpagetest.bagproduct();
		bagpagetest.bagprice();
		Assert.assertEquals(wishlistpage.printproduct(), bagpagetest.bagproduct());
		//if(pname.equals(bagpname)==true){
		}
	
	
}
		/*
		 * if (ArrayList1.equals(ArrayList2) == true) {
            System.out.println(" Array List are equal");
		 */
		
		//Assert.AreEqual(pname,bagpname);
	
	
	//@AfterTest()
	/*public void teardown(){
		driver.quit();
	}

}*/
