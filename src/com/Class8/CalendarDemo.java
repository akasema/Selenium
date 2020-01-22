package com.Class8;

import org.openqa.selenium.By;

import com.Util.CommonMethods;

public class CalendarDemo extends CommonMethods{

	public static void main(String[] args) {
		setUp("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	     
	    driver.findElement(By.id("Password")).sendKeys("hrm123");
	    driver.findElement(By.id("btnLogin")).submit();
	   	    
	    driver.findElement(By.xpath("//b[text()='PIM']")).click();
	     driver.findElement(By.id("Leave")).click();
	  
//	     driver.findElement(By.id("menu_pim_addEmployee")).click();
	    
	    
	   
//	    driver.findElement(By.cssSelector("input#firstName")).sendKeys("Akim");
//	    driver.findElement(By.cssSelector("input#lastName")).sendKeys("Akimov");
//	    driver.findElement(By.cssSelector("input#btnSave")).click();
//	    driver.findElement(By.linkText("Welcome Admin")).click();
//	    driver.findElement(By.linkText("Logout")).click();

	    
	    //calendar //img[@class='ui-datepicker-trigger']
	}

}
