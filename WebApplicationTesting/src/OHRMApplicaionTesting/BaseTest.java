package OHRMApplicaionTesting;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {
	WebDriver driver;
	Logger log=Logger.getLogger("BaseTest");
	
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	@BeforeTest
	public void setUp() 
	{
PropertyConfigurator.configure("Log4j.properties");	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get(applicationUrlAddress);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	/*@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	*/

}
