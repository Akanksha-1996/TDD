package com.qa.myntra.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.myntra.base.Baseclass;

public class BagPage extends Baseclass {

	//@FindBy(className="itemContainer-base-brand")
	String bagproductname = "itemContainer-base-brand";
	String bagpricename = "itemComponents-base-price itemComponents-base-bold itemContainer-base-amount";
	//itemComponents-base-price itemComponents-base-bold itemContainer-base-amount
	
	
public BagPage(){
	PageFactory.initElements(driver, this);	
	}


public String bagproduct(){
	/*List<WebElement> bagpname= driver.findElements(By.xpath(bagproductname));
	for(WebElement webelement:bagpname){
		String name= webelement.getText();
		System.out.println(name);}
}*/

	List<WebElement> pname= driver.findElements(By.className(bagproductname));//fetch list of all web elements coming from myntra
	  List<String> all_elements=new ArrayList<String>();//store to print list of product names will be stored in this list
	  System.out.println("printing products name from bag page");
	  for(int i =0; i<pname.size();i++){
		  all_elements.add(pname.get(i).getText());;
		  System.out.println(pname.get(i).getText());
		  }
	return bagproductname;
	  
}

public String bagprice(){
	System.out.println("price method started");
	List<WebElement> bagprice1=driver.findElements(By.className(bagpricename));
	 List<String> bagprice=new ArrayList<String>();
	 System.out.println("printing price from bag page");
	 
	 //putting price 1 value to price
	 for(int i =0; i<bagprice1.size();i++){
		  bagprice.add(bagprice1.get(i).getText());  }
	 
	 System.out.println("price method list");
		HashMap<String, List<String>> hashMap1 = new HashMap<String, List<String>>();
		  hashMap1.put("prices:", bagprice);
		  System.out.println(hashMap1);
		  return bagprice.toString();
}
//public void removebagproduct(){	
//}
}