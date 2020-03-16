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



public class LoginPage{
	String url="http://127.0.0.1/index.php?s=/index/user/logininfo.html";
	String title="�û���¼ - ShopXO";
	
	@FindBy(name="accounts")
	public WebElement inputUserName;
	
	@FindBy(name="pwd")
	public WebElement inputPassword;
	
	@FindBy(xpath="//button[text()='��¼']")
	public WebElement buttonSubmit;
	
	@FindBy(linkText="�������룿")
	public WebElement linkForgetPassword;
	
	@FindBy(linkText="ע��")
	public WebElement linkRegister;
	
	@FindBy(linkText="�˳�")
	public WebElement checkLogin;
}

