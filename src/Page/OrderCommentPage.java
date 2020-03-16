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

public class OrderCommentPage{
	
	String url="http://127.0.0.1/index.php?s=/index/order/comments/id/18.html";//18是可修改的订单号
	String title="ShopXO";

	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div[1]/table/tbody/tr/td[1]/div[1]/div/a")
	public WebElement linkGoods;
	
	@FindBy(xpath="//div[@class='rating-items']/ul/li[1]")
	public WebElement buttonStar;
	
	@FindBy(name="content[]")
	public WebElement inputComment;
	
	@FindBy(xpath="xpath=//div[Text()='+上传图片']")
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
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div[2]/div/div")
	public WebElement buttonIsAnonymity;
	
	@FindBy(xpath="//button[text()='提交']")
	public WebElement buttonSubmitComment;

}
