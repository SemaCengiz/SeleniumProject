package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/Sema/Downloads/chromedriver");
		  WebDriver driver = new ChromeDriver();
		  
		 driver.get("http://www.hsamckinley.org/enrollment/");

	}

}
