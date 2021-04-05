package com.bank.Transfer;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant{
	public WebDriver driver;
	public Photo p1;
	public Property p;
@BeforeMethod
public void start() throws FileNotFoundException, IOException
{
	System.setProperty(key,value);
	 driver=new ChromeDriver();
	 
	  p=new Property();
	 driver.get(p.getProperty("url"));
}
@AfterMethod
public void stop(ITestResult r) throws IOException {
int status = r.getStatus();
String name = r.getName();
	if(status==2)
	{
		 p1=new Photo();
		p1.getPhoto(driver);
	}
		
}

}
