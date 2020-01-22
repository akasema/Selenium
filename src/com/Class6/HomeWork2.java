package com.Class6;
/**
 * TC 2: Verify element is clickable1.Open chrome browser
 * 2.Go to “https://the-internet.herokuapp.com/”
 * 3.Click on “Click on the “Dynamic Controls” link
 * 4.Select checkbox and click Remove
 * 5.Click on Add button and verify “It's back!” text is displayed
 * 6.Close the browser
 */
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Util.CommonMethods;

public class HomeWork2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
setUp("Chrome", "https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
	System.out.println("Dynamic Control");
	driver.findElement(By.xpath("//input[@label='blah']")).click();
	System.out.println("Click Check Box");
	driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
	WebDriverWait wait = new WebDriverWait(driver, 20); 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button[onclick='swapCheckbox()']")));
	System.out.println("Click Remove");
	driver.findElement(By.xpath("//button[onclick='swapCheckbox()']")).click();
	
	//initialize
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("button[onclick='swapCheckbox()']")));
		
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		
	System.out.println("Click Add");
	driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
	System.out.println("Click Add");

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("It's back!")));
	
	boolean isDispl=driver.findElement(By.xpath("//p[@id='message']")).isDisplayed();
	if (isDispl) {
		System.out.println("Displayed");
	}else {
		System.out.println("Not Displayed");
	}
	
	Thread.sleep(3000);
	driver.quit();
	}

}
