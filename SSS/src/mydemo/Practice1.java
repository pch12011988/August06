package mydemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		//List<WebElement> col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		//System.out.println("no of columns are:" + col.size());
		//List<WebElement> row = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		//System.out.println("no of rows are:" + row.size());
		
		WebElement baseTable= driver.findElement(By.tagName("table"));
		//to find third row
		
		WebElement tRow= baseTable.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[3]"));
		System.out.println("third row data is"+tRow.getText());
		
		WebElement tCol= tRow.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[3]/td[2]"));
		System.out.println("third row second column data is"+tCol.getText());
		
		
		//driver.close();

	}

}
