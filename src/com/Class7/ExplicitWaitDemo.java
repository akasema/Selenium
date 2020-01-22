package com.Class7;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Util.CommonMethods;
import com.Util.Constants;
public class ExplicitWaitDemo extends CommonMethods{
/**
		 * navigate practise url web page 
		 * click on others
		 * select dynamic data loading
		 * click get new user 
		 * verify/validate that first name element is displayed
		 * */
		
	public static void main(String[] args) {
		setUp("chrome", Constants.Practice_URL);
		driver.findElement(By.linkText("Others")).click();
		driver.findElement(By.linkText("Dynamic Data Loading")).click();
		driver.findElement(By.id("save")).click();
		// webdriver wait or explicit wait --> wait for specified element to load appear on the 
		//it will wait untill expected condition is mer or specified time has passed.
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[starts-with(text(), 'First Name')]")));	 
		boolean isdisplayed=driver.findElement(By.xpath("//p[starts-with(text(), 'First Name')]")).isDisplayed();
		
		if (isdisplayed) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		driver.close();
	}

}
