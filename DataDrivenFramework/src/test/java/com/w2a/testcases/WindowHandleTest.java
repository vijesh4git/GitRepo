package com.w2a.testcases;

import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.pages.windowhandles;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class WindowHandleTest extends TestBase{
	public static WebDriver driver;
  @Parameters({"URL"})
  @Test
  public void f(String urlname) {
	  System.out.println(urlname);
	  driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	  driver.manage().window().maximize();
	  windowhandles ownd = new windowhandles(driver);
	  //ownd.testwindowhandle();
	  Assert.assertEquals(ownd.testwindowhandle(), "Rahul Shetty Academy");
    Reporter.log("Test passed");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
