package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.QandAPage;
import Page.RegisterPage;
import utils.Log;

public class RegisterAction extends LoadableComponent{
	private BasePage page;
	private RegisterPage rPage;
	String url="http://127.0.0.1/index.php?s=/index/user/reginfo.html";
	String title="用户注册 - ShopXO";
	
	public RegisterAction(BasePage page){
		this.page=page;
		this.rPage=PageFactory.initElements(page.getDriver(), RegisterPage.class);
	}
	
	//点击打开链接
	public void load() {}
	
	//获取url
	public String getUrl() {
		Log.info("打开网页："+url);
		return url;
	}
	
	//点击进入登录页面
	public void openLoginPage() throws InterruptedException {
		page.click(rPage.buttonLogin);
		Log.info("进入登录页面");
	}
	
	//点击账号注册
	public void clickAccountRegister() throws InterruptedException {
		page.click(rPage.selectAccountRegister);
		Log.info("点击账号注册");
	}
	
	//点击手机注册
	public void clickPhoneRegister() throws InterruptedException {
		page.click(rPage.selectPhoneRegister);
		Log.info("点击手机注册");
	}
	
	//点击邮箱注册
	public void clickEmailRegister() throws InterruptedException {
		page.click(rPage.selectEmailRegister);
		Log.info("点击邮箱注册");
	}
	
	//输入用户名
	public void inputUserName(String text) throws InterruptedException {
		page.type(rPage.inputName, text);
		Log.info("输入用户名："+text);
	}
	
	//输入密码
	public void inputPassword(String text) throws InterruptedException {
		page.type(rPage.inputPassword, text);
		Log.info("输入密码："+text);
	}
	
	//点击勾选协议
	public void clickAgreement() throws InterruptedException {
		page.click(rPage.selectAgreement);
		Log.info("点击勾选协议");
	}
	
	//点击进入协议页面
	public void openAgreement() throws InterruptedException {
		page.click(rPage.linkReadAgreement);
		Log.info("进入协议页面");
	}
	
	//点击注册按钮
	public void submitRegister() throws InterruptedException {
		page.click(rPage.buttonSubmit);
		Log.info("点击注册");
	}
	
	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
