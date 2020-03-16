package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.SearchPage;
import Page.SecuritySetPage;
import utils.Log;

public class SecuritySetAction extends LoadableComponent{
	private BasePage page;
	private SecuritySetPage sPage;
	String url="http://127.0.0.1/index.php?s=/index/safety/index.html";
	String title="安全设置 - ShopXO";
	
	public SecuritySetAction(BasePage page){
		this.page=page;
		this.sPage=PageFactory.initElements(page.getDriver(), SecuritySetPage.class);
	}
	
	//点击打开链接
	public void load() {}
	
	//获取url
	public String getUrl() {
		Log.info("打开网页："+url);
		return url;
	}
	
	//点击修改密码按钮
	public void clickEditPassword() throws InterruptedException {
		page.click(sPage.buttonEditPassword);
		Log.info("点击修改密码");
	}
	
	//点击绑定电话按钮
	public void clickBoundPhone() throws InterruptedException {
		page.click(sPage.buttonBoundPhone);
		Log.info("点击绑定电话");
	}
	
	//点击绑定邮箱按钮
	public void clickBoundEmail() throws InterruptedException {
		page.click(sPage.buttonBoundEmail);
		Log.info("点击绑定邮箱");
	}
	
	String iurl="http://127.0.0.1/index.php?s=/index/safety/loginpwdinfo.html";
	String ititle="登录密码修改 - 安全设置 - ShopXO";
	
	//点击返回上一个页面
	public void clickBackPage() throws InterruptedException {
		page.click(sPage.linkReturn);
		Log.info("返回安全设置");
	}
	
	//输入当前密码
	public void inputCurrentPassword(String text) throws InterruptedException {
		page.type(sPage.inputPassword,text);
		Log.info("输入当前密码："+text);
	}
	
	//输入新密码
	public void inputNewPassword(String text) throws InterruptedException {
		page.type(sPage.inputNewPassword,text);
		Log.info("输入新密码："+text);
	}
	
	//输入确认密码
	public void reputNewPassword(String text) throws InterruptedException {
		page.type(sPage.inputConfirmNewPassword,text);
		Log.info("再次确认密码："+text);
	}
	
	//点击保存密码
	public void submitPassword() throws InterruptedException {
		page.click(sPage.buttonSubmit);
		Log.info("保存密码");
	}
	
	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}

}
