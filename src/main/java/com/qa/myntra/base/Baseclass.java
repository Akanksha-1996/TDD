package com.qa.myntra.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.qa.myntra.utils.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public Baseclass(){
		
		try{
			prop= new Properties();
			FileInputStream fis= new FileInputStream(
					"C:/program/myntra/src/main/java/com/qa/myntra/properties/config.properties");
			prop.load(fis);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();

		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
public static void initialisation(){
	               String BrowserName=  prop.getProperty("browser");
	               if(BrowserName.equals("chrome")){
	            	   WebDriverManager.chromedriver().setup();
	            	   driver= new ChromeDriver();
	            	   System.out.println("Chrome Driver launched successfully");
	            	   }
	               else if(BrowserName.equals("firefox")){
	            	   WebDriverManager.firefoxdriver().setup();
	            	   driver = new FirefoxDriver();
	            	   System.out.println("Firefox Broswer Launched Successfully");
	            	   
	               }
	               else if(BrowserName.equals("IE")){
	            	   WebDriverManager.iedriver().setup();
	            	   driver = new InternetExplorerDriver();
	            	   System.out.println("Firefox Broswer Launched Successfully");
	               }
	               else{
	            	   System.out.println("No Browser found");
	               }
	               driver.manage().window().maximize();
	               driver.manage().deleteAllCookies();
	               //driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeout, TimeUnit.SECONDS );
	               driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitWait, TimeUnit.SECONDS);
	               
	               driver.get(prop.getProperty("url"));
	               System.out.println("URL launched successfully");
	               
	               
}
}
