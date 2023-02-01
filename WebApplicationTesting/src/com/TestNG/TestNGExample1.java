package com.TestNG;

import org.testng.annotations.Test;

public class TestNGExample1 {
	@Test(priority=1)
	public void gmailApplicationLaunch()
	{
		System.out.println("Gmail Application Launch Successfull");
	}
@Test(priority=2)
public void gmailInBoxTest()
{
	System.out.println("Inbox functionality Test successfull");
	
}
@Test(enabled=false)
public void gmailComposeMailTest()
{
	System.out.println("ComposeMail Functionality Test Successfull");
}
@Test(priority=3)
public void gmailSentMailTest()
{
	System.out.println("SentMail functionality Test successfull");
}




}
