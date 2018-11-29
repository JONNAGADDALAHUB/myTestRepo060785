package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class AbstractStepdefinitions {
	public static WebDriver driver;
	public static WebDriver getDriver() {
			System.setProperty("webdriver.gecko.driver", "C:/MyW10_Stuff/Softwares/geckodriver-v0.23.0-win64/geckodriver.exe");
			//FirefoxOptions options = new FirefoxOptions();
			//options.addArguments("--headless");
			//driver = new FirefoxDriver(options);
			//System.out.println("--------------headless mode is on----------");
			driver = new FirefoxDriver();
		return driver;
	}
}
