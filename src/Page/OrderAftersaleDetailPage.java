package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;
import Base.DriverBase;

public class OrderAftersaleDetailPage{
	
	String url="http://127.0.0.1/index.php?s=/index/orderaftersale/aftersale/oid/12/did/12.html";//18是可修改的订单号
	String title="ShopXO";

	@FindBy(xpath="//a[@class='goods-title']")
	public WebElement linkgoods;

	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/div[1]")
	public WebElement buttonOnlyRefund;
	
	@FindBy(xpath="//div[@class='am-cf aftersale-type']/div[2]")
	public WebElement buttonOnlyReturn;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[3]/div/form/div[1]/div/a")
	public WebElement clickRefundReason;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[3]/div/form/div[1]/div/div/div/input")
	public WebElement inputRefundReason;
	
	@FindBy(xpath="//input[@name='price']")
	public WebElement inputRefundPrice;
	
	@FindBy(xpath="//input[@name='number']")
	public WebElement inputRefundNumber;
	
	@FindBy(xpath="//textarea[@name='msg']")
	public WebElement inputRefundMessage;
	
	@FindBy(xpath="//div[text()='+上传图片']")
	public WebElement buttonUploadImage;
	
	@FindBy(id="edui3_iframe")
	public WebElement iFrame;
	
	@FindBy(xpath="//input[@name='file']")
	public WebElement inputUploadImage;
	
	@FindBy(xpath="//input[@name='file']")
	public WebElement buttonContinueAddImage;
	
	@FindBy(xpath="//div[text()='开始上传']")
	public WebElement buttonStartUpload;
	
	@FindBy(xpath="//span[@class='cancel']")
	public WebElement buttonCanncelImage;
	
	@FindBy(xpath="//div[text()='确认']")
	public WebElement buttonImageYes;
	
	@FindBy(xpath="//div[text()='取消']")
	public WebElement buttonImageNo;
	
	@FindBy(id="edui6_body")
	public WebElement buttonCloseFrame;
	
	@FindBy(xpath="//button[text()='提交']")
	public WebElement buttonSubmitRefund;
	
}
