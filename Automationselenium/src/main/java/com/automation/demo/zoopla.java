package com.automation.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class zoopla {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//open the browser
		driver.get("https://www.zoopla.co.uk/");
		//click cookie
		driver.findElement(By.xpath(" //*[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
		
		//click Sign_In
		driver.findElement(By.xpath(" //*[@class='button button--tertiary-dark account-link__text']")).click();
		//please wait
		WebDriverWait obj = new WebDriverWait(driver, 30);
		obj.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath(" //*[@name='signin_email']"), 0));
		
		//click Email
		WebElement email = driver.findElement(By.xpath(" //*[@name='signin_email']"));
		
		email.sendKeys("bimita1989@gmail.com");//input[@type='email']
		

		//Click Password
		WebElement password = driver.findElement(By.xpath(" //*[@name='signin_password']"));
		password.sendKeys("bimita2016");//input[@type='password']
		
		//Click Sign
		WebElement Login = driver.findElement(By.xpath(" //*[@value='Sign in']"));
		Login.click();//*[@value='Sign in']
		//close the browser
		//driver.quit();
		}
}
	
	
	

