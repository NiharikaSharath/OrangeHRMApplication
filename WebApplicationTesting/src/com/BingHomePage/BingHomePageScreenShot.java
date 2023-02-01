package com.BingHomePage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingHomePageScreenShot {
public static void main(String[] args) throws IOException {
	WebDriver driver;
	String applicationUrlAddress="http://bing.com";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(applicationUrlAddress);
	File bingCapturedScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(bingCapturedScreenShot,new File("./ApplicationScreenShots/bing.png"));
	driver.quit();
}
}

