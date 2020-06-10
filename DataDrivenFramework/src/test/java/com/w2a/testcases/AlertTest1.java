package com.w2a.testcases;

import org.testng.annotations.Test;

import com.w2a.pages.AlertPage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AlertTest1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("http://demo.guru99.com/test/delete_customer.php");
	  driver.manage().window().maximize();
	  AlertPage oalertpage = new AlertPage(driver);
	  String msg1 = oalertpage.alerttest();
	  Assert.assertEquals(msg1, "Customer Successfully Delete!");
	  System.out.println("Successfully deleted");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
