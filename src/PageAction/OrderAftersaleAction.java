package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.MessagePage;
import Page.OrderAftersalePage;
import utils.Log;

public class OrderAftersaleAction extends LoadableComponent{
	private BasePage page;
	private OrderAftersalePage oPage;
	String url="http://127.0.0.1/index.php?s=/index/orderaftersale/index.html";
	String title="�����ۺ� - ShopXO";
	
	public OrderAftersaleAction(BasePage page){
		this.page=page;
		this.oPage=PageFactory.initElements(page.getDriver(), OrderAftersalePage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//��ȡurl
	public String getUrl() {
		return url;
	}

	//��鶩���ۺ��Ѵ�
	public void checkBrowsePage() {
		if(page.isSelect(oPage.orderAfterSale)) {
			System.out.println("�����ۺ��Ѵ�");
		}else {
			Log.info("�����ۺ�δ��");
		}		
	}
	
	//�����ۺ󶩵�
	public void search(String text) throws InterruptedException {
		page.type(oPage.inputSearch, text);
		page.click(oPage.buttonSearch);
		Log.info("������"+text);
	}
	
	//����򿪸�������
	public void clickOpenMoreCondition() throws InterruptedException {
		page.click(oPage.selectMoreCondition);
		Log.info("�򿪸�������");
	}

	//������������Type
	public void inputConditionType(String text) throws InterruptedException {
		page.click(oPage.clickType);
		page.type(oPage.inputType, text);
		page.enterKey();
		Log.info("�������ͣ�"+text);
	}
	
	//������������Status
	public void inputConditionStatus(String text) throws InterruptedException {
		page.click(oPage.clickStatus);
		page.type(oPage.inputStatus, text);
		page.enterKey();
		Log.info("����״̬��"+text);
	}
	
	//������������Refund
	public void inputConditionRefund(String text) throws InterruptedException {
		page.click(oPage.clickTypeRefund);
		page.type(oPage.inputRefund, text);
		page.enterKey();
		Log.info("�����˿"+text);
	}
	
	//�����������
	public void clickConditionSearch() throws InterruptedException {
		page.click(oPage.buttonConditionSearch);
		Log.info("��������");
	}
	
	//����������
	public void clickCleanCondition() throws InterruptedException {
		page.click(oPage.buttonCleanCondition);
		Log.info("�������");
	}
	
	//�������Ʒ����
	public void clickOpenGoodsPage() throws InterruptedException {
		page.click(oPage.linkGoods);
		Log.info("����Ʒ��"+page.getElementAttribute(oPage.linkGoods, "text"));
	}
	
	//����鿴��������
	public void openOrderDetail() throws InterruptedException {
		page.click(oPage.buttonOrderDetail);
		Log.info("�鿴�ۺ�����");
	}
	
	//���ɾ������
	public void clickDeleteOrder(String text) throws InterruptedException {
		page.click(oPage.buttonOrderCanncel);
		Log.info("���ȡ���ۺ�");
		if(text=="cancel") {
			page.click(oPage.buttonDeleteNo);
			Log.info("ȡ��ɾ���ۺ�");
		}else if(text=="yes") {
			page.click(oPage.buttonDeleteYes);
			Log.info("ȷ��ɾ���ۺ�");
		}else {
			Log.error("ȡ���ۺ�ʧ��");
		}
	}	

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
