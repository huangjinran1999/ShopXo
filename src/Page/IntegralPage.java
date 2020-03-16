package Page;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;

//我的积分页面
public class IntegralPage{

	String url="http://127.0.0.1/index.php?s=/index/userintegral/index.html";
	String title="我的积分 - ShopXO";

	@FindBy(xpath="/html/body/div[4]/div[1]/div/ul/li[3]")
	public WebElement myIntegral;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div/div/input")
	public WebElement inputSearch;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div/div/span/button")
	public WebElement buttonSearch;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div/label")
	public WebElement selectMoreCondition;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr/td[1]/div/a")
	public WebElement clickType;
	
	@FindBy(xpath="//div[@class='chosen-search']/input")
	public WebElement inputType;
	
	@FindBy(xpath="//ul[@class='chosen-results']/li[2]")
	public WebElement checkTypeMin;
	
	@FindBy(xpath="//ul[@class='chosen-results']/li[3]")
	public WebElement checkTypeAdd;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr/td[2]/button")
	public WebElement buttonTypeSearch;
	
	@FindBy(linkText="清除条件")
	public WebElement buttonCleanCondition;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/table/tbody/tr[1]/td[6]/span")
	public WebElement buttonIntegralMore;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/table/tbody/tr[1]/td[6]/div/div/div[1]/span")
	public WebElement buttonCloseDetail;

}
