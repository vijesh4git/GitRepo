package com.w2a.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AlertPage {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(name = "cusid")
	WebElement cusid;
	@FindBy(name = "submit")
	WebElement subbtn;
	
public AlertPage(WebDriver driver)
{
	wait= new WebDriverWait(driver, 30);
	PageFactory.initElements(driver, this);
	this.driver = driver;
}
public String alerttest() throws InterruptedException
{
	wait.until(ExpectedConditions.visibilityOf(cusid)).sendKeys("2345");
	wait.until(ExpectedConditions.visibilityOf(subbtn)).click();
	wait.until(ExpectedConditions.alertIsPresent());
	//Thread.sleep(2000);
       Alert oalert = driver.switchTo().alert();
       oalert.accept();
       wait.until(ExpectedConditions.alertIsPresent());
       Alert oalert1 = driver.switchTo().alert();
       String msg= oalert1.getText();
       //System.out.println(msg);
       //Assert.assertEquals(msg, "Customer Successfully Delete!1");
       oalert1.accept();
       return msg;

}
}
