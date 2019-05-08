package pages;

import base.Testbase;

public class Formspage extends Testbase {

	public void Searchform(String formname) throws InterruptedException {
		type("EB_Typetosearchform_xpath", formname);
		Thread.sleep(1000);
		clicklink(formname);

	}
}
