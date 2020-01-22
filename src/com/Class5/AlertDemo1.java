package com.Class5;

import org.openqa.selenium.By;

import com.Util.CommonMethods;

public class AlertDemo1 extends CommonMethods{

public static final String Practice_URL="http://166.62.36.207/syntaxpractice/index.html";
	
	public static void main(String[] args) throws InterruptedException{
		CommonMethods.setUp("chrome", Practice_URL);
		Thread.sleep(100);
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
		
		driver.findElement(By.linkText("Javascript Alers")).click();
		

	}

}
