package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.OrderAftersaleDetailPage;
import Page.OrderCommentPage;
import Page.OrderManagePage;
import utils.Log;

public class OrderManageAction extends LoadableComponent{
	private BasePage page;
	private OrderManagePage oPage;
	String url="http://127.0.0.1/index.php?s=/index/order/index.html";
	String title="�ҵĶ��� - ShopXO";
	
	public OrderManageAction(BasePage page){
		this.page=page;
		this.oPage=PageFactory.initElements(page.getDriver(), OrderManagePage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//��ȡurl
	public String getUrl() {
		return url;
	}
	

	//����������
	public void search(String text) throws InterruptedException {
		page.type(oPage.inputSearch, text);
		page.click(oPage.buttonSearch);
		Log.info("������"+text);
	}

	//����򿪸�������
	public void openMoreCondition() throws InterruptedException {
		page.click(oPage.selectMoreCondition);
		Log.info("�򿪸�������");
	}
	
	//��������StartTime
	public void inputStartTime(String year,String month,String day) throws InterruptedException {
		page.dataPick(oPage.inputStartTime, year, month, day);
		Log.info("������ʼʱ�䣺"+year+month+day);
	}
	
	//��������EndTime
	public void inputEndTime(String year,String month,String day) throws InterruptedException {
		page.dataPick(oPage.inputEndTime, year, month, day);
		Log.info("�������ʱ�䣺"+year+month+day);
	}
	
	//��������StartPrice
	public void inputStartPrice(String text) throws InterruptedException {
		page.type(oPage.inputStartPrice, text);
		Log.info("������С�۸�"+text);
	}

	//��������EndPrice
	public void inputEndPrice(String text) throws InterruptedException {
		page.type(oPage.inputEndPrice, text);
		Log.info("�������۸�"+text);
	}
	
	//��������Pay
	public void inputConditionPay(String text) throws InterruptedException {
		page.click(oPage.clickPay);
		page.type(oPage.inputPay, text);
		page.enterKey();
		Log.info("����֧����ʽ��"+text);
	}
	
	//��������PayStatus
	public void inputConditionPayStatus(String text) throws InterruptedException {
		page.click(oPage.clickPayStatus);
		page.type(oPage.inputPayStatus, text);
		page.enterKey();
		Log.info("���븶��״̬��"+text);
	}
	
	//��������Status
	public void inputOrderStatus(String text) throws InterruptedException {
		page.click(oPage.clickOrderStatus);
		page.type(oPage.inputOrderStatus, text);
		page.enterKey();
		Log.info("���붩��״̬��"+text);
	}
	
	//��������CommentStatus
	public void inputCommentStatus(String text) throws InterruptedException {
		page.click(oPage.clickCommentStatus);
		page.type(oPage.inputCommentStatus, text);
		page.enterKey();
		Log.info("��������״̬��"+text);
	}
	
	//�����������
	public void clickSearchCondition() throws InterruptedException {
		page.click(oPage.buttonConditionSearch);
		Log.info("�����������");
	}

	//����������
	public void clickCleanCondition() throws InterruptedException {
		page.click(oPage.buttonCleanCondition);
		Log.info("�������");
	}
	
	//������������ۺ�ҳ��
	public void clickApplyAftersale() throws InterruptedException {
		page.click(oPage.linkApplyAftersale);
		Log.info("���������ۺ�ҳ��");
	}
	
	//��������ۺ����ҳ��
	public void clickRefundPlan() throws InterruptedException {
		page.click(oPage.linkRefundPlan);
		Log.info("�����ۺ����ҳ��");
	}	
	
	//��������˻�/�˿�ҳ��
	public void clickApplyRefund() throws InterruptedException {
		page.click(oPage.linkRefund);
		Log.info("�����˻�/�˿�ҳ��");
	}
	
	//������붩������ҳ��
	public void openOrderDetail() throws InterruptedException {
		page.click(oPage.linkGoodsDetail);
		Log.info("���붩������ҳ��");
	}
	
	//������붩������ҳ��
	public void openOrderComment() throws InterruptedException {
		page.click(oPage.buttonOrderComment);
		Log.info("���붩������ҳ��");
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
	public void clickOrderLogistics() throws InterruptedException {
		page.click(oPage.buttonOrderLogistics);
		Log.info("�鿴��������");
	}
	
	//����ر���������
	public void closeOrderLogistics() throws InterruptedException {
		page.click(oPage.buttonCloseLogistics);
		Log.info("�ر���������");
	}
	
	//��������ջ�
	public void clickOrderReceive(String text) throws InterruptedException {
		page.click(oPage.buttonOrderReceive);
		Log.info("����ջ�");
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
		
	
	//���ȡ������
	public void clickCancelOrder(String text) throws InterruptedException {
		page.click(oPage.buttonOrderCanncel);
		Log.info("ȡ������");
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
	
	//������붩��֧��ҳ��
	public void clickOrderPay() throws InterruptedException {
		page.click(oPage.buttonOrderPay);
		Log.info("���붩��֧��ҳ��");
	}

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}

}
