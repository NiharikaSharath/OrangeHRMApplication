package com.Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_SignInTest {
	public static void main(String[] args) {
		WebDriver driver;
		String applicationUrlAddress="http://gmail.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		//<input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" spellcheck="false" tabindex="0" aria-label="Email or phone" name="identifier" value="" autocapitalize="none" id="identifierId" dir="ltr" data-initial-dir="ltr" data-initial-value="">
		//
		driver.findElement(By.id("identifierId")).sendKeys("palemniharika@gmail.com");
		//<span jsname="V67aGc" class="VfPpkd-vQzf8d">Next</span>
		WebElement nextPage=driver.findElement(By.linkText("Next"));
		nextPage.click(); 
		/*<a class="button
		           
		           
		           
	            button--medium
	           
	            button--mobile-before-hero-only
	           " href="https://accounts.google.com/AccountChooser/signinchooser?service=mail&amp;continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&amp;flowName=GlifWebSignIn&amp;flowEntry=AccountChooser" data-action="sign in" data-category="cta" data-label="header">Sign in</a>
	           */
		WebElement signInElement=driver.findElement(By.linkText("Sign in"));
		signInElement.click();
		
	}

}
