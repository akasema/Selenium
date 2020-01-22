package com.Class7;

	import org.openqa.selenium.By;

import com.Util.CommonMethods;

	
public class TestAlertFunction extends CommonMethods {

	
		public static void main(String[] args) throws InterruptedException {

			setUp("chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/javascript-alert-box-demo.html");
			driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
			
			String alertText=getAlertText();
			System.out.println(alertText);
			Thread.sleep(3000);
			acceptAlert();
		
			Thread.sleep(3000);
			driver.quit();
		}
	}


