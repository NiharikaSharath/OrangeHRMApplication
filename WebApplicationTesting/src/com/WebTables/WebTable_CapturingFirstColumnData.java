package com.WebTables;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class WebTable_CapturingFirstColumnData {
		WebDriver driver;
		public void applicationLaunch()
		{
			String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(applicationUrlAddress);
			driver.manage().window().maximize();
			
		}
	 public void applicationClose()
	 {
		 driver.quit();
	 }

	public void capturingFirstColumnData() throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\hi\\Desktop\\AutomationScripts\\WebApplicationTesting\\ExcelFiles\\WebTable_FirstColumnData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		String xpathExpression_Part1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String xpathExpression_Part2="]/td[1]";
		By tableXpathL=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr");
		List<WebElement>WebTablecityName=driver.findElements(tableXpathL);
		int citiesCount=WebTablecityName.size();
		System.out.println(citiesCount);
		
		for(int index=1;index<=citiesCount;index++)
		{
			WebElement cityNameElement=driver.findElement(By.xpath(xpathExpression_Part1+index+xpathExpression_Part2));
			String cityName=cityNameElement.getText();
			System.out.println(cityName);
			Row row=sheet.createRow(index);
			Cell cell=row.createCell(0);
			cell.setCellValue(cityName);
			FileOutputStream file1=new FileOutputStream("C:\\Users\\hi\\Desktop\\AutomationScripts\\WebApplicationTesting\\ExcelFiles\\WebTable_FirstColumnData.xlsx");
			workbook.write(file1);
		}
	}
	public static void main(String[] args) throws IOException
	{
		WebTable_CapturingFirstColumnData rowCellData=new WebTable_CapturingFirstColumnData();
		rowCellData.applicationLaunch();
		rowCellData.capturingFirstColumnData();
		rowCellData.applicationClose();
	}

		
		
		
		
		
		
	}





