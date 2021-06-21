package com.qa.myntra.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.myntra.base.Baseclass;

public class WishlistPage extends Baseclass{
	
	/*
bag1- //*[@id='item0']/div[2]/div[2]/span/a
done1-//*[@id='item0']/div[2]/div/div/div[4]
productname1-//*[@id="item0"]/div[2]/div[1]/p[1]
price1-//*[@id='item0']/div[2]/div[1]/div/span[1]
bag2-//*[@id='item1']/div[2]/div[2]/span/a
done2- //*[@id='item0']/div[2]/div/div/div[4]////*[@id="item0"]/div[2]/div/div/div[4]//
//*[@id="item0"]/div[2]/div/div/div[4]
productname2-//*[@id="item1"]/div[2]/div[1]/p[1]
price2-//*[@id="item1"]/div[2]/div[1]/div/span[1]
bag3-//*[@id='item2']/div[2]/div[2]
done3-//*[@id='item1']/div[2]/div[2]/span/a
productname3-//*[@id="item2"]/div[2]/div[1]/p[1]
price3-//*[@id="item2"]/div[2]/div[1]/div/span[1]
bag4-//*[@id='item3']/div[2]/div[2]/span/a
done4-//*[@id='item2']/div[2]/div[2]/span/a
productname4-//*[@id='item3']/div[2]/div[1]/p[1]
price4-//*[@id="item3"]/div[2]/div[1]/div/span[1]
bag5-//*[@id='item4']/div[2]/div[2]/span/a
done5-//*[@id='item3']/div[2]/div[2]/span/a
productname5-//*[@id="item4"]/div[2]/div[1]/p[1]
price5-//*[@id="item4"]/div[2]/div[1]/div/span[1]
bagpagebtn-//*[@id='desktop-header-cnt']/div[2]/div[2]/a[2]/span[3]
*/
//productname = //*[@classname='itemdetails-itemDetailsLabel']	
	
	@FindBy(xpath="//*[@id='item0']/div[2]/div[2]/span/a")
	WebElement addtobagbtn1;
	
	@FindBy(xpath="//*[@id='item0']/div[2]/div/div/div[4]")
	WebElement donebtn1;
	
	@FindBy(xpath="//*[@id='item0']/div[2]/div[2]/span/a")
	WebElement addtobagbtn2;
	
	@FindBy(xpath="//*[@id='item0']/div[2]/div/div/div[4]")
	WebElement donebtn2;
	
	@FindBy(xpath="//*[@id='item0']/div[2]/div[2]/span/a")
	WebElement addtobagbtn3;
	
	@FindBy(xpath="//*[@id='item0']/div[2]/div/div/div[4]")
	WebElement donebtn3;
	
	@FindBy(xpath="//*[@id='item0']/div[2]/div[2]/span/a")
	WebElement addtobagbtn4;
	
	@FindBy(xpath="//*[@id='item0']/div[2]/div/div/div[4]")
	WebElement donebtn4;
	
	@FindBy(xpath="//*[@id='item0']/div[2]/div[2]/span/a")
	WebElement addtobagbtn5;
	
	@FindBy(xpath="//*[@id='item0']/div[2]/div/div/div[4]")
	WebElement donebtn5;
	
	//@FindBy(className="itemdetails-itemDetailsLabel")
	String productname = "itemdetails-itemDetailsLabel";
	
	@FindBy(xpath="//*[@id='desktop-header-cnt']/div[2]/div[2]/a[2]/span[3]")
	WebElement bagpagebtn;
	
	 String pricelist="itemdetails-boldFont";
	
	/*
	 * price1-//*[@id='item0']/div[2]/div[1]/div/span[1]
	 * 
	 * @FindBy(xpath="//*[@id='item0']/div[2]/div[1]/div/span[1]")
	WebElement price1;
	
	@FindBy(xpath="//*[@id='item1']/div[2]/div[1]/div/span[1]")
	WebElement price2;
	
	@FindBy(xpath="//*[@id='item2']/div[2]/div[1]/div/span[1]")
	WebElement price3;
	
	@FindBy(xpath="//*[@id='item3']/div[2]/div[1]/div/span[1]")
	WebElement price4;
	
	@FindBy(xpath="//*[@id='item4']/div[2]/div[1]/div/span[1]")
	WebElement price5;
	 * 
	 */
	
/*[@class="itemdetails-boldFont"]
	@FindBy(xpath="//*[@id='item0']/div[2]/div[1]/div/span[1]")
	int price1;
	
	@FindBy(xpath="//*[@id='item1']/div[2]/div[1]/div/span[1]")
	int price2;
	
	@FindBy(xpath="//*[@id='item2']/div[2]/div[1]/div/span[1]")
	int price3;
	
	@FindBy(xpath="//*[@id='item3']/div[2]/div[1]/div/span[1]")
	int price4;
	
	@FindBy(xpath="//*[@id='item4']/div[2]/div[1]/div/span[1]")
	int price5;
	
	//@FindBy(className="itemdetails-boldFont")
	//Integer price;
	 
	 */
	public WishlistPage(){
		PageFactory.initElements(driver, this);
	}
	

	
	
	
	//Dog(String c) {
	  //color = c;}
	
