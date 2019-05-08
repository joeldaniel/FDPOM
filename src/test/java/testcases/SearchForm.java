package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.Testbase;
import pages.Formspage;
import utilities.Utilities;

public class SearchForm extends Testbase {


	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void searchform(Hashtable<String, String> data) throws Exception {
		test = extent.createTest("searchform");

		Formspage FP = new Formspage();

			Thread.sleep(3000);
			FP.Searchform(data.get("form"));
			Thread.sleep(3000);





	}

}
