package OHRMApplicaionTesting;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest1 {
	
		WebDriver driver;
		
		
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		@BeforeTest
		public void setUp() 
		{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
		/*@AfterTest
		public void tearDown()
		{
			driver.close();
		}*/
		

	}


