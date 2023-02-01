package com.GetUrlAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAddress_BingHomePage {
	public static void main(String[] args)
	{
		String applicationUrlAddress="http://bing.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		String expected_BingHomePageUrlAddress="bing.com";
		System.out.println("The expected Url of Bing Home page is:" + expected_BingHomePageUrlAddress);
		String actual_BingHomePageUrlAddress=driver.getCurrentUrl();
		System.out.println("The actual Url of Bing Home page is:"  + actual_BingHomePageUrlAddress);
		if(actual_BingHomePageUrlAddress.contains  (expected_BingHomePageUrlAddress))
				{
			System.out.println("Url Matched-Pass");
				}
		else
		{
			System.out.println("Url not matched-Fail");
		}
		driver.quit();
	}
		

}
