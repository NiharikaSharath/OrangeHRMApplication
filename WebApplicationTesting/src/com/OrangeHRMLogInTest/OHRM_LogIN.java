package com.OrangeHRMLogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LogIN {
public static void main(String[] args) throws InterruptedException {
	//WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//Launch the chrome browser
	 WebDriver driver=new ChromeDriver();
	//Navigate to OrangeHRMApplication
	driver.get(applicationUrlAddress);
	String expected_OrangeHRMTitle="OrangeHRM";
	System.out.println("The expected title of OrangeHRM is:" +expected_OrangeHRMTitle);
	String actual_OrangeHRMTitle=driver.getTitle();
	System.out.println("The actual title of OrangeHRM is:"+actual_OrangeHRMTitle);
	if(actual_OrangeHRMTitle.equals(expected_OrangeHRMTitle))
	{
		System.out.println("Title matched-pass");
	}

	else
	{
	
		System.out.println("Title not matched-Fail");
	}
	//Validate URL Address
	String expected_OrangeHRMUrlAddress="orangehrm-4.2.0.1";
	System.out.println("The expected url of OrangeHRM is:"+expected_OrangeHRMUrlAddress);
	String actual_OrangeHRMUrlAddress=driver.getCurrentUrl();
	System.out.println("The actual Url of OrangeHRM is:" +actual_OrangeHRMUrlAddress);
    if(actual_OrangeHRMUrlAddress.contains(expected_OrangeHRMUrlAddress))
    {
    	System.out.println("Url matched-pass");
    }
    else
    {
    	System.out.println("Url not matched-fail");
    }
    //<div id="logInPanelHeading">LOGIN Panel</div>
    WebElement logInPanel=driver.findElement(By.id("logInPanelHeading"));
    //Get the text of an Element-LogIN Panel
    String logInPanel_Text=logInPanel.getText();
    System.out.println("The text of an Element LogIn is:"+logInPanel_Text);
    
    String expected_logInPanelText="LOGIN panel";
    System.out.println("The expected text of lOgInPanel is:"+expected_logInPanelText);
    String actual_logInPanelText=logInPanel_Text;
    System.out.println("The actual text of LogIn Panel is:"+actual_logInPanelText);
    if(actual_logInPanelText.equals(expected_logInPanelText))
    {
    	System.out.println("Text Matched-pass");
    }
    else
    {
    	System.out.println("Text not matched-Fail");
    }
    //LogIn with valid test data
    //<input name="txtUsername" id="txtUsername" type="text">
    driver.findElement(By.id("txtUsername")).sendKeys("Niharika");
    //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
    driver.findElement(By.name("txtPassword")).sendKeys("Q@Trainer7");
    //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
    driver.findElement(By.className("button")).click();
    //Validate Home Page
    //a)Validating Title
    String expected_OrangeHRMHomePageTitle="OrangeHRM";
    System.out.println("The expected title of OrangeHRMHomePage is:" +expected_OrangeHRMHomePageTitle);
    String actual_OrangeHRMHomePageTitle=driver.getTitle();
    if(actual_OrangeHRMHomePageTitle.equals(expected_OrangeHRMHomePageTitle))
    {
    	System.out.println("Title of Home page matched-Pass");
    }
    else
    {
    	System.out.println("Title of Home page not matched-fail");
    }
    //Text---------Admin
    //<b>Admin</b>
    String expected_admin_Text="Admin";
    System.out.println("The expected text of Admin is:"+expected_admin_Text);
    By adminHome=By.linkText("Admin");
    WebElement adminH=driver.findElement(adminHome);
    String actual_admin_Text=adminH.getText();
    if(actual_admin_Text.contains(expected_admin_Text))
    {
    	System.out.println("The text of Admin is Matched - Pass");
    }
    else
    {
   System.out.println("Text of Admin not matched--Fail");
    }
    //Automate Welcome Admin
   // <a href="# id="welcome" class="panelTrigger">Welcome Admin</a>
    By welcomeAdminLocator=By.linkText("Welcome Admin");
    WebElement welcomeAdmin=driver.findElement(welcomeAdminLocator);
    String welcomeAdmin_Text=welcomeAdmin.getText();
    System.out.println(" The text of an element welcome admin is:"+ welcomeAdmin_Text);
    String welcomeAttributeValue=welcomeAdmin.getAttribute("class");
    System.out.println("The attribute value of welcome Admin element is:"+welcomeAttributeValue);
     welcomeAdmin.click();
     Thread.sleep(1000);
     //Automate Logout -welcome Admin
    // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
    	By logOutOfHomePage=By.linkText("Logout");
    	WebElement logOutWelcomeAdmin=driver.findElement(logOutOfHomePage);
    	logOutWelcomeAdmin.click();
    	
    	driver.quit();
}
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    



	


