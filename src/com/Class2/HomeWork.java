package com.Class2;
/*
 * TC 1: HRMS Application Login: 
Open chrome browser
Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
Enter valid username and password
Click on login button
Then verify Syntax Logo is displayed.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
	static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		// using tag name
//		driver.findElement(By.id("txtUsername")).sendKeys("VaughnEdward");
//		driver.findElement(By.id("txtPassword")).sendKeys("VaughnEdward@$12!");
		// using xpath
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("VaughnEdward");
		driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys("VaughnEdward@$12!");	
	
		driver.findElement(By.id("btnLogin")).click();
	
	Thread.sleep(1000);
	WebElement path=driver.findElement(By.id("branding"));
	if (path.isDisplayed()) {
		System.out.println("The Logo has been displayed");
	}else {
		System.out.println("The Logo Not displayed");
	}
	driver.close();
	}

}
