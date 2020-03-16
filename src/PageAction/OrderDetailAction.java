package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.OrderDetailPage;
import Page.OrderManagePage;
import utils.Log;

public class OrderDetailAction extends LoadableComponent{
	private BasePage page;
	private OrderDetailPage oPage;
	String url="http://127.0.0.1/index.php?s=/index/order/detail/id/18.html";//18是可修改的订单号
	String title="ShopXO";
	
	public OrderDetailAction(BasePage page){
		this.page=page;
		this.oPage=PageFactory.initElements(page.getDriver(), OrderDetailPage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//获取url
	public String getUrl() {
		return page.getUrl();
	}
	
	//查看订单状态
	public void checkOrderStatus() throws InterruptedException {
		String text=page.getElementAttribute(oPage.getTextOrderStatus, "text");
		Log.info("查看订单状态："+text);
	}	
	
	//点击进入商品页面
	public void openGoodsPage() throws InterruptedException {
		page.click(oPage.linkGoods);
		Log.info("进入商品页面："+page.getElementAttribute(oPage.linkGoods, "text"));
	}
	
	//点击进入评论页面
	public void openCommentPage() throws InterruptedException {
		page.click(oPage.buttonOrderComment);
		Log.info("进入评论页面");
	}

	//点击删除订单
	public void clickDeleteOrder(String text) throws InterruptedException {
		page.click(oPage.buttonOrderDelete);
		Log.info("点击删除订单");
		if(text=="cancel") {
			page.click(oPage.buttonDeleteNo);
			Log.info("取消删除订单");
		}else if(text=="yes") {
			page.click(oPage.buttonDeleteYes);
			Log.info("确认删除订单");
		}else {
			Log.error("删除订单失败");
		}
	}
	
	//点击查看物流
	public void clickOpenLogistics() throws InterruptedException {
		page.click(oPage.buttonOrderLogistics);
		Log.info("点击查看物流");
	}
	
	//点击关闭物流详情
	public void clickCloseLogistics() throws InterruptedException {
		page.click(oPage.buttonCloseLogistics);
		Log.info("关闭物流详情");
	}
	
	//点击取消订单
	public void clickCancelOrder(String text) throws InterruptedException {
		page.click(oPage.buttonOrderCancel);
		Log.info("点击取消订单");
		if(text=="cancel") {
			page.click(oPage.buttonDeleteNo);
			Log.info("取消取消订单");
		}else if(text=="yes") {
			page.click(oPage.buttonDeleteYes);
			Log.info("确认取消订单");
		}else {
			Log.error("取消订单失败");
		}
	}

	//点击支付订单
	public void clickPayOrder() throws InterruptedException {
		page.click(oPage.buttonOrderPay);
		Log.info("点击支付订单");
	}
	
	//点击收货按钮
	public void clickOrderReceive(String text) throws InterruptedException {
		page.click(oPage.buttonOrderReceive);
		Log.info("点击收货按钮");
		if(text=="cancel") {
			page.click(oPage.buttonDeleteNo);
			Log.info("取消收货");
		}else if(text=="yes") {
			page.click(oPage.buttonDeleteYes);
			Log.info("确认收货");
		}else {
			Log.error("收货失败");
		}
	}	
	
	//选择支付方式
	public void selectPayWay(String text) throws InterruptedException {
		if(text=="现金支付") {
			page.click(oPage.buttonPayCash);
		}else if(text=="支付宝") {
			page.click(oPage.buttonPayZFB);
		}else if(text=="微信") {
			page.click(oPage.buttonPayWX);
		}else if(text=="货到付款") {
			page.click(oPage.buttonPayHDFK);
		}else if(text=="QQ") {
			page.click(oPage.buttonPayQQ);
		}else {
			Log.info("支付方式错误");
		}
		Log.info("选择支付方式："+text);
	}
	
	//点击确认支付订单
	public void clickPay() throws InterruptedException {
		page.click(oPage.buttonPay);
	}

	//点击取消支付
	public void clickCancelPay() throws InterruptedException {
		page.click(oPage.buttonCancelPay);
	}

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
