package com.bank.Transfer;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo implements AutoConstant{
public void getPhoto(WebDriver driver) throws IOException
{
	Date d=new  Date();
	d.toString().replaceAll(":","-");
	TakesScreenshot t=(TakesScreenshot)driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	File dest=new File(photopath);
	FileUtils.copyFile(src, dest);
}
}
