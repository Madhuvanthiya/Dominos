package org.Hook;

import java.io.IOException;

import org.Base.Dominos_Base;
import org.Testdata.Dominos_Testdata;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook_Dominos{
	public static WebDriver driver;
	
	@Before
	public void setup() {
	
		 Dominos_Base.launchbrowser();
		 Dominos_Base.windowmaxi();
		 Dominos_Base.geturl(Dominos_Testdata.url);
		 Dominos_Base.implicitwait(Dominos_Testdata.sec);
	}
	
	
	@After
	public void tearDown() {
		Dominos_Base.toquit();
	}
	@AfterStep
	public void screenshot(Scenario scenario) throws IOException {
//		 if (!scenario.isFailed()) {
//	            if (driver instanceof TakesScreenshot) {
//	                TakesScreenshot ts = (TakesScreenshot) driver;
//	                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//	                
//	                // Attach the screenshot to the scenario report
//	                scenario.attach(screenshot, "image/png", "Screenshot - Passed Scenario");
//	            }
//	        }
//		if(scenario.isFailed()) {
//			TakesScreenshot ts = (TakesScreenshot) driver;
//			byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
//			scenario.attach(screenshot,"image/png",scenario.getName());
//		}
		Dominos_Base.addscreenshot(scenario);
	}
}
