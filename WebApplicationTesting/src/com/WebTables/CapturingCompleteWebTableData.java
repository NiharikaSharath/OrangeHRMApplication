package com.WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingCompleteWebTableData {
	WebDriver driver;
	public void applicationLaunch()
	{
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		
	}
	public void CapturingCompleteTableData()
	{
		//Identifying the Table
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		// /html/body/div[5]/section[1]/div
		By webTableLocator=By.xpath("/html/body/div[5]/section[1]/div");
		WebElement webTable=driver.findElement(webTableLocator);
		// Identifying the Row of a table
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
		
		
		
		
		
	}
	
	
	
 public void applicationClose()
 {
	 driver.quit();
 }

}
