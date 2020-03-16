package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.CartPage;
import Page.OrderManagePage;
import Page.OrderSubmitPage;
import utils.Log;

public class OrderSubmitAction extends LoadableComponent{
	private BasePage page;
	private OrderSubmitPage oPage;
	String url="http://127.0.0.1/index.php?s=/index/buy/index.html";
	String title="ShopXO";
	
	public OrderSubmitAction(BasePage page){
		this.page=page;
		this.oPage=PageFactory.initElements(page.getDriver(), OrderSubmitPage.class);
	}
	
	//���������
	public void load() {
		page.open(url);
	}
	
	//���ѡ�����ʼ�
	public void selectExpress() throws InterruptedException {
		page.click(oPage.selectExpress);
		Log.info("ѡ�����ʼ�");
	}
	
	//���ѡ������
	public void selectPickUp() throws InterruptedException {
		page.click(oPage.selectPickup);
		Log.info("ѡ������ȡ��");
	}
	
	//����½���ַ
	public void clickNewAddress() throws InterruptedException {
		page.click(oPage.buttonNewAddress);
		if(page.isTextExist("������ַ")) {
			Log.info("��������ַ�ɹ�");
		}else {
			Log.error("��������ַʧ��");
		}
	}

	//�������frame
	public void enterFrame() throws InterruptedException {
		page.enterFrame(oPage.iFrame);
		Log.info("����༭��ַiframe");
	}
		
	//��������
	public void inputName(String text) throws InterruptedException {
		page.type(oPage.inputName, text);
		Log.info("����������"+text);
	}
		
	//����绰
	public void inputPhone(String text) throws InterruptedException {
		page.type(oPage.inputPhone, text);
		Log.info("����绰��"+text);
	}
	
	//����ʡ
	public void inputProvince(String text) throws InterruptedException {
		page.click(oPage.clickProvince);
		page.type(oPage.inputProvince, text);
		page.enterKey();
		Log.info("����ʡ�ݣ�"+text);
	}
		
	//�������
	public void inputCity(String text) throws InterruptedException {
		page.click(oPage.clickCity);
		page.type(oPage.inputCity, text);
		page.enterKey();
		Log.info("������У�"+text);
	}
		
	//����������
	public void inputCounty(String text) throws InterruptedException {
		page.click(oPage.clickCounty);
		page.type(oPage.inputCounty, text);
		page.enterKey();
		Log.info("���������أ�"+text);
	}
		
	//������ϸ��ַ
	public void inputFormAddress(String text) throws InterruptedException {
		page.type(oPage.inputFormAddress, text);
		Log.info("������ϸ��ַ��"+text);
	}
		
	//�������
	public void inputAlias(String text) throws InterruptedException {
		page.type(oPage.inputAlias, text);
		Log.info("���������"+text);
	}
		
	//���Ĭ��
	public void clickAddressDefault() throws InterruptedException {
		page.click(oPage.inputIsDefault);
		Log.info("���ô˵�ַΪĬ�ϵ�ַ");
	}
		
	//���ȡ���༭��ַ
	public void clickExitEdit() throws InterruptedException {
		page.click(oPage.buttonCanncelNewAddress);
		Log.info("ȡ���༭��ַ");
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
		page.click(oPage.buttonSave);
		Log.info("��������ַ");
		page.leaveFrame();
		if(page.isTextExist(name)) {
			Log.info("��ַ�༭�ɹ�");
		}else {
			Log.error("��ַ�༭ʧ��");
		}
		assertTrue(page.isTextExist(name));
	}
			
	//�������ַ��ΪĬ��
	public void clickdefault(String text) throws InterruptedException {
		page.click(oPage.linkSetDefault);
		Log.info("���˵�ַ��ΪĬ��");
		if(text=="cancel") {
			page.click(oPage.buttonDeleteNo);
			Log.info("ȡ�����˵�ַ��ΪĬ��");
		}else if(text=="yes") {
			page.click(oPage.buttonDeleteYes);
			Log.info("ȷ�Ͻ��˵�ַ��ΪĬ��");
		}else {
			Log.error("���˵�ַ��ΪĬ��ʧ��");
		}
	}
			
	//����༭��ַ
	public void clickEditAddress() throws InterruptedException {
		page.click(oPage.linkEditAddress);
		if(page.isTextExist("�༭��ַ")) {
			Log.info("�򿪱༭��ַ�ɹ�");
		}else {
			Log.error("�򿪱༭��ַʧ��");
		}
	}
		
	//���ɾ����ַ
	public void clickDeleteAddress(String text) throws InterruptedException {
		page.click(oPage.linkDeleteAddress);
		Log.info("���ɾ����ַ");
		if(text=="cancel") {
			page.click(oPage.buttonDeleteNo);
			Log.info("ȡ��ɾ����ַ");
		}else if(text=="yes") {
			page.click(oPage.buttonDeleteYes);
			Log.info("ȷ��ɾ����ַ");
		}else {
			Log.error("ɾ����ַʧ��");
		}
	}
	
	//���ɾ����ַ�ɹ�
	public boolean id_delete() {
		if(page.isElementExist(oPage.checkAddress)) {
			Log.error("ɾ����ַʧ��");
			return false;
		}else {
			Log.info("ɾ����ַ�ɹ�");
			return true;
		}
	}
	
	//���ѡ�������
	public void selectPickupSite() throws InterruptedException {
		page.click(oPage.buttonSelectAddress);
		Log.info("��ѡ�������ҳ��");
		page.click(oPage.buttonSelectSite);
		Log.info("ѡ�������");
	}
	
	//����ر������
	public void closePickupSite() throws InterruptedException {
		page.click(oPage.buttonCloseSite);
		Log.info("�ر������ҳ��");
	}
	
	//ѡ��֧����ʽ
	public void selectPayWay(String text) throws InterruptedException {
		if(text=="�ֽ�֧��") {
			page.click(oPage.selectPayCash);
			Log.info("ѡ��֧����ʽ��"+text);
		}else if(text=="֧����") {
			page.click(oPage.selectPayZFB);
			Log.info("ѡ��֧����ʽ��"+text);
		}else if(text=="΢��") {
			page.click(oPage.selectPayWX);
			Log.info("ѡ��֧����ʽ��"+text);
		}else if(text=="��������") {
			page.click(oPage.selectPayHDFK);
			Log.info("ѡ��֧����ʽ��"+text);
		}else {
			Log.error("֧����ʽ����");
		}
	}
	
	//���������Ʒҳ��
	public void openGoodsPage() throws InterruptedException {
		page.click(oPage.linkGoods);
	}
	
	//������������
	public void inputMessage(String text) throws InterruptedException {
		page.type(oPage.inputMessage, text);
	}
	
	//����ύ������ť
	public void submitOrder() throws InterruptedException {
		page.click(oPage.buttonSubmitOrder);
		Log.info("�ύ����");
	}
	
	//��������ҵĶ���
	public void openMyOrder() throws InterruptedException {
		page.click(oPage.buttonMyOrder);
		assertTrue(page.isTextExist("��Ʒ����"));
		Log.info("�����ҵĶ���");
	}

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}

}
