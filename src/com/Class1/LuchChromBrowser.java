package com.Class1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LuchChromBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
// browser navigation commands
		Thread.sleep(1000);
		driver.navigate().to("http://www.syntaxtechs.com");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
