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
	
	//点击打开链接
	public void load() {
		page.open(url);
	}
	
	//获取url
	public String getUrl() {
		Log.info(page.getUrl());
		return page.getUrl();
	}
	
	//点击进入登录页面
	public void clickLoginPage() throws InterruptedException {
		page.click(hPage.linkLogin);
	}
	
	//点击进入登录页面
	public void clickRegisterPage() throws InterruptedException {
		page.click(hPage.linkRegister);
	}
	
	//点击退出
	public void clickButtonLogout() throws InterruptedException {
		page.click(hPage.linkLogout);
	}
	
	//点击进入个人中心
	public void clickPersonalCenterPage() throws InterruptedException {
		page.click(hPage.linkPerson);
	}
	
	//点击进入订单管理
	public void clickOrderManagePage() throws InterruptedException {
		page.click(hPage.linkMyShop);
		page.click(hPage.linkMyOrder);
	}
	
	//点击进入我的收藏
	public void clickMyCollectionPage() throws InterruptedException {
		page.click(hPage.linkMyCollection);
		page.click(hPage.linkGoodsColletion);
	}
	
	//点击进入购物车
	public void clickCartPage() throws InterruptedException {
		page.click(hPage.linkTopCart);
	}
	
	//点击进入我的消息
	public void clickMyMessagePage() throws InterruptedException {
		page.click(hPage.linkTopMessage);
	}
	
	//鼠标悬浮到右侧购物车
	public void suspendCart() throws InterruptedException {
		page.mouseoverElement(hPage.selectCart);
	}
	
	//点击删除购物车中的商品
	public void clickDeleteCartGoods() throws InterruptedException {
		page.click(hPage.buttonDeleteCartGoods);
	}
	
	//点击结算购物车中的商品
	public void clickAccountCartGoods() throws InterruptedException {
		page.click(hPage.buttonBuyCartGoods);
	}
	
	//鼠标悬浮到留言
	public void suspendMessage() throws InterruptedException {
		page.mouseoverElement(hPage.selectMessage);
	}
	
	//输入留言姓名
	public void inputMessageName(String text) throws InterruptedException {
		page.type(hPage.inputMessageName, text);
	}

	//输入留言电话
	public void inputMessagePhone(String text) throws InterruptedException {
		page.type(hPage.inputMessagePhone, text);
	}

	//输入留言内容
	public void inputMessageBody(String text) throws InterruptedException {
		page.type(hPage.inputMessageBody, text);
	}
	
	//点击提交留言
	public void clickSubmitMessage() throws InterruptedException {
		page.click(hPage.buttonSubmit);
	}
	
	//点击进入待付款订单
	public void clickWaitPayOrderPage() throws InterruptedException {
		page.click(hPage.linkWaitPayOrder);
	}
	
	//点击进入待发货订单
	public void clickWaitDeliverOrderPage() throws InterruptedException {
		page.click(hPage.linkWaitDeliveryOrder);
	}
	
	//点击进入待收货订单
	public void clickWaitReceiveOrderPage() throws InterruptedException {
		page.click(hPage.linkWaitReceiveOrder);
	}
	
	//点击进入待评价订单
	public void clickWaitCriticOrderPage() throws InterruptedException {
		page.click(hPage.linkWaitCommentOrder);
	}
	
	//输入搜索内容并点击搜索
	public void search(String text) throws InterruptedException {
		page.type(hPage.inputSearch, text);
		page.click(hPage.buttonSearch);
	}

	//点击进入分类页面
	public void clickCategoryPage() throws InterruptedException {
		page.click(hPage.linkCategory);
	}
	
	//点击进入手机分类页面
	public void clickSJCategoryPage() throws InterruptedException {
		page.mouseoverElement(hPage.selectSMBG);
		page.click(hPage.selectSortSJ);
	}
	
	//点击进入服饰鞋包分类页面
	public void clickFSXBCategoryPage() throws InterruptedException {
		page.click(hPage.selectGoodsSort);
		page.click(hPage.selectSortCloth);
	}
	
	//点击进入商品页面
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
			Log.info("此商品不存在");
		}
		Log.info("打开商品："+goodsId);
	}

	//进入frame
	public void enterFrame() throws InterruptedException {
		page.enterFrame(1);
	}
		
	//点击进入注册页面
	public void clickLinkRegister() throws InterruptedException {
		page.click(hPage.linkFrameRegister);
	}
		
	//iframe中输入账号
	public void inputUserName(String text) throws InterruptedException {
		page.type(hPage.inputUserName, text);
	}
		
	//iframe中输入密码
	public void inputPassword(String text) throws InterruptedException {
		page.type(hPage.inputPassword, text);
	}
		
	//iFrame点击登录
	public void clickIframeLogin() throws InterruptedException {
		page.click(hPage.buttonSubmit);
	}
		
	//点击进入忘记密码页面
	public void clickLinkForgetPassword() throws InterruptedException {
		page.click(hPage.linkForgetPassword);
	}
		
	//退出frame
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
