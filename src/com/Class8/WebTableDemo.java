package com.Class8;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Util.CommonMethods;
import com.Util.Constants;

public class WebTableDemo extends CommonMethods{

	public static void main(String[] args) {
		 setUp("chrome", Constants.Practice_URL);
		//navigate to table 
		 driver.findElement(By.linkText("Table")).click();
		 driver.findElement(By.linkText("Table Data Search")).click();
		 
		 //find how many rows of data table has
		 List<WebElement> rows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
				 
				 
		 
		 System.out.println("Printing Row Data----------");
		 Iterator<WebElement> rowsIt=rows.iterator();
		 
		 
		 
		 List<WebElement> cols=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		 
		 System.out.println("Printing column Headers----------");
		 for (WebElement cols: )

	}

}
