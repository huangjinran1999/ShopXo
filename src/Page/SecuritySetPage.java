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



public class SecuritySetPage{
	
	String url="http://127.0.0.1/index.php?s=/index/safety/index.html";
	String title="安全设置 - ShopXO";

	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/section[1]/div/a")
	public WebElement buttonEditPassword;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/section[2]/div/a")
	public WebElement buttonBoundPhone;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/section[3]/div/a")
	public WebElement buttonBoundEmail;

	@FindBy(xpath="/html/body/div[4]/div/ul/li[2]/div")
	public WebElement linkGoods1;
	
	String iurl="http://127.0.0.1/index.php?s=/index/safety/loginpwdinfo.html";
	String ititle="登录密码修改 - 安全设置 - ShopXO";
	
	@FindBy(linkText=" 返回")
	public WebElement linkReturn;
	
	@FindBy(name="my_pwd")
	public WebElement inputPassword;
	
	@FindBy(name="new_pwd")
	public WebElement inputNewPassword;
	
	@FindBy(name="confirm_new_pwd")
	public WebElement inputConfirmNewPassword;
	
	@FindBy(xpath="//button[text()='保存']")
	public WebElement buttonSubmit;

}
