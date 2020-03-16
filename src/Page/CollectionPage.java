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

public class CollectionPage{

	String url="http://127.0.0.1/index.php?s=/index/userfavor/goods.html";
	String title="我的收藏 - ShopXO";
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div/ul/li[2]/ul/li[3]")
	public WebElement myCollection;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div/div/input")
	public WebElement inputSearch;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div/div/span/button")
	public WebElement buttonSearch;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div/table/tbody/tr[1]/td[1]/div/div/a")
	public WebElement linkGoods;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div/table/tbody/tr/td[3]/button")
	public WebElement buttonCancel;
	
	@FindBy(xpath="//button[text()=' 取消']/../..")
	public WebElement checkCancel;
	
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
	
	@FindBy(xpath="/html/body/div[1]/div/ul[2]/div[3]/div/a/span")
	public WebElement buttonTopCollection;
	
	@FindBy(linkText="商品收藏")
	public WebElement buttonTopGoodsCollection;

}
