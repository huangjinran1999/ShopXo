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
	String title="�û���¼ - ShopXO";
	
	public LoginAction(BasePage page){
		this.page=page;
		this.lPage=PageFactory.initElements(page.getDriver(), LoginPage.class);
	}

	public void load() {
		// TODO Auto-generated method stub
	}
	
	//��ȡurl
	public String getUrl() {
		return url;
	}
	
	//�������ע��ҳ��
	public void clickRegisterPage() throws InterruptedException {
		page.click(lPage.linkRegister);
		if(page.isTextExist("���Ѿ�ע�ᣬ���ھ�")) {
			Log.info("�������ע��ҳ��");
		}else {
			Log.error("����ע��ҳ��ʧ��");
		}
	}
	//�����˻�
	public void inputAccount(String text) throws InterruptedException {
		page.type(lPage.inputUserName, text);
		Log.info("�����˺ţ�"+text);
	}
	//��������
	public void inputPassword(String text) throws InterruptedException {
		page.type(lPage.inputPassword, text);
		Log.info("�������룺"+text);
	}
	//�����¼��ť
	public void clickLoginButton() throws InterruptedException {
		page.click(lPage.buttonSubmit);
		if(this.is_login()) {
			Log.info("��¼�ɹ�");
		}else {
			Log.error("��¼ʧ��");
		}
	}
	//��¼
	public void login(String name,String password) throws InterruptedException {
		this.inputAccount(name);
		this.inputPassword(password);
		this.clickLoginButton();
	}
	//�Ƿ��Ѿ���¼
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
