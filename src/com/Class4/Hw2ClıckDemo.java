package com.Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Util.CommonMethods;
import com.Util.Constants;

public class Hw2ClýckDemo extends Constants{

	public static void main(String[] args) {
		
		CommonMethods.setUp("chrome", Practice_URL);
		WebDriver driver=new ChromeDriver();
		driver.findElement(By.linkText("Checkbox.))
	}

}
