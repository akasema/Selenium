package com.Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.Util.CommonMethods;

public class ExplicitWaitDemo2 extends CommonMethods{
// navigate google search for wegmans
	//click on link wegman grocery delivery
	//click log in 
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", "http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("wegmans",Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='Wegmans Grocery Delivery | Powered By Instacart‎']")).click();
		driver.findElement(By.className("q")).sendKeys("wegmans", Keys.ENTER);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
		Thread.sleep(300);
		driver.quit();
		
		
		

	}

}
