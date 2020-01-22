package com.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {
	public static final String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']"));
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Syntax@12");
		String attribute=driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("class");
		System.out.println(attribute);
		//Submit and click arasýndaki fark click hemen clickler 
		// sayfa yuklenmediyse hata döner , submit page load bekler ki bu daha iyidir
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	}

}
