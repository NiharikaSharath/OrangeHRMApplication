package ValidatingOrangeHRMTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Title_Validation {
	public static void main(String[] args)
	{
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get(applicationUrlAddress);
			String expected_OrangeHRMTitle="OrangHRM";
			System.out.println("The expected title of OrangeHRM is:" +expected_OrangeHRMTitle);
			String actual_OrangeHRMTitle=driver.getTitle();
			System.out.println("The actual title of OrangeHRM is:" +actual_OrangeHRMTitle);
			if(actual_OrangeHRMTitle.equals(expected_OrangeHRMTitle))
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
