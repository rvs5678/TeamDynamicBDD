package stepDefinitions;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestBase {

	@Before
	public void openBrowser() {
		initialization();
	}
	
	@After
	public void closeBrowser() {
		tearDown();
	}
}
