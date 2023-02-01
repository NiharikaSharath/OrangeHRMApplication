package OHRMApplicaionTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class OrangeHRM_LogInTest extends BaseTest 
{
FileInputStream file;
XSSFWorkbook workBook;
XSSFSheet sheet;
Row row;
Cell userNameRowOfCell;
FileInputStream propertiesFile;
Properties prop;
FileOutputStream fileOutputStream;
//Logger log=Logger.getLogger("OrangeHRM_LogInTest");
@Test(priority=1)
public void logInPageValidation()
{ 
	//PropertyConfigurator.configure("Log4j.properties");
	String expectedTitle_OrangeHRMApplicationLogInPage="OrangeHRM";
	//System.out.println(" The title of OrangeHRM Application:"+expectedTitle_OrangeHRMApplicationLogInPage);
	log.info(" The title of OrangeHRM Application:"+expectedTitle_OrangeHRMApplicationLogInPage);
	String actualTitle_OrangeHRMApplicationLogInPage=driver.getTitle();
	//System.out.println("The actual title of OrangeHRMApplication :"+actualTitle_OrangeHRMApplicationLogInPage);
	log.info("The actual title of OrangeHRMApplication :"+actualTitle_OrangeHRMApplicationLogInPage);
	if(actualTitle_OrangeHRMApplicationLogInPage.equals(expectedTitle_OrangeHRMApplicationLogInPage))
	{
		log.info("Title Matched-pass");
	}
	else
	{
		log.info("Title not matched-fail");
	}
}
@Test(priority=2)
	public void logInPageUrlValidation() 
	{	
	
	String expected_OrangeHRMApplicationLogInPageUrlAddress="orangehrm-4.2.0.1";
	log.info("The expected orangeHRM Application logIn page url address is :"+expected_OrangeHRMApplicationLogInPageUrlAddress);
			String actual_OrangeHRMApplicationLogInPageUrlAddress=driver.getCurrentUrl();
			log.info("The actual OrangeHRM Application logIn page Url Address is:"+actual_OrangeHRMApplicationLogInPageUrlAddress);
			if(actual_OrangeHRMApplicationLogInPageUrlAddress.contains(expected_OrangeHRMApplicationLogInPageUrlAddress))
			{
				log.info("Url matched-pass");
			}
			else
			{
				log.info("url not matched");
			}
}
@Test(priority=3)
public void logInFunctionalityTest() throws IOException
{
	file=new FileInputStream("C:\\Users\\hi\\Desktop\\AutomationScripts\\WebApplicationTesting\\src\\com\\OrangeHRM_LogIn_ExcelDataFiles\\OrangeHRM_LogIn_ExcelDataFile1.xlsx");
	workBook=new XSSFWorkbook(file);
	sheet=workBook.getSheet("Sheet1");
	row=sheet.getRow(1);
	userNameRowOfCell=row.getCell(0);
	String userNameTestData=userNameRowOfCell.getStringCellValue();
	log.info(userNameTestData);
	Cell passwordRowOfCell=row.getCell(1);
	String passwordTestData=passwordRowOfCell.getStringCellValue();
	log.info(passwordTestData);
	//Identifying the properties file
	propertiesFile=new FileInputStream("C:\\Users\\hi\\Desktop\\AutomationScripts\\WebApplicationTesting\\src\\com\\config\\OrangHRMApplication.properties");
	//creating an object for properties class
	prop=new Properties();
	//Loading the properties file
	prop.load(propertiesFile);
	//Identifying the property of an element based on property file
	By userNameL=By.id((prop.getProperty("userNameProperty")));
	WebElement userName=driver.findElement(userNameL);
	userName.sendKeys(userNameTestData);
	By passwordL=By.name((prop.getProperty("passwordProperty")));
	WebElement password=driver.findElement(passwordL);
	password.sendKeys(passwordTestData);
	//logInButtonProperty=button
	By logInButtonL=By.className((prop.getProperty("logInButtonProperty")));
	WebElement logInButton=driver.findElement(logInButtonL);
	logInButton.click();
	
	
	
	
}
}
