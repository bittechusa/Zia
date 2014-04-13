package com.bit.test;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	
	FirefoxDriver driver=new FirefoxDriver();

@Test

public void support()
{
	driver.get("http://www.facebook.com");
	driver.quit();
	
}




}
