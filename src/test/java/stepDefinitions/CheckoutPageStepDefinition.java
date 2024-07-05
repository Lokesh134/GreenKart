package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import Utilis.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Checkout;
import pageObjects.LandingPage;

public class CheckoutPageStepDefinition {

	
	
	public Checkout checkoutpage;
	TestContextSetup setup;
	public CheckoutPageStepDefinition(TestContextSetup setup)
	{
		this.checkoutpage = setup.objectManager.Checkout();
		this.setup = setup;
	}
	
	
	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order()
	{
		//if we declare like this it only works on this method  
		//checkoutpage = setup.objectManager.Checkout();
		Assert.assertTrue(checkoutpage.VerifyPromoBtn());
		Assert.assertTrue(checkoutpage.VerifyplaceOrder()); 
		
	}
	
	@Then("^user proceed to checkout and validate the (.+) items in checkout page$")
	public void user_proceed_to_checkout_and_validate(String name)
	{
		checkoutpage.CheckoutItems();
	}
	
}

