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
	String title="�û�ע�� - ShopXO";
	
	public RegisterAction(BasePage page){
		this.page=page;
		this.rPage=PageFactory.initElements(page.getDriver(), RegisterPage.class);
	}
	
	//���������
	public void load() {}
	
	//��ȡurl
	public String getUrl() {
		Log.info("����ҳ��"+url);
		return url;
	}
	
	//��������¼ҳ��
	public void openLoginPage() throws InterruptedException {
		page.click(rPage.buttonLogin);
		Log.info("�����¼ҳ��");
	}
	
	//����˺�ע��
	public void clickAccountRegister() throws InterruptedException {
		page.click(rPage.selectAccountRegister);
		Log.info("����˺�ע��");
	}
	
	//����ֻ�ע��
	public void clickPhoneRegister() throws InterruptedException {
		page.click(rPage.selectPhoneRegister);
		Log.info("����ֻ�ע��");
	}
	
	//�������ע��
	public void clickEmailRegister() throws InterruptedException {
		page.click(rPage.selectEmailRegister);
		Log.info("�������ע��");
	}
	
	//�����û���
	public void inputUserName(String text) throws InterruptedException {
		page.type(rPage.inputName, text);
		Log.info("�����û�����"+text);
	}
	
	//��������
	public void inputPassword(String text) throws InterruptedException {
		page.type(rPage.inputPassword, text);
		Log.info("�������룺"+text);
	}
	
	//�����ѡЭ��
	public void clickAgreement() throws InterruptedException {
		page.click(rPage.selectAgreement);
		Log.info("�����ѡЭ��");
	}
	
	//�������Э��ҳ��
	public void openAgreement() throws InterruptedException {
		page.click(rPage.linkReadAgreement);
		Log.info("����Э��ҳ��");
	}
	
	//���ע�ᰴť
	public void submitRegister() throws InterruptedException {
		page.click(rPage.buttonSubmit);
		Log.info("���ע��");
	}
	
	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
