package com.org.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.org.utility.TestUtil;

public class TestBase {

	public static Properties prob ;
	public static WebDriver driver;
	public static Logger log;
	
	public TestBase()
	{
		try {
			prob = new Properties();
			FileInputStream ip = new FileInputStream ("/Users/Windows 7/test-workspace/InfyPractise/"
					+ "src/com/org/testdata/config.properties");
			prob.load(ip);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	public static void initialization()
	{
		
		String browserName = prob.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		driver.get(prob.getProperty("url"));
		
	}
}
