package com.WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class timeAndDateApplication {
	WebDriver driver;
	public void applicationLaunch()
	{
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		
	}
 public void applicationClose()
 {
	 driver.quit();
 }

public void capturingFirstColumnData()
{
	String xpathExpression_Part1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String xpathExpression_Part2="]/td[1]";
	By tableXpathL=By.xpath("/htm/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr");
	List<WebElement>WebTablecityName=driver.findElements(tableXpathL);
	int citiesCount=WebTablecityName.size();
	System.out.println(citiesCount);
	
	for(int index=1;index<=citiesCount;index++)
	{
		WebElement cityNameElement=driver.findElement(By.xpath(xpathExpression_Part1+index+xpathExpression_Part2));
		String cityName=cityNameElement.getText();
		System.out.println(cityName);
		
	}
}
public static void main(String[] args)
{
	timeAndDateApplication rowCellData=new timeAndDateApplication();
	rowCellData.applicationLaunch();
	rowCellData.capturingFirstColumnData();
	rowCellData.applicationClose();
}

	
	
	
	
	
	
}


