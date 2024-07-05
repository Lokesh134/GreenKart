package stepDefinitions;

import java.io.IOException;

import Utilis.TestContextSetup;
import io.cucumber.java.After;

public class Hooks {
	TestContextSetup setup;
	public Hooks(TestContextSetup setup) {
		this.setup = setup;
	}

	@After
	public void AfterScenario() throws IOException
	{
		setup.testbase.WebDriverManager().quit();
		
		
	}






}
