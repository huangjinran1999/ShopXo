package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.AddressPage;
import Page.LoginPage;
import utils.Log;

public class AddressAction extends LoadableComponent{
	private BasePage page;
	private AddressPage aPage;
	String url="http://127.0.0.1/index.php?s=/index/useraddress/index.html";
	String title="�ҵĵ�ַ - ShopXO";

	public AddressAction(BasePage page){
		this.page=page;
		this.aPage=PageFactory.initElements(page.getDriver(), AddressPage.class);
	}

	public void load() {
		// TODO Auto-generated method stub
	}
	
	//��ȡurl
	public String getUrl() {
		return url;
	}
	
	//����ҵĵ�ַ�Ѵ�
	public void checkAddressPage() {
		if(page.isSelect(aPage.myAddress)) {
			Log.info("�ҵĵ�ַҳ�� �Ѵ�");
		}else {
			Log.error("�ҵĵ�ַҳ�� δ��");
		}
	}
		
	//���������ַ
	public void clickNewAddress() throws InterruptedException {
		page.click(aPage.buttonNewAddress);
		if(page.isElementExist(aPage.buttonCanncelNewAddress)) {
			Log.info("���������ַ��ť");
		}else {
			Log.error("���������ַ��ťʧ��");
		}
	}
	
	//�������frame
	public void enterFrame() throws InterruptedException {
		page.enterFrame(aPage.iFrame);
		Log.info("����༭��ַiframe");
	}
		
	//��������
	public void inputName(String text) throws InterruptedException {
		page.type(aPage.inputName, text);
		Log.info("����������"+text);
	}
		
	//����绰
	public void inputPhone(String text) throws InterruptedException {
		page.type(aPage.inputPhone, text);
		Log.info("����绰��"+text);
	}
	
	//����ʡ
	public void inputProvince(String text) throws InterruptedException {
		page.click(aPage.clickProvince);
		page.type(aPage.inputProvince, text);
		page.enterKey();
		Log.info("����ʡ�ݣ�"+text);
	}
		
	//�������
	public void inputCity(String text) throws InterruptedException {
		page.click(aPage.clickCity);
		page.type(aPage.inputCity, text);
		page.enterKey();
		Log.info("������У�"+text);
	}
		
	//����������
	public void inputCounty(String text) throws InterruptedException {
		page.elementWait(aPage.clickCounty);
		page.click(aPage.clickCounty);
		Log.info("dianji");
		page.type(aPage.inputCounty, text);
		page.enterKey();
		Log.info("���������أ�"+text);
	}
		
	//������ϸ��ַ
	public void inputFormAddress(String text) throws InterruptedException {
		page.type(aPage.inputFormAddress, text);
		Log.info("������ϸ��ַ��"+text);
	}
		
	//�������
	public void inputAlias(String text) throws InterruptedException {
		page.type(aPage.inputAlias, text);
		Log.info("���������"+text);
	}
		
	//���Ĭ��
	public void clickAddressDefault() throws InterruptedException {
		page.click(aPage.inputIsDefault);
		Log.info("���ô˵�ַΪĬ�ϵ�ַ");
	}
		
	//���ȡ���༭��ַ
	public void clickExitEdit() throws InterruptedException {
		page.click(aPage.buttonCanncelNewAddress);
		Log.info("ȡ���༭��ַ");
	}
		
	//�������ַ��ΪĬ�ϣ����óɹ���
	public void clickdefault(String text) throws InterruptedException {
		page.click(aPage.buttonDefault);
		Log.info("������˵�ַ��ΪĬ��");
		if(text=="cancel") {
			page.click(aPage.buttonDeleteNo);
			Log.info("ȡ�����˵�ַ��ΪĬ��");
		}else if(text=="yes") {
			page.click(aPage.buttonDeleteYes);
			Log.info("ȷ�Ͻ��˵�ַ��ΪĬ��");
		}else {
			Log.error("��ַ��ΪĬ��ʧ��");
		}
	}
		
	//����༭��ַ
	public void clickEditAddress() throws InterruptedException {
		page.click(aPage.buttonEdit);
		if(page.isElementExist(aPage.buttonCanncelNewAddress)) {
			Log.info("����༭��ַ��ť");
		}else {
			Log.error("����༭��ַ��ťʧ��");
		}
	}
	
	//���ɾ����ַ
	public void clickDeleteAddress(String text) throws InterruptedException {
		page.click(aPage.buttonDelete);
		Log.info("���ɾ����ַ");
		if(text=="cancel") {
			page.click(aPage.buttonDeleteNo);
			Log.info("ȡ��ɾ���˵�ַ");
		}else if(text=="yes"){
			page.click(aPage.buttonDeleteYes);
			Log.info("ɾ����ַ�ɹ�");
		}else {
			Log.error("ɾ����ַʧ��");
		}
	}
	
	//�༭��ַ
	public void editAddress(String name,String phone,String province,String city,String county,String formAddress) throws InterruptedException {
		this.enterFrame();
		this.inputName(name);
		this.inputPhone(phone);
		this.inputProvince(province);
		this.inputCity(city);
		//this.inputCounty(county);
		this.inputFormAddress(formAddress);
		page.click(aPage.buttonSave);
		Log.info("��������ַ");
		page.leaveFrame();
		if(page.isTextExist(name)) {
			Log.info("��ַ�༭�ɹ�");
		}else {
			Log.error("��ַ�༭ʧ��");
		}
		assertTrue(page.isTextExist(name));
	}
	
	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}	

