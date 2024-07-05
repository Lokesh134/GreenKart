package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	
	private By searchField = By.id("search-field");
	private By offeredElement = By.cssSelector("tr td:nth-child(1)");
	 
	public WebDriver driver;
	
	public OffersPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void getSearchElement(String Shortname)
	{
		driver.findElement(searchField).sendKeys(Shortname);
	}
	
	
	public String getOfferedElement()
	{
		return driver.findElement(offeredElement).getText();
	}
	
	 
}
