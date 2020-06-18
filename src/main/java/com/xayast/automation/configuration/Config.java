package com.xayast.automation.configuration;

public class Config {
	public final static String url = "http://automationpractice.com/index.php";
	public final static String browserPath = System.getProperty("user.dir")
			+ "\\src\\resources\\BrowserStack\\";
	public final static long implicitWait = 5000;
	public final static String snapShotFolder = System.getProperty("user.dir") + "\\src\\resources\\snapshots\\";
	public final static String testReportFolder = System.getProperty("user.dir")+"\\src\\resources\\test-reports\\";
	
}
