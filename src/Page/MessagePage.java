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


public class MessagePage{

	String url="http://127.0.0.1/index.php?s=/index/message/index.html";
	String title="我的消息 - ShopXO";

	@FindBy(xpath="/html/body/div[5]/div[1]/div/ul/li[4]/ul/li[4]")
	public WebElement myMessage;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div/div/input")
	public WebElement inputSearch;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div/div/span/button")
	public WebElement buttonSearch;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div/label")
	public WebElement selectMoreCondition;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[1]/div/a")
	public WebElement clickType;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[1]/div/div/div/input")
	public WebElement inputType;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[1]/div/div/ul/li[2]")
	public WebElement selectTypeDefault;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[2]/div/a")
	public WebElement clickTraffic;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[2]/div/div/div/input")
	public WebElement inputTraffic;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[2]/div/div/ul/li[3]")
	public WebElement checkTrafficOrder;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[2]/div/div/ul/li[4]")
	public WebElement checkTrafficRecharge;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[2]/div/div/ul/li[5]")
	public WebElement checkTrafficCash;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[1]/div/a")
	public WebElement clickStatus;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[1]/div/div/div/input")
	public WebElement inputStatus;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[1]/div/div/ul/li[2]")
	public WebElement checkStatusUnRead;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[1]/div/div/ul/li[3]")
	public WebElement checkStatusIsRead;

	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[2]/button")
	public WebElement buttonConditionSearch;
	
	@FindBy(linkText="清除条件")
	public WebElement buttonCleanCondition;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div/table/tbody/tr[1]/td[7]/span")
	public WebElement buttonMessageMore;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div/table/tbody/tr[1]/td[7]/div/div/div[1]/span")
	public WebElement buttonCloseDetail;

}
