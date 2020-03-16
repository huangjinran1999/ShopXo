package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.GoodsPage;
import Page.HomePage;
import utils.Log;

public class HomeAction extends LoadableComponent{
	private BasePage page;
	private HomePage hPage;
	String url="http://127.0.0.1/";
	String title="ShopXO";
	
	public HomeAction(BasePage page){
		this.page=page;
		this.hPage=PageFactory.initElements(page.getDriver(), HomePage.class);
	}
	
	//���������
	public void load() {
		page.open(url);
	}
	
	//��ȡurl
	public String getUrl() {
		Log.info(page.getUrl());
		return page.getUrl();
	}
	
	//��������¼ҳ��
	public void clickLoginPage() throws InterruptedException {
		page.click(hPage.linkLogin);
	}
	
	//��������¼ҳ��
	public void clickRegisterPage() throws InterruptedException {
		page.click(hPage.linkRegister);
	}
	
	//����˳�
	public void clickButtonLogout() throws InterruptedException {
		page.click(hPage.linkLogout);
	}
	
	//��������������
	public void clickPersonalCenterPage() throws InterruptedException {
		page.click(hPage.linkPerson);
	}
	
	//������붩������
	public void clickOrderManagePage() throws InterruptedException {
		page.click(hPage.linkMyShop);
		page.click(hPage.linkMyOrder);
	}
	
	//��������ҵ��ղ�
	public void clickMyCollectionPage() throws InterruptedException {
		page.click(hPage.linkMyCollection);
		page.click(hPage.linkGoodsColletion);
	}
	
	//������빺�ﳵ
	public void clickCartPage() throws InterruptedException {
		page.click(hPage.linkTopCart);
	}
	
	//��������ҵ���Ϣ
	public void clickMyMessagePage() throws InterruptedException {
		page.click(hPage.linkTopMessage);
	}
	
	//����������Ҳ๺�ﳵ
	public void suspendCart() throws InterruptedException {
		page.mouseoverElement(hPage.selectCart);
	}
	
	//���ɾ�����ﳵ�е���Ʒ
	public void clickDeleteCartGoods() throws InterruptedException {
		page.click(hPage.buttonDeleteCartGoods);
	}
	
	//������㹺�ﳵ�е���Ʒ
	public void clickAccountCartGoods() throws InterruptedException {
		page.click(hPage.buttonBuyCartGoods);
	}
	
	//�������������
	public void suspendMessage() throws InterruptedException {
		page.mouseoverElement(hPage.selectMessage);
	}
	
	//������������
	public void inputMessageName(String text) throws InterruptedException {
		page.type(hPage.inputMessageName, text);
	}

	//�������Ե绰
	public void inputMessagePhone(String text) throws InterruptedException {
		page.type(hPage.inputMessagePhone, text);
	}

	//������������
	public void inputMessageBody(String text) throws InterruptedException {
		page.type(hPage.inputMessageBody, text);
	}
	
	//����ύ����
	public void clickSubmitMessage() throws InterruptedException {
		page.click(hPage.buttonSubmit);
	}
	
	//�������������
	public void clickWaitPayOrderPage() throws InterruptedException {
		page.click(hPage.linkWaitPayOrder);
	}
	
	//����������������
	public void clickWaitDeliverOrderPage() throws InterruptedException {
		page.click(hPage.linkWaitDeliveryOrder);
	}
	
	//���������ջ�����
	public void clickWaitReceiveOrderPage() throws InterruptedException {
		page.click(hPage.linkWaitReceiveOrder);
	}
	
	//�����������۶���
	public void clickWaitCriticOrderPage() throws InterruptedException {
		page.click(hPage.linkWaitCommentOrder);
	}
	
	//�����������ݲ��������
	public void search(String text) throws InterruptedException {
		page.type(hPage.inputSearch, text);
		page.click(hPage.buttonSearch);
	}

	//����������ҳ��
	public void clickCategoryPage() throws InterruptedException {
		page.click(hPage.linkCategory);
	}
	
	//��������ֻ�����ҳ��
	public void clickSJCategoryPage() throws InterruptedException {
		page.mouseoverElement(hPage.selectSMBG);
		page.click(hPage.selectSortSJ);
	}
	
	//����������Ь������ҳ��
	public void clickFSXBCategoryPage() throws InterruptedException {
		page.click(hPage.selectGoodsSort);
		page.click(hPage.selectSortCloth);
	}
	
	//���������Ʒҳ��
	public void clickGoodsPage(int goodsId) throws InterruptedException {
		if(goodsId==1) {
			page.click(hPage.linkGoods1);
		}else if(goodsId==2) {
			page.click(hPage.linkGoods2);
		}else if(goodsId==3) {
			page.click(hPage.linkGoods3);
		}else if(goodsId==4) {
			page.click(hPage.linkGoods4);
		}else if(goodsId==5) {
			page.click(hPage.linkGoods5);
		}else if(goodsId==6) {
			page.click(hPage.linkGoods6);
		}else if(goodsId==7) {
			page.click(hPage.linkGoods7);
		}else if(goodsId==8) {
			page.click(hPage.linkGoods8);
		}else if(goodsId==9) {
			page.click(hPage.linkGoods9);
		}else if(goodsId==10) {
			page.click(hPage.linkGoods10);
		}else if(goodsId==11) {
			page.click(hPage.linkGoods11);
		}else if(goodsId==12) {
			page.click(hPage.linkGoods12);
		}else {
			Log.info("����Ʒ������");
		}
		Log.info("����Ʒ��"+goodsId);
	}

	//����frame
	public void enterFrame() throws InterruptedException {
		page.enterFrame(1);
	}
		
	//�������ע��ҳ��
	public void clickLinkRegister() throws InterruptedException {
		page.click(hPage.linkFrameRegister);
	}
		
	//iframe�������˺�
	public void inputUserName(String text) throws InterruptedException {
		page.type(hPage.inputUserName, text);
	}
		
	//iframe����������
	public void inputPassword(String text) throws InterruptedException {
		page.type(hPage.inputPassword, text);
	}
		
	//iFrame�����¼
	public void clickIframeLogin() throws InterruptedException {
		page.click(hPage.buttonSubmit);
	}
		
	//���������������ҳ��
	public void clickLinkForgetPassword() throws InterruptedException {
		page.click(hPage.linkForgetPassword);
	}
		
	//�˳�frame
	public void leaveFrame() throws InterruptedException {
		page.leaveFrame();
	}
	
	
	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
