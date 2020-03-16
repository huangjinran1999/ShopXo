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

public class OrderManagePage{
	
	String url="http://127.0.0.1/index.php?s=/index/order/index.html";
	String title="我的订单 - ShopXO";

	@FindBy(xpath="/html/body/div[4]/div[1]/div/ul/li[2]/ul/li[1]")
	public WebElement orderAfterSale;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div/div/input")
	public WebElement inputSearch;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div/div/span/button")
	public WebElement buttonSearch;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div/label")
	public WebElement selectMoreCondition;
	
	@FindBy(name="time_start")
	public WebElement inputStartTime;
	
	@FindBy(name="time_end")
	public WebElement inputEndTime;
	
	@FindBy(name="price_start")
	public WebElement inputStartPrice;
	
	@FindBy(name="price_end")
	public WebElement inputEndPrice;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[1]/div/a")
	public WebElement clickPay;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[1]/div/div/div/input")
	public WebElement inputPay;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[1]/div/div/ul/li[2]")
	public WebElement checkPayZFB;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[1]/div/div/ul/li[3]")
	public WebElement checkPayCash;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[2]/div/a")
	public WebElement clickPayStatus;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[2]/div/div/div/input")
	public WebElement inputPayStatus;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[2]/div/div/ul/li[2]")
	public WebElement checkPayStatusWaitPay;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[2]/div/div/ul/li[3]")
	public WebElement checkPayStatusIsPay;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[2]/div/div/ul/li[4]")
	public WebElement checkPayStatusIsRefund;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td[2]/div/div/ul/li[5]")
	public WebElement checkPayStatusPartRefund;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[3]/td[1]/div/a")
	public WebElement clickOrderStatus;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[3]/td[1]/div/div/div/input")
	public WebElement inputOrderStatus;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[3]/td[1]/div/div/ul/li[2]")
	public WebElement checkOrderStatusWaitAffirm;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[3]/td[1]/div/div/ul/li[3]")
	public WebElement checkOrderStatusWaitPay;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[3]/td[1]/div/div/ul/li[4]")
	public WebElement checkOrderStatusWaitDeliver;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[3]/td[1]/div/div/ul/li[5]")
	public WebElement checkOrderStatusWaitReceive;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[3]/td[1]/div/div/ul/li[6]")
	public WebElement checkOrderStatusIsComplete;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[3]/td[1]/div/div/ul/li[7]")
	public WebElement checkOrderStatusIsCanncel;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[3]/td[1]/div/div/ul/li[8]")
	public WebElement checkOrderStatusIsClose;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[3]/td[2]/div/a")
	public WebElement clickCommentStatus;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[3]/td[2]/div/div/div/input")
	public WebElement inputCommentStatus;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[3]/td[2]/div/div/ul/li[2]")
	public WebElement checkCommentStatusWaitCritic;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[3]/td[2]/div/div/ul/li[3]")
	public WebElement checkCommentStatusIsCritic;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[4]/td/button")
	public WebElement buttonConditionSearch;
	
	@FindBy(linkText="清除条件")
	public WebElement buttonCleanCondition;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/table[1]/tbody/tr[2]/td[1]/div[1]/div/a")
	public WebElement linkGoods;
	
	@FindBy(partialLinkText="申请售后")
	public WebElement linkApplyAftersale;
	
	@FindBy(partialLinkText="退款/退货")
	public WebElement linkRefund;
	
	@FindBy(linkText="查看进度")
	public WebElement linkRefundPlan;
	
	@FindBy(xpath="//button[text()=' 删除']")
	public WebElement buttonOrderDelete;
	
	@FindBy(xpath="//button[text()=' 取消']")
	public WebElement buttonOrderCanncel;
	
	@FindBy(xpath="//button[text()=' 物流']")
	public WebElement buttonOrderLogistics;
	
	@FindBy(xpath="//span[@class='am-close']")
	public WebElement buttonCloseLogistics;
	
	@FindBy(xpath="//button[text()=' 收货']")
	public WebElement buttonOrderReceive;
	
	@FindBy(linkText=" 支付")
	public WebElement buttonOrderPay;
	
	@FindBy(partialLinkText="评论")
	public WebElement buttonOrderComment;
	
	@FindBy(linkText="订单详情")
	public WebElement linkGoodsDetail;
	
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
