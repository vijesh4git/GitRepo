package com.w2a.testcases;

import org.testng.annotations.Test;

import com.w2a.pages.EkartPage1;
import com.w2a.pages.IframePage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class EcommerceTest {
	public static WebDriver driver;
	  
	  @Test
	  public void addtoCartTest()
	  {
		  driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		  driver.manage().window().maximize();
		  EkartPage1 oekart = new EkartPage1(driver);
		  oekart.AddtoCart();
		 
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  }

	  @AfterTest
	  public void afterTest() {
		  //driver.close();
	  }

}
