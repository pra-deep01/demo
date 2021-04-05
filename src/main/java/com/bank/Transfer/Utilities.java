package com.bank.Transfer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilities {
	public void dropDown(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver, WebElement target)
	{
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
	}
	public void contextClk(WebDriver driver,WebElement target)
	{
		Actions a=new Actions(driver);
		a.contextClick(target).perform();
	}
	public void scrollBy(WebDriver driver,int x,int y)
	{
		JavascriptExecutor j=(JavascriptExecutor )driver;
		j.executeScript("window.scrollBy("+x+","+y+")");
	}

}
