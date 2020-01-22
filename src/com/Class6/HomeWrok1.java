package com.Class6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.Util.CommonMethods;

public class HomeWrok1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	setUp("chrome", "https://the-internet.herokuapp.com/");
	driver.findElement(By.linkText("Dynamic Loading")).click();

	driver.findElement(By.partialLinkText("Example 1")).click();
	System.out.println("click example1 ");
	driver.findElement(By.xpath("//button[text()='Start']")).click();	
	System.out.println("click start");
	boolean isDisp=driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	String expText="Hello World!";
	
	if (isDisp) {
	System.out.println("Expected text obtained"+expText);
	}else {
		System.out.println("Text Not observed");
	}
	Thread.sleep(3000);
	driver.quit();
	
	
	}
}
