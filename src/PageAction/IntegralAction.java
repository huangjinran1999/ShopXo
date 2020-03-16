package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.HomePage;
import Page.IntegralPage;
import utils.Log;

public class IntegralAction extends LoadableComponent{
	private BasePage page;
	private IntegralPage iPage;
	String url="http://127.0.0.1/index.php?s=/index/userintegral/index.html";
	String title="�ҵĻ��� - ShopXO";
	
	public IntegralAction(BasePage page){
		this.page=page;
		this.iPage=PageFactory.initElements(page.getDriver(), IntegralPage.class);
	}
	
	//���������
	public void load() {}
	
	//��ȡurl
	public String getUrl() {
		Log.info("����ҳ��"+url);
		return url;
	}

	//����ҵĻ����Ѵ�
	public void checkIntegralPage() {
		if(page.isSelect(iPage.myIntegral)) {
			Log.info("�ҵĻ����Ѵ�");
		}else {
			Log.info("�ҵĻ���δ��");
		}		
	}
	
	//��������
	public void search(String text) throws InterruptedException {
		page.type(iPage.inputSearch, text);
		page.click(iPage.buttonSearch);
		Log.info("�������֣�"+text);
	}
	
	//�������������
	public void clickOpenMoreCondition() throws InterruptedException {
		page.click(iPage.selectMoreCondition);
		Log.info("�������������");
	}
	
	//���벢����ĳ�����͵Ļ���
	public void inputIntegralType(String text) throws InterruptedException {
		page.click(iPage.clickType);
		page.type(iPage.inputType, text);
		page.enterKey();
		Log.info("����������ͣ�"+text);
	}
	
	//���������������
	public void clickSearchCondition() throws InterruptedException {
		page.click(iPage.buttonTypeSearch);
		Log.info("������������");
	}
	
	//��������������
	public void clickCleanCondition() throws InterruptedException {
		page.click(iPage.buttonCleanCondition);
		Log.info("����������");
	}
	
	//����鿴��������
	public void clickIntegralDetail() throws InterruptedException {
		page.click(iPage.buttonIntegralMore);
		Log.info("�鿴��������");
	}
	
	//����رջ�������
	public void clickCloseIntegralDetail() throws InterruptedException {
		page.click(iPage.buttonCloseDetail);
		Log.info("�رջ�������");
	}

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
