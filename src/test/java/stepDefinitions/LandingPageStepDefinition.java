package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import Utilis.TestContextSetup;
import io.cucumber.java.en.Given; 
import io.cucumber.java.en.When;
import pageObjects.LandingPage;

public class LandingPageStepDefinition {

	TestContextSetup setup;
	LandingPage page;
	public LandingPageStepDefinition(TestContextSetup setup)
	{
		this.page = setup.objectManager.landingPage();
		this.setup = setup;
	}
	
	@Given("User is on GreenCart Landing Page")
		public void user_is_on_green_cart_landing_page() throws IOException {
		    // setup.driver = new ChromeDriver();
        	//setup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		    // setup.testbase.WebDriverManager();
		    Assert.assertTrue(page.getTitleLandingPage().contains("GreenKart"));
        	System.out.println("I am on landing page");
		}
		@When("^user searched with Shortname (.+) and extracted actual name of product$")
		public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException 
			{  
			//LandingPage page = new LandingPage(setup.driver);
			//LandingPage page = setup.objectManager.landingPage();
			//if we write like above line code it only works on this method only 
			page.getsearchItem(shortName);
			
			//setup.driver.findElement(By.xpath("//input[@class='search-keyword']")).sendKeys(shortName);
			Thread.sleep(2000);
			setup.itemname = page.getProductName().split("-")[0].trim();
		     System.out.println(setup.itemname+" is the item name");
		       
		}
		
		//@When("And Added {String} items of the selected product to cart")
		public void Added_items_of_the_selected_product_to_cart(String name)
		{
			System.out.println();
		}
		
}

