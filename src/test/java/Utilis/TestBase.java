package Utilis;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
	public WebDriver driver;
    public WebDriver WebDriverManager() throws IOException
    {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
    	Properties prop = new Properties();
    	prop.load(fis);
    	String url = prop.getProperty("QAurl");
    	String browser = prop.getProperty("Browser");
    	 
    	
    	if(driver == null) {
    		switch (browser)
    		{
    		
    		case "chrome":
    			 driver = new ChromeDriver();
    			 break;
    			 
    		case "firefox":
    			driver = new FirefoxDriver();
    			break;
    		case "edge":
    			driver = new EdgeDriver();
    			break;
    		
    		}
       
		driver.get(url);
		System.out.println("I am on landing page"); 
    	}
		 
		return driver;
	}

}
