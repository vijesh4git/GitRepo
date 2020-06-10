package com.w2a.testcases;

import org.testng.annotations.Test;
import com.w2a.base.TestBase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.w2a.base.TestBase;
import com.w2a.pages.WebElementPage;
import com.w2a.pages.windowhandles;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TestWebElement extends TestBase{
	WebDriver driver;
	//ExtentReports extent;
 
  @Test
  public void f() throws IOException {
	 // System.out.println(urlname);
	  //driver.get(prop.);
	  driver = initializeDriver();
	  driver.get(prop.getProperty("url"));
	  driver.manage().window().maximize();
	  WebElementPage tweb = new WebElementPage(driver);
	  tweb.testWebElement();
	  //Assert.assertTrue());
	  //test.addScreenCaptureFromBase64String(s);
	  //System.out.println(datatb);
	  
	  //ownd.testwindowhandle();
	  //Assert.assertEquals(ownd.testwindowhandle(), "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
    //Reporter.log("Test passed");
	 
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  
	 
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
