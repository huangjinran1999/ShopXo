package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Page.CollectionPage;
import utils.Log;

public class CollectionAction extends LoadableComponent{
	private BasePage page;
	private CollectionPage cPage;
	String url="http://127.0.0.1/index.php?s=/index/userfavor/goods.html";
	String title="�ҵ��ղ� - ShopXO";
	
	public CollectionAction(BasePage page){
		this.page=page;
		this.cPage=PageFactory.initElements(page.getDriver(), CollectionPage.class);
	}
	
	//���������
	public void load() {}
	
	//��ȡurl
	public String getUrl() {
		return url;
	}
	
	//����ҵ��ղ��Ѵ�
	public void checkCollectionPage() {
		if(page.isSelect(cPage.myCollection)) {
			System.out.println("�ҵ��ղ��Ѵ�");
		}else {
			Log.info("my colletion is close");
		}		
	}
	
	//�����������ݲ��������
	public void inputSearchBody(String text) throws InterruptedException {
		page.type(cPage.inputSearch, text);
		page.click(cPage.buttonSearch);
		Log.info("������"+text);
	}
	
	//��������Ʒ
	public void clickOpenGoods() throws InterruptedException {
		page.click(cPage.linkGoods);
		Log.info("�����Ʒ��"+page.getElementAttribute(cPage.linkGoods, "text"));
	}
	
	//���ȡ���ղ���Ʒ
	public void clickDeleteGoods(String text) throws InterruptedException {
		page.click(cPage.buttonCancel);
		Log.info("���ȡ���ղ���Ʒ");
		if(text=="cancel") {
			page.click(cPage.buttonDeleteNo);
			Log.info("ȡ��ȡ���ղ�");
		}else {
			page.click(cPage.buttonDeleteYes);
			Log.info("ȷ��ȡ���ղ�");
		}
	}	
	
	//����Ƿ�ɹ�ȡ���ղ�
	public boolean is_delete() {
		if(page.isTextExist(" û���������")) {
			Log.error("�ղ���Ʒɾ��ʧ��");
			return false;
		}else {
			Log.error("�ղ���Ʒɾ���ɹ�");
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
