package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.IntegralPage;
import Page.PersonalDataPage;
import Page.QandAPage;
import utils.Log;

public class QandAAction extends LoadableComponent{
	private BasePage page;
	private QandAPage qPage;
	String url="http://127.0.0.1/index.php?s=/index/answer/index.html";
	String title="�ʴ�/���� - ShopXO";
	
	public QandAAction(BasePage page){
		this.page=page;
		this.qPage=PageFactory.initElements(page.getDriver(), QandAPage.class);
	}
	
	//���������
	public void load() {}
	
	//��ȡurl
	public String getUrl() {
		Log.info("����ҳ��"+url);
		return url;
	}
	
	//�����������ݲ��������
	public void search(String text) throws InterruptedException {
		page.type(qPage.inputSearch, text);
		page.click(qPage.buttonSearch);
		Log.info("������"+text);
	}
	
	//����򿪸�������
	public void openMoreCondition() throws InterruptedException {
		page.click(qPage.selectMoreCondition);
		Log.info("�򿪸�������");
	}
	
	//��������Display
	public void inputConditionDisplay(String text) throws InterruptedException {
		page.click(qPage.selectDisplay);
		page.type(qPage.inputDisplay, text);
		page.enterKey();
		Log.info("������ʾ��"+text);
	}
	
	//��������Status
	public void inputConditionStatus(String text) throws InterruptedException {
		page.click(qPage.selectStatus);
		page.type(qPage.inputStatus, text);
		page.enterKey();
		Log.info("����״̬��"+text);
	}
	
	//���������������
	public void searchCondition() throws InterruptedException {
		page.click(qPage.buttonConditionSearch);
		Log.info("������������");
	}
	
	//����������
	public void cleanCondition() throws InterruptedException {
		page.click(qPage.buttonCleanCondition);
		Log.info("�������");
	}
	
	//����鿴��Ϣ����
	public void openMessageDetail() throws InterruptedException {
		page.click(qPage.buttonMessageMore);
		Log.info("�鿴��Ϣ����");
	}
	
	//����ر���Ϣ����
	public void closeMessageDetail() throws InterruptedException {
		page.click(qPage.buttonCloseDetail);
		Log.info("�ر���Ϣ����");
	}
	
	//���ɾ����Ϣ
	public void clickDeleteMessage(String text) throws InterruptedException {
		page.click(qPage.buttonMessageDelete);
		Log.info("���ɾ����Ϣ");
		if(text=="cancel") {
			page.click(qPage.buttonDeleteNo);
			Log.info("ȡ��ɾ����Ϣ");
		}else if(text=="yes") {
			page.click(qPage.buttonDeleteYes);
			Log.info("ȷ��ɾ����Ϣ");
		}else {
			Log.error("ɾ����Ϣʧ��");
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
