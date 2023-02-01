package com.BrowsersAutomtion;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Url {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.bing.com/");
		
		driver.quit();
		/*System.setProperty("webdriver.edge.driver","C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
		WebDriver edgeDriver=new EdgeDriver();
			
		edgeDriver.get("https://www.google.co.in/");
		edgeDriver.navigate().to("https://www.bing.com/");*/
		
	
		
		
		
}
}