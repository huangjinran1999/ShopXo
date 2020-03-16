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

public class SearchPage{
	
	String url="http://127.0.0.1/index.php?s=/index/search/index.html";
	String title="ÉÌÆ·ËÑË÷ - ShopXO";
	
	@FindBy(id="search-input")
	public WebElement inputSearch;
	
	@FindBy(id="ai-topsearch")
	public WebElement buttonSearch;
	
	@FindBy(xpath="/html/body/div[4]/div/div[1]/ul/li[2]/dl/div/dd[1]")
	public WebElement selectBrandAll;
	
	@FindBy(xpath="/html/body/div[4]/div/div[1]/ul/li[2]/dl/div/dd[2]")
	public WebElement selectBrandQS;
	
	@FindBy(xpath="/html/body/div[4]/div/div[1]/ul/li[2]/dl/div/dd[3]")
	public WebElement selectBrandJJS;
	
	@FindBy(xpath="/html/body/div[4]/div/div[1]/ul/li[3]/dl/div/dd[1]")
	public WebElement selectSortAll;
	
	@FindBy(xpath="/html/body/div[4]/div/div[1]/ul/li[3]/dl/div/dd[2]")
	public WebElement selectSortSMBG;
	
	@FindBy(xpath="/html/body/div[4]/div/div[1]/ul/li[3]/dl/div/dd[3]")
	public WebElement selectSortFSXB;
	
	@FindBy(xpath="/html/body/div[4]/div/div[1]/ul/li[3]/dl/div/dd[4]")
	public WebElement selectSortSPYL;
	
	@FindBy(xpath="/html/body/div[4]/div/div[1]/ul/li[4]/dl/div/dd[1]")
	public WebElement selectPriceAll;
	
	@FindBy(xpath="/html/body/div[4]/div/div[1]/ul/li[4]/dl/div/dd[2]")
	public WebElement selectPrice100;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/ul/li[1]/a")
	public WebElement buttonAll;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/ul/li[2]/a")
	public WebElement buttonSales;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/ul/li[3]/a")
	public WebElement buttonPrices;
	
	@FindBy(xpath="/html/body/div[4]/div/ul/li[1]/div")
	public WebElement linkGoods2;
	
	@FindBy(xpath="/html/body/div[4]/div/ul/li[2]/div")
	public WebElement linkGoods1;

}
