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


public class OrderAftersalePage{
	String url="http://127.0.0.1/index.php?s=/index/orderaftersale/index.html";
	String title="订单售后 - ShopXO";

	@FindBy(xpath="/html/body/div[4]/div[1]/div/ul/li[2]/ul/li[2]")
	public WebElement orderAfterSale;
	
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
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[1]/div/a")
	public WebElement clickTypeRefund;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[1]/div/div/div/input")
	public WebElement inputTypeReturn;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[2]/div/a")
	public WebElement clickStatus;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[2]/div/div/div/input")
	public WebElement inputStatus;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[2]/div/div/ul/li[2]")
	public WebElement checkStatusWaitConfirm;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[2]/div/div/ul/li[3]")
	public WebElement checkStatusWaitRerurn;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[2]/div/div/ul/li[4]")
	public WebElement checkStatusWaitAudit;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[2]/div/div/ul/li[5]")
	public WebElement checkStatusIsComplete;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[2]/div/div/ul/li[6]")
	public WebElement checkStatusIsRefuse;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[2]/div/div/ul/li[7]")
	public WebElement checkStatusIsCancel;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[1]/div/a")
	public WebElement selectRefund;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[1]/div/div/div/input")
	public WebElement inputRefund;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[1]/div/div/ul/li[2]")
	public WebElement checkRefundMbin;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[1]/div/div/ul/li[3]")
	public WebElement checkRefundWallet;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[1]/div/div/ul/li[4]")
	public WebElement checkRefundManual;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[2]/button")
	public WebElement buttonConditionSearch;
	
	@FindBy(linkText="清除条件")
	public WebElement buttonCleanCondition;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/table[1]/tbody/tr[2]/td[1]/div[1]/div/a")
	public WebElement linkGoods;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div/table/tbody/tr/td[6]/a")
	public WebElement buttonOrderDetail;
	
	@FindBy(xpath="//button[text()=' 取消']")
	public WebElement buttonOrderCanncel;
	
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

}
