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



public class RegisterPage{
	
	String url="http://127.0.0.1/index.php?s=/index/user/reginfo.html";
	String title="用户注册 - ShopXO";

	@FindBy(xpath="//div[@class='register-top']/a")
	public WebElement buttonLogin;
	
	@FindBy(linkText="账号注册")
	public WebElement selectAccountRegister;

	@FindBy(linkText="手机注册")
	public WebElement selectPhoneRegister;

	@FindBy(linkText="邮箱注册")
	public WebElement selectEmailRegister;
	
	@FindBy(name="accounts")
	public WebElement inputName;
	
	@FindBy(name="pwd")
	public WebElement inputPassword;

	@FindBy(xpath="/html/body/div[4]/div/div/div/div[2]/div/div/div[1]/form/div[3]/label/span")
	public WebElement selectAgreement;
	
	@FindBy(linkText="《服务协议》")
	public WebElement linkReadAgreement;
	
	@FindBy(xpath="//button[text()='注册']")
	public WebElement buttonSubmit;

}
