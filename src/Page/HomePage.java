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

public class HomePage{

	String url="http://127.0.0.1/";
	String title="ShopXO";

	
	@FindBy(xpath="/html/body/div[2]/div/ul[1]/div/div/a[text()='登录']")
	public WebElement linkTopLogin;
	
	@FindBy(xpath="/html/body/div[2]/div/ul[1]/div/div/a[text()='注册']")
	public WebElement linkTopRegister;
	
	@FindBy(xpath="/html/body/div[2]/div/ul[1]/div/div/a[text()='退出']")
	public WebElement linkTopLogout;
	
	@FindBy(xpath="//div[@class='member-login']/a[text()='登录']")
	public WebElement linkLogin;
	
	@FindBy(xpath="//div[@class='member-login']/a[text()='注册']")
	public WebElement linkRegister;
	
	@FindBy(xpath="//img[@class='user-avatar']")
	public WebElement imgPerson;
	
	@FindBy(xpath="//a[@class='member-logout'and@text()='退出']")
	public WebElement linkLogout;
	
	@FindBy(xpath="/html/body/div[2]/div/ul[2]/div[1]")
	public WebElement linkPersonalCenter;
	
	@FindBy(xpath="/html/body/div[2]/div/ul[2]/div[2]/div/a")
	public WebElement linkMyShop;
	
	@FindBy(linkText="我的订单")
	public WebElement linkMyOrder;
	
	@FindBy(xpath="/html/body/div[2]/div/ul[2]/div[3]/div/a")
	public WebElement linkMyCollection;
	
	@FindBy(linkText="商品收藏")
	public WebElement linkGoodsColletion;
	
	@FindBy(xpath="/html/body/div[2]/div/ul[2]/div[4]")
	public WebElement linkTopCart;
	
	@FindBy(xpath="/html/body/div[2]/div/ul[2]/div[5]")
	public WebElement linkTopMessage;
	
	@FindBy(xpath="/html/body/div[11]/a[1]")
	public WebElement linkPerson;
	
	@FindBy(xpath="/html/body/div[11]/a[2]")
	public WebElement linkBrowse;
	
	@FindBy(xpath="/html/body/div[11]/a[3]")
	public WebElement linkFavor;
	
	@FindBy(xpath="//div[@class='cart-text']")
	public WebElement selectCart;
	
	@FindBy(xpath="/html/body/div[11]/div/div/div[1]/table/tbody/tr[2]/td[3]/a")
	public WebElement buttonDeleteCartGoods;
	
	@FindBy(xpath="/html/body/div[11]/div/div/div[2]/form/button")
	public WebElement buttonBuyCartGoods;
	
	@FindBy(xpath="//div[@class='base-nav answer-content']")
	public WebElement selectMessage;
	
	@FindBy(name="name")
	public WebElement inputMessageName;
	
	@FindBy(name="tel")
	public WebElement inputMessagePhone;
	
	@FindBy(name="content")
	public WebElement inputMessageBody;
	
	@FindBy(id="search-input")
	public WebElement inputSearch;
	
	@FindBy(id="ai-topsearch")
	public WebElement buttonSearch;
	
	@FindBy(xpath="/html/body/div[3]/div/div[3]/form/ul/li[1]")
	public WebElement linkHotSearch;
	
	@FindBy(className="all-goods")
	public WebElement linkCategory;
	
	@FindBy(xpath="//ul[@class='category-list']/li[1]")
	public WebElement selectSMBG;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div/ul/li[1]/div[2]/div/div/div/div/dl[1]/dt/a")
	public WebElement selectSortSJTX;//需要显示
	
	@FindBy(xpath="/html/body/div[5]/div/div/div/ul/li[1]/div[2]/div/div/div/div/dl[1]/dd[1]/a")
	public WebElement selectSortSJ;//需要显示
	
	@FindBy(xpath="/html/body/header/div/div/ul/li[1]")
	public WebElement selectHome;
	
