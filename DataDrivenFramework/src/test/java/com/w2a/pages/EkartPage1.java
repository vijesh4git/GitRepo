package com.w2a.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EkartPage1 {
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath = "//button[contains(text(),'ADDED')]")
	WebElement addedBtn;

	
	public EkartPage1(WebDriver driver)
	{
		//js = (JavascriptExecutor)driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void AddtoCart()
	{
	  List<WebElement> list = driver.findElements(By.cssSelector("h4.product-name")); 
	  
	  for(int i=0;i<list.size();i++)
	  {
		  String productname = list.get(i).getText();
		if(productname.contains("Cucumber"))
		{
		  driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click();
		  String addedbtnname = wait.until(ExpectedConditions.visibilityOf(addedBtn)).getText();
		  //Assert.assertEquals(addedbtnname, "ADDED");
		  System.out.println("button name =" + addedbtnname);
		  Assert.assertTrue(addedbtnname.contains("ADDED"));
		
		}
	  }
	}
}
