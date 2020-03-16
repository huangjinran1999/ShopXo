package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


import utils.Log;
import utils.ReadProperties;


//³õÊ¼»¯ä¯ÀÀÆ÷
public class DriverBase {
	public static WebDriver driver;
	public static  BasePage page;
	public String driverType;
	
	public WebDriver getDriver() {
        return driver;
    }
	
	public void open(String url) {
		driver.get(url);
	}

	
	@BeforeSuite
	public void doBeforeSuite() throws Exception {

		//driverType=ReadProperties.getPropertyValue("driverType");
		driverType="firefox";
		SelectDriver selectDriver=new SelectDriver();
		this.driver=selectDriver.newWebDriver(driverType);
		driver.manage().window().maximize();
		Log.info("´ò¿ªä¯ÀÀÆ÷£º"+driverType);
		page = new BasePage(driver);
	}

	@AfterSuite
	public void doAfterMethod() {
		if(this.driver != null){
			this.driver.quit();
			}
		Log.info("ÍË³öä¯ÀÀÆ÷");
	}

}
