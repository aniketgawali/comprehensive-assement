package com.mindtree.seleniumclass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//assign the properties to the wedriver
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//login the tide web portal
		driver.get("https://tide.com/en-us");
		//maximise  the page
		driver.manage().window().maximize();
		driver.getTitle();
		//by clicking on register get the sign up now option to get further log in option
		//driver.findElement(By.linkText("Register")).click();
		//driver.findElement(By.linkText("Sign up now")).click();
		//driver.findElement(By.xpath("//button[@class='underline text-primaryCta lg:text-base leading-light font-montserratSemiBold font-semibold']")).click();
		//driver.findElement(By.xpath("//button[contains(@class,'underline text-primaryCta lg:text-base leading-light font-montserratSemiBold font-semibold')]")).click();
		//driver.switchTo().window("https://www.pggoodeveryday.com/login/");
		//driver.findElement(By.id("login-email")).sendKeys("aniketgawali677@gmail.com");
		//driver.findElement(By.id("login-password")).sendKeys("Aniket@677");
		//driver.findElement(By.xpath("//input[@type='submit']")).click(); 
		//once get login get back to the home page 
		//driver.navigate().back();
		//driver.switchTo().window("https://tide.com/en-us");
		//driver.get("https://tide.com/en-us");
		//select a random product to 
		//driver.findElement(By.linkText("Shop Products")).click();
		//driver.findElement(By.xpath("//img[@alt='alt=\"Tide Hygienic Clean Heavy Duty 10X Free Power PODS®\"']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Tide Hygienic Clean Heavy Duty");
		
		
	
	}

}
