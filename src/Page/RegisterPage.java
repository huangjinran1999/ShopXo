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
	String title="�û�ע�� - ShopXO";

	@FindBy(xpath="//div[@class='register-top']/a")
	public WebElement buttonLogin;
	
	@FindBy(linkText="�˺�ע��")
	public WebElement selectAccountRegister;

	@FindBy(linkText="�ֻ�ע��")
	public WebElement selectPhoneRegister;

	@FindBy(linkText="����ע��")
	public WebElement selectEmailRegister;
	
	@FindBy(name="accounts")
	public WebElement inputName;
	
	@FindBy(name="pwd")
	public WebElement inputPassword;

	@FindBy(xpath="/html/body/div[4]/div/div/div/div[2]/div/div/div[1]/form/div[3]/label/span")
	public WebElement selectAgreement;
	
	@FindBy(linkText="������Э�顷")
	public WebElement linkReadAgreement;
	
	@FindBy(xpath="//button[text()='ע��']")
	public WebElement buttonSubmit;

}
