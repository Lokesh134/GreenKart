package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
public LandingPage page;
public OffersPage offer;
public WebDriver driver;
public Checkout checkout;
 
 public PageObjectManager(WebDriver driver) {
	 
	 this.driver = driver;

 }

 public LandingPage landingPage()
 {
 	page = new LandingPage(driver);
 	return page;
 	
 }
 
 public OffersPage offerspage()
 {
	 offer = new OffersPage(driver);
	 return offer;
 }
 
 public Checkout Checkout()
 {
	 checkout = new Checkout(driver);
	return checkout;
	 
 }
 
 
}
