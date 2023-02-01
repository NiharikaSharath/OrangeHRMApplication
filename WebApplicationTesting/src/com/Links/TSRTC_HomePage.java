package com.Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TSRTC_HomePage {
	public static void main(String[] args) {
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
	By linkL=By.tagName("a");
	List<WebElement>tSRTC_HeaderBlockLinks=tSRTC_headerBlock.findElements(linkL);
	int tSRTC_headerBlockLinks_Count=tSRTC_HeaderBlockLinks.size();
	System.out.println("The number of links in the TSRTC Header Block are:-"+tSRTC_headerBlockLinks_Count);
	for(int index=0;index<tSRTC_headerBlockLinks_Count;index++)
	{
		String tSRTC_headerBlock_LinkName=tSRTC_HeaderBlockLinks.get(index).getText();
		System.out.println(index+" "+tSRTC_headerBlock_LinkName);
	}
	
driver.quit();
	
	}
}




