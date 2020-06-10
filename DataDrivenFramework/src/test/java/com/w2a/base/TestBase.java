package com.w2a.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	public WebDriver driver;
	
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fin = new FileInputStream("E:\\Eclipse_Workspace\\DataDrivenFramework\\src\\test\\java\\com\\w2a\\utilities\\config.properties");
		
		prop.load(fin);
		String browsername = prop.getProperty("browser");
		
		if (browsername.equalsIgnoreCase("chrome"))
		{
			  System.out.println("chrome browser");
			  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		return driver;
	}
		
		public String takescreenshot(String testcasename,WebDriver driver) throws IOException
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			String destfile = System.getProperty("user.dir")+"\\Reports\\" +testcasename+".png";
			FileUtils.copyFile(src, new File(destfile));
			return destfile;
	}

	
}
