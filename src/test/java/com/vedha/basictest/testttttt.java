package com.vedha.basictest;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testttttt {
	@Test
	public void selenium() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.id("guide-icon")).click();
		driver.findElement(By.xpath("//*[@placeholder=\"Search\"]")).sendKeys("kalusukovalani songs");
		driver.findElement(By.id("search-icon-legacy\"")).click();
		
			
	}

	@Test
	public void seleniumm() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions act=new Actions(driver);
		WebElement icons=driver.findElement(By.id("guide-icon"));
		act.moveToElement(icons).click().build().perform();
		WebElement search=driver.findElement(By.xpath("//*[@placeholder=\"Search\"]"));
		act.moveToElement(search).sendKeys("tigers").build().perform();
		
	}
	

	public void seleniummm() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
