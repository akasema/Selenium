package com.Class03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement2 {
	public static final String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.xpath("//input[@id='txtUsername']"));
				
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Syntax@12");
		
		//span[@id='spanMessage']
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement links=driver.findElement(By.tagName("a"));
		System.out.println(links.getSize());
		
}
}