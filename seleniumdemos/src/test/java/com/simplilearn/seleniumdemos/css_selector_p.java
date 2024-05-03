package com.simplilearn.seleniumdemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class css_selector_p {
	
	@Test
	public void css_selector_practice() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//        driver.manage().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://test.qatechhub.com/form-elements/");
//		driver.findElement(By.cssSelector("#wpforms-49-field_1")).sendKeys("anand");
//		driver.findElement(By.cssSelector("#wpforms-49-field_1-last")).sendKeys("kumar");
//		driver.findElement(By.cssSelector("#wpforms-49-field_2")).sendKeys("anand.gmail.com");
//		driver.findElement(By.cssSelector("#wpforms-49-field_4")).sendKeys("123456789");
//		driver.findElement(By.cssSelector("#wpforms-49-field_3_1")).click();
////		driver.findElement(By.cssSelector("#wpforms-49-field_5");
		
	    driver.findElement(By.cssSelector("input[value='Female']")).click();  // imp attr used as css selector

		
		
	}
	
	@Test
	public void css_selector_practice2() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
//		driver.findElement(By.cssSelector("#email")).sendKeys("anand.gmail.com");
		driver.findElement(By.cssSelector(".inputtext _55r1 _6luy")).sendKeys("anand.gmail.com");
		
//		class name is inputtext _55r1 _6luy - to use class as cssselctor add .(dot). if there is spacing the that also is joined by adding . in between
	}

}
