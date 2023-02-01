package com.Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRMApplication_FN_MN_LN {
	public static void main(String[] args) throws InterruptedException {
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Launch the chrome browser
		 WebDriver driver=new ChromeDriver();
		//Navigate to OrangeHRMApplication
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		 //LogIn with valid test data
	    //<input name="txtUsername" id="txtUsername" type="text">
	    driver.findElement(By.id("txtUsername")).sendKeys("Niharika");
	    //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	    driver.findElement(By.name("txtPassword")).sendKeys("Q@Trainer7");
	    //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	    driver.findElement(By.className("button")).click();
	    //Mouse Hover onto PIM element
	    //Identifying properties of PIM
	    //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
	   By pimL=By.id("menu_pim_viewPimModule");
        WebElement pim=driver.findElement(pimL);
        //MouseHover operation onto PIM Element-done using Action class
        Actions action=new Actions(driver);
        action.moveToElement(pim).build().perform();
        //Automating Add Employee Element(Hidden Element)
        //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
         By AddEmployeeL=By.linkText("Add Employee");
         WebElement AddEmployee=driver.findElement(AddEmployeeL);
         AddEmployee.click();
         // Enter FirstName,MiddleName,LastName in AddEmployee page
         
         //<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
           driver.findElement(By.id("firstName")).sendKeys("Niharika");
          
          
         //<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
         driver.findElement(By.id("middleName")).sendKeys("Reddy");
         //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
         driver.findElement(By.id("lastName")).sendKeys("Palem");
       
         
         //Get the FirstName,MiddleName,LastName from AddEmployee
       
         By firstNameL=By.id("firstName");
         WebElement firstName=driver.findElement(firstNameL);
         String expected_firstName_Text=firstName.getAttribute("value");
         System.out.println("The text of an Element FirstName is:"+expected_firstName_Text);
         By middleNameL=By.id("middleName");
         WebElement middleName=driver.findElement(middleNameL);
         String expected_middleName_Text=middleName.getAttribute("value");
         System.out.println("The text of an Element middleName is:"+expected_middleName_Text);
         By lastNameL=By.id("lastName");
         WebElement lastName=driver.findElement(lastNameL);
         String expected_lastName_Text=lastName.getAttribute("value");
         System.out.println("The text of an Element lastName is:"+expected_lastName_Text);
         //<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0001" id="employeeId">
         By employeeIdL=By.id("employeeId");
         WebElement employeeId=driver.findElement(employeeIdL);
         String expected_employeeId_value=employeeId.getAttribute("value");
         System.out.println("The Expected value of EmployeeId is:-"+expected_employeeId_value);
         //performing click() operation on Save
         //<input type="button" class="" id="btnSave" value="Save">
         By saveL=By.id("btnSave");
         WebElement save=driver.findElement(saveL);
         save.click();
         //Get actual values of firstName,middleName,lastName
         //<input value="Niharika" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
         By firstNameLocator=By.id("personal_txtEmpFirstName");
         WebElement firstNameOfPersonalDetails=driver.findElement(firstNameLocator);
         String actual_firstName_Text=firstNameOfPersonalDetails.getAttribute("value");
         System.out.println("The Actual text of an Element firstName is:"+actual_firstName_Text);
         //id="personal_txtEmpMiddleName"
         By middleNameLocator=By.id("personal_txtEmpMiddleName");
         WebElement middleNameOfPersonalDetails=driver.findElement(middleNameLocator);
         String actual_middleName_Text=middleNameOfPersonalDetails.getAttribute("value");
         System.out.println("The Actual text of an Element middleName is:"+actual_middleName_Text);
         //id="personal_txtEmpLastName"
         By lastNameLocator=By.id("personal_txtEmpLastName");
         WebElement lastNameOfPersonalDetails=driver.findElement(lastNameLocator);
         String actual_lastName_Text=lastNameOfPersonalDetails.getAttribute("value");
         System.out.println("The Actual text of an Element lastName is:"+actual_lastName_Text);
        //Validation fisrtName,middleName,lastName with actual and expected text
         //validation of FirstName
         if(actual_firstName_Text.equals(expected_firstName_Text))
         {
        	 System.out.println("FirstName is Matched");
         }
         else
         {
        	 System.out.println("FirstName is not Matched");
         }
         //validation of MiddleName
         if(actual_middleName_Text.equals(expected_middleName_Text))
         {
        	 System.out.println("MiddleName is Matched");
         }
         else
         {
        	 System.out.println("MiddleName is not Matched");
         }
         //Validation of LastName
         if(actual_lastName_Text.equals(expected_lastName_Text))
         {
        	 System.out.println("LastName is Matched");
         }
         else
         {
        	 System.out.println("LastName is not Matched");
         }
         //id="personal_txtEmployeeId"
         //<input value="0001" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disable">
         employeeIdL=By.id("personal_txtEmployeeId");
         employeeId=driver.findElement(employeeIdL);
         String actual_employeeId_value=employeeId.getAttribute("value");
         System.out.println("The Actual value of EmployeeId is:-"+actual_employeeId_value);
         //Validation of EmployeeId
         if(actual_employeeId_value.equals(expected_employeeId_value))
        {
        	System.out.println("EmployeeId is Matched"); 
        }
         else
         {
        	 System.out.println("EmployeeId is not Matched");
         }
         //Automate Welcome Admin
         //<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
         By WelcomeAdminLocator=By.linkText("Welcome Admin");
         WebElement welcomeAdmin=driver.findElement(WelcomeAdminLocator);
         welcomeAdmin.click();
         Thread.sleep(1000);
         //Automate logout
         //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
         By logOutL=By.linkText("Logout");
         WebElement logout=driver.findElement(logOutL);
         logout.click();
         driver.close();
	}
}
         
         
         
         
         
        
         
         
         
        
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
		
		
		
	


