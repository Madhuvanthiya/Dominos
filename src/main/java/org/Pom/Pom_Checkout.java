package org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Checkout {
	
WebDriver driver;
	
	public Pom_Checkout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='txt--wrpr']//span//span")
	WebElement prodsubtotal;
	@FindBy(xpath="//button[@data-label='miniCartCheckout']//span")
	WebElement checkout;
	@FindBy(xpath="//div[@class='txt--wrpr marginTop']//span//span")
	WebElement grandtotal;
	@FindBy(xpath="(//div[@class='price--fnl']//span)[1]")
	WebElement priceMargherita;
	@FindBy(xpath="(//div[@class='price--fnl']//span)[2]")
	WebElement pricepaneer;
	@FindBy(xpath="(//div[@class='price--fnl']//span)[3]")
	WebElement pricepepsi;
	@FindBy(xpath="(//div[@class='price--fnl']//span)[4]")
	WebElement pricegourmetpza;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getProdsubtotal() {
		return prodsubtotal;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getGrandtotal() {
		return grandtotal;
	}
	public WebElement getPriceMargherita() {
		return priceMargherita;
	}
	public WebElement getPricepaneer() {
		return pricepaneer;
	}
	public WebElement getPricepepsi() {
		return pricepepsi;
	}
	public WebElement getPricegourmetpza() {
		return pricegourmetpza;
	}

}
