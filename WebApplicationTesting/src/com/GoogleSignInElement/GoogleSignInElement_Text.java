package com.GoogleSignInElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSignInElement_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String applicationUrlAddress="http://google.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		//<a href="https://e=/e.com/&amp;ec=GAZAmgQ"target="-top">Sign in</a>
		/*WebElement SignInElement=driver.findElement(By.linkText("Sign in"));
		String SignInElementText=SignInElement.getText();
		System.out.println(SignInElement);*/
		//getting the text of sign in element
		/*
		By SignInLocator=By.linkText("Sign in");
		WebElement SignIn=driver.findElement(SignInLocator);
		String SignIn_Text=SignIn.getText();
		System.out.println("The text of an Element Sign In is:"+SignIn_Text);
		*/
		//<a class="gb-7 gb-8 gb-do gb-dd" href="http://accounts.google.com/http://www.google.com/&amp;ec=GAZAmgQ"target="-top">Sign in</a>
		By SignInL=By.linkText("Sign in");
		WebElement SignIn=driver.findElement(SignInL);
		//String SignInAttributeValue=SignIn.getAttribute("href");
		String SignInAttributeValue=SignIn.getAttribute("class");
		System.out.println("The attibute value of Sign In Element is:"+SignInAttributeValue);
		String SignIn_Text= SignIn_getText();
		System.out.println("The text of an element SignIn is:"+SignIn_Text);
		SignIn.click();
		String SignInWebPage_Title=driver.getTitle();
		System.out.println("The title of the Sign In WebPage is:"+SignInWebPage_Title);
		driver.quit();
		
		
		

		

	}

	private static String SignIn_getText() {
		// TODO Auto-generated method stub
		return null;
	}

}
