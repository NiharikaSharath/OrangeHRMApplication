package com.ValidatingOrangeHRMUrlAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAddress_OrangeHRM {
	public static void main(String[] args)
	{
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		String expected_OrangeHRMUrlAddress="orange-4.2.0.1";
		System.out.println("The expected Url of OrangeHRM is:" + expected_OrangeHRMUrlAddress);
		String actual_OrangeHRMUrlAddress=driver.getCurrentUrl();
		System.out.println("The actual Url of OrangeHRM is:"  + actual_OrangeHRMUrlAddress);
		if(actual_OrangeHRMUrlAddress.contains(expected_OrangeHRMUrlAddress))
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
