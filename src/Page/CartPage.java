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

public class CartPage{

	String url="http://127.0.0.1/index.php?s=/index/cart/index.html";
	String title="购物车 - ShopXO";
	
	@FindBy(xpath="/html/body/div[2]/div/ul[2]/div[4]/div/a/span")
	public WebElement buttonTopCart;
	
	@FindBy(xpath="/html/body/div[9]/div/a")
	public WebElement buttonRightCart;
	
	@FindBy(xpath="/html/body/div[5]/table/tbody/tr[1]/td[1]/label/span/i[2]")
	public WebElement selectCartGoods;
	
	@FindBy(xpath="/html/body/div[5]/table/tbody/tr[1]/td[1]/div[1]/div/a")
	public WebElement linkGoods;
	
	@FindBy(xpath="/html/body/div[5]/table/tbody/tr[1]/td[3]/div/span[1]")
	public WebElement buttonMinGoods;
	
	@FindBy(xpath="/html/body/div[5]/table/tbody/tr[1]/td[3]/div/span[2]")
	public WebElement buttonAddGoods;
	
	@FindBy(xpath="/html/body/div[5]/table/tbody/tr[1]/td[3]/div/input")
	public WebElement inputGoodsNumber;
	
	@FindBy(xpath="//a[@class='submit-delete'andtext()='删除']")
	public WebElement buttonDeleteGoods;
	
	@FindBy(xpath="//a[@class='submit-delete'andtext()='删除']/../..")
	public WebElement checkGoods;
	
	@FindBy(className="am-ucheck-icons")
	public WebElement buttonCheckAll;
	
	@FindBy(linkText="清空")
	public WebElement buttonEmpty;
	
	@FindBy(xpath="/html/body/div[5]/div/div[2]/form/button")
	public WebElement buttonAccount;
	
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
