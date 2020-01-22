 package com.Class6;
 /**
  * Open chrome browser
  * 2.Go to “https://the-internet.herokuapp.com/”
  * 3.Click on “Click on the “Dynamic Controls” link
  * 4.Click on enable button5.Enter “Hello” and verify text is entered successfully
  * 6.Close the browser
  */

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Util.CommonMethods;

public class HomeWork3 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		System.out.println("Dynamic Controls");
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
//		driver.findElement(By.cssSelector("button[onclick='swapInput()']")).click();
		
		System.out.println("Enable");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[text()='Enable']")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");;
		System.out.println("Hello entered");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
