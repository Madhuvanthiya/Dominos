Feature: Dominos Test Automation

Scenario: Add and Remove Products
Given User Click on Order Online now
And User Enter the Address and Pincode
When User add the VEG PIZZA with following product and the quantity
|Product|Quantity|
|Caprese Gourmet Pizza|2|
|Margherita|2|
|Peppy Paneer|2|
And User Subtotal the Cart value of VEG PIZZA with sum of (Each Product Value *Qty)
And User Select the BEVERAGES as Pepsi475ml and the below quantity
|Product|Quantity|
|Pepsi475ml|12|
And User Subtotal the Cart value of BEVERAGES with sum of (Each Product Value *Qty)
And User Removes the following product from the Cart
|Product|Quantity|
|Margherita|1|
|Pepsi 475ml|6|
And Subtotal the cart value with sum of (Each Product Value *Qty)
Then User should get the Subtotal value of all Cart product and Click checkout
And Verify the Subtotal price with Place Order Price Details


 