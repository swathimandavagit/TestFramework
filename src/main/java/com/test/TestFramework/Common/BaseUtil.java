package com.test.TestFramework.Common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseUtil {
	private static WebDriver driver = null;
	private static String browserVal;
	private static ConfigurationLoader loader;
	
	static {
		initiateBrowser();
	}
	
	public static void initiateBrowser() {
		try {
			loader = new ConfigurationLoader();
			browserVal = loader.getValue("browser");
			System.out.println(browserVal);

			if(driver == null) {
				if (browserVal.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver",
							"F:\\Swathi\\workspace2\\TestFramework\\src\\main\\java\\com\\test\\TestFramework\\Resources\\chromedriver.exe");
					ChromeOptions options = new ChromeOptions();
					driver = new ChromeDriver(options);
				}
			}
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//page load timeout
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			//Maximize the window
			driver.manage().window().maximize();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
