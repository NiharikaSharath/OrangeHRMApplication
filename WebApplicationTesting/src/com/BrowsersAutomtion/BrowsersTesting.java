package com.BrowsersAutomtion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class BrowsersTesting {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver.exe");
		ChromeDriver chromeDriver=new ChromeDriver();
		chromeDriver.navigate().to("https://www.apsrtc.com/");
		//chromeDriver.quit();
		System.setProperty("webdriver.opera.driver","C:\\Users\\hi\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		OperaDriver operaDriver=new OperaDriver();
		operaDriver.navigate().to("https://www.youtube.com/");
		//operaDriver.quit();
		System.setProperty("webdriver.edge.driver","C:\\Users\\hi\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver edgeDriver=new EdgeDriver();
		edgeDriver.get("https://www.australia.com/");
		//edgeDriver.quit();
		
		
	}
}
