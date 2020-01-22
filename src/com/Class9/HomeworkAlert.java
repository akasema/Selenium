package com.Class9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Util.CommonMethods;
import com.Util.Constants;

public class HomeworkAlert extends CommonMethods {
	
public static void main(String[] args) throws InterruptedException  {
	

//	public static void main(String[] args) throws InterruptedException {
			setUp("chrome", Constants.TOOLSQA);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("timingAlert")));
			driver.findElement(By.id("timingAlert")).click();
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(5000);
			driver.quit();
		}

	}


