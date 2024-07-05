package Utilis;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver)
	{
		this.driver = driver;
	}

	public void SwitchWindowToChild()
	{
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();
		 String ParentWindow  = iterator.next();
	    String ChildWindow = iterator.next();
	    driver.switchTo().window(ChildWindow);
	}
	
	
}
