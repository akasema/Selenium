package com.Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String site="http://www.google.com";
		driver.navigate().to(site);
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(100);
		driver.close();

	}

}
