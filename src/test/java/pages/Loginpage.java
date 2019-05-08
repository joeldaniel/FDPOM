package pages;

import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;

import base.Testbase;
import utilities.GetFullPageScreenShot;

public class Loginpage extends Testbase {

	// public final By loginid = By.xpath("//div[@class='loginpage
	// ng-star-inserted']//div[1]//input[1]");
	public final By password = By.xpath("//input[@type='password']");
	public final By server = By.xpath("//div[3]//input[1]");
	public final By site = By.xpath("//div[@class='dot-rightpane']//div[4]//input[1]");
	public final By loginbtn = By.xpath("//span[@class='btn-label']");

	
	public void logintoFD(String user, String pass, String servername, String sitename) throws Exception {


		if (user != null && pass != null) {
			type("PB_loginid_xpath", user);
			test.log(Status.INFO, "username entered");
			Thread.sleep(30);
			driver.findElement(password).sendKeys(pass);
			test.log(Status.INFO, "password entered");
			Thread.sleep(30);

			driver.findElement(server).clear();
			driver.findElement(server).sendKeys(servername);
			test.log(Status.INFO, "servername entered");
			Thread.sleep(30);
			driver.findElement(site).clear();
			driver.findElement(site).sendKeys(sitename);
			test.log(Status.INFO, "sitename entered");
			Thread.sleep(30);
			driver.findElement(loginbtn).click();

			Thread.sleep(TIMEOUT);
			if (driver.getTitle().equalsIgnoreCase(Config.getProperty("TITLE"))) {
				test.log(Status.PASS, "Logged in sucessfully");
			}
			else {
				String screenShotPath = GetFullPageScreenShot.capture(driver, "logged in fail");
				test.log(Status.FAIL, "logged in fail: " + test.addScreenCaptureFromPath(screenShotPath));

			}

			//Assert.assertEquals(Config.getProperty("TITLE"), driver.getTitle());
		}

	}
}
