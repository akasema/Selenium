package com.Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Util.CommonMethods;

public class RecapDemoRadioButtn extends CommonMethods{
public static String url="http://facebook.com";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		CommonMethods.setUp("chrome", url);
		driver.get(url);// will wait until page load 
		driver.navigate().to("http://facebook.com");// reach page and do what is needed
//		driver.findElement(By.linkText("https://www.facebook.com/recover/initiate?lwv=110&amp;ars=royal_blue_bar")).click();
		driver.findElement(By.linkText("Forgot account?")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.quit();
	}

}
