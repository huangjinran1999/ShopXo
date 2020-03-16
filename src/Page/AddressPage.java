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



//我的地址页面：url=http://127.0.0.1/index.php?s=/index/useraddress/index.html
public class AddressPage{
	
	String url="http://127.0.0.1/index.php?s=/index/useraddress/index.html";
	String title="我的地址 - ShopXO";

	@FindBy(xpath="/html/body/div[4]/div[1]/div/ul/li[4]/ul/li[2]")
	public WebElement myAddress;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div/button")
	public WebElement buttonNewAddress;
	
	@FindBy(linkText=" 设为默认")
	public WebElement buttonDefault;
	
	@FindBy(linkText=" 编辑")
	public WebElement buttonEdit;
	
	@FindBy(linkText=" 删除")
	public WebElement buttonDelete;
	
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
	
	@FindBy(xpath="//iframe[@src='http://127.0.0.1/index.php?s=/index/useraddress/saveinfo.html']")
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
	
}

