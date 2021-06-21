package com.qa.myntra.pages;

import java.awt.Desktop.Action;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.myntra.base.Baseclass;

public class MobileCover extends Baseclass {
	
	@FindBy(xpath="//*[@id='mountRoot']/div/div[1]/main/div[3]/div[1]/section/div/div[4]/ul/li[1]/label")
	WebElement black;
	
	@FindBy(xpath="//*[@id='desktopSearchResults']/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img")
	//*[@id='desktopSearchResults']/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img
	WebElement wishlistele1;
	
	@FindBy(xpath="//*[@id='mountRoot']/div/div/div/main/div[2]/div[2]/div[3]/div/div[2]/span[2]")
	WebElement wishbutton1;
	
	@FindBy(xpath="//*[@id='desktopSearchResults']/div[2]/section/ul/li[2]/a/div[1]/div/div[1]/div/picture/img")
	WebElement wishlistele2;
	
	@FindBy (xpath= "//*[@id='mountRoot']/div/div/div/main/div[2]/div[2]/div[3]/div/div[2]/span[2]")
	WebElement wishbutton2;
	
	@FindBy(xpath="//*[@id='desktopSearchResults']/div[2]/section/ul/li[3]/a/div[1]/div/div/div/picture/img")
	WebElement wishlistele3;
	
	@FindBy(xpath="//*[@id='mountRoot']/div/div/div/main/div[2]/div[2]/div[3]/div/div[2]/span[2]")
	WebElement wishbutton3;
	
	@FindBy(xpath="//*[@id='desktopSearchResults']/div[2]/section/ul/li[4]/a/div[1]/div/div/div/picture/img")
	WebElement wishlistele4;
	
	@FindBy(xpath="//*[@id='mountRoot']/div/div/div/main/div[2]/div[2]/div[3]/div/div[2]")
	WebElement wishbutton4;
	
	@FindBy(xpath="//*[@id='desktopSearchResults']/div[2]/section/ul/li[5]/a/div[1]/div/div[1]/div/picture/img")
	WebElement wishlistele5;
	
	@FindBy(xpath="//*[@id='mountRoot']/div/div/div/main/div[2]/div[2]/div[3]/div/div[2]/span[2]")
	WebElement wishbutton5;
	
	//@FindBy(xpath="//*[@id='desktopSearchResults']/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img")
	//By MobileCover1;
	
	//@FindBy(xpath="//*[@id='desktopSearchResults']/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img")
	//WebElement mousehover;
	
	
	
	@FindBy(xpath="//*[@id='desktop-header-cnt']/div[2]/div[2]/a[1]/span[1]")
	WebElement wishlistpagebtn;
	
	public MobileCover(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean color(){
		black.click();
		return black.isSelected();
		
		
	}
	
	public void wishlistbtn(){
		/*wishlistele1.click();
		 String parent = driver.getWindowHandle();
		  Set<String> allWindows=driver.getWindowHandles();
		  for(String child:allWindows)
		  {
			  if(!parent.equalsIgnoreCase(child))
			  {
				  driver.switchTo().window(child);
		           wishbutton1.click();
		           
		           driver.close();
		           driver.switchTo().window(parent);
			  }
		  }
		8wishlistele2.click();*/
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementsByClassName('myntraweb-sprite product-notWishlistedIcon sprites-notWishlisted')[0].click()");
		js.executeScript("document.getElementsByClassName('myntraweb-sprite product-notWishlistedIcon sprites-notWishlisted')[1].click()");
		js.executeScript("document.getElementsByClassName('myntraweb-sprite product-notWishlistedIcon sprites-notWishlisted')[2].click()");
		js.executeScript("document.getElementsByClassName('myntraweb-sprite product-notWishlistedIcon sprites-notWishlisted')[3].click()");
		js.executeScript("document.getElementsByClassName('myntraweb-sprite product-notWishlistedIcon sprites-notWishlisted')[4].click()");
		/*WebElement ele = driver.findElement((mousehover);
		Actions action = new Actions (driver);
		action.moveToElement(ele).perform();
		
		
		/*wishlistele2.click();
		wishlistele3.click();
		wishlistele4.click();
		wishlistele5.click();
		*/
		}
	
	public WishlistPage wishlistpage(){
		wishlistpagebtn.click();
		return new WishlistPage();//can be removed
		
	}
	
	
	

}
