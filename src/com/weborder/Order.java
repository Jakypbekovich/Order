package com.weborder;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Order {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/jakyp/Documents/selenium dependencies/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		
		driver.findElement(By.xpath("//a[@href=\"Process.aspx\"]")).click();
		
		Random random = new Random();
		int value = random.nextInt(101);
		String s = value+"";
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys(s);
		
		
		int nums = 65 + (int)(Math.random() * ((90 - 65) + 1));
		char ch = (char) nums;
		String st = ch+"";
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("John "+st+" Smith");
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).sendKeys("123 Jones Branch Dr.");
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).sendKeys("McLean");
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).sendKeys("VA");
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5")).sendKeys("22102");
		
		
		
		
		
		
		Random rd2 = new Random();
	       int crd = 1 + (int)(Math.random() * ((3 - 1) + 1));
	       switch(crd) {
	       case 1: driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();  break;      
	       case 2: driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1")).click();   break;
	       case 3: driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2")).click();  break;}
	       
	       String numcard = "";
			
	       
	       if(crd==1) {
	    	numcard="4";
			for(int i=0; i<15; i++) {
				numcard+=random.nextInt(10);
			}
	    }
	    else if(crd==2) {
	    	numcard = "5";
			for(int i=0; i<15; i++) {
				numcard+=random.nextInt(10);
			}
	    }
	    else {
	    	numcard = "3";
			for(int i=0; i<14; i++) {
				numcard+=random.nextInt(10);
			}
	    }
		
	    driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(numcard);
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("12/20");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
        
        if(driver.getPageSource().contains("New order has been successfully added")) {
        	System.out.println("Verification was successful");
        }
        else {
        	System.out.println("Verification Failed");
        }
		
		
		
	       

	}

}
