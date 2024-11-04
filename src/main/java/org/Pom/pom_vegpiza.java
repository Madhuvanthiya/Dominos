package org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_vegpiza {
WebDriver driver;
	
	public pom_vegpiza(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div//span)[15]")
	WebElement vegpizza;
	@FindBy(xpath="//div//button[@onclick='moeRemoveBanner()'][@class='ng-binding']")
	WebElement dontallow;
	@FindBy(xpath="(//div[@class='injectStyles-sc-1jy9bcf-0 jrxrSi']//button[@data-label='addTocart']//span)[3]")
	WebElement PrimaveraGourmetPizza;
	@FindBy(xpath="(//div//img[@class='img-wrpr__img'])[79]")
	WebElement margherita;
	@FindBy(xpath="(//div//img[@class='img-wrpr__img'])[82]")
	WebElement peppypaneer;
	@FindBy(xpath="(//div[@class='sc-dqBHgY iicSxJ']//span[@class='rupee'])[3]")
	WebElement totalGourmetpza;
	@FindBy(xpath="(//div[@class='menu-right']//span[@class='rupee'])[1]")
	WebElement totalmargherita;
	@FindBy(xpath="(//div[@class='menu-right']//span[@class='rupee'])[2]")
	WebElement totalpeppypaneer;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getVegpizza() {
		return vegpizza;
	}
	public WebElement getDontallow() {
		return dontallow;
	}
	public WebElement getPrimaveraGourmetPizza() {
		return PrimaveraGourmetPizza;
	}
	public WebElement getMargherita() {
		return margherita;
	}
	public WebElement getPeppypaneer() {
		return peppypaneer;
	}
	public WebElement getTotalGourmetpza() {
		return totalGourmetpza;
	}
	public WebElement getTotalmargherita() {
		return totalmargherita;
	}
	public WebElement getTotalpeppypaneer() {
		return totalpeppypaneer;
	}

}
