package com.Class5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Util.CommonMethods;
public class HomWork2 extends CommonMethods {
		public static void main(String[] args) throws InterruptedException {
		//The method is opening syntax Practice website using chrome browser
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

			WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/index.html");

		driver.findElement(By.linkText("Others")).click();
//		driver.navigate().to("http://166.62.36.207/syntaxpractice/drag-and-drop-demo.html");
		System.out.println("Nevigate to Others page");
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		System.out.println("Nevigate to Home page");
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(2000);
//		String frame1=driver.findElement(By.xpath(" //img[@data-animation='animated zoomInLeft']")).getText();
//		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		System.out.println("Nevigate to Frame1 page");
		Thread.sleep(2000);
		//String frame2Text=driver.findElement(By.xpath(" //img[@alt='Syntax Technologies']")).getText();
		boolean textDis=driver.findElement(By.xpath("//img[@alt='Syntax Technologies']")).isDisplayed();
		System.out.println("Logo is "+textDis);
		Thread.sleep(2000);
		driver.close();
}
}


