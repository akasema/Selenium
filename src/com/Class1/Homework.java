package com.Class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Util.CommonMethods;

public class Homework extends CommonMethods{
/*
 * VanEarl	VanEarl@&12
VanceEddie	VanceEddie@&12
VaughnEdward	VaughnEdward@$12!
 */
	public static void main(String[] args) throws InterruptedException {
	String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
		System.out.println("Enter commonmethods");
//		CommonMethods.setUp("chrome", url);
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		System.out.println("Come back commonmethods");
		//		driver.navigate().to("http://166.62.36.207/syntaxpractice/drag-and-drop-demo.html");
		driver.findElement(By.linkText("Others")).click();
		System.out.println("Nevigate to others page");
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println("Nevigate back page");
		
		Thread.sleep(1000);
		driver.navigate().to("http://jiravm.centralus.cloudapp.azure.com:8081/jquery-download-progress-bar-demo.html");
	System.out.println("Closing");
		driver.close();
	}

}
