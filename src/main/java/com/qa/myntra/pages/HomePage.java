package com.qa.myntra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.myntra.base.Baseclass;

public class HomePage extends Baseclass {
	
	//searchbar xpath= "//*[@id='desktop-header-cnt']/div[2]/div[3]/input"
	//xpath searchbtn- //*[@id='desktop-header-cnt']/div[2]/div[3]/a/span
	//33more btn - //*[@id="mountRoot"]/div/div[1]/main/div[3]/div[1]/section/div/div[4]/div[2]/span
	//black btn- //*[@id='mountRoot']/div/div[1]/main/div[3]/div[1]/section/div/div[4]/ul/li[1]/label
	//wishlistele1= //*[@id='desktopSearchResults']/div[2]/section/ul/li[1]/div[3]/span
	//wishlistele2- //*[@id='desktopSearchResults']/div[2]/section/ul/li[2]/div[3]/span
	//wishlistele3- //*[@id='desktopSearchResults']/div[2]/section/ul/li[3]/div[3]/span
	//wishlistele4- //*[@id='desktopSearchResults']/div[2]/section/ul/li[4]/div[3]/span
	//wishlistele5- //*[@id='desktopSearchResults']/div[2]/section/ul/li[5]/div[3]/span
	//wishlistpagebtn - //*[@id='desktop-header-cnt']/div[2]/div[2]/a[1]/span[1]
	
	@FindBy(xpath="//*[@id='desktop-header-cnt']/div[2]/div[3]/input")
	WebElement searchbar;
	
	@FindBy(xpath="//*[@id='desktop-header-cnt']/div[2]/div[3]/a/span")
	WebElement searchbtn;
	
	
	
	public HomePage(){
		PageFactory.initElements(driver, this); 
		
	}
	
	public void searchBar(String sc){
		searchbar.sendKeys(sc);
		searchbtn.click();
	}
	
	
	
	

	

}


