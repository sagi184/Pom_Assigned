package testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
public static String captureScreenshot(WebDriver driver, String screenshotname){
		
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File Dest = new File("./Screenshots/"+screenshotname+ System.currentTimeMillis() + ".png");
			FileUtils.copyFile(source, Dest);
			String errflpath = Dest.getAbsolutePath();
			//FileUtils.copyFile(source, new File("./Screenshots/"+screenshotname+ System.currentTimeMillis() + ".png"));
			System.out.println("Screenshot taken");
			
		}
		catch (Exception e)
		{
			System.out.println("Exception while taking screenshot "+e.getMessage());
			
		}
		//return driver;
		
		
		return screenshotname;
		
		}
	
}
