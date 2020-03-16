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


public class BrowsePage{

	String url="http://127.0.0.1/index.php?s=/index/usergoodsbrowse/index.html";
	String title="我的足迹 - ShopXO";
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div/ul/li[4]/ul/li[5]")
	public WebElement myBrowse;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div/div/input")
	public WebElement inputSearch;
	
	@FindBy(xpath="//button[text()='搜索']")
	public WebElement buttonSearch;
	
	@FindBy(linkText="清空")
	public WebElement buttonEmpty;
	
	@FindBy(xpath="//tbody/tr[1]/td[1]/div/div")
	public WebElement goodsLink;
	
	@FindBy(xpath="//button[text()=' 删除']")
	public WebElement buttonDelete;
	
	@FindBy(xpath="//button[text()=' 删除']/../..")
	public WebElement checkgoods;
	
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
