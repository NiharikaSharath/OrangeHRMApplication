package com.RadioButtonTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtonTest {
WebDriver driver;
String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";
@BeforeTest
public void setUp() 
{

System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();

driver.get(applicationUrlAddress);
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().window().maximize();
}
@AfterTest
public void tearDown()
{
	driver.close();
}
@Test
public void radioButtonsTest() throws InterruptedException
{
	By group1RadioButtonL=By.name("group1");
	List<WebElement>group1RadioButton=driver.findElements(group1RadioButtonL);
	int group1RadioButtonCount=group1RadioButton.size();
	
	By group2RadioButtonL=By.name("group2");
	List<WebElement>group2RadioButton=driver.findElements(group2RadioButtonL);
	int group2RadioButtonCount=group2RadioButton.size();
	if(group2RadioButtonCount==group1RadioButtonCount)
	{
		System.out.println("Both are equal");
	}
	else
	{
		System.out.println("Both are not equal");
	}
	//Performing click operation on each radio button
	for(int clickIndex=0;clickIndex<group1RadioButtonCount;clickIndex++)
	{
		//Performing click on a group1 radio button
		group1RadioButton.get(clickIndex).click();
		group2RadioButton.get(clickIndex).click();
		Thread.sleep(5000);
		
		
			for(int statusIndexgroup1=0;statusIndexgroup1<group1RadioButtonCount;statusIndexgroup1++)
			{
			System.out.println(group1RadioButton.get(statusIndexgroup1).getAttribute("value")+""
					+group1RadioButton.get(statusIndexgroup1).getAttribute("checked"));
			}
			
			for(int statusIndexgroup2=0;statusIndexgroup2<group2RadioButtonCount;statusIndexgroup2++)
			{
			System.out.println(group2RadioButton.get(statusIndexgroup2).getAttribute("value")+""
					+group2RadioButton.get(statusIndexgroup2).getAttribute("checked"));
			}	
		
		}
		System.out.println();
		
				
		
		
	
	}
}

