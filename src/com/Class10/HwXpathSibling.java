package com.Class10;

import org.openqa.selenium.By;

import com.Util.CommonMethods;
/**
 * TC 1: HRMS Login

Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login to the application by writing xpath based on “parent and child relation”
 * @author kadir
 *TC 2: HRMS Login

Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login to the application by writing xpath based on “following and preceding siblings”
 */
public class HwXpathSibling extends CommonMethods{
public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth";
	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", url);
		  driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
	        
	        driver.findElement(By.xpath("//form[@id='frmLogin']/div[3]/input")).sendKeys("Hum@nhrm123");
	        
	        driver.findElement(By.xpath("//form[@id='frmLogin']/div[5]/input")).click();
	        
	        Thread.sleep(3000);



	}

}