	@FindBy(xpath="/html/body/header/div/div/ul/li[2]/a")
	public WebElement selectGoodsSort;
	
	@FindBy(xpath="/html/body/header/div/div/ul/li[2]/ul/li[1]")
	public WebElement selectSortCloth;
	
	@FindBys({
		@FindBy(className="mod-vip"),
		@FindBy(className="member-center"),
		@FindBy(xpath="//a[1]")
	})
	public WebElement linkWaitPayOrder;
	
	@FindBys({
		@FindBy(className="mod-vip"),
		@FindBy(className="member-center"),
		@FindBy(xpath="//a[2]")
	})
	public WebElement linkWaitDeliveryOrder;
	
	@FindBys({
		@FindBy(className="mod-vip"),
		@FindBy(className="member-center"),
		@FindBy(xpath="//a[3]")
	})
	public WebElement linkWaitReceiveOrder;
	
	@FindBys({
		@FindBy(className="mod-vip"),
		@FindBy(className="member-center"),
		@FindBy(xpath="//a[4]")
	})
	public WebElement linkWaitCommentOrder;
	
	@FindBy(xpath="//div[@class='word']/a[1]")
	public WebElement buttonSortPhone;
	
	@FindBys({
		@FindBy(id="floor1"),
		@FindBy(xpath="//div[@class='goods-list']/div[8]")
	})
	public WebElement linkGoods1;
	
	@FindBys({
		@FindBy(id="floor1"),
		@FindBy(xpath="//div[@class='goods-list']/div[7]")
	})
	public WebElement linkGoods2;
	
	@FindBys({
		@FindBy(id="floor1"),
		@FindBy(xpath="//div[@class='goods-list']/div[6]")
	})
	public WebElement linkGoods3;
	
	@FindBys({
		@FindBy(id="floor1"),
		@FindBy(xpath="//div[@class='goods-list']/div[5]")
	})
	public WebElement linkGoods4;
	
	@FindBys({
		@FindBy(id="floor1"),
		@FindBy(xpath="//div[@class='goods-list']/div[4]")
	})
	public WebElement linkGoods5;
	
	@FindBys({
		@FindBy(id="floor1"),
		@FindBy(xpath="//div[@class='goods-list']/div[3]")
	})
	public WebElement linkGoods6;
	
	@FindBys({
		@FindBy(id="floor1"),
		@FindBy(xpath="//div[@class='goods-list']/div[2]")
	})
	public WebElement linkGoods7;
	
	@FindBys({
		@FindBy(id="floor1"),
		@FindBy(xpath="//div[@class='goods-list']/div[1]")
	})
	public WebElement linkGoods8;
	
	@FindBys({
		@FindBy(id="floor2"),
		@FindBy(xpath="//div[@class='goods-list']/div[4]")
	})
	public WebElement linkGoods9;
	
	@FindBys({
		@FindBy(id="floor2"),
		@FindBy(xpath="//div[@class='goods-list']/div[3]")
	})
	public WebElement linkGoods10;
	
	@FindBys({
		@FindBy(id="floor2"),
		@FindBy(xpath="//div[@class='goods-list']/div[2]")
	})
	public WebElement linkGoods11;
	
	@FindBys({
		@FindBy(id="floor2"),
		@FindBy(xpath="//div[@class='goods-list']/div[1]")
	})
	public WebElement linkGoods12;
	
	
	@FindBy(linkText="立即注册")
	public WebElement linkFrameRegister;
	
	@FindBy(name="accounts")
	public WebElement inputUserName;
	
	@FindBy(name="pwd")
	public WebElement inputPassword;
	
	@FindBy(xpath="//button[text()='登录']")
	public WebElement buttonSubmit;
	
	@FindBy(xpath="//a[@class='am-fr'andtext()='忘记密码？']")
	public WebElement linkForgetPassword;

}
