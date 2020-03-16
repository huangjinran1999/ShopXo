package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.Log;

public class SelectDriver {
	public WebDriver newWebDriver(String driverType) throws IOException {
		
		WebDriver wd = null;
		if(driverType.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
			wd = new FirefoxDriver();
			Log.info("Using Firefox");
		}else if(driverType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			wd = new ChromeDriver();
			Log.info("Using Chrome");
		}else {
			return null;
		}
		
		return wd;
	}
}
