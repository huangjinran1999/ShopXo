package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.OrderDetailPage;
import Page.OrderManagePage;
import utils.Log;

public class OrderDetailAction extends LoadableComponent{
	private BasePage page;
	private OrderDetailPage oPage;
	String url="http://127.0.0.1/index.php?s=/index/order/detail/id/18.html";//18�ǿ��޸ĵĶ�����
	String title="ShopXO";
	
	public OrderDetailAction(BasePage page){
		this.page=page;
		this.oPage=PageFactory.initElements(page.getDriver(), OrderDetailPage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//��ȡurl
	public String getUrl() {
		return page.getUrl();
	}
	
	//�鿴����״̬
	public void checkOrderStatus() throws InterruptedException {
		String text=page.getElementAttribute(oPage.getTextOrderStatus, "text");
		Log.info("�鿴����״̬��"+text);
	}	
	
	//���������Ʒҳ��
	public void openGoodsPage() throws InterruptedException {
		page.click(oPage.linkGoods);
		Log.info("������Ʒҳ�棺"+page.getElementAttribute(oPage.linkGoods, "text"));
	}
	
	//�����������ҳ��
	public void openCommentPage() throws InterruptedException {
		page.click(oPage.buttonOrderComment);
		Log.info("��������ҳ��");
	}

	//���ɾ������
	public void clickDeleteOrder(String text) throws InterruptedException {
		page.click(oPage.buttonOrderDelete);
		Log.info("���ɾ������");
		if(text=="cancel") {
			page.click(oPage.buttonDeleteNo);
			Log.info("ȡ��ɾ������");
		}else if(text=="yes") {
			page.click(oPage.buttonDeleteYes);
			Log.info("ȷ��ɾ������");
		}else {
			Log.error("ɾ������ʧ��");
		}
	}
	
	//����鿴����
	public void clickOpenLogistics() throws InterruptedException {
		page.click(oPage.buttonOrderLogistics);
		Log.info("����鿴����");
	}
	
	//����ر���������
	public void clickCloseLogistics() throws InterruptedException {
		page.click(oPage.buttonCloseLogistics);
		Log.info("�ر���������");
	}
	
	//���ȡ������
	public void clickCancelOrder(String text) throws InterruptedException {
		page.click(oPage.buttonOrderCancel);
		Log.info("���ȡ������");
		if(text=="cancel") {
			page.click(oPage.buttonDeleteNo);
			Log.info("ȡ��ȡ������");
		}else if(text=="yes") {
			page.click(oPage.buttonDeleteYes);
			Log.info("ȷ��ȡ������");
		}else {
			Log.error("ȡ������ʧ��");
		}
	}

	//���֧������
	public void clickPayOrder() throws InterruptedException {
		page.click(oPage.buttonOrderPay);
		Log.info("���֧������");
	}
	
	//����ջ���ť
	public void clickOrderReceive(String text) throws InterruptedException {
		page.click(oPage.buttonOrderReceive);
		Log.info("����ջ���ť");
		if(text=="cancel") {
			page.click(oPage.buttonDeleteNo);
			Log.info("ȡ���ջ�");
		}else if(text=="yes") {
			page.click(oPage.buttonDeleteYes);
			Log.info("ȷ���ջ�");
		}else {
			Log.error("�ջ�ʧ��");
		}
	}	
	
	//ѡ��֧����ʽ
	public void selectPayWay(String text) throws InterruptedException {
		if(text=="�ֽ�֧��") {
			page.click(oPage.buttonPayCash);
		}else if(text=="֧����") {
			page.click(oPage.buttonPayZFB);
		}else if(text=="΢��") {
			page.click(oPage.buttonPayWX);
		}else if(text=="��������") {
			page.click(oPage.buttonPayHDFK);
		}else if(text=="QQ") {
			page.click(oPage.buttonPayQQ);
		}else {
			Log.info("֧����ʽ����");
		}
		Log.info("ѡ��֧����ʽ��"+text);
	}
	
	//���ȷ��֧������
	public void clickPay() throws InterruptedException {
		page.click(oPage.buttonPay);
	}

	//���ȡ��֧��
	public void clickCancelPay() throws InterruptedException {
		page.click(oPage.buttonCancelPay);
	}

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
