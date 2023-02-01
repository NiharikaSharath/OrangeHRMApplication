package com.osmania.ac.in;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PerformingSelectOperation_SelectLanguage {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	String applicationUrlAddress="https://www.osmania.ac.in/";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(applicationUrlAddress);
driver.manage().window().maximize();
//id="gtranslate_selector"
By selectLanguageL=By.id("gtranslate_selector");
WebElement selectLanguage=driver.findElement(selectLanguageL);
selectLanguage.click();
//<select onchange="doGTranslate(this);" class="notranslate" id="gtranslate_selector" aria-label="Website Language Selector" align="right" style="position:relative; z-index:1000"><option value="">Select Language</option><option value="en|hi">Hindi</option><option value="en|fr">French</option><option value="en|de">German</option><option value="en|es">Spanish</option><option value="en|el">Greek</option><option value="en|en">English</option><option value="en|te">Telugu</option><option value="en|ml">Malayalam</option><option value="en|ur">Urdu</option><option value="en|nl">Dutch</option><option value="en|ar">Arabic</option><option value="en|zh-Hans">Chinese (Simplified)</option><option value="en|ru">Russian</option><option value="en|ta">Tamil</option><option value="en|sa">Sanskrit</option><option value="en|fa">Persian (Farsi)</option><option value="en|ne">Nepali</option><option value="en|mr">Marathi</option><option value="en|mn">Mangolian	</option><option value="en|la">Latin</option><option value="en|kn">Kannada</option><option value="en|ja">Japanese</option><option value="en|it">Italian	</option><option value="en|gu">Gujarati	</option><option value="en|hu">Hungarian</option><option value="en|id ,in">Indonesian</option><option value="en|ga">Irish	</option><option value="en|th">Thai</option></select>
By dropDownListL=By.tagName("option");
List<WebElement>Osmania_SelectLanguageList=selectLanguage.findElements(dropDownListL);
      System.out.println("The languages are:"+Osmania_SelectLanguageList);
int Osmania_SelectLanguageList_Count=Osmania_SelectLanguageList.size();
System.out.println("The number of languages are:"+Osmania_SelectLanguageList_Count);
for(int index=0;index<Osmania_SelectLanguageList.size();index++)
{ 

	String Osmania_SelectLanguageListName=Osmania_SelectLanguageList.get(index).getText();
	System.out.println(index+" "+Osmania_SelectLanguageListName);
	
	//Osmania_SelectLanguageList.get(index).click();
	//Thread.sleep(5000);
	
	Select selectLanguageSelect=new Select(selectLanguage);
	selectLanguageSelect.selectByVisibleText("Hindi");
	selectLanguageSelect.selectByVisibleText("French");
	selectLanguageSelect.selectByValue("en|de");
	selectLanguageSelect.selectByValue("en|es");
	selectLanguageSelect.selectByVisibleText("English");
	selectLanguageSelect.selectByVisibleText("Telugu");
	selectLanguageSelect.selectByValue("en|ml");
	selectLanguageSelect.selectByValue("en|ur");
	selectLanguageSelect.selectByVisibleText("Dutch");
	selectLanguageSelect.selectByVisibleText("Arabic");
	selectLanguageSelect.selectByValue("en|zh-Hans");
	selectLanguageSelect.selectByValue("en|ru");
	selectLanguageSelect.selectByVisibleText("Tamil");
	selectLanguageSelect.selectByVisibleText("Sanskrit");
	selectLanguageSelect.selectByValue("en|fa");
	selectLanguageSelect.selectByValue("en|ne");
	selectLanguageSelect.selectByVisibleText("Marathi");
	selectLanguageSelect.selectByVisibleText("Mangolian");
	selectLanguageSelect.selectByValue("en|la");
	selectLanguageSelect.selectByValue("en|kn");
	selectLanguageSelect.selectByVisibleText("Japanese");
	selectLanguageSelect.selectByVisibleText("Italian");
	selectLanguageSelect.selectByValue("en|gu");
	selectLanguageSelect.selectByValue("en|hu");
	selectLanguageSelect.selectByValue("en|id ,in");
	selectLanguageSelect.selectByVisibleText("Irish");
	selectLanguageSelect.selectByVisibleText("Thai");
	
	
}

driver.quit();
}
}


























