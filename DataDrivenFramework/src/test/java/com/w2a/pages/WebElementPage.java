package com.w2a.pages;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.math3.analysis.function.Ceil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebElementPage {
	WebDriver driver;
	WebDriverWait wait;
	XSSFWorkbook owkbk;
	
	//@FindBy(id = "openwindow")
	//WebElement opnwnd;
	//@FindBy(xpath = "//table/thead/tr")
	//WebElement wtable;
	public WebElementPage(WebDriver driver)
	{
		wait= new WebDriverWait(driver, 30);
		//PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void testWebElement()
	{
		try {
			
		
		WebElement mytab = driver.findElement(By.xpath("//table[@class='dataTable']"));
		List<WebElement> rowstab =mytab.findElements(By.tagName("tr"));
		int rowcount = rowstab.size();
		
		System.out.println("rowcount="+ rowcount);
		File file = new File("E:\\Eclipse_Workspace\\DataDrivenFramework\\src\\test\\resources\\excel\\testdata7.xlsx");
		FileOutputStream ofile = new FileOutputStream(file);
		owkbk = new XSSFWorkbook();
		XSSFSheet osheet = owkbk.createSheet("webtabledata");
		
		for(int i=0;i<rowcount;i++)
		{
		 List<WebElement>coltab = rowstab.get(i).findElements(By.tagName("td"));
		 int colcount = coltab.size();
		 System.out.println();
		 XSSFRow row = osheet.createRow(i);
		 for(int j=0;j<colcount;j++)
			 
		 {
			 
			//System.out.print(coltab.get(j).getText()+ " "); 
			 //ab.get(j);
			 //System.out.println(val);
			
			XSSFCell cell = row.createCell(j);
			//cell.toString();
			cell.setCellValue(coltab.get(j).getText());
			
			System.out.println("Cell value=" + cell.getStringCellValue());
			//String cell1 =cell.getStringCellValue();
			
			
			
		 }
		}
		
		owkbk.write(ofile);
		
		//Assert.assertTrue(errorme);
    
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		

	
	
	
	}

}