	public void addtopage(){
		addtobagbtn1.click();
		donebtn1.click();
		addtobagbtn2.click();
		donebtn2.click();
		addtobagbtn3.click();
		donebtn3.click();
		addtobagbtn4.click();
		donebtn4.click();
		addtobagbtn5.click();
		donebtn5.click();
	}
	
	//to print the product name
	public String printproduct(){
		System.out.println("printing products starts");
		
		
		  List<WebElement> pname= driver.findElements(By.className(productname));//fetch list of all web elements coming from myntra
		  List<String> all_elements=new ArrayList<String>();//store to print list of product names will be stored in this list
		  System.out.println("printing products from wishlist page");
		  for(int i =0; i<pname.size();i++){
			  all_elements.add(pname.get(i).getText());;
			  System.out.println(pname.get(i).getText());
			  /*
		String parent = driver.getWindowHandle();
		  Set<String> allWindows=driver.getWindowHandles();
		  for(String child:allWindows)
		  {
			  if(!parent.equalsIgnoreCase(child))
			  {
				  driver.switchTo().window(child);
				  List<WebElement> pname= driver.findElements(By.className(productname));
				  List<String> all_elements=new ArrayList<String>();
				  System.out.println("printing products");
				  for(int i =1; i<pname.size();i++){
					  all_elements.add(pname.get(i).getText());;
					  System.out.println(pname.get(i).getText());
						//for(int i =1; i<pname.size();i++)
		           //driver.close();
		           //driver.switchTo().window(parent);
			  }
		  
		
		}*/
		  }
		return productname;
		
	}
	//to print the price name
	//assertEquals(38.0, map.get());
	/*
	 * for (Map.Entry m : hm.entrySet()) {

   System.out.println((m.getKey() + "  " + m.getValue()));
  }
	 * 
	*/
	public String price(){
		/*
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(int i=1;i<map.size();i++)
		{
		map.getText
		map.put("p2", price2);
		map.put("p3", price3);
		map.put("p4", price4);
		map.put("p5", price5);
		}
		
		 for (Map.Entry m : map.entrySet()) {

			   System.out.println((m.getKey() + "  " + m.getValue()));
			  }
			  */
		
		
		System.out.println("price method started");
		
		/*
		 *  List<WebElement> pname= driver.findElements(By.className(productname));//fetch list of all web elements coming from myntra
		  List<String> all_elements=new ArrayList<String>();//store to print list of product names will be stored in this list
		  System.out.println("printing price");
		  for(int i =1; i<price1.size();i++){
			  price.add(pname.get(i).getText());;
			  System.out.println(price1.get(i).getText());
		 * 
		 */
		
		//putting pricelist value to price 1
		 List<WebElement> price1=driver.findElements(By.className(pricelist));
		 List<String> price=new ArrayList<String>();
		 System.out.println("printing price");
		 
		 //putting price 1 value to price
		 for(int i =0; i<price1.size();i++){
			  price.add(price1.get(i).getText());
			 
		  }
		 System.out.println("price method list");
			HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();
			  hashMap.put("prices:", price);
				 
			  //loop HashMap
			 // for (Entry<String, List<String>> entry : hashMap.entrySet()) {
			 //System.out.println(entry.getKey()+" "+entry.getValue().toString());
			 System.out.println(hashMap);
				  //return (entry.getKey()+" "+entry.getValue());
			   //product1 price(string)  - price(value)
			   //return  pricelist;
			  //}
			return pricelist.toString();
			 }
		
		public BagPage bagPage(){
			bagpagebtn.click();
			return new BagPage();//can it be removed?
		}
	}


	

	

