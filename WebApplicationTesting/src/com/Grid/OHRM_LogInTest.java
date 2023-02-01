package com.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OHRM_LogInTest {
@Parameters("Browser")
@Test
public void logInTest(String browserName) throws MalformedURLException 
{
	System.out.println("The name of the Browser is :-"+browserName);
	DesiredCapabilities cap=null;
	if(browserName.equals("chrome"))
	{
		cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
	}
	else
		if(browserName.equals("edge"))
		{
			cap=DesiredCapabilities.edge();
			cap.setBrowserName("edge");
			cap.setPlatform(Platform.WINDOWS);
		}
	
	
RemoteWebDriver	 driver=new RemoteWebDriver(new URL("http://192.168.1.6:4444/wd/hub"),cap);
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	
	driver.get(applicationUrlAddress);
}
}
