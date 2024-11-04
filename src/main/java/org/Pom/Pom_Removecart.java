package org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Removecart {
	
WebDriver driver;
	
	public Pom_Removecart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@class='cnt ']//div[@data-label='decrease'])[1]")
	WebElement deletCart1;
	@FindBy(xpath="(//div[@class='cnt ']//div[@data-label='decrease'])[4]")
	WebElement deletCart4;
	@FindBy(xpath="(//div[@class='crt-cnt-qty-prc']//child::span[@class='rupee'])[4]")
	WebElement afterRmvtotalGourmetpizza;
	@FindBy(xpath="(//div[@class='crt-cnt-qty-prc']//child::span[@class='rupee'])[1]")
	WebElement afterRmvtotalmargherita;
	@FindBy(xpath="(//div[@class='crt-cnt-qty-prc']//child::span[@class='rupee'])[2]")
	WebElement aftRmvtotalpaneer;
	@FindBy(xpath="(//div[@class='crt-cnt-qty-prc']//child::span[@class='rupee'])[3]")
	WebElement subtotalPepsi;

	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getDeletCart1() {
		return deletCart1;
	}
	public WebElement getDeletCart4() {
		return deletCart4;
	}
	public WebElement getAfterRmvtotalGourmetpizza() {
		return afterRmvtotalGourmetpizza;
	}
	public WebElement getAfterRmvtotalmargherita() {
		return afterRmvtotalmargherita;
	}
	public WebElement getAftRmvtotalpaneer() {
		return aftRmvtotalpaneer;
	}
	public WebElement getSubtotalPepsi() {
		return subtotalPepsi;
	}

}
