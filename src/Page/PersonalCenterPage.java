package Page;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;



public class PersonalCenterPage{
	
	String url="http://127.0.0.1/index.php?s=/index/user/index.html";
	String title="用户中心 - ShopXO";

	@FindBy(xpath="/html/body/div[5]/div[1]/div/ul/li[1]")
	public WebElement selectPersonalCenter;
	
	@FindBy(xpath="/html/body/div[5]/div[1]/div/ul/li[2]/a")
	public WebElement selectBusinessManage;
	
	@FindBy(xpath="//ul[@id='collapse-nav-business']/li[1]")
	public WebElement selectOrderManage;
	
	@FindBy(xpath="//ul[@id='collapse-nav-business']/li[2]")
	public WebElement selectOrderAfterSale;
	
	@FindBy(xpath="//ul[@id='collapse-nav-business']/li[3]")
	public WebElement selectMyFavor;
	
	@FindBy(xpath="/html/body/div[5]/div[1]/div/ul/li[3]/a")
	public WebElement selectPropertyCenter;
	
	@FindBy(xpath="//ul[@id='collapse-nav-property']/li")
	public WebElement selectMyIntegral;
	
	@FindBy(xpath="/html/body/div[5]/div[1]/div/ul/li[4]/a")
	public WebElement selectDataManage;
	
	@FindBy(xpath="//ul[@id='collapse-nav-base']/li[1]")
	public WebElement selectPersonalData;
	
	@FindBy(xpath="//ul[@id='collapse-nav-base']/li[2]")
	public WebElement selectMyAddress;
	
	@FindBy(xpath="//ul[@id='collapse-nav-base']/li[3]")
	public WebElement selectSecuritySet;
	
	@FindBy(xpath="//ul[@id='collapse-nav-base']/li[4]")
	public WebElement selectMyMessage;
	
	@FindBy(xpath="//ul[@id='collapse-nav-base']/li[5]")
	public WebElement selectMyBrowse;
	
	@FindBy(xpath="//ul[@id='collapse-nav-base']/li[6]")
	public WebElement selectQA;
	
	@FindBy(xpath="/html/body/div[5]/div[1]/div/ul/li[5]/a")
	public WebElement selectSafeLogout;
	
	@FindBy(className="am-icon-camera-retro")
	public WebElement linkChangeHeadImage;
	
	@FindBy(name="file")
	public WebElement inputImage;
	
	@FindBy(xpath="//button[text()='确认']")
	public WebElement buttonSubmitImage;
	
	@FindBy(xpath="//span[@class='am-close']")
	public WebElement buttonCloseFrame;
	
	@FindBy(className="am-icon-edit")
	public WebElement linkChangeData;
	
	@FindBy(className="am-icon-street-view")
	public WebElement linkChangeAddress;
	
	@FindBy(linkText=" 消息 ")
	public WebElement linkMessage;
	
	@FindBy(xpath="//ul[@class='user-base-icon']/li[1]/a")
	public WebElement linkAllOrder;
	
	@FindBy(xpath="//ul[@class='user-base-icon']/li[2]/a")
	public WebElement linkGoodsFavor;
	
	@FindBy(xpath="//ul[@class='user-base-icon']/li[3]/a")
	public WebElement linkMyBrowse;
	
	@FindBy(xpath="//ul[@class='user-base-icon']/li[4]/a")
	public WebElement linkMyIntegral;
	
	@FindBy(xpath="//div[@class='order-nav']/a")
	public WebElement linkMyOrder;
	
	@FindBy(xpath="//ul[@class='order-base']/li[1]/a")
	public WebElement linkOrderWaitPay;
	
	@FindBy(xpath="//ul[@class='order-base']/li[2]/a")
	public WebElement linkOrderWaitDeliver;
	
	@FindBy(xpath="//ul[@class='order-base']/li[3]/a")
	public WebElement linkOrderWaitReceive;
	
	@FindBy(xpath="//ul[@class='order-base']/li[4]/a")
	public WebElement linkOrderWaitCritic;
	
	@FindBy(xpath="//ul[@class='order-base']/li[5]/a")
	public WebElement linkOrderAfterSale;

}
