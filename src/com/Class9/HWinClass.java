package com.Class9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Util.CommonMethods;
import com.Util.Constants;

public class HWinClass extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
		
	
	setUp("chrome", Constants.HRMS_URL);
	 Constants.logInHRMS();
    Thread.sleep(2000);
     driver.findElement(By.xpath("//a[@id = 'menu_recruitment_viewRecruitmentModule']")).click();
     driver.findElement(By.linkText("Candidates")).click();
     List<WebElement> rows=driver.findElements(By.xpath("//table[@id = 'resultTable']/tbody/tr"));
     String firstPart="//table[@id = 'resultTable']/tbody/tr[";
     String secondPart="]/td[3]";
     String thirdPart="]/td[1]";
    
     int numberOfRows=rows.size();
     System.out.println(numberOfRows);
     
     for(int i=1; i<=numberOfRows; i++) {
         String namePresent=driver.findElement(By.xpath(firstPart+i+secondPart)).getText();
        
         if(namePresent.contains("Jessica")) {
        	 System.out.println(namePresent);
             driver.findElement(By.xpath(firstPart+i+thirdPart)).click();
             System.out.println("Already clicked");
             break;
         }
//             else {
//             System.out.println("Text not present");
//         }
     }
     driver.quit();

}
}
