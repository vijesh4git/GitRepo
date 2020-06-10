package com.w2a.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class IframePage {
	JavascriptExecutor js;
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath = "//iframe[@name='iframe-name']")
	WebElement ifrme;
	@FindBy(xpath = "//li[contains(text(),'contact@rahulshettyacademy.com')]")
	WebElement ctmail;
	@FindBy(id = "mousehover")
	WebElement mshvrbtn;
	@FindBy(xpath = "//a[contains(text(),'Top')]")
	WebElement topslct;
	public IframePage(WebDriver driver)
	{  
		js = (JavascriptExecutor)driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void iframetest()
	{
	 //WebElement element = 	
	 //js.executeScript("arguments[0].scrollIntoView(true);", ctmail); 	
	 js.executeScript("window.scrollBy(0,1000)");	
	 driver.switchTo().frame(ifrme);
	 String emailid = wait.until(ExpectedConditions.visibilityOf(ctmail)).getText();
	 Assert.assertEquals(emailid, "contact@rahulshettyacademy.com");
	 System.out.println(emailid);
	}
	
	public void mousehovertest()
	{
      js.executeScript("window.scrollBy(0,900)");
      Actions action = new Actions(driver);
      Action action1 = action.moveToElement(mshvrbtn).build();
      action1.perform();
      Action action2 = action.moveToElement(topslct).click().build();
      action2.perform();
      
   }
}
