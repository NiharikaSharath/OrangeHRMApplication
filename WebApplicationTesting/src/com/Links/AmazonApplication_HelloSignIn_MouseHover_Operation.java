package com.Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonApplication_HelloSignIn_MouseHover_Operation {
public static void main(String[] args) {
	String applicationUrlAddress="http:amazon.in";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver;
    driver=new ChromeDriver();
    driver.get(applicationUrlAddress);
    //<span id="nav-link-accountList-nav-line-1" class="nav-line-1 nav-progressive-content">Hello, sign in</span>


By helloSignInL=By.id("nav-link-accountList");
WebElement helloSignIn=driver.findElement(helloSignInL);
Actions action=new Actions(driver);
action.moveToElement(helloSignIn).build().perform();;
By yourOrdersL=By. linkText("Your Orders");
WebElement yourOrders=driver.findElement(yourOrdersL);
yourOrders.click();
}
}
