package com.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.SingletonTest;

public class PageTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		SingletonTest instance=SingletonTest.getInstance();
		driver=instance.openBrowser();
	}
	@Test
	public void TestMethod()
	{
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	 }

}
