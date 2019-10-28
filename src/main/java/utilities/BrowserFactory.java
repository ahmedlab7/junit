package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.Base;

public class BrowserFactory extends Base { 

	
	static WebDriver driver;
	static WebElement element;

	public static WebDriver runChrome() {

		System.setProperty("webdriver.chrome.driver", "C:\\TechFiosDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 

		driver.get("http://techfios.com/test/101/");
		
		return driver;
	}
}
