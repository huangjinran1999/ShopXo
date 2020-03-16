package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.RegisterPage;
import Page.SearchPage;
import utils.Log;

public class SearchAction extends LoadableComponent{
	private BasePage page;
	private SearchPage sPage;
	String url="http://127.0.0.1/index.php?s=/index/search/index.html";
	String title="��Ʒ���� - ShopXO";
	
	public SearchAction(BasePage page){
		this.page=page;
		this.sPage=PageFactory.initElements(page.getDriver(), SearchPage.class);
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
		page.type(sPage.inputSearch, text);
		page.click(sPage.buttonSearch);
		Log.info("������"+text);
	}
	
	//���ѡ��Ʒ��
	public void selectBrand(String text) throws InterruptedException {
		if(text=="����") {
			page.click(sPage.selectBrandAll);
		}else if(text=="ǿ��") {
			page.click(sPage.selectBrandQS);
		}else if(text=="�ѽ�ʿ") {
			page.click(sPage.selectBrandJJS);
		}else {
			page.click(sPage.selectBrandAll);
		}
		Log.info("ѡ��Ʒ�ƣ�"+text);
	}
	
	//���ѡ�����
	public void selectSort(String text) throws InterruptedException {
		if(text=="����") {
			page.click(sPage.selectSortAll);
		}else if(text=="����칫") {
			page.click(sPage.selectSortSMBG);
		}else if(text=="����Ь��") {
			page.click(sPage.selectSortFSXB);
		}else if(text=="ʳƷ����") {
			page.click(sPage.selectSortSPYL);
		}else {
			page.click(sPage.selectBrandAll);
		}
		Log.info("ѡ����ࣺ"+text);
	}
	
	//����ܺ�����
	public void clickAllOrder() throws InterruptedException {
		page.click(sPage.buttonAll);
		Log.info("�ۺ�����");
	}
	
	//�����������
	public void clickSalesOrder() throws InterruptedException {
		page.click(sPage.buttonSales);
		Log.info("��������");
	}
	
	//����۸�����
	public void clickPricesOrder() throws InterruptedException {
		page.click(sPage.buttonPrices);
		Log.info("�۸�����");
	}
	
	//��������һ����Ʒҳ��
	public void openGoods1() throws InterruptedException {
		page.click(sPage.linkGoods1);
		Thread.sleep(3000);
		page.getNewWindow();
		Log.info("������Ʒҳ�棺"+page.getTitle());
	}
	
	//�������ڶ�����Ʒҳ��
	public void openGoods2() throws InterruptedException {
		page.click(sPage.linkGoods2);
		Thread.sleep(3000);
		page.getNewWindow();
		Log.info("������Ʒҳ�棺"+page.getTitle());
	}
	
	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
