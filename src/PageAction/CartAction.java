package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.BrowsePage;
import Page.CartPage;
import utils.Log;

public class CartAction extends LoadableComponent{
	private BasePage page;
	private CartPage cPage;
	String url="http://127.0.0.1/index.php?s=/index/cart/index.html";
	String title="���ﳵ - ShopXO";
	
	public CartAction(BasePage page){
		this.page=page;
		this.cPage=PageFactory.initElements(page.getDriver(), CartPage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//��ȡurl
	public String getUrl() {
		return url;
	}
	
	//���ѡ����Ʒ
	public void clickSelectGoods() throws InterruptedException {
		page.click(cPage.selectCartGoods);
		Log.info("ѡ����Ʒ��"+page.getElementAttribute(cPage.linkGoods, "text"));
	}
	
	//���������ﳵ�е���Ʒ
	public void clickGoods() throws InterruptedException {
		page.click(cPage.linkGoods);
		Log.info("�����Ʒ��"+page.getElementAttribute(cPage.linkGoods, "text"));
	}
	
	//������Ʒ����
	public void inputGoodsNumber(String text) throws InterruptedException {
		page.type(cPage.inputGoodsNumber, text);
		Log.info("������Ʒ������"+text);
	}
	
	//���ɾ�����ﳵ�е���Ʒ
	public void clickDeleteGoods(String text) throws InterruptedException {
		page.click(cPage.buttonDeleteGoods);
		Log.info("���ɾ����Ʒ��"+page.getElementAttribute(cPage.linkGoods, "text"));
		if(text=="cancel") {
			page.click(cPage.buttonDeleteNo);
			Log.info("ȡ��ɾ����Ʒ");
		}else if(text=="yes") {
			page.click(cPage.buttonDeleteYes);
			Log.info("ȷ��ɾ����Ʒ");
		}else {
			Log.error("��Ʒɾ��ʧ��");
		}
	}
	
	//����Ƿ�ɾ����Ʒ
	public boolean is_delete() {
		String checkid=page.getElementAttribute(cPage.checkGoods, "id");
		if(page.isElementExist(page.getDriver().findElement(By.id(checkid)))) {
			return false;
		}else {
			return true;
		}
	}
	
	//���ȫѡ���ﳵ�е���Ʒ
	public void clickSelectAllGoods() throws InterruptedException {
		page.click(cPage.buttonCheckAll);
		Log.info("�����Ʒȫѡ");
	}
	
	//�����չ��ﳵ
	public void clickClearCart(String text) throws InterruptedException {
		page.click(cPage.buttonEmpty);
		Log.info("�����չ��ﳵ");
		if(text=="cancel") {
			page.click(cPage.buttonDeleteNo);
			Log.info("ȡ����չ��ﳵ");
		}else if(text=="yes") {
			page.click(cPage.buttonDeleteYes);
			Log.info("ȷ����չ��ﳵ");
		}else {
			Log.error("��չ��ﳵʧ��");
		}
	}
	
	//������㹺�ﳵ�е���Ʒ
	public void clickAccountCart() throws InterruptedException {
		page.click(cPage.buttonAccount);
		Log.info("���������Ʒ");
	}
	
	//�鿴����url
	public String getOrderUrl() {
		return page.getUrl();
	}
	
	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
