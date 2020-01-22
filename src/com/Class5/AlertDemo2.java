package com.Class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.Util.CommonMethods;

public class AlertDemo2  extends CommonMethods{

public static final String Practice_URL="http://166.62.36.207/syntaxpractice/index.html";
	
	public static void main(String[] args) throws InterruptedException{
		CommonMethods.setUp("chrome", Practice_URL);
		
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
		
		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		
		Alert alert=driver.switchTo().alert();
		
	}

}
