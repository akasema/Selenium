package com.Class1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PageCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
//		Thread.sleep(1000);
		// differents get and navigate; get only get  no history, navigate will report history , forward come back ...
		//get will not continue untill webpage completely downladed
//		driver.navigate().to("http://Google.com");
//		driver.navigate().back();
//		driver.navigate().forward(); 

        final String expectedTitle="Google";
        String actualTitle=driver.getTitle();
        
        if(expectedTitle.equals(actualTitle)) {
            System.out.println("The actual and expected Title matched");
        }else {
            System.err.println("The actual and expected Title did not match");
        }
        
        System.out.println("*******************");
        
        String expectedUrl="https://www.google.com/?gws_rd=ssl";
        String actualUrl=driver.getCurrentUrl();
        
        
        if(expectedUrl.equals(actualUrl)) {
            System.out.println("Both URL matched");
        }else {
            System.err.println("Actual and Expected did not match");
        }
        
        
        
        driver.close();
        
	

	}

}
