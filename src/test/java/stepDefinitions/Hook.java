package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import stepLibrary.GenericWrappers;

public class Hook extends GenericWrappers {

	@Before
	public void before(Scenario scenario) throws Exception {
		appiumStart();
		System.out.println("Get In To Invoke app");
		new GenericWrappers().initiateNativeAPP();
	}


	@After
	public void afterClass(Scenario scenario) throws Exception {
		if (scenario.isFailed()) {
			System.out.println("Scenario Failed...Taking screenshot....");
			takeScreenShotonFailure(scenario);
		}
		appiumStop();
	}

}