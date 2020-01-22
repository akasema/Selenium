package com.Class6;
import org.openqa.selenium.By;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

import com.Util.CommonMethods;

public class HWexpats extends CommonMethods{
	
	
		public static void main(String[] args) {
		//open chrome browser, go to https://the-internet.herokuapp.com/
			setUp("Chrome","https://the-internet.herokuapp.com/");
		//click on dynamic controls	link
			driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		//Select checkbox and click Remove
			
			boolean box=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
			if(box) {
				System.out.println("checkbox selected by default");
			}else {
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			}
			driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']")).click();
			
		//add wait webdriver 
			WebDriverWait wait=new WebDriverWait(driver, 20);
		//initialize
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("button[onclick='swapCheckbox()']")));
			
			driver.findElement(By.xpath("//button[text()='Add']")).click();
			driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
			String afterClickMsg=driver.findElement(By.xpath("//p[@id='message']")).getText();
			System.out.println(afterClickMsg);
			if (afterClickMsg.equals("It's back!")) {
				System.out.println("message Displayed, case passed");
			}else {
				System.out.println("message NOT Displayed, case FAILED");
			}
			driver.close();
		}


}
