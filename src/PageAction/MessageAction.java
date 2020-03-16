package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.BrowsePage;
import Page.MessagePage;
import utils.Log;

public class MessageAction extends LoadableComponent{
	private BasePage page;
	private MessagePage mPage;
	String url="http://127.0.0.1/index.php?s=/index/message/index.html";
	String title="�ҵ���Ϣ - ShopXO";
	
	public MessageAction(BasePage page){
		this.page=page;
		this.mPage=PageFactory.initElements(page.getDriver(), MessagePage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//��ȡurl
	public String getUrl() {
		return url;
	}
	
	//�����������ݲ��������
	public void search(String text) throws InterruptedException {
		page.type(mPage.inputSearch, text);
		page.click(mPage.buttonSearch);
		Log.info("���� ��"+text);
	}
	
	//����򿪸�����������
	public void clickOpenMoreCondition() throws InterruptedException {
		page.click(mPage.selectMoreCondition);
		Log.info("�򿪸�����������");
	}
	
	//������������Type
	public void inputConditionType(String text) throws InterruptedException {
		page.click(mPage.clickType);
		page.type(mPage.inputType, text);
		page.enterKey();
		Log.info("�������ͣ�"+text);
	}
	
	//������������Business
	public void inputConditionBusiness(String text) throws InterruptedException {
		page.click(mPage.clickTraffic);
		page.type(mPage.inputTraffic, text);
		page.enterKey();
		Log.info("����ҵ��"+text);
	}
	
	//������������Status
	public void inputConditionStatus(String text) throws InterruptedException {
		page.click(mPage.clickStatus);
		page.type(mPage.inputStatus, text);
		page.enterKey();
		Log.info("����״̬��"+text);
	}
	
	//���������������
	public void clickSearchCondition() throws InterruptedException {
		page.click(mPage.selectMoreCondition);
		Log.info("���������������");
	}	
	
	//����������
	public void clickCleanCondition() throws InterruptedException {
		page.click(mPage.buttonCleanCondition);
		Log.info("�������");
	}
	
	//����鿴��Ϣ����
	public void clickMessageDetail() throws InterruptedException {
		page.click(mPage.buttonMessageMore);
		Log.info("�鿴��Ϣ����");
	}
	
	//����ر���Ϣ����
	public void clickCloseMessageDetail() throws InterruptedException {
		page.click(mPage.buttonCloseDetail);
		Log.info("�ر���Ϣ����");
	}

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
