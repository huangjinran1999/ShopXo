package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.BrowsePage;
import Page.CartPage;
import Page.CategoryPage;
import utils.Log;

public class CategoryAction extends LoadableComponent{
	private BasePage page;
	private CategoryPage cPage;
	String url="http://127.0.0.1/index.php?s=/index/category/index.html";
	String title="��Ʒ���� - ShopXO";
	
	public CategoryAction(BasePage page){
		this.page=page;
		this.cPage=PageFactory.initElements(page.getDriver(), CategoryPage.class);
	}
	
	//���������
	public void load() {
		page.open(url);
	}
	
	//����򿪷��� ����칫
	public void clickOpenSort1() throws InterruptedException {
		page.click(cPage.selectClassify1);
		Log.info("������ࣺ����칫");
	}
	
	//����򿪷��� �ֻ�ͨѶ
	public void clickOpenSort2() throws InterruptedException {
		page.click(cPage.selectClassify2);
		if(page.isTextExist("Huawei/��Ϊ H60-L01 ��ҫ6 �ƶ�4G�������ֻ� ��׿")) {
			Log.info("ѡ����ࣺ�ֻ�ͨѶ");
		}else {
			Log.error("ѡ������ֻ�ͨѶʧ��");
		}
		
	}
	
	//����򿪷��� �ֻ�
	public void clickOpenSort3() throws InterruptedException {
		page.click(cPage.selectClassify3);
		if(page.isTextExist("Huawei/��Ϊ H60-L01 ��ҫ6 �ƶ�4G�������ֻ� ��׿")) {
			Log.info("ѡ����ࣺ�ֻ�");
		}else {
			Log.error("ѡ������ֻ�ʧ��");
		}
	}
	
	//����Ʒҳ��
	public void openGoods() throws InterruptedException {
		page.click(cPage.goods);
		Thread.sleep(3000);
		if(page.isElementExist(cPage.check)) {
			Log.info("����Ʒҳ��");
		}else {
			Log.error("����Ʒҳ��ʧ��");
		}
	}
	
	//�鿴�Ƿ����Ʒҳ��
	public boolean checkGoods() {
		return page.isElementExist(cPage.check);
	}

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
