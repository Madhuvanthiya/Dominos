package org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Add_Cart {
	
WebDriver driver;
	
	public Pom_Add_Cart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div//div[@data-label='increase'])[3]")
	WebElement qutyAdd;
	@FindBy (xpath="(//div//div[@data-label='increase'])[4]")
	WebElement qutyincrement;
	@FindBy(xpath="(//div//div[@data-label='increase'])[12]")
	WebElement qtyincrmt2;
	@FindBy(xpath="//div//button[@class='btn--trnpsnt-wht']//span")
	WebElement toCart;
	@FindBy(xpath="(//div//div[@data-label='increase'])[14]")
	WebElement qtyIncrmtpepsi;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getQutyAdd() {
		return qutyAdd;
	}
	public WebElement getQutyincrement() {
		return qutyincrement;
	}
	public WebElement getQtyincrmt2() {
		return qtyincrmt2;
	}
	public WebElement getToCart() {
		return toCart;
	}
	public WebElement getQtyIncrmtpepsi() {
		return qtyIncrmtpepsi;
	}


}
