package com.Class03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Util.CommonMethods;

public class WebElements extends CommonMethods{
	public static String url="https://the-internet.herokuapp.com/";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
	
	 
	 List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	int nOfAllLink=allLinks.size();
	 System.out.println(nOfAllLink);
	}

}
