package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.MessagePage;
import Page.OrderAftersalePage;
import utils.Log;

public class OrderAftersaleAction extends LoadableComponent{
	private BasePage page;
	private OrderAftersalePage oPage;
	String url="http://127.0.0.1/index.php?s=/index/orderaftersale/index.html";
	String title="订单售后 - ShopXO";
	
	public OrderAftersaleAction(BasePage page){
		this.page=page;
		this.oPage=PageFactory.initElements(page.getDriver(), OrderAftersalePage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//获取url
	public String getUrl() {
		return url;
	}

	//检查订单售后已打开
	public void checkBrowsePage() {
		if(page.isSelect(oPage.orderAfterSale)) {
			System.out.println("订单售后已打开");
		}else {
			Log.info("订单售后未打开");
		}		
	}
	
	//搜索售后订单
	public void search(String text) throws InterruptedException {
		page.type(oPage.inputSearch, text);
		page.click(oPage.buttonSearch);
		Log.info("搜索："+text);
	}
	
	//点击打开更多条件
	public void clickOpenMoreCondition() throws InterruptedException {
		page.click(oPage.selectMoreCondition);
		Log.info("打开更多条件");
	}

	//输入搜索条件Type
	public void inputConditionType(String text) throws InterruptedException {
		page.click(oPage.clickType);
		page.type(oPage.inputType, text);
		page.enterKey();
		Log.info("搜索类型："+text);
	}
	
	//输入搜索条件Status
	public void inputConditionStatus(String text) throws InterruptedException {
		page.click(oPage.clickStatus);
		page.type(oPage.inputStatus, text);
		page.enterKey();
		Log.info("搜索状态："+text);
	}
	
	//输入搜索条件Refund
	public void inputConditionRefund(String text) throws InterruptedException {
		page.click(oPage.clickTypeRefund);
		page.type(oPage.inputRefund, text);
		page.enterKey();
		Log.info("搜索退款："+text);
	}
	
	//点击条件搜索
	public void clickConditionSearch() throws InterruptedException {
		page.click(oPage.buttonConditionSearch);
		Log.info("条件搜索");
	}
	
	//点击清除条件
	public void clickCleanCondition() throws InterruptedException {
		page.click(oPage.buttonCleanCondition);
		Log.info("清除条件");
	}
	
	//点击打开商品链接
	public void clickOpenGoodsPage() throws InterruptedException {
		page.click(oPage.linkGoods);
		Log.info("打开商品："+page.getElementAttribute(oPage.linkGoods, "text"));
	}
	
	//点击查看订单详情
	public void openOrderDetail() throws InterruptedException {
		page.click(oPage.buttonOrderDetail);
		Log.info("查看售后详情");
	}
	
	//点击删除订单
	public void clickDeleteOrder(String text) throws InterruptedException {
		page.click(oPage.buttonOrderCanncel);
		Log.info("点击取消售后");
		if(text=="cancel") {
			page.click(oPage.buttonDeleteNo);
			Log.info("取消删除售后");
		}else if(text=="yes") {
			page.click(oPage.buttonDeleteYes);
			Log.info("确认删除售后");
		}else {
			Log.error("取消售后失败");
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
