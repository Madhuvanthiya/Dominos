package org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_pepsi {
	
WebDriver driver;
	
	public Pom_pepsi(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@data-label='Beverages'])[2]")
	WebElement beverages;
	@FindBy(xpath="//div//button[@data-label='Add button']//span")
	WebElement nothanksbtn;
	@FindBy(xpath="(//div[@class='sc-bYSBpT gRzrIn']//div[@class='sc-iELTvK cYbiOn']//button[@data-label='addTocart']//span)[112]")
	WebElement cartpepsi;
	@FindBy(xpath="(//div[@class='crt-cntnt']//span[@class='rupee'])[4]")
	WebElement totalpepsi;
	@FindBy(xpath="(//div[@class='crt-cnt-qty-prc']//child::span[@class='rupee'])[3]")
	WebElement subtotalPepsi;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getBeverages() {
		return beverages;
	}
	public WebElement getNothanksbtn() {
		return nothanksbtn;
	}
	public WebElement getCartpepsi() {
		return cartpepsi;
	}
	public WebElement getTotalpepsi() {
		return totalpepsi;
	}
	public WebElement getSubtotalPepsi() {
		return subtotalPepsi;
	}


}
