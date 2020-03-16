package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.OrderAftersalePage;
import Page.OrderCommentPage;
import utils.Log;

public class OrderCommentAction extends LoadableComponent{
	private BasePage page;
	private OrderCommentPage oPage;
	String url="http://127.0.0.1/index.php?s=/index/order/comments/id/18.html";//18�ǿ��޸ĵĶ�����
	String title="ShopXO";
	
	public OrderCommentAction(BasePage page){
		this.page=page;
		this.oPage=PageFactory.initElements(page.getDriver(), OrderCommentPage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//��ȡurl
	public String getUrl() {
		return page.getUrl();
	}
	
	//�������Ʒҳ��
	public void clickOpenGoodsPage() throws InterruptedException {
		page.click(oPage.linkGoods);
		Log.info("����Ʒҳ��");
	}

	//�����������
	public void clickCommentStart() throws InterruptedException {
		page.click(oPage.buttonStar);
		Log.info("�����Ǽ�");
	}
	
	//������������
	public void inputCommentBody(String text) throws InterruptedException {
		page.type(oPage.inputComment, text);
		Log.info("�����������ݣ�"+text);
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
		Log.info("�ر�frame");
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
	
	//���������ť
	public void clickAnonymity() throws InterruptedException {
		page.click(oPage.buttonIsAnonymity);
		Log.info("�����������");
	}
	
	//����ύ����
	public void submitComment() throws InterruptedException {
		page.click(oPage.buttonSubmitComment);
		Log.info("����ύ����");
	}	
	
	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}

}
