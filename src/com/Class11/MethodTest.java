package com.Class11;

import com.Util.CommonMethods;

public class MethodTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUp("chrome", "https://www.expedia.com/");
		scrollDown(1000);
		Thread.sleep(1000);
		scrollUp(1000);
		Thread.sleep(1000);
		driver.quit();
		

	}

}
