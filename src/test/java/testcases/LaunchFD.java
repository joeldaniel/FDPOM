package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.Testbase;
import pages.Loginpage;
import utilities.Utilities;

public class LaunchFD extends Testbase {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void launchFD(Hashtable<String, String> data) throws Exception {
		test = extent.createTest("launchFD");
		Loginpage LP = new Loginpage();

		LP.logintoFD(data.get("username"), data.get("password"), data.get("servername"), data.get("sitename"));

		Thread.sleep(30000);

	}

}
