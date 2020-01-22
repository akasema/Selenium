package com.Class4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Util.CommonMethods;
import com.Util.Constants;
//kendimz sürekli kullandýgýmýz elemanlarý sahip olan bir sýnýf yazýp burada kýsa kod kullanýrýz
// comkonMethods clasý
public class CheckBoxDemo extends CommonMethods {
	public static final String HRMS_URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static final String Practice_URL="http://166.62.36.207/syntaxpractice/index.html";
	//yukarýdaki linki constant clasýnda da yazýp buraya alabiliriz
	public static void main(String[] args) throws InterruptedException {
	
		CommonMethods.setUp("chrome",Constants.Practice_URL);
		driver.manage().window().maximize();
		WebElement loginBtn=driver.findElement(By.cssSelector("input#btnLogin"));
		System.out.println(loginBtn.isEnabled());
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		
//		CommonMethods.setUp("chrome",Constants.Practice_URL);
		WebElement maleRadioB=driver.findElement(By.xpath("//input[@name='optradio'"));
		System.out.println(maleRadioB.isSelected());
		maleRadioB.click();
		System.out.println(maleRadioB.isSelected());
		
		List<WebElement> radioButtons =(List<WebElement>) driver.findElement(By.name("optradio"));
		for (int i=0; i< radioButtons.size(); i++) {
			
		}
		
		
		
		driver.close();
	} 

}
