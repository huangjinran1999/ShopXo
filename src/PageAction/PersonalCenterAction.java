package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.MessagePage;
import Page.OrderManagePage;
import Page.PersonalCenterPage;
import utils.Log;

public class PersonalCenterAction extends LoadableComponent{
	private BasePage page;
	private PersonalCenterPage pPage;
	String url="http://127.0.0.1/index.php?s=/index/user/index.html";
	String title="�û����� - ShopXO";
	
	public PersonalCenterAction(BasePage page){
		this.page=page;
		this.pPage=PageFactory.initElements(page.getDriver(), PersonalCenterPage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//��ȡurl
	public String getUrl() {
		return url;
	}
	
	//����򿪸�������ҳ��
	public void openPersonalCenter() throws InterruptedException{
		page.click(pPage.selectPersonalCenter);
		Log.info("�򿪸�������ҳ��");
	}
	
	//���ҵ�����ť
	public void clickBusinessManage() throws InterruptedException{
		page.click(pPage.selectBusinessManage);
		Log.info("���ҵ�����");
	}

	//����򿪶�������ҳ��
	public void openOrderManage() throws InterruptedException{
		page.click(pPage.selectOrderManage);
		Log.info("�򿪶�������ҳ��");
	}
	
	//����򿪶����ۺ�ҳ��
	public void openOrderAftersale() throws InterruptedException{
		page.click(pPage.selectOrderAfterSale);
		Log.info("�򿪶����ۺ�ҳ��");
	}
	
	//������ҵ��ղع���ҳ��
	public void openMyFavor() throws InterruptedException{
		page.click(pPage.selectMyFavor);
		Log.info("���ҵ��ղ�ҳ��");
	}

	//����Ʋ����İ�ť
	public void clickPropertyCenter() throws InterruptedException{
		page.click(pPage.selectPropertyCenter);
		Log.info("����Ʋ�����");
	}
	
	//������ҵĻ���ҳ��
	public void openMyIntegral() throws InterruptedException{
		page.click(pPage.selectMyIntegral);
		Log.info("���ҵĻ���ҳ��");
	}	
	
	//������Ϲ���ť
	public void clickDataManage() throws InterruptedException{
		page.click(pPage.selectDataManage);
		Log.info("������Ϲ���");
	}
	
	//����򿪸�������ҳ��
	public void openPersonalData() throws InterruptedException{
		page.click(pPage.selectPersonalData);
		Log.info("�򿪸�������ҳ��");
	}	
	
	//������ҵĵ�ַҳ��
	public void openMyAddress() throws InterruptedException{
		page.click(pPage.selectMyAddress);
		Log.info("���ҵĵ�ַҳ��");
	}
	
	//����򿪰�ȫ����ҳ��
	public void openSecuritySet() throws InterruptedException{
		page.click(pPage.selectSecuritySet);
		Log.info("�򿪰�ȫ����ҳ��");
	}	
	
	//������ҵ���Ϣҳ��
	public void openMyMessage() throws InterruptedException{
		page.click(pPage.selectMyMessage);
		Log.info("���ҵ���Ϣҳ��");
	}
	
	//������ҵ��㼣ҳ��
	public void openMyBrowse() throws InterruptedException{
		page.click(pPage.selectMyBrowse);
		Log.info("���ҵ��㼣ҳ��");
	}	
	
	//������ʴ�����ҳ��
	public void openQandA() throws InterruptedException{
		page.click(pPage.selectQA);
		Log.info("���ʴ�����ҳ��");
	}

	//�����ȫ�˳���ť
	public void clickLogout() throws InterruptedException{
		page.click(pPage.selectSafeLogout);
		Log.info("�����ȫ�˳�");
	}
	
	//����޸�ͷ��
	public void clickEditHead() throws InterruptedException{
		page.click(pPage.linkChangeHeadImage);
		Log.info("����޸�ͷ��");
	}
	
	//ѡ���ϴ�ͼƬ
	public void inputImage(String text) throws InterruptedException {
		page.type(pPage.inputImage,text);
		Log.info("ѡ���ϴ�ͼƬ��"+text);
	}
		
	//���ȷ��ͼƬ��ť
	public void submitImage() throws InterruptedException {
		page.click(pPage.buttonSubmitImage);
		Log.info("ȷ��ͼƬ");
	}
		
	//����ر��޸�ͼƬ��
	public void closeFrame() throws InterruptedException {
		page.click(pPage.buttonCloseFrame);
		Log.info("�ر��޸�ͼƬ��");
	}
	
	//�������������ҳ��
	public void openWaitPayOrderPage() throws InterruptedException {
		page.click(pPage.linkOrderWaitPay);
		Log.info("����������ҳ��");
	}
	
	//����������������ҳ��
	public void openWaitDeliverOrderPage() throws InterruptedException {
		page.click(pPage.linkOrderWaitDeliver);
		Log.info("�������������ҳ��");
	}
	
	//���������ջ�����ҳ��
	public void openWaitReceiveOrderPage() throws InterruptedException {
		page.click(pPage.linkOrderWaitReceive);
		Log.info("������ջ�����ҳ��");
	}
	
	//�����������۶���ҳ��
	public void openWaitCriticOrderPage() throws InterruptedException {
		page.click(pPage.linkOrderWaitCritic);
		Log.info("��������۶���ҳ��");
	}
	
	//��������ۺ󶩵�ҳ��
	public void openAftersaleOrderPage() throws InterruptedException {
		page.click(pPage.linkOrderAfterSale);
		Log.info("�����ۺ󶩵�ҳ��");
	}
	
	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
