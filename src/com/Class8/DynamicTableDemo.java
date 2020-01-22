package com.Class8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Util.CommonMethods;

public class DynamicTableDemo extends CommonMethods{

	public static String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	public static void main(String[] args) {
		setUp("chrome", url);
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		String expValue="Bob Feather";
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

			for (int i=0; i<=rows.size(); i++) {
				String rowText=rows.get(i-1).getText();
				if(rowText.contains(expValue)) {
					driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/td[1]")).click();

				}
			}
				
		 
		 
	}

}
