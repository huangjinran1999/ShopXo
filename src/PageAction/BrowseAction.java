package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.AddressPage;
import Page.BrowsePage;
import utils.Log;

public class BrowseAction extends LoadableComponent{
	private BasePage page;
	private BrowsePage bPage;
	String url="http://127.0.0.1/index.php?s=/index/usergoodsbrowse/index.html";
	String title="�ҵ��㼣 - ShopXO";
		
	public BrowseAction(BasePage page){
		this.page=page;
		this.bPage=PageFactory.initElements(page.getDriver(), BrowsePage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//��ȡurl
	public String getUrl() {
		return url;
	}
	
	//����ҵ��㼣�Ѵ�
	public void checkBrowsePage() {
		if(page.isSelect(bPage.myBrowse)) {
			Log.info("�ҵ��㼣�Ѵ�");
		}else {
			Log.info("�ҵ��㼣δ��");
		}		
	}
	
	//�����������ݲ��������
	public void inputSearchBody(String text) throws InterruptedException {
		page.type(bPage.inputSearch, text);
		page.click(bPage.buttonSearch);
		Log.info("������"+text);
	}
	
	//���ɾ����Ʒ�������¼
	public void clickDeleteGoods(String text) throws InterruptedException {
		page.click(bPage.buttonDelete);
		Log.info("���ɾ�������¼");
		if(text=="cancel") {
			page.click(bPage.buttonDeleteNo);
			Log.info("ȡ��ɾ����¼");
		}else if(text=="yes") {
			page.click(bPage.buttonDeleteYes);
			Log.info("ȷ��ɾ����¼");
		}else {
			Log.error("ɾ�������¼ʧ��");
		}
	}
	
	//��������Ʒ
	public void clickGoods() throws InterruptedException {
		page.click(bPage.goodsLink);
	}
	
	//��������Ʒ�����¼
	public void clickClearGoods(String text) throws InterruptedException {
		page.click(bPage.buttonEmpty);
		Log.info("�����������¼");
		if(text=="cancel") {
			page.click(bPage.buttonDeleteNo);
			Log.info("ȡ����ռ�¼");
		}else if(text=="yes") {
			page.click(bPage.buttonDeleteYes);
			Log.info("ȷ����ռ�¼");
		}else {
			Log.error("��������¼ʧ��");
		}
	}
	
	//�����Ʒ�Ƿ�ɾ��
	public boolean is_delete(){
		if(page.isTextExist(" û���������")) {
			Log.error("�����¼ɾ��ʧ��");
			return false;
		}else {
			Log.info("�����¼ɾ���ɹ�");
			return true;
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
