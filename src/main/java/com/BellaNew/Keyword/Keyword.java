package com.BellaNew.Keyword;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.BellaNew.TestBase.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Keyword extends TestBase {

	@Before
	public void OpenBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			TestBase.driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			TestBase.driver = new FirefoxDriver();
		}
	}

	@After
	public void tearDown() throws Exception {
		TestBase.driver.quit();
	}
}
