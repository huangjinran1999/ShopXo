package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.OrderAftersaleDetailPage;
import Page.OrderCommentPage;
import Page.OrderManagePage;
import utils.Log;

public class OrderManageAction extends LoadableComponent{
	private BasePage page;
	private OrderManagePage oPage;
	String url="http://127.0.0.1/index.php?s=/index/order/index.html";
	String title="我的订单 - ShopXO";
	
	public OrderManageAction(BasePage page){
		this.page=page;
		this.oPage=PageFactory.initElements(page.getDriver(), OrderManagePage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//获取url
	public String getUrl() {
		return url;
	}
	

	//搜索订单号
	public void search(String text) throws InterruptedException {
		page.type(oPage.inputSearch, text);
		page.click(oPage.buttonSearch);
		Log.info("搜索："+text);
	}

	//点击打开更多条件
	public void openMoreCondition() throws InterruptedException {
		page.click(oPage.selectMoreCondition);
		Log.info("打开更多条件");
	}
	
	//输入条件StartTime
	public void inputStartTime(String year,String month,String day) throws InterruptedException {
		page.dataPick(oPage.inputStartTime, year, month, day);
		Log.info("输入起始时间："+year+month+day);
	}
	
	//输入条件EndTime
	public void inputEndTime(String year,String month,String day) throws InterruptedException {
		page.dataPick(oPage.inputEndTime, year, month, day);
		Log.info("输入结束时间："+year+month+day);
	}
	
	//输入条件StartPrice
	public void inputStartPrice(String text) throws InterruptedException {
		page.type(oPage.inputStartPrice, text);
		Log.info("输入最小价格："+text);
	}

	//输入条件EndPrice
	public void inputEndPrice(String text) throws InterruptedException {
		page.type(oPage.inputEndPrice, text);
		Log.info("输入最大价格："+text);
	}
	
	//输入条件Pay
	public void inputConditionPay(String text) throws InterruptedException {
		page.click(oPage.clickPay);
		page.type(oPage.inputPay, text);
		page.enterKey();
		Log.info("输入支付方式："+text);
	}
	
	//输入条件PayStatus
	public void inputConditionPayStatus(String text) throws InterruptedException {
		page.click(oPage.clickPayStatus);
		page.type(oPage.inputPayStatus, text);
		page.enterKey();
		Log.info("输入付款状态："+text);
	}
	
	//输入条件Status
	public void inputOrderStatus(String text) throws InterruptedException {
		page.click(oPage.clickOrderStatus);
		page.type(oPage.inputOrderStatus, text);
		page.enterKey();
		Log.info("输入订单状态："+text);
	}
	
	//输入条件CommentStatus
	public void inputCommentStatus(String text) throws InterruptedException {
		page.click(oPage.clickCommentStatus);
		page.type(oPage.inputCommentStatus, text);
		page.enterKey();
		Log.info("输入评论状态："+text);
	}
	
	//点击搜索条件
	public void clickSearchCondition() throws InterruptedException {
		page.click(oPage.buttonConditionSearch);
		Log.info("点击搜索条件");
	}

	//点击清除条件
	public void clickCleanCondition() throws InterruptedException {
		page.click(oPage.buttonCleanCondition);
		Log.info("清除条件");
	}
	
	//点击进入申请售后页面
	public void clickApplyAftersale() throws InterruptedException {
		page.click(oPage.linkApplyAftersale);
		Log.info("进入申请售后页面");
	}
	
	//点击进入售后进度页面
	public void clickRefundPlan() throws InterruptedException {
		page.click(oPage.linkRefundPlan);
		Log.info("进入售后进度页面");
	}	
	
	//点击进入退货/退款页面
	public void clickApplyRefund() throws InterruptedException {
		page.click(oPage.linkRefund);
		Log.info("进入退货/退款页面");
	}
	
	//点击进入订单详情页面
	public void openOrderDetail() throws InterruptedException {
		page.click(oPage.linkGoodsDetail);
		Log.info("进入订单详情页面");
	}
	
	//点击进入订单评论页面
	public void openOrderComment() throws InterruptedException {
		page.click(oPage.buttonOrderComment);
		Log.info("进入订单评论页面");
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
	public void clickOrderLogistics() throws InterruptedException {
		page.click(oPage.buttonOrderLogistics);
		Log.info("查看物流详情");
	}
	
	//点击关闭物流详情
	public void closeOrderLogistics() throws InterruptedException {
		page.click(oPage.buttonCloseLogistics);
		Log.info("关闭物流详情");
	}
	
	//点击订单收货
	public void clickOrderReceive(String text) throws InterruptedException {
		page.click(oPage.buttonOrderReceive);
		Log.info("点击收货");
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
		
	
	//点击取消订单
	public void clickCancelOrder(String text) throws InterruptedException {
		page.click(oPage.buttonOrderCanncel);
		Log.info("取消订单");
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
	
	//点击进入订单支付页面
	public void clickOrderPay() throws InterruptedException {
		page.click(oPage.buttonOrderPay);
		Log.info("进入订单支付页面");
	}

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}

}
