package com.simplilearn.seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locator_identifiers {
	
    @Test
	public void testLocatoridentifiers(){
	
    	WebDriverManager.chromedriver().setup();
    	ChromeDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.facebook.com/");
//    	driver.findElement(By.id("email")).sendKeys("anand.gmail.com");
    	driver.findElement(By.name("email")).sendKeys("abc.gmail.com");
    	
    	driver.findElement(By.id("pass")).sendKeys("12345678");
//    	driver.findElement(By.name("pass")).sendKeys("12345678");
    	
//    	driver.findElement(By.name("login")).click();
    	driver.findElement(By.tagName("button")).click();      //tagname input tag button
    	
    	
   
    	
//    	driver.quit();
    	

	}
    
    @Test
    public void link_examples(){
    	
    	WebDriverManager.chromedriver().setup();
    	ChromeDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.amazon.in/");
//    	driver.findElement(By.linkText("Mobiles")).click();
    	driver.findElement(By.partialLinkText("Best")).click();

    	
    	
   
    	
//    	driver.quit();
    	

	}
    

}
