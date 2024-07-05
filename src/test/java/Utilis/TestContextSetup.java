package Utilis;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;
import stepDefinitions.Hooks;
 

public class TestContextSetup {

	 
	public  String itemname;
	public WebDriver driver;
    TestContextSetup setup;
    public PageObjectManager objectManager;
    public TestBase testbase;
    public GenericUtils genericUtils;
  
    public TestContextSetup( ) throws IOException {
    	testbase = new TestBase();
    	genericUtils = new GenericUtils(testbase.WebDriverManager());
    	objectManager = new PageObjectManager(testbase.WebDriverManager());
    }
}
