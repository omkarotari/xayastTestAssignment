package com.xayast.automation.libraries;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;
import com.xayast.automation.configuration.Config;

public class TakeSnapshot {
	static String filePath = Config.snapShotFolder;

	public static boolean getSnapshot(WebDriver dr, String methodName) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
   	 File scrFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
     //The below method will save the screen shot in d drive with test method name 
        try {
			//File(scrFile, new File(filePath+methodName+".png"));
        	FileUtils.copyFile(scrFile, new File(filePath+methodName+"_"+timeStamp+".png"), true);
			System.out.println("***Placed screen shot in "+filePath+" ***");
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
			
		}
	}

}
