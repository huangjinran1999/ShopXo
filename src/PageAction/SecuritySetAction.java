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
	String title="��ȫ���� - ShopXO";
	
	public SecuritySetAction(BasePage page){
		this.page=page;
		this.sPage=PageFactory.initElements(page.getDriver(), SecuritySetPage.class);
	}
	
	//���������
	public void load() {}
	
	//��ȡurl
	public String getUrl() {
		Log.info("����ҳ��"+url);
		return url;
	}
	
	//����޸����밴ť
	public void clickEditPassword() throws InterruptedException {
		page.click(sPage.buttonEditPassword);
		Log.info("����޸�����");
	}
	
	//����󶨵绰��ť
	public void clickBoundPhone() throws InterruptedException {
		page.click(sPage.buttonBoundPhone);
		Log.info("����󶨵绰");
	}
	
	//��������䰴ť
	public void clickBoundEmail() throws InterruptedException {
		page.click(sPage.buttonBoundEmail);
		Log.info("���������");
	}
	
	String iurl="http://127.0.0.1/index.php?s=/index/safety/loginpwdinfo.html";
	String ititle="��¼�����޸� - ��ȫ���� - ShopXO";
	
	//���������һ��ҳ��
	public void clickBackPage() throws InterruptedException {
		page.click(sPage.linkReturn);
		Log.info("���ذ�ȫ����");
	}
	
	//���뵱ǰ����
	public void inputCurrentPassword(String text) throws InterruptedException {
		page.type(sPage.inputPassword,text);
		Log.info("���뵱ǰ���룺"+text);
	}
	
	//����������
	public void inputNewPassword(String text) throws InterruptedException {
		page.type(sPage.inputNewPassword,text);
		Log.info("���������룺"+text);
	}
	
	//����ȷ������
	public void reputNewPassword(String text) throws InterruptedException {
		page.type(sPage.inputConfirmNewPassword,text);
		Log.info("�ٴ�ȷ�����룺"+text);
	}
	
	//�����������
	public void submitPassword() throws InterruptedException {
		page.click(sPage.buttonSubmit);
		Log.info("��������");
	}
	
	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}

}
