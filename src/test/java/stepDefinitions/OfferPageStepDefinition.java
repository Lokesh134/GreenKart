package stepDefinitions;



import java.io.IOException;

import org.testng.Assert;

import Utilis.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;

public class OfferPageStepDefinition {
	 TestContextSetup setup;
	 public String offeredname;
	public OfferPageStepDefinition(TestContextSetup setup)
	{
		this.setup = setup;
	}
	
	@Then("^user searched for same shortname (.+) in offers page$")
	public void user_searched_for_same_shortname_in_offers_page(String Shortname) throws InterruptedException {
	
		SwitchToOffersPage();
	   //setup.driver.findElement(By.id("search-field")).sendKeys(Shortname);
		OffersPage offer = setup.objectManager.offerspage();
		offer.getSearchElement(Shortname);
	    Thread.sleep(2000);
	   // offeredname = setup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
	    offeredname = offer.getOfferedElement();
	    System.out.println(offeredname);		
	  
	}
	//Loose Coupling
	//single responsibility principle
	public void SwitchToOffersPage()
	{
		//if already switched to offer page-> skip below part
		//if (setup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"));
		//setup.driver.findElement(By.linkText("Top Deals")).click();
		LandingPage landingpage  = setup.objectManager.landingPage();
		landingpage.TopDeals();
		setup.genericUtils.SwitchWindowToChild();
		 
	}

	@And("validate product name in offers page matches with Landing Page")
	public void user_Offered_name_validated_with_Shortname() throws IOException {
	
	    Assert.assertEquals(setup.itemname, offeredname);
		System.out.println(offeredname + " Sucessfully validated"); 
		//setup.hooks.AfterScenario();
		
	}	


}
