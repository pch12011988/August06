package mydemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MYTest extends MyBase {
	// public static WebDriver driver;

	@Test(priority = 1,groups="Regression")
	public void verifyURL() {
		String actual_URL = driver.getCurrentUrl();
		System.out.println("My Curent URL is:" + actual_URL);
		String expected_URL = "file:///D:/Selenium%20Setup/Offline%20Website%20_%20new/index.html";
		AssertJUnit.assertEquals(actual_URL, expected_URL);
		System.out.println("Test case one with thread ID :" + Thread.currentThread().getId());
		log.info("URL Verfied");
		System.out.println("**********************");
		
	}

	@Test(priority = 2,groups="Regression")
	public void verifyApplicationTitle() {
		String actual_title = driver.getTitle(); 
		System.out.println("ApplicationTitle is" + actual_title);
		String expected_title = "AdminLTE 2 | Log in";
		AssertJUnit.assertEquals(actual_title, expected_title);
		System.out.println("Test case two with thread ID:" + Thread.currentThread().getId());
		log.info("Application Title Verfied");
		System.out.println("**********************");
	}

	@Test(priority = 3,groups="Regression")
	public void verifyTitle() {
		String aTitle = driver.findElement(By.xpath("//a[@href='index2.html']")).getText();
		System.out.println("Login Page Title is:" + aTitle);
		String eTitle = "AdminLTE";
		AssertJUnit.assertEquals(aTitle, eTitle);
		System.out.println("Test case three with thread ID:" + Thread.currentThread().getId());
		log.info("Title Verfied");
		System.out.println("**********************");

	}

	@Test(priority = 4,groups="Regression")
	public void loginSession() {
		driver.findElement(By.xpath("//p[contains(text(),'Sign in to start your session')]"));
		log.info("Sign in to Start your Session");
		System.out.println("**********************");

	}

	@Test(priority = 5,groups="Regression")
	public void placeHolders() {
		String str = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("placeholder");
		String exp = "Email";
		AssertJUnit.assertEquals(str, exp);
		System.out.println("Place Holder E Verified");
		String str1 = driver.findElement(By.xpath("//input[@id='password']")).getAttribute("placeholder");
		String exp1 = "Password";
		AssertJUnit.assertEquals(str1, exp1);
		log.info("Place Holder P Verified");
		System.out.println("**********************");

	}

	@Test(priority = 6,groups="Regression")
	public void verifyButtonColor() {
		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
		System.out.println("before mouse hover button color is" + element.getCssValue("background-color"));

		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		log.info("after mouse hover button color is" + element.getCssValue("color"));

		System.out.println("**********************");
	}

	@Test(priority = 7,groups="Regression")
	public void checkLinks() {
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		for (WebElement link : li)
			System.out.println(link.getText());
		log.info("links are verified");
		System.out.println("**********************");

	}

	@Test(priority = 8,groups="Regression")
	public void blankEmailPassword() {
		WebElement stract = driver.findElement(By.xpath("//input[@type='text']"));
		stract.sendKeys("");
		String strexp = "kiran@gmail.com";
		Assert.assertNotEquals(stract, strexp);

		WebElement pasact = driver.findElement(By.xpath("//input[@type='password']"));
		pasact.sendKeys("");
		String pasExp = "123456";
		Assert.assertNotEquals(pasact, pasExp);

		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
		button.click();

		String Uname = driver.findElement(By.xpath("//div[contains(text(),'Please enter email.')]")).getText();
		System.out.println(Uname);

		String Password = driver.findElement(By.xpath("//div[contains(text(),'Please enter password.')]")).getText();
		System.out.println(Password);

		System.out.println("**********************");

	}

	@Test(priority = 9,groups="Regression")
	public void invalidEmailPassword() {
		WebElement stract = driver.findElement(By.xpath("//input[@type='text']"));
		stract.sendKeys("kira1n@gmail.com");
		String strexp = "kiran@gmail.com";
		Assert.assertNotEquals(stract, strexp);
		stract.clear();

		WebElement pasact = driver.findElement(By.xpath("//input[@type='password']"));
		pasact.sendKeys("12345");
		String pasExp = "123456";
		Assert.assertNotEquals(pasact, pasExp);
		pasact.clear();

		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
		button.click();

		// String Uname = driver.findElement(By.xpath("//div[contains(text(),'Please
		// enter email.')]")).getText();
		log.error("please enter the uname as kiran@gmail.com");

		// String Password = driver.findElement(By.xpath("//div[contains(text(),'Please
		// enter password.')]")).getText();
		log.error("please enter the password as 123456");

		System.out.println("**********************");

	}

	@Test(priority = 10,groups="Regression")
	public void validEmailPassword() {
		WebElement stract = driver.findElement(By.xpath("//input[@type='text']"));
		stract.sendKeys("kiran@gmail.com");

		WebElement pasact = driver.findElement(By.xpath("//input[@type='password']"));
		pasact.sendKeys("123456");

		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
		button.click();

		System.out.println("**********************");

	}

	@Test(priority = 11,groups="Smoke")
	public void verifyDashboardURL() {
		String dash = driver.getCurrentUrl();
		System.out.println("dashboard Url is" + dash);
		String expdash = "file:///D:/Selenium%20Setup/Offline%20Website%20_%20new/pages/examples/dashboard.html";
		Assert.assertEquals(dash, expdash);
		log.info("DashboardURL Verfied");
		System.out.println("**********************");
	}

	@Test(priority = 12,groups="Smoke")
	public void verifyDashboardTitle() {
		String dash = driver.getTitle();
		System.out.println("dashboard Title is" + dash);
		String expdash = "AdminLTE 2 | Dashboard";
		Assert.assertEquals(dash, expdash);
		log.info("DashboardTitle Verfied");
		System.out.println("**********************");
	}

	@Test(priority = 13,groups="Smoke")
	public void verifyDashboardHeading() {
		String dash = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
		System.out.println("dashboard Title is" + dash);

		String expdash = "Dashboard Control panel";
		Assert.assertEquals(dash, expdash);
		log.info("DashboardHeading verified");
		System.out.println("**********************");
	}

	@Test(priority = 14,groups="Smoke")
	public void verifyLogo() {
		WebElement img = driver.findElement(By.xpath("//img[@class='img-circle']"));
		Assert.assertTrue(false, "image is displayed:" + img.isDisplayed());
		System.out.println("size of image is:" + img.getSize());
		log.info("Logo Verfied");
		System.out.println("**********************");

	}

	@Test(priority = 15,groups="Unit")
	public void clickOnUsers() {
		WebElement element = driver.findElement(By.xpath("//a[@href='users.html']"));
		element.click();

		WebElement element1 = driver.findElement(By.xpath("//span[@class='label label-danger']//following::span[2]"));
		element1.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		log.info("clicked on Users");
		System.out.println("**********************");

	}

	@Test(priority = 16,groups="Unit")
	public void printUSERtable() throws InterruptedException {
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-hover']"));
		// List<WebElement> tr = driver.findElements(By.tagName("tr"));
		// System.out.println("no of rows in table are:" + tr.size());

		/*
		 * for (WebElement row : tr) { List<WebElement> td =
		 * driver.findElements(By.tagName("td")); for (WebElement col : td) {
		 * System.out.println(col.getText()); }
		 * System.out.println("**********************");
		 * 
		 * }
		 */
		for (WebElement tdata : driver.findElements(By.tagName("tr"))) {
			System.out.println("\t" + tdata.getText());
		}
		log.info("table printed");
	}

	@Test(priority = 17,groups="Unit")
	public void addUser() {

		WebElement element2 = driver
				.findElement(By.xpath("//button[@class='btn btn-block btn-primary btn-sm pull-right']"));
		element2.click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("prashant");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prashant@gmail.com");
		driver.findElement(By.xpath("//input[@id='Male']")).click();

		WebElement option1 = driver.findElement(By.xpath("//select[@class='form-control']"));

		Select s = new Select(option1);
		s.selectByIndex(2);
		// s.selectByValue(value);
		// s.selectByVisibleText(text);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pradiovi");

		driver.findElement(By.xpath("//button[@class='btn btn-info pull-right']")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
		log.info("user added successfully");
		System.out.println("**********************");
	}

	/*
	 * @Test(priority=18) public void printOPERATORtable() { WebElement table=
	 * driver.findElement(By.xpath("//table[@class='table table-hover']"));
	 * for(WebElement tdata: driver.findElements(By.tagName("tr"))){
	 * System.out.println("\t"+tdata.getText());
	 * 
	 * }
	 * 
	 * }
	 */

	@Test(priority = 19,groups="Unit")
	public void logOut() {
		driver.findElement(By.xpath("//a[@href='logout.html']")).click();
		System.out.println(driver.findElement(By.xpath("//p[@style='color:red;text-align:center;']")).getText());
		log.info("log out successfully");
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void setUpBrowser() throws Exception {
		initialization();
		log.info("initialization completed successfully");
	}

	@AfterSuite
	public void afterSuite() {
		driver.close();
	
	}

}
