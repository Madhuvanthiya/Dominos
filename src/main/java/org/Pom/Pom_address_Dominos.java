package org.Pom;

import org.Base.Dominos_Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_address_Dominos extends Dominos_Base{	
	WebDriver driver;
	
	public Pom_address_Dominos(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@onclick='redirectToOrderOnline()']//button")
	WebElement orderonlinebtn;
	@FindBy(xpath="//div//input[@placeholder='Enter your delivery address']")
	WebElement Address;
	@FindBy(xpath="//div//input[@placeholder='Enter Area / Locality']")
	WebElement Area;
	@FindBy(xpath="//ul//li[1]//div//span[@class='lst-desc-main ellipsis']")
	WebElement suggestion2;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getOrderonlinebtn() {
		return orderonlinebtn;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getArea() {
		return Area;
	}
	public WebElement getSuggestion2() {
		return suggestion2;
	}


}
