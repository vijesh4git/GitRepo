package com.w2a.pages;

import static org.testng.Assert.expectThrows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Customerpage {
	
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath = "//button[contains(text(),'Customer Login')]")
	WebElement cloginbtn;
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement logbtn;
	@FindBy(xpath = "//strong[contains(text(),'Welcome')]//span")
	WebElement usrnm;
	
	public Customerpage(WebDriver driver)
	{ 
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public String loginpage(String customerName, String accNo) throws InterruptedException
	{   
		wait.until(ExpectedConditions.visibilityOf(cloginbtn)).click();
	      Thread.sleep(1000);
		Select csdrpdwn = new Select(driver.findElement(By.name("userSelect")));
	     //WebElement option = csdrpdwn.getOptions().get(0);
	     //System.out.println(option.getText());
	     //csdrpdwn.getAllSelectedOptions();
	     csdrpdwn.selectByVisibleText(customerName);
	     String drpvalue = csdrpdwn.getFirstSelectedOption().getText();
	     
	     System.out.println(drpvalue);
		return drpvalue;
		
	}
	
	public WebElement getUsername()
		{ 
		wait.until(ExpectedConditions.visibilityOf(logbtn)).click();
		wait.until(ExpectedConditions.visibilityOf(usrnm));
		return usrnm;
   
}
}