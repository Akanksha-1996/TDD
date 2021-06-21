package com.qa.myntra.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.myntra.base.Baseclass;
import com.qa.myntra.pages.HomePage;
import com.qa.myntra.pages.LoginPage;

public class HomePageTest extends Baseclass {
	LoginPage loginpage;//int a;  
	HomePage homepage;
	
	public HomePageTest(){
		super();
	}
	@BeforeMethod()
		public void setup() throws InterruptedException{
			initialisation();
			loginpage = new LoginPage();
			homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));//without object creation calling a method??/		
			homepage = new HomePage();
	}
	
	@Test
	public void search(){
		homepage.searchBar(prop.getProperty("product"));
	}
	
	@AfterMethod
	public void teardown(){
		System.out.println("Logged in successfully");
		driver.quit();
	}
	}

