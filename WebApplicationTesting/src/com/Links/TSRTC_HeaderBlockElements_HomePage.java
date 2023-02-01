package com.Links;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeaderBlockElements_HomePage {
public static void main(String[] args) throws IOException {
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	driver.get(applicationUrlAddress);
	driver.manage().window().maximize();
	By linksL=By.tagName("a");
	List<WebElement>TSRTC_HomePagelinks=driver.findElements(linksL);
	int TSRTC_HomePageLinks_Count=TSRTC_HomePagelinks.size();
	System.out.println("The number of links of Tsrtc HomePage are:"+TSRTC_HomePageLinks_Count);
	for(int i=0;i<TSRTC_HomePagelinks.size();i++)
	{
		
		String TSRTC_HomePageLinkName=TSRTC_HomePagelinks.get(i).getText();
	  System.out.println(i+" "+TSRTC_HomePageLinkName);
	}

By tSRTC_headerBlockL=By.className("menu-wrap");
WebElement tSRTC_headerBlock=driver.findElement(tSRTC_headerBlockL);
By links=By.tagName("a");
List<WebElement>tSRTC_HeaderBlockLinks=tSRTC_headerBlock.findElements(links);

int tSRTC_headerBlockLinks_Count=tSRTC_HeaderBlockLinks.size();
System.out.println("The number of links in the TSRTC Header Block are:-"+tSRTC_headerBlockLinks_Count);
for(int index=0;index<tSRTC_headerBlockLinks_Count;index++)
{
	  String expected_HeaderBlockLinksUrlAddress=((WebElement) tSRTC_HeaderBlockLinks).getAttribute("href");
	  System.out.println("The Expected url address of header block elements are:"+expected_HeaderBlockLinksUrlAddress);
	String tSRTC_headerBlock_LinkName=tSRTC_HeaderBlockLinks.get(index).getText();
	System.out.println(index+" "+tSRTC_headerBlock_LinkName);
	tSRTC_HeaderBlockLinks.get(index).click();
	String actual_WebPageTitle=driver.getTitle();
	System.out.println(actual_WebPageTitle);
	String actual_WebPageCurrentUrlAddress=driver.getCurrentUrl();
	System.out.println(actual_WebPageCurrentUrlAddress);
	System.out.println();
	driver.navigate().back();
	tSRTC_headerBlockL=By.className("menu-wrap");
	tSRTC_headerBlock=driver.findElement(tSRTC_headerBlockL);
	linksL=By.tagName("a");
	tSRTC_HeaderBlockLinks=tSRTC_headerBlock.findElements(linksL);
	if(actual_WebPageCurrentUrlAddress.equals(expected_HeaderBlockLinksUrlAddress))
	{
		System.out.println("URL matched");
	}
	else
	{
		System.out.println("URL Not matched");
	}
File	currentScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils. copyFile(currentScreenshot,new File("./ApplicationScreenShots/"+tSRTC_headerBlock_LinkName+".png"));;
}

}
}	
	
	
	
	
	
	


