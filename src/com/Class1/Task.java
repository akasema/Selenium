package com.Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		/*TC 1: Amazon Page Title Verification: 
Open chrome browser
Go to “https://www.amazon.com/”
Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
TC 2: Syntax Page URL Verification: 
Open chrome browser
Navigate to “https://www.syntaxtechs.com/”
Navigate to “https://www.google.com/”
Navigate back to Syntax Technologies Page
Refresh current page
Verify url contains “Syntax”
		 */
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.navigate().to("https://www.amazon.com");
		 final String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	        String actualTitle=driver.getTitle();
	        System.out.println(actualTitle);
	        if(expectedTitle.equals(actualTitle)) {
	            System.out.println("The actual and expected Title matched");
	        }else {
	            System.err.println("The actual and expected Title did not match");
	        }
	        		
		driver.navigate().back();
		driver.close();	
	}

}
