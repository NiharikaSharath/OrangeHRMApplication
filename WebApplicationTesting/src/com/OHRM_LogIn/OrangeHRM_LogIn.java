package com.OHRM_LogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_LogIn {

	public static void main(String[] args) throws InterruptedException {
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(applicationUrlAddress);
		//Validate LogInPage
		String expected_OrangeHRMLogInPageTitle="LogInPage";
		System.out.println("The expected OrangeHRMLogInPage is:"+expected_OrangeHRMLogInPageTitle);
		String actual_OrangeHRMLogInPageTitle=driver.getTitle();
		System.out.println("The actual OrangeHRMLogInPage is:+actual_OrangeHRMLogInPageTitle");
		if(actual_OrangeHRMLogInPageTitle.equals(expected_OrangeHRMLogInPageTitle))
		{
			System.out.println("Title Matched - Pass");
			
		}
		else
		{
			System.out.println("Title not Matched - Fail");
		}
		
	
		//Navigate to OrangeHRM Application
		driver.get(applicationUrlAddress);
		String expected_OrangeHRMTitle="OrangeHRM";
		System.out.println("The expected OrangeHRM is:"+expected_OrangeHRMTitle);
		String actual_OrangeHRMTitle=driver.getTitle();
		System.out.println("The actual OrangeHRM is:+actual_OrangeHRMTitle");
		if(actual_OrangeHRMTitle.equals(expected_OrangeHRMTitle))
		{
			System.out.println("Title Matched - Pass");
			
		}
		else
		{
			System.out.println("Title not Matched - Fail");
		}
		//Expected UrlAddress Orangehrm-4.2.0.1
		driver.get(applicationUrlAddress);
		String expected_OrangeHRMUrlAddress="orangehrm-4.2.0.1";
		System.out.println("The expected OrangeHRMUrlAddress is:"+expected_OrangeHRMUrlAddress);
		String actual_OrangeHRMUrlAddress=driver.getCurrentUrl();
		System.out.println("The actual OrangeHRMUrlAddress is:"+actual_OrangeHRMUrlAddress);
		if(actual_OrangeHRMUrlAddress.contains(expected_OrangeHRMUrlAddress))
		{
			System.out.println("UrlAddress Matched - Pass");
		}
		else
		{
			System.out.println("UrlAddress not Matched - Fail");
				
			}
		//<div id="logInPanelHeading">LOGIN Panel</div>
		WebElement logInPanel=driver.findElement(By.id("logInPanelHeading"));
		//Expected Text - LogInPanel
		String logInPanel_Text=logInPanel.getText();
		System.out.println("The text of an Element LogIn is:"+logInPanel_Text);
		String expected_logInPanelText="LOGIN Panel";
		System.out.println("The expected text of logInPanel is:"+expected_logInPanelText);
		String actual_logInPanelText=logInPanel_Text;
		System.out.println("The actual text og logInPanel is:"+actual_logInPanelText);
		if(actual_logInPanelText.equals(expected_logInPanelText))
		{
			System.out.println("Text Matched - Pass");
		}
		else
		{
			System.out.println("Text not Matched - Fail");
		}
		//LogIn with valid Text Data
		//<input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys("Niharika");
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		driver.findElement(By.name("txtPassword")).sendKeys("Q@Trainer7");
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.className("button")).click();
		//Validate HomePage
		// a) Validatating OrangeHRM
		String expected_OrangeHRMHomePageTitle="OrangeHRM";
		System.out.println("The expected OrangeHRMHomePageTitle is:"+expected_OrangeHRMHomePageTitle);
		String actual_OrangeHRMHomePageTitle=driver.getTitle();
		System.out.println("The actual OrangeHRMHomePageTitle is:"+actual_OrangeHRMHomePageTitle);
		if(actual_OrangeHRMHomePageTitle.equals(expected_OrangeHRMHomePageTitle))
		{
			System.out.println("Title Matched - Pass");
		}
		else
		{
			System.out.println("Title not Matched - Fail");
		}
		//Text Admin
	    //<b>Admin</b>
		String expected_admin_Text="Admin";
		System.out.println("The expected test of Admin is:"+expected_admin_Text);
		By adminHome=By.linkText("Admin");
		WebElement adminH=driver.findElement(adminHome);
		String actual_admin_Text=adminH.getText();
		System.out.println("The text of an element admin is:"+actual_admin_Text);
		if(actual_admin_Text.contains(expected_admin_Text))
		{
			System.out.println("Text of Admin is Matched - Pass");
		}
		else
		{
			System.out.println("Text oF Admin is not Matched - Fail");
			
		}
		//Automate Welcome Admin
		//<a href="# id="welcome" class="panelTrigger">WelCome Admin</a>
		By welcomeAdminLocator=By.linkText("Welcome Admin");
		WebElement welcomeAdmin=driver.findElement(welcomeAdminLocator);
		String welcomeAdmin_Text=welcomeAdmin.getText();
		System.out.println("the text of an element welcome admin is:"+welcomeAdmin_Text);
		String welcomeAttributeValue=welcomeAdmin.getAttribute("class");
		System.out.println("The attribute value of welcome admin element is:"+welcomeAttributeValue);
		welcomeAdmin.click();
		Thread.sleep(1000);
		//Automate logout - welcome Admin
	    // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

		By logOutOfHomePage=By.linkText("Logout");
		WebElement logOutWelcomeAdmin=driver.findElement(logOutOfHomePage);
		logOutWelcomeAdmin.click();
		driver.quit();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		

	      
	
