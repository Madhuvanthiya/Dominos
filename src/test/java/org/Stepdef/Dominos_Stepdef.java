package org.Stepdef;

import org.Base.Dominos_Base;
import org.Pom.Pom_Add_Cart;
import org.Pom.Pom_Checkout;
import org.Pom.Pom_Removecart;
import org.Pom.Pom_address_Dominos;
import org.Pom.Pom_pepsi;
import org.Pom.pom_vegpiza;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class Dominos_Stepdef extends Dominos_Base{
	 
	Pom_address_Dominos pom_class;
	Pom_Add_Cart addcart_pom;
	Pom_Checkout checkout_pom;
	Pom_pepsi pepsibevarage_pom;
	Pom_Removecart cartremove_pom;
	pom_vegpiza vegpizas_pom;


@Given("User Click on Order Online now")
public void userClickOnOrderOnlineNow() {
    pom_class=new Pom_address_Dominos(driver);
    addcart_pom=new Pom_Add_Cart(driver);
    checkout_pom=new Pom_Checkout(driver);
    pepsibevarage_pom=new Pom_pepsi(driver);
    cartremove_pom=new Pom_Removecart(driver);
    vegpizas_pom=new pom_vegpiza(driver);

    jsclick(pom_class.getOrderonlinebtn());
}
@Given("User Enter the Address and Pincode")
public void userEnterTheAddressAndPincode() throws InterruptedException{
	jsclick(pom_class.getAddress());
	tosend(pom_class.getArea(), "600100");
	Thread.sleep(5000);
	jsclick(pom_class.getSuggestion2());

}
@When("User add the VEG PIZZA with following product and the quantity")
public void userAddTheVEGPIZZAWithFollowingProductAndTheQuantity(DataTable dataTable) {
	//jsclick(vegpizas_pom.getDontallow());
   jsclick(vegpizas_pom.getVegpizza());
   jsclick(vegpizas_pom.getMargherita());
   jsclick(addcart_pom.getToCart());
   jsclick(addcart_pom.getQutyAdd());
   jsclick(vegpizas_pom.getPeppypaneer());
   jsclick(addcart_pom.getToCart());
   jsclick(addcart_pom.getQutyincrement());
   jsclick(vegpizas_pom.getPrimaveraGourmetPizza());
   jsclick(addcart_pom.getQtyincrmt2());
}
@Then("User Subtotal the Cart value of VEG PIZZA with sum of \\(Each Product Value *Qty)")
public void userSubtotalTheCartValueofVEGPIZZAWithSumOfEachProductValueQty() {
  String priceofMargherita = vegpizas_pom.getTotalmargherita().getText();
  System.out.println(priceofMargherita);
  double double1 = Double.parseDouble(priceofMargherita);
  String priceofPeppypaneer = vegpizas_pom.getTotalpeppypaneer().getText();
  System.out.println(priceofPeppypaneer);
  double paneersubtotal = Double.parseDouble(priceofPeppypaneer);
  String priceofGourmetpza = vegpizas_pom.getTotalGourmetpza().getText();
  System.out.println(priceofGourmetpza);
  double gourmetsubtotal = Double.parseDouble(priceofGourmetpza);
  System.out.println(gourmetsubtotal);
  double subtotalofvegpza=double1+paneersubtotal+gourmetsubtotal;
  System.out.println(subtotalofvegpza);
}
@When("User Select the BEVERAGES as Pepsi475ml and the below quantity")
public void userSelectTheBEVERAGESAsPepsi475mlAndTheBelowQuantity(DataTable dataTable) {
	jsclick(pepsibevarage_pom.getBeverages());
	jsclick(pepsibevarage_pom.getCartpepsi());
	//jsclick(pom_class.getNothanksbtn());
	int incrm = 12;
    WebElement qtyIncrmtpepsi = addcart_pom.getQtyIncrmtpepsi();
	for(int i=1;i<incrm;i++) {
		jsclick(qtyIncrmtpepsi);
		}
}
@Then("User Subtotal the Cart value of BEVERAGES with sum of \\(Each Product Value *Qty)")
public void userSubtotalTheCartValueOfBEVERAGESWithSumOfEachProductValueQty() {
   String priceofpepsi = pepsibevarage_pom.getTotalpepsi().getText();
   System.out.println(priceofpepsi);
   double double1 = Double.parseDouble(priceofpepsi);
   System.out.println(double1);

}
@When("User Removes the following product from the Cart")
public void userRemovesTheFollowingProductFromTheCart(DataTable dataTable) {
   jsclick(cartremove_pom.getDeletCart1());
   WebElement deletCartpepsi = cartremove_pom.getDeletCart4();
   int decrm=6;
   for(int i=0;i<decrm;i++) {
	   jsclick(deletCartpepsi);
   }
}
@Then("Subtotal the cart value with sum of \\(Each Product Value *Qty)")
public void subtotalTheCartValueWithSumOfEachProductValueQty() {
    String newtotalpriceofmargherita = cartremove_pom.getAfterRmvtotalmargherita().getText();
    System.out.println(newtotalpriceofmargherita);
    double margheritasubtotal = Double.parseDouble(newtotalpriceofmargherita);
    System.out.println(margheritasubtotal);
    String paneertotalprice = cartremove_pom.getAftRmvtotalpaneer().getText();
    System.out.println(paneertotalprice);
    double paneerprice = Double.parseDouble(paneertotalprice);
    System.out.println(paneerprice);
    String gourmetpzatotalprice = cartremove_pom.getAfterRmvtotalGourmetpizza().getText();
    System.out.println(gourmetpzatotalprice);
    double gourmetpzaprice = Double.parseDouble(gourmetpzatotalprice);
    System.out.println(gourmetpzaprice);
    String subtotalpriceofPepsi = cartremove_pom.getSubtotalPepsi().getText();
    System.out.println(subtotalpriceofPepsi);
    double pepsisubtotal = Double.parseDouble(subtotalpriceofPepsi);
    System.out.println(pepsisubtotal);
    double subtotalofall=margheritasubtotal+paneerprice+gourmetpzaprice+pepsisubtotal;
    System.out.println(subtotalofall);
}
@Then("User should get the Subtotal value of all Cart product and Click checkout")
public void userShouldGetTheSubtotalValueOfAllCartProductAndClickCheckout() {
  jsclick(checkout_pom.getCheckout());
  String prodtotalprice = checkout_pom.getProdsubtotal().getText();
  System.out.println(prodtotalprice);
  double prodprice = Double.parseDouble(prodtotalprice);
  System.out.println(prodprice);
  String grandprice = checkout_pom.getGrandtotal().getText();
  System.out.println(grandprice);
  double grandtotal = Double.parseDouble(grandprice);
  System.out.println(grandtotal);
  
}
@Then("Verify the Subtotal price with Place Order Price Details")
public void verifyTheSubtotalPriceWithPlaceOrderPriceDetails() {
    String text = checkout_pom.getPriceMargherita().getText();
    double margherita = Double.parseDouble(text);
    String text2 = checkout_pom.getPricepaneer().getText();
    double paneer = Double.parseDouble(text2);
    String text3 = checkout_pom.getPricegourmetpza().getText();
    double gourmetpza = Double.parseDouble(text3);
    String text4 = checkout_pom.getPricepepsi().getText();
    double pepsi = Double.parseDouble(text4);
    double subtotalvalue= margherita+paneer+gourmetpza+pepsi;
    String totalpriceofprod = checkout_pom.getProdsubtotal().getText();
    double prodtotalprice = Double.parseDouble(totalpriceofprod);
    Assert.assertEquals(subtotalvalue, prodtotalprice,2);
    
}

}







