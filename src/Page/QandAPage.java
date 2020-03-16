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


public class QandAPage{
	
	String url="http://127.0.0.1/index.php?s=/index/answer/index.html";
	String title="问答/留言 - ShopXO";

	@FindBy(xpath="/html/body/div[4]/div[1]/div/ul/li[4]/ul/li[6]")
	public WebElement selectQA;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div/div/input")
	public WebElement inputSearch;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div/div/span/button")
	public WebElement buttonSearch;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div/label")
	public WebElement selectMoreCondition;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[1]/div/a")
	public WebElement selectDisplay;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[1]/div/div/div/input")
	public WebElement inputDisplay;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[1]/div/div/ul/li[2]")
	public WebElement checkDisplayNo;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[1]/div/div/ul/li[3]")
	public WebElement checkDisplayYes;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[2]/div/a")
	public WebElement selectStatus;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[2]/div/div/div/input")
	public WebElement inputStatus;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[2]/div/div/ul/li[2]")
	public WebElement checkStatusNo;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[1]/td[2]/div/div/ul/li[3]")
	public WebElement checkStatusYes;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/table/tbody/tr[2]/td/button")
	public WebElement buttonConditionSearch;
	
	@FindBy(linkText="清除条件")
	public WebElement buttonCleanCondition;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div/table/tbody/tr/td[8]/span")
	public WebElement buttonMessageMore;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div/table/tbody/tr/td[8]/div/div/div[1]/span")
	public WebElement buttonCloseDetail;
	
	@FindBy(xpath="//button[text()=' 删除']")
	public WebElement buttonMessageDelete;

	@FindBy(xpath="//button[text()='保存']")
	public WebElement buttonSubmit;
	
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
