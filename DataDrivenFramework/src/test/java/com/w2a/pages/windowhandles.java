package com.w2a.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowhandles {
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(id = "openwindow")
	WebElement opnwnd;
	@FindBy(xpath = "//a[contains(text(),'Open Tab')]")
	WebElement opntab;
	public windowhandles(WebDriver driver)
	{
		wait= new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public String testwindowhandle()
	{
		String mainwindow = driver.getWindowHandle();
		String title = null;
		System.out.println("main window id =" + mainwindow);
	//wait.until(ExpectedConditions.visibilityOf(opnwnd)).click();
		wait.until(ExpectedConditions.visibilityOf(opntab)).click();
	Set<String>ids = driver.getWindowHandles();
	Iterator<String> it = ids.iterator();
	
	while(it.hasNext())
	{
		String childwindow = it.next();
		if(!mainwindow.equalsIgnoreCase(childwindow))
		{
	   driver.switchTo().window(childwindow);
	   System.out.println("Childwindow id ="+ childwindow);
	   title = driver.getTitle();
	   System.out.println("title of child window=" + title);
	}
	}
	driver.close();
	driver.switchTo().window(mainwindow);
	String title1= driver.getTitle();
	System.out.println("Maindow title=" + title1);
	return title;
	
	
	}

}
