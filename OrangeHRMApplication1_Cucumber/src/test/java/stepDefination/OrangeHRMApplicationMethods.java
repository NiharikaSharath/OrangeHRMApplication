package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class OrangeHRMApplicationMethods {
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	@Given("^User should Launch Chrome Browser$")
	public void user_should_Launch_Chrome_Browser()
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\hi\\Desktop\\AutomationScripts\\OrangeHRMApplication1_Cucumber\\browserDriverFiles\\chromedriver.exe");
	    driver=new ChromeDriver();
	}

	@When("^User Enters OrangeHRM Application Url Address$")
	public void user_Enters_OrangeHRM_Application_Url_Address() 
	{
		driver.manage().deleteAllCookies();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("^User should be able to Navigate to OrangeHRM Application LogIn Page$")
	public void user_should_be_able_to_Navigate_to_OrangeHRM_Application_LogIn_Page()
	{
		String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
		//id="logInPanelHeading"
		By logInPanelLocator=By.id("logInPanelHeading");
		WebElement OrangeHRMApplicationLogInPageLogInPanel=driver.findElement(logInPanelLocator);
		String actual_OrangeHRMApplicationLogInPageText=OrangeHRMApplicationLogInPageLogInPanel.getText();
		if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
		{
			System.out.println("Successfully navigated to OrangeHRM Application LogIn Page----PASS");
		}
		else
		{
			System.out.println("Failed to navigate to OrangeHRM Application LogIn Page ----FAIL");
		}
		Assert.assertEquals("Failed to navigated to OrangeHRM LogIn Page---FAIL",expected_OrangeHRMApplicationLogInPageText,actual_OrangeHRMApplicationLogInPageText );
	}

	@Then("^User should close the OrangeHRM Application$")
	public void user_should_close_the_OrangeHRM_Application() 
	{
		driver.quit();
	}



}
