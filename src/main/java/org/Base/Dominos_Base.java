package org.Base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class Dominos_Base {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	
	
	public static void launchbrowser() {//normal Browser launch
		driver = new EdgeDriver();
	}
	public static void geturl(String url) {
		driver.get(url);
	}
	public static void windowmaxi() {
		driver.manage().window().maximize();
	}
	public static void implicitwait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	public static void jsclick(WebElement element) {
	 js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].click();", element);
	}
	public static void explicitwait() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState=='complete'"));    
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void tosend(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void toclear(WebElement element) {
		element.clear();
	}
	public static void alertOK() {
		driver.switchTo().alert().accept();
	}
	public static void alertDismiss() {
		 driver.switchTo().alert().dismiss();
	}
	public static void addscreenshot(Scenario scenario) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("/Dominos/target"+scenario.getName()+".png");
		FileUtils.copyFile(source, destination);
	}
	public static void toquit() {
		driver.quit();
	}
	

}
