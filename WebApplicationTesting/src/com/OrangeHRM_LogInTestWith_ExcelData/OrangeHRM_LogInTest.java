package com.OrangeHRM_LogInTestWith_ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_LogInTest {
public static void main(String[] args) throws IOException, InterruptedException {
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//Launch the chrome browser
	 WebDriver driver=new ChromeDriver();
	//Navigate to OrangeHRMApplication
	driver.get(applicationUrlAddress);
	FileInputStream file=new FileInputStream("C:\\Users\\hi\\Desktop\\AutomationScripts\\WebApplicationTesting\\src\\com\\OrangeHRM_LogIn_ExcelDataFiles\\OrangeHRM_LogIn_ExcelDataFile.xlsx");
	XSSFWorkbook workBook=new XSSFWorkbook(file);
	XSSFSheet sheet=workBook.getSheet("Sheet1");
	int rowCount=sheet.getLastRowNum();
	//int cellCount=sheet.getRow().getLastCellNum();
	System.out.println("The value of rowCount is:"+rowCount);
	
	for(int rowIndex=2;rowIndex<=rowCount;rowIndex++)
	{
	int cellCount=sheet.getRow(rowIndex).getLastCellNum();
	System.out.println("The value of cellCount is:"+cellCount);
		//for(int cellIndex=0;cellIndex<=cellCount;cellIndex++)
		
			Row row=sheet.getRow(rowIndex);
		     Cell userNameRowOfCell=row.getCell(0); 
			String userNameTestData=userNameRowOfCell.getStringCellValue();
			System.out.println(userNameTestData+" ");
			
			Cell passwordRowOfCell=row.getCell(1);
			String passwordTestData=passwordRowOfCell.getStringCellValue();
			System.out.println(passwordTestData+" ");
		    System.out.println();
		    //<input name="txtUsername" id="txtUsername" type="text">
			By userNameL=By.id("txtUsername");
			WebElement Username=driver.findElement(userNameL);
			Username.sendKeys(userNameTestData);
			//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
			By passwordL=By.name("txtPassword");
			WebElement Password=driver.findElement(passwordL);
			Password.sendKeys(passwordTestData);
			//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
			By logInButtonL=By.className("button");
			WebElement logInButton=driver.findElement(logInButtonL);
			logInButton.click();
			File  logInFailedScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(logInFailedScreenshot,new File("./ApplicationScreenshots/logInFailed.png"));
			//<span id="spanMessage">Invalid credentials</span>
			
			//By spanMessageL=By.className("spanMessage");
			//WebElement spanMessage=driver.findElement(spanMessageL);
			
			
			
			
			
			 String expected_OrangeHRMApplicationHomePageText="Admin";
			 System.out.println("The Expected Text of an OrangeHRM application HomePage is"+":"+expected_OrangeHRMApplicationHomePageText);
			 //<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
			 By welcomeAdminL=By.linkText("Welcome Admin");
			 WebElement welComeAdmin=driver.findElement(welcomeAdminL);
			 welComeAdmin.click();
			 String actual_OrangeHRMApplicationHomePage_Text=welComeAdmin.getText();
			 System.out.println("The actual Text of the OrangeHRM application HomePage is:"+actual_OrangeHRMApplicationHomePage_Text);
			if(actual_OrangeHRMApplicationHomePage_Text.contains(expected_OrangeHRMApplicationHomePageText))
			{
				System.out.println("OrangeHrm home page text found-PASS");
				Cell rowOfNewCell=row.createCell(2);
				rowOfNewCell.setCellValue("OrangeHRM HomePage Text  Found-PASS");
				
			
		}
			else
			{
				System.out.println("OrangeHRM home page text Not found-FAIL");
				Cell rowOfNewCell=row.createCell(2);
				rowOfNewCell.setCellValue("OrangeHRM HomePage Text Not Found-FAIL");
				
			}
			Cell rowOfNewCell=row.createCell(2);
		rowOfNewCell.setCellValue("OrangeHRM HomePage Text Not Found-FAIL");
	FileOutputStream file1=new FileOutputStream("C:\\Users\\hi\\Desktop\\AutomationScripts\\WebApplicationTesting\\src\\com\\OrangeHRM_LogIn_ExcelDataFiles\\OrangeHRM_LogIn_ExcelDataFile.xlsx");
	workBook.write(file1);
	welComeAdmin.click();
	Thread.sleep(1000);
	By logoutL=By.linkText("Logout");
	WebElement logOut=driver.findElement(logoutL);
	logOut.click();
	
	//rowIndex++;
//driver.quit();
	/*driver.navigate().back();
	
	 userNameL=By.id("txtUsername");
	Username=driver.findElement(userNameL);
	Username.sendKeys(userNameTestData);
	 passwordL=By.name("txtPassword");
	 Password=driver.findElement(passwordL);
	Password.sendKeys(passwordTestData);
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	logInButtonL=By.className("button");
	logInButton=driver.findElement(logInButtonL);
	logInButton.click();
	*/
	
	
		}
	//driver.navigate().back();
	
	}
}
//}

