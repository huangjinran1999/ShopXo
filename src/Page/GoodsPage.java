package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;
import Base.DriverBase;


public class GoodsPage{

	
	@FindBy(xpath="//p[@class='goods-not-buy-tips']")
	public WebElement checkGoodsInventory;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div[1]/div/ul/li[1]")
	public WebElement selectGoodsImage;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div[1]/div/ul/li[2]")
	public WebElement selectGoodsImage2;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div[1]/div/ul/li[2]")
	public WebElement selectGoodsVideo;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div[1]/div/i[1]")
	public WebElement buttonPlayVideo;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div[1]/div/i[2]")
	public WebElement buttonCloseVideo;
	
	@FindBy(tagName="video")
	public WebElement video;
	
	@FindBys({
		@FindBy(xpath="//form[@Name='loginform']"),
		@FindBy(xpath="//li[contains(text(),'套餐一')]")
	})
	public WebElement selectPackage1;
	
	@FindBys({
		@FindBy(xpath="//form[@Name='loginform']"),
		@FindBy(xpath="//li[contains(text(),'套餐二')]")
	})
	public WebElement selectPackage2;
	
/*	@FindBys({
		@FindBy(xpath="//form[@Name='loginform']"),
		@FindBy(xpath="//li[contains(text(),'金色')]")
	})
*/
	@FindBy(xpath="/html/body/div[4]/div[2]/div[2]/div[2]/dl/dd/div[2]/div[3]/form/div[1]/div[2]/ul/li[1]")
	public WebElement selectColorGold;
	
/*	@FindBys({
		@FindBy(xpath="//form[@Name='loginform']"),
		@FindBy(xpath="//li[contains(text(),'银色')]")
	})
*/
	@FindBy(xpath="/html/body/div[4]/div[2]/div[2]/div[2]/dl/dd/div[2]/div[3]/form/div[1]/div[2]/ul/li[2]")
	public WebElement selectColorSilver;
	
	@FindBys({
		@FindBy(xpath="//form[@Name='loginform']"),
		@FindBy(xpath="//li[contains(text(),'32G')]")
	})
	public WebElement selectCapacity32;
	
	@FindBys({
		@FindBy(xpath="//form[@Name='loginform']"),
		@FindBy(xpath="//li[contains(text(),'64G')]")
	})
	public WebElement selectCapacity64;
	
	@FindBys({
		@FindBy(xpath="//form[@Name='loginform']"),
		@FindBy(xpath="//li[contains(text(),'128G')]")
	})
	public WebElement selectCapacity128;
	
	@FindBys({
		@FindBy(xpath="//form[@Name='loginform']"),
		@FindBy(xpath="//li[contains(text(),'粉色')]")
	})
	public WebElement selectColorPink;
	
	@FindBys({
		@FindBy(xpath="//form[@Name='loginform']"),
		@FindBy(xpath="//li[contains(text(),'白色')]")
	})
	public WebElement selectColorWhite;
	
	@FindBys({
		@FindBy(xpath="//form[@Name='loginform']"),
		@FindBy(xpath="//li[contains(text(),'黑色')]")
	})
	public WebElement selectColorBlack;
	
	@FindBys({
		@FindBy(xpath="//form[@Name='loginform']"),
		@FindBy(xpath="//li[contains(text(),'S')]")
	})
	public WebElement selectSizeS;
	
	@FindBys({
		@FindBy(xpath="//form[@Name='loginform']"),
		@FindBy(xpath="//li[contains(text(),'M')]")
	})
	public WebElement selectSizeM;
	
	@FindBys({
		@FindBy(xpath="//form[@Name='loginform']"),
		@FindBy(xpath="//li[contains(text(),'L')]")
	})
	public WebElement selectSizeL;
	
	@FindBys({
		@FindBy(xpath="//form[@Name='loginform']"),
		@FindBy(xpath="//li[contains(text(),'XL')]")
	})
	public WebElement selectSizeXL;

	@FindBy(id="text_box")
	public WebElement inputNumber;
	
	@FindBy(xpath="//div[@class='theme-options']/dd/span/span")
	public WebElement getAttributeInventory;
	
	@FindBy(xpath="//em[text()='收藏']")
	public WebElement buttonFavor;
	
	@FindBy(linkText="立即购买")
	public WebElement buttonBuy;
	
	@FindBy(xpath="//div[@class='buy-nav ']/div[3]/div/button")
	public WebElement buttonJoinCart;
	
	@FindBy(xpath="//div[@class='am-sticky-placeholder']/ul/li[1]")
	public WebElement selectDetail;
	
	@FindBy(xpath="//div[@class='am-sticky-placeholder']/ul/li[2]")
	public WebElement selectComments;
	
	@FindBy(xpath="//div[@class='am-sticky-placeholder']/ul/li[3]")
	public WebElement selectOtherGoods;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div[1]/div/ul/li[1]/div[1]/a")
	public WebElement linkOtherGoods;
	
	@FindBy(xpath="//iframe[@src='/index.php?s=/index/user/modallogininfo.html']")
	public WebElement iframe;
	
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
