package com.Class9;
import org.openqa.selenium.By;

import com.Util.CommonMethods;
public class HWork2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", "http://166.62.36.207/humanresources/symfony/web/");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		 
		 driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		
		 driver.findElement(By.id("btnLogin")).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@id = 'menu_recruitment_viewRecruitmentModule']/b")).click();

		 
		 Thread.sleep(3000);
			driver.quit();
	}

}
