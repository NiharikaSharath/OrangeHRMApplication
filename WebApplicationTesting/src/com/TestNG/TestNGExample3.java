package com.TestNG;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGExample3 {
	@BeforeMethod
	public void gmailApplicationLaunch()
	{
		System.out.println("Gmail application launch successfull"); 
		
	}
	@AfterMethod
	public void gmailApplicationClose()
	{
		System.out.println("gmail application closed successfull");
	}
	@Test(priority=1)
	public void gmailInBoxTest()
	{
		System.out.println("Inbox functionality Test successfull");
	}
	@Test(enabled=false)
	public void gmailComposeMailTest() {
		System.out.println("ComposeMail functionality test successfull");
	}
	@Test(priority=2)
	public void gmailSentMailTest()
	{
		System.out.println("Sent Mail functionality Test successfull");
	}
	@Test(priority=3)
	public void gmailDraftsTest()
	{
		System.out.println("Drafts functionality Test successfull");
	}
	
	
	
	
	
	
	
}
