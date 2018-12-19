package com.bdd.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver dr;
	public void openBrowser(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/anamulhoque/Downloads/chromedriver");
			dr = new ChromeDriver();
		}
	}
	public void goToUrl() {
		dr.get("https://www.eshopper24.com/");
	}

}
