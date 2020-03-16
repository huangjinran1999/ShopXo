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



public class PersonalDataPage{
	
	String url="http://127.0.0.1/index.php?s=/index/personal/index.html";
	String title="个人资料 - ShopXO";
	
	@FindBy(xpath="//a[text()=' 编辑']")
	public WebElement linkEditData;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/dl/dd[1]/span/a")
	public WebElement linkEditHead;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/dl/dd[5]/span[2]/a")
	public WebElement linkEditPhone;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/dl/dd[6]/span[2]/a")
	public WebElement linkEditEmail;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div[2]/form/div[2]/button[1]")
	public WebElement buttonPlus;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div[2]/form/div[2]/button[2]")
	public WebElement buttonMinus;
	
	@FindBy(name="file")
	public WebElement inputImage;
	
	@FindBy(xpath="//button[text()='确认']")
	public WebElement buttonSubmitImage;
	
	@FindBy(xpath="//span[@class='am-close']")
	public WebElement buttonCloseFrame;
	
	String iurl="http://127.0.0.1/index.php?s=/index/personal/saveinfo.html";
	String ititle="个人资料编辑 - ShopXO";
	
	@FindBy(linkText=" 返回")
	public WebElement linkReturn;
	
	@FindBy(name="nickname")
	public WebElement inputNickName;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div[2]/div/label[1]/span")
	public WebElement selectGenderSecrecy;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div[2]/div/label[2]/span")
	public WebElement selectGenderWomen;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div[2]/div/label[3]/span")
	public WebElement selectGenderMan;
	
	@FindBy(name="birthday")
	public WebElement inputBirthday;
	
	@FindBy(xpath="//button[text()='保存']")
	public WebElement buttonSubmit;

}
