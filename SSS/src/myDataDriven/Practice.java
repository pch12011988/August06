package myDataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Practice {

	public static void main(String[] args) {
		// 1. WebDriver driver= new WebDriver();

		WebDriver driver1 =new FirefoxDriver();
		// driver1.

		/*
		 * In the above statement, WebDriver is an interface. An interface contains
		 * empty methods that have been defined but not implemented. These methods can
		 * be implemented by anyone as long as the method type and signatures are not
		 * violated. Therefore, an interface is also known as contract, because you can
		 * use an interface as you like but you cannot change the way it has been
		 * defined. And, since it has empty methods you won't actually need to
		 * instantiate it and so you cannot instantiate it. FirefoxDriver is a class
		 * that has been written specifically for the Firefox browser. It has methods
		 * that are implemented and it can be instantiated. It can perform all functions
		 * (or methods) on the Firefox browser as defined in the interface WebDriver. So
		 * in the above statement, we are actually telling FirefoxDriver class that "hey
		 * you can automate the various methods that you want on the Firefox browser but
		 * you need to stick to the contract defined in WebDriver". So we declare a
		 * reference variable of type WebDriver and then use it to instantiate
		 * FirefoxDriver, which means that the object (driver) is of type WebDriver but
		 * points to the memory allocation to all data and methods in FirefoxDriver
		 * (and, as mentioned above, the FirefoxDriver class already has the implemented
		 * version of methods in WebDriver). So all good :) By using this technique, we
		 * have made it easy for the tester to use any browser of his or her liking.
		 */

		// RemoteWebDriver driver = new FirefoxDriver();
		// driver.get("http://www.google.com");
		
		
		
		WebDriver driver3=null;//null pointer exception
		driver3.get("http://www.google.com");
		System.out.println("1");
		//driver3.close();
		System.out.println("2");

//				WebDriver driver2 = new HtmlUnitDriver();
//
	//	driver2.get("http://www.google.com");
		//System.out.println("1");
		//driver2.close();
		//System.out.println("2");
		
		
	
		

	}

}
