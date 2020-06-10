package com.w2a.testcases;

import org.testng.annotations.Test;

import com.mongodb.diagnostics.logging.Logger;
import com.w2a.pages.Customerpage;
import com.w2a.utilities.ExcelUtilities;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Test1 {
	static WebDriver driver;
	String loginname;
	  String usrname;
	  int i=0;
	  int j=0;
  @Test(dataProvider = "DataFromExcel",priority =1)
  public void f(String CustomerName,String AccNo) throws InterruptedException {
	  //System.out.println("test result");
	  //Assert.assertEquals(6, 5);
	 
	  driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
	  driver.manage().window().maximize();
	  Customerpage ocpage = new Customerpage(driver);
	  //for(int i=0;i<)
	 
	  loginname = ocpage.loginpage(CustomerName,AccNo);
	  usrname = ocpage.getUsername().getText();
	  System.out.println("Assertion executed inside dataprovider"+loginname+ "&" + usrname);
	  Assert.assertEquals(loginname,usrname,"loginname & username are equal"); 
	  
	 //driver.navigate().refresh();
	  //Thread.sleep(2000);
	
	//System.out.println("User name & login name matched");
	 
	  //String usrname = ocpage.getUsername().getText();
	  //System.out.println(loginname + usrname);
	  //Assert.assertEquals(loginname, usrname);
	  
	  //String abc = ocpage.loginpage();
	  //String usrname = ocpage.getUsername().getText();
	  //Assert.assertEquals(abc,usrname);
	  //Assert.assertTrue(abc.equals(usrname));
	  //if(abc.equals(usrname))
	 /* {
		  System.out.println("username matched");
	  }*/
  }
  
  @Test(priority=2)
  public void compareData()
  { 
	  System.out.println("Assertion executed"+loginname+ "&" + usrname);
	 //Assert.assertEquals(loginname,usrname); 
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }
  
  @DataProvider
  public Object[][] DataFromExcel() throws Exception
  {
	  ExcelUtilities oexcel = new ExcelUtilities("E:\\Eclipse_Workspace\\DataDrivenFramework\\src\\test\\resources\\excel\\testdata.xlsx","Customer");
	  //oexcel.getCellData()
	return oexcel.exceldp();
	  
  }

}
