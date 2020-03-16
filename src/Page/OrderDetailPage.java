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
	String url="http://127.0.0.1/index.php?s=/index/order/detail/id/18.html";//18�ǿ��޸ĵĶ�����
	String title="ShopXO";

	
	@FindBy(xpath="//div[@class='status']/p")
	public WebElement getTextOrderStatus;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div[1]/div[3]/table/tbody/tr/td[1]/div[1]/div/a")
	public WebElement linkGoods;
	
	@FindBy(xpath="//button[text()=' �ջ�']")
	public WebElement buttonOrderReceive;
	
	@FindBy(linkText=" ����")
	public WebElement buttonOrderComment;
	
	@FindBy(xpath="//button[text()=' ɾ��']")
	public WebElement buttonOrderDelete;
	
	@FindBy(xpath="//button[text()=' ����']")
	public WebElement buttonOrderLogistics;
	
	@FindBy(xpath="//button[text()=' ȡ��']")
	public WebElement buttonOrderCancel;

	@FindBy(xpath="//button[text()=' ֧��']")
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
	
	@FindBy(xpath="//button[text()='ȷ��֧��']")
	public WebElement buttonPay;
	
	@FindBy(xpath="//span[@class='am-close']")
	public WebElement buttonCancelPay;

	@FindBys({
	    @FindBy(className = "am-modal-dialog"),
	    @FindBy(xpath="//span[text()='ȡ��']")
	})
	public WebElement buttonDeleteNo;
	
	@FindBys({
	    @FindBy(className = "am-modal-dialog"),
	    @FindBy(xpath="//span[text()='ȷ��']")
	})
	public WebElement buttonDeleteYes;
	
	@FindBys({
	    @FindBy(id = "plugins-expressforkdn-popup"),
	    @FindBy(xpath="//span[@class='am-close']")
	})
	public WebElement buttonCloseLogistics;

}
