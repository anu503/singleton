package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonTest {

	private static SingletonTest driver_instance=null;
	private WebDriver driver;
	private SingletonTest()
	{
		
	}
	public WebDriver openBrowser()
	{  
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danda\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
        return driver;
		}
	public static SingletonTest getInstance()
	{
		if(driver_instance==null)
			driver_instance=new SingletonTest();
		return driver_instance;
	}
}
