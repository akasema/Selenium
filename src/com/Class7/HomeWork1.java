package com.Class7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Util.CommonMethods;
import java.util.List;


public class HomeWork1 extends CommonMethods{
/**
 * Open chrome browser
 * 2.Go to “http://166.62.36.207/syntaxpractice/”
 * 3.Click on “Table” link4.Click on “Table Data Search” link
 * 5.Verify tables consist of 4 rows and 7 columns
 * 6.Print name of all column headers 
 * 7.Print data of all rows
 * 8.Quit Browser
 * @param args
 * @throws InterruptedException 
 */
	public static void main(String[] args) throws InterruptedException {
		 setUp("chrome", "http://166.62.36.207/syntaxpractice/");
		 driver.findElement(By.linkText("Table")).click();
		 driver.findElement(By.linkText("Table Data Search")).click();
		 
		 List<WebElement> rows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		 System.out.println("Number of  Rows "+rows.size());
//		 for (int i=0; i<=rows.size()-1; i++) {
//			 System.out.println(rows.get(i).getText());
//		 }
		 List<WebElement> cols=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		 System.out.println("Number Of Columns "+cols.size());
//		 for (int i=0; i<=cols.size()-1; i++) {
//			 System.out.println(cols.get(i).getText());
//		 }
		 System.out.println(cols.get(2).getText()+rows.get(4).getText());
//		 for (int i=0; i<=cols.size()-1; i++) {
//			 for (int y=0; y<=rows.size()-1; y++) {
//				System.out.println(cols.get(i).getText()); 
//			 }
//		 }
		 System.out.println("Number of rows is - " + rows.size() + " and columns is - " + cols.size());
		 for(int i=1; i<=rows.size(); i++) {
			 WebElement row=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]"));
				 String rowData = row.getText();
				 System.out.println("Row "+i+" data is "+rowData);
				 if(rowData.contains("0003")) {
					 driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td/input")).click();
				 System.out.println("Clicked");
				 break;
				 }
				 }
	Thread.sleep(2000);
	driver.quit();
	}

}