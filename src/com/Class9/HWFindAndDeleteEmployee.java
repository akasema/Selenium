package com.Class9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Util.CommonMethods;
import com.Util.Constants;

public class HWFindAndDeleteEmployee extends CommonMethods{
	
	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth";

/**
 * TC 1: Delete Employee
Open chrome browser
Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login into the application
Add Employee
Verify Employee has been added
Go to Employee List
Delete added Employee
Quit the browser
 * @param args
 * @throws InterruptedException 
 */
	public static void main(String[] args) throws InterruptedException {
	 
		setUp("chrome", url);
		Constants.logInHRMS();
		System.out.println("Enter to recurremenet Page");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[@id = 'menu_recruitment_viewRecruitmentModule']/b")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();		
		//add Employee
		driver.findElement(By.xpath("//input[@name='addCandidate[firstName]']")).sendKeys("Kadir");
		driver.findElement(By.xpath("//input[@name='addCandidate[lastName]']")).sendKeys("GOK");
		driver.findElement(By.xpath("//input[@name='addCandidate[email]']")).sendKeys("kadirgok1@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		 Thread.sleep(1000);
		 String url2="http://166.62.36.207/humanresources/symfony/web/index.php/recruitment/viewCandidates";
		String empName="Kadir";
		 findEmployeClick(url2,empName);
		//delete employee
		driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
		System.out.println(empName+" Entry Delete button clicked!");
		 
		driver.findElement(By.id("dialogDeleteBtn")).click();
		System.out.println("Employeee with id # " + empName + " has been sucessfully deleted");
		
		Thread.sleep(2000);
		System.out.println("Alert Accepted");
		 
		driver.quit();
	}

}
