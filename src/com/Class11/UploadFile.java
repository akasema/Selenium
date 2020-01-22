package com.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Util.CommonMethods;

public class UploadFile extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUp("chrome","https://the-internet.herokuapp.com/upload" );
		Thread.sleep(1000);	
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\kadir\\Desktop\\2.7mKtchen.jpeg");
		WebElement uploaded=driver.findElement(By.xpath("//div[@id='upload-files']/preceding-sibling::h3"));
	if (uploaded.isDisplayed()) {
		System.out.println("File Successfully uploaded");
	}else {
		System.out.println("File is not uploaded");
	}
	
	driver.quit();
	}

}
