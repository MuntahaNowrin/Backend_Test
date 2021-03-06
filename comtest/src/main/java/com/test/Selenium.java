package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	static WebDriver driver= null;
	
    public static void main(String[] args) {
    	String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "/home/arafat/browser_driver/lib/chromedriver/chromedriver");
		driver = new ChromeDriver();

		driver.get("http://localhost:8085/java-tomcat-maven-example/");

		String bodyText = driver.findElement(By.tagName("h2")).getText();
		System.out.println(bodyText);

		if (bodyText.contains("Hello World!")) {

			System.out.println("TESTing PASSED!");

		} else {

			System.out.println("TEST FAILED");
		}

		driver.close();

    }
}