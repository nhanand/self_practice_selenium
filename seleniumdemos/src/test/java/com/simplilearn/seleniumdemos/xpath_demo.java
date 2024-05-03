package com.simplilearn.seleniumdemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_demo {
	
	@Test
	public void createCheckBoxXpath() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//        driver.manage().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
//		driver.get("https://test.qatechhub.com/form-elements/");
//		driver.findElement(By.xpath("//*[@id=\"wpforms-49-field_3_2\"]")).click();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
		
		String expectedUrl = "https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles";
		
		String currentUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedUrl, currentUrl);
		
//		driver.quit();
	}
	

}
