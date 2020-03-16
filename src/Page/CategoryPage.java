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

public class CategoryPage{
	String url="http://127.0.0.1/index.php?s=/index/category/index.html";
	String title="商品分类 - ShopXO";

	
	@FindBy(xpath="//ul[@class='category-nav am-fl']/li[1]")
	public WebElement selectClassify1;
	
	@FindBy(xpath="/html/body/div[5]/div[1]/div[1]/div/div")
	public WebElement selectClassify2;
	
	@FindBy(xpath="/html/body/div[5]/div[1]/div[1]/ul/li[1]")
	public WebElement selectClassify3;

	@FindBy(xpath="/html/body/div[4]/div/ul/li[1]/div/a/div/p")
	public WebElement goods;
	
	@FindBy(xpath="//button[text()='立即购买']")
	public WebElement check;
}
