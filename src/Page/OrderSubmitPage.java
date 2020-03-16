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

public class OrderSubmitPage{
	String url="http://127.0.0.1/index.php?s=/index/buy/index.html";
	String title="ShopXO";

	@FindBy(linkText="快递邮寄")
	public WebElement selectExpress;
	
	@FindBy(linkText="自提点取货")
	public WebElement selectPickup;
	
	@FindBy(xpath="//button[text()='使用新地址']")
	public WebElement buttonNewAddress;
	
	@FindBy(xpath="//iframe[contains(@src,'/index/useraddress/saveinfo')]")
	public WebElement iFrame;
	
	@FindBy(xpath="/html/body/div[1]/form/div[1]/input")
	public WebElement inputName;
	
	@FindBy(name="tel")
	public WebElement inputPhone;
	
	@FindBy(xpath="/html/body/div[1]/form/div[3]/div[1]/a/div")
	public WebElement clickProvince;
	
	@FindBy(xpath="/html/body/div[1]/form/div[3]/div[1]/div/div/input")
	public WebElement inputProvince;

	@FindBy(xpath="/html/body/div[1]/form/div[3]/div[2]/a/div")
	public WebElement clickCity;
	
	@FindBy(xpath="/html/body/div[1]/form/div[3]/div[2]/div/div/input")
	public WebElement inputCity;
	
	@FindBy(css="html.js.cssanimations body div.am-g.my-content form.am-form.form-validation div.am-form-group.region-linkage.am-form-error div.chosen-container.chosen-container-single.am-radius.chosen-select a.chosen-single.chosen-default div")
	public WebElement clickCounty;
	
	@FindBy(xpath="/html/body/div[1]/form/div[3]/div[3]/div/div/input")
	public WebElement inputCounty;
	
	@FindBy(id="form-address")
	public WebElement inputFormAddress;
	
	@FindBy(name="alias")
	public WebElement inputAlias;
	
	@FindBy(name="is_default")
	public WebElement inputIsDefault;
	
	@FindBy(xpath="//button[text()='保存']")
	public WebElement buttonSave;
	
	@FindBy(xpath="//span[@class='am-close']")
	public WebElement buttonCanncelNewAddress;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/ul/li[1]/div[3]/a[1]")
	public WebElement linkSetDefault;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/ul/li[1]/div[3]/a[2]")
	public WebElement linkEditAddress;
	
	@FindBy(linkText=" 删除")
	public WebElement linkDeleteAddress;
	
	@FindBy(xpath="//a[text=' 删除']/../..")
	public WebElement checkAddress;
	
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
	
	@FindBy(xpath="//button[text()='选择取货地址']")
	public WebElement buttonSelectAddress;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div[3]/div/div[2]/ul/li/button")
	public WebElement buttonSelectSite;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div[3]/div/div[2]/ul/li/p[2]/a")
	public WebElement buttonCheckMap;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div[3]/div/div[2]/div/div[1]/button")
	public WebElement buttonCloseMap;
	
	@FindBy(xpath="//span[@class='am-close']")
	public WebElement buttonCloseSite;
	
	@FindBy(xpath="//ul[@class='payment-list']/li[1]")
	public WebElement selectPayCash;
	
	@FindBy(xpath="//ul[@class='payment-list']/li[3]")
	public WebElement selectPayZFB;
	
	@FindBy(xpath="//ul[@class='payment-list']/li[4]")
	public WebElement selectPayWX;
	
	@FindBy(xpath="//ul[@class='payment-list']/li[2]")
	public WebElement selectPayHDFK;
	
	@FindBy(xpath="//div[@class='goods-detail']/a")
	public WebElement linkGoods;
	
	@FindBy(className="memo-input")
	public WebElement inputMessage;
	
	@FindBy(xpath="//button[text()='提交订单']")
	public WebElement buttonSubmitOrder;
	
	@FindBy(xpath="/html/body/div[4]/div/div/a[2]")
	public WebElement buttonMyOrder;

}
