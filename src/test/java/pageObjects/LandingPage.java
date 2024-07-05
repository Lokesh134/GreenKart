package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
private By search = By.xpath("//input[@class='search-keyword']");
private By productName = By.cssSelector("h4.product-name");
private By deals = By.linkText("Top Deals");

public WebDriver driver;
public LandingPage(WebDriver driver)
{
	this.driver = driver;
}

public String getTitleLandingPage() {
	return driver.getTitle();
}

public void getsearchItem(String shortname)
{
	driver.findElement(search).sendKeys(shortname);
}


public String getProductName()
{
	return driver.findElement(productName).getText();
}

public void TopDeals()
{
	driver.findElement(deals).click();
}


}