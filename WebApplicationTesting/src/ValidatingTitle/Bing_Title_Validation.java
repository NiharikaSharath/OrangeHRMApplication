package ValidatingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_Title_Validation {
	public static void main(String[] args) {
		String applicationUrlAddress="http://bing.com";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		String expected_BingHomePageTitle="Bing";
		System.out.println("The expected title of Bing Home page is:" +expected_BingHomePageTitle);
		String actual_BingHomePageTitle=driver.getTitle();
		System.out.println("The actual title of Bing Home page is:" +actual_BingHomePageTitle);
		if(actual_BingHomePageTitle.equals(expected_BingHomePageTitle))
				{
			System.out.println("Title Matched-Pass");
				}
		else
		{
			System.out.println("Title not matched-Fail");
		}
		driver.quit();
	}
		
}
		


