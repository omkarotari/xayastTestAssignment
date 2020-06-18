package com.xayast.automation.driver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.xayast.automation.configuration.Config;

public class Driver {
	public WebDriver dr;
	public static ExtentTest test;
	static ExtentReports report;
	
	@BeforeSuite
	public void suiteInitializer()
	{
		String timeStamp1 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
		report = new ExtentReports(Config.testReportFolder+"\\HotWireTestReport"+timeStamp1+".html");
		test = report.startTest("HotWire Vacation Page Result Test");
	}
	
	@BeforeClass
	@Parameters({"browsers"})
	public void initialize(String browser)
	{
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", Config.browserPath + "chromedriver.exe");
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--disable-infobars");
			op.addArguments("--start-maximized");	
			//op.setExperimentalOption("execludeSwitches", new String[] {"enable-automatin"});
			dr = new ChromeDriver(op);
			dr.manage().timeouts().implicitlyWait(Config.implicitWait, TimeUnit.SECONDS);
			dr.get(Config.url);

		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", Config.browserPath + "geckodriver.exe");
			
			dr = new FirefoxDriver();
			dr.manage().timeouts().implicitlyWait(Config.implicitWait, TimeUnit.SECONDS);
			dr.get(Config.url);

		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", Config.browserPath + "IEDriverServer.exe");
			InternetExplorerOptions op = new InternetExplorerOptions();
			// op.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,"");
			dr = new InternetExplorerDriver(op);
			dr.manage().timeouts().implicitlyWait(Config.implicitWait, TimeUnit.SECONDS);
			dr.get(Config.url);
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", Config.browserPath + "MicrosoftWebDriver.exe");
			dr = new EdgeDriver();
			dr.manage().timeouts().implicitlyWait(Config.implicitWait, TimeUnit.SECONDS);
			dr.get(Config.url);
		} 

		dr.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown()
	{
		dr.quit();
		report.flush();
	}

}