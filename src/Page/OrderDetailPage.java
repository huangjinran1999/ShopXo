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

public class OrderDetailPage{
	String url="http://127.0.0.1/index.php?s=/index/order/detail/id/18.html";//18是可修改的订单号
	String title="ShopXO";

	
	@FindBy(xpath="//div[@class='status']/p")
	public WebElement getTextOrderStatus;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div[1]/div[3]/table/tbody/tr/td[1]/div[1]/div/a")
	public WebElement linkGoods;
	
	@FindBy(xpath="//button[text()=' 收货']")
	public WebElement buttonOrderReceive;
	
	@FindBy(linkText=" 评价")
	public WebElement buttonOrderComment;
	
	@FindBy(xpath="//button[text()=' 删除']")
	public WebElement buttonOrderDelete;
	
	@FindBy(xpath="//button[text()=' 物流']")
	public WebElement buttonOrderLogistics;
	
	@FindBy(xpath="//button[text()=' 取消']")
	public WebElement buttonOrderCancel;

	@FindBy(xpath="//button[text()=' 支付']")
	public WebElement buttonOrderPay;
	
	@FindBy(xpath="//ul[@class='payment-list']/li[1]")
	public WebElement buttonPayCash;
	
	@FindBy(xpath="//ul[@class='payment-list']/li[2]")
	public WebElement buttonPayZFB;

	@FindBy(xpath="//ul[@class='payment-list']/li[3]")
	public WebElement buttonPayWX;
	
	@FindBy(xpath="//ul[@class='payment-list']/li[4]")
	public WebElement buttonPayHDFK;
	
	@FindBy(xpath="//ul[@class='payment-list']/li[5]")
	public WebElement buttonPayQQ;
	
	@FindBy(xpath="//button[text()='确认支付']")
	public WebElement buttonPay;
	
	@FindBy(xpath="//span[@class='am-close']")
	public WebElement buttonCancelPay;

	@FindBys({
	    @FindBy(className = "am-modal-dialog"),
	    @FindBy(xpath="//span[text()='取消']")
	})
	public WebElement buttonDeleteNo;
	
	@FindBys({
	    @FindBy(className = "am-modal-dialog"),
	    @FindBy(xpath="//span[text()='确定']")
	})
	public WebElement buttonDeleteYes;
	
	@FindBys({
	    @FindBy(id = "plugins-expressforkdn-popup"),
	    @FindBy(xpath="//span[@class='am-close']")
	})
	public WebElement buttonCloseLogistics;

}
