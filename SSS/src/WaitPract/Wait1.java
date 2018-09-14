package WaitPract;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait1 {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/Selenium%20Setup/Offline%20Website%20_%20new/index.html");
		
		 WebDriverWait wait = new WebDriverWait(driver, 20);
	     
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("RP_Homepage.BuyNow_Btn")      ));
		

}
}
