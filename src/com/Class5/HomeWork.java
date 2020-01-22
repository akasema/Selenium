package com.Class5;
/*
 * C 1: Syntax Frame verification
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Others” link
Click on “Iframe” link
Click on the “Home” link inside the 1 frame
Verify “Syntax logo” is displayed in another frame
Quit browser
 */

import org.openqa.selenium.By;

import com.Util.CommonMethods;

public class HomeWork extends CommonMethods {
	public static final String URL = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) {
		CommonMethods.setUp("chrome", URL);
		
		driver.findElement(By.linkText("Input Forms")).click();
		//driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
		
		//driver.findElement(By.xpath("//a[@href='#' and text()='Others']")).click();
			

	}

}
