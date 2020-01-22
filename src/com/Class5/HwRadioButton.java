package com.Class5;
import org.openqa.selenium.By;

import com.Util.CommonMethods;

public class HwRadioButton extends CommonMethods{
	
 
		public static final String HRMS_URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
		//Open chrome browser
	//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
	//Click on “Input Forms” links
	//Click on “Radio Buttons Demo” links
	//Click on any radio button in “Radio Button Demo” section.
	//Verify correct checkbox is clicked
	//Click on any radio button in “Group Radio Buttons Demo” section.
	//Verify correct checkbox is clicked
	//Quit browser
		
		public static void main(String[] args) throws InterruptedException {
			CommonMethods.setUp("chrome", HRMS_URL);
			driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Radio Buttons Demo")).click();
			
		}

	}