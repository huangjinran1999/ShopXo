package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.OrderAftersaleDetailPage;
import Page.OrderDetailPage;
import Page.OrderManagePage;
import utils.Log;

public class OrderAftersaleDetailAction extends LoadableComponent{
	private BasePage page;
	private OrderAftersaleDetailPage oPage;
	String url="http://127.0.0.1/index.php?s=/index/orderaftersale/aftersale/oid/12/did/12.html";//18�ǿ��޸ĵĶ�����
	String title="ShopXO";
	
	public OrderAftersaleDetailAction(BasePage page){
		this.page=page;
		this.oPage=PageFactory.initElements(page.getDriver(), OrderAftersaleDetailPage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//��ȡurl
	public String getUrl() {
		return page.getUrl();
	}

	//�������Ʒҳ��
	public void openGoodsPage() throws InterruptedException {
		page.click(oPage.linkgoods);
		Log.info("����Ʒҳ�棺"+page.getElementAttribute(oPage.linkgoods, "text"));
	}
	
	//������˿�
	public void clickOnlyRefund() throws InterruptedException {
		page.click(oPage.buttonOnlyRefund);
		Log.info("���˿�");
	}
	
	//����˻�
	public void clickReturn() throws InterruptedException {
		page.click(oPage.buttonOnlyReturn);
		Log.info("�˻�");
	}
	
	//�����˿�/�˻�ԭ��
	public void inputRefundReason(String text) throws InterruptedException {
		page.click(oPage.clickRefundReason);
		page.type(oPage.inputRefundReason, text);
		page.enterKey();
		Log.info("�����˿�/�˻�ԭ��"+text);
	}
	
	//�����˿�/�˻�����
	public void inputRefundNumber(String text) throws InterruptedException {
		String smax=page.getElementAttribute(oPage.inputRefundNumber, "value");
		int max=Integer.parseInt(smax);
		int itext=Integer.parseInt(text);
		if(itext>=0&&itext<=max) {
			page.type(oPage.inputRefundNumber, text);
			Log.info("�����˿�/�˻�������"+text);
		}else{
			Log.info("�˿���������");
		}
		
	}
	
	//�����˿�/�˻����
	public void inputRefundPrice(String text) throws InterruptedException {
		String smax=page.getElementAttribute(oPage.inputRefundPrice, "value");
		int max=Integer.parseInt(smax);
		int itext=Integer.parseInt(text);
		if(itext>=0&&itext<=max) {
			page.type(oPage.inputRefundPrice, text);
			Log.info("�����˿�/�˻���"+text);
		}else{
			Log.info("�˿������");
		}
	}
	
	//�����˿�/�˻�˵��
	public void inputRefundMessage(String text) throws InterruptedException {
		page.type(oPage.inputRefundMessage, text);
		Log.info("�����˿�/�˻�˵����"+text);
	}
	
	//����ϴ�ͼƬ��ť
	public void clickUploadImage() throws InterruptedException {
		page.click(oPage.buttonUploadImage);
		Log.info("����ϴ�ͼƬ");
	}	
	
	//��λ���ϴ�ͼƬ��frame
	public void enterFrame() throws InterruptedException {
		page.enterFrame("edui3_iframe");
	}
		
	//�ϴ�ͼƬ
	public void inputUploadImage(String text) throws InterruptedException {
		page.type(oPage.inputUploadImage, text);
		Log.info("�ϴ�ͼƬ��"+text);
	}
		
	//��������ϴ�ͼƬ
	public void clickContinueAddImage(String text) throws InterruptedException {
		page.type(oPage.buttonContinueAddImage,text);
		Log.info("�ϴ�ͼƬ��"+text);
	}	
		
	//�����ʼ�ϴ�
	public void clickStartUpload() throws InterruptedException {
		page.click(oPage.buttonStartUpload);
		Log.info("�����ʼ�ϴ�");
	}	
		
	//����ر�frame
	public void clickCloseFrame() throws InterruptedException {
		page.click(oPage.buttonCloseFrame);
	}
		
	//���frameȷ��
	public void clickYesFrame() throws InterruptedException {
		page.click(oPage.buttonImageYes);
		Log.info("ȷ���ϴ�ͼƬ");
	}
		
	//���frameȡ��
	public void clickNoFrame() throws InterruptedException {
		page.click(oPage.buttonImageNo);
		Log.info("ȡ���ϴ�ͼƬ");
	}
		
	//����ύ�˻�/�˿�����
	public void clickSubmitApply() throws InterruptedException {
		page.click(oPage.buttonSubmitRefund);
		Log.info("�ύ�˻�/�˿�����");
	}	

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
