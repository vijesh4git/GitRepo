package com.w2a.testcases;

import org.testng.annotations.Test;

import com.w2a.pages.IframePage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class IframeTest {
	public static WebDriver driver;
  @Test(enabled = false)
  public void iframeTesting() {
	  
	  driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	  IframePage ofrm = new IframePage(driver);
	  ofrm.iframetest();
	  
	    }
  @Test
  public void mousehovertest()
  {
	  driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	  IframePage ofrm1 = new IframePage(driver);
	  ofrm1.mousehovertest();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
