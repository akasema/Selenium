package com.Class7;

import java.util.concurrent.TimeUnit;

import com.Util.CommonMethods;

public class PageLoadAndImplicitWait extends CommonMethods{

	public static void main(String[] args) {

		setUp("chrome", "https://cnn.com");
	//	driver.manage().timeouts().pageLoadTimeout((30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);

	}

}
