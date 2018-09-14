package mydemo;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MyBase {
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver eventdriver;
	public static Logger log = Logger.getLogger("MyTest");

	public MyBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("D:\\FREECRM\\SSS\\src\\myconfig\\Config.properties");
			prop.load(fis);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void initialization() {
		PropertyConfigurator.configure("log4j.properties");
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\chromedriver.exe ");
			driver = new ChromeDriver();
		} else if (browserName.equals("geckodriver")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium Setup\\geckodriver.exe ");
			driver = new FirefoxDriver();
		} else if (browserName.equals(" ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\Selenium Setup\\IEdriver.exe");
			driver = new InternetExplorerDriver();

		}
		log.info("New driver instantiated");

		eventdriver = new EventFiringWebDriver(driver);
		MyListener li = new MyListener();
		eventdriver.register(li);
		driver = eventdriver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info("Implicit wait applied on the driver for 10 seconds");

		driver.get(prop.getProperty("url"));
		log.info("Web application launched");

	}

}
