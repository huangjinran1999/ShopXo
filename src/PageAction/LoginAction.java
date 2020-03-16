package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;


import Base.BasePage;
import Base.DriverBase;
import Page.LoginPage;
import utils.Log;

public class LoginAction extends LoadableComponent{
	private BasePage page;
	private LoginPage lPage;
	String url="http://127.0.0.1/index.php?s=/index/user/logininfo.html";
	String title="用户登录 - ShopXO";
	
	public LoginAction(BasePage page){
		this.page=page;
		this.lPage=PageFactory.initElements(page.getDriver(), LoginPage.class);
	}

	public void load() {
		// TODO Auto-generated method stub
	}
	
	//获取url
	public String getUrl() {
		return url;
	}
	
	//点击进入注册页面
	public void clickRegisterPage() throws InterruptedException {
		page.click(lPage.linkRegister);
		if(page.isTextExist("我已经注册，现在就")) {
			Log.info("点击进入注册页面");
		}else {
			Log.error("进入注册页面失败");
		}
	}
	//输入账户
	public void inputAccount(String text) throws InterruptedException {
		page.type(lPage.inputUserName, text);
		Log.info("输入账号："+text);
	}
	//输入密码
	public void inputPassword(String text) throws InterruptedException {
		page.type(lPage.inputPassword, text);
		Log.info("输入密码："+text);
	}
	//点击登录按钮
	public void clickLoginButton() throws InterruptedException {
		page.click(lPage.buttonSubmit);
		if(this.is_login()) {
			Log.info("登录成功");
		}else {
			Log.error("登录失败");
		}
	}
	//登录
	public void login(String name,String password) throws InterruptedException {
		this.inputAccount(name);
		this.inputPassword(password);
		this.clickLoginButton();
	}
	//是否已经登录
	public boolean is_login(){
		return page.isElementExist(lPage.checkLogin);
	}

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	
	public void quit() {
		page.getDriver().quit();
	}

}
