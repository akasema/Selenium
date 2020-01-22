package com.Class9;

import org.openqa.selenium.By;

import com.Util.CommonMethods;
import com.Util.Constants;

/**
 * TC 1: Leave List Search Validation

Open chrome browser
Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login into the application
Select Leave List
Select from December 1, 2019 until January 31, 2020
Check only Pending approval
Click on Search
Validate “No Records Found” is displayed
Quit the browser
 * @author kadir
 *
 */
public class HWLeaveList extends CommonMethods{
public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth";
	public static void main(String[] args) throws InterruptedException {
	//set up chrome & webdrivers
		setUp("chrome", url );
	//login too web
	Constants.logInHRMS();
	//go to leave List
	driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click();
	driver.findElement(By.id("menu_leave_viewLeaveList")).click();
	driver.findElement(By.id("calFromDate")).clear();
	driver.findElement(By.id("calFromDate")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).sendKeys("01");
	
	
	

	}

}
