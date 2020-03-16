package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.MessagePage;
import Page.OrderManagePage;
import Page.PersonalCenterPage;
import utils.Log;

public class PersonalCenterAction extends LoadableComponent{
	private BasePage page;
	private PersonalCenterPage pPage;
	String url="http://127.0.0.1/index.php?s=/index/user/index.html";
	String title="用户中心 - ShopXO";
	
	public PersonalCenterAction(BasePage page){
		this.page=page;
		this.pPage=PageFactory.initElements(page.getDriver(), PersonalCenterPage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//获取url
	public String getUrl() {
		return url;
	}
	
	//点击打开个人中心页面
	public void openPersonalCenter() throws InterruptedException{
		page.click(pPage.selectPersonalCenter);
		Log.info("打开个人中心页面");
	}
	
	//点击业务管理按钮
	public void clickBusinessManage() throws InterruptedException{
		page.click(pPage.selectBusinessManage);
		Log.info("点击业务管理");
	}

	//点击打开订单管理页面
	public void openOrderManage() throws InterruptedException{
		page.click(pPage.selectOrderManage);
		Log.info("打开订单管理页面");
	}
	
	//点击打开订单售后页面
	public void openOrderAftersale() throws InterruptedException{
		page.click(pPage.selectOrderAfterSale);
		Log.info("打开订单售后页面");
	}
	
	//点击打开我的收藏管理页面
	public void openMyFavor() throws InterruptedException{
		page.click(pPage.selectMyFavor);
		Log.info("打开我的收藏页面");
	}

	//点击财产中心按钮
	public void clickPropertyCenter() throws InterruptedException{
		page.click(pPage.selectPropertyCenter);
		Log.info("点击财产中心");
	}
	
	//点击打开我的积分页面
	public void openMyIntegral() throws InterruptedException{
		page.click(pPage.selectMyIntegral);
		Log.info("打开我的积分页面");
	}	
	
	//点击资料管理按钮
	public void clickDataManage() throws InterruptedException{
		page.click(pPage.selectDataManage);
		Log.info("点击资料管理");
	}
	
	//点击打开个人资料页面
	public void openPersonalData() throws InterruptedException{
		page.click(pPage.selectPersonalData);
		Log.info("打开个人资料页面");
	}	
	
	//点击打开我的地址页面
	public void openMyAddress() throws InterruptedException{
		page.click(pPage.selectMyAddress);
		Log.info("打开我的地址页面");
	}
	
	//点击打开安全设置页面
	public void openSecuritySet() throws InterruptedException{
		page.click(pPage.selectSecuritySet);
		Log.info("打开安全设置页面");
	}	
	
	//点击打开我的消息页面
	public void openMyMessage() throws InterruptedException{
		page.click(pPage.selectMyMessage);
		Log.info("打开我的消息页面");
	}
	
	//点击打开我的足迹页面
	public void openMyBrowse() throws InterruptedException{
		page.click(pPage.selectMyBrowse);
		Log.info("打开我的足迹页面");
	}	
	
	//点击打开问答留言页面
	public void openQandA() throws InterruptedException{
		page.click(pPage.selectQA);
		Log.info("打开问答留言页面");
	}

	//点击安全退出按钮
	public void clickLogout() throws InterruptedException{
		page.click(pPage.selectSafeLogout);
		Log.info("点击安全退出");
	}
	
	//点击修改头像
	public void clickEditHead() throws InterruptedException{
		page.click(pPage.linkChangeHeadImage);
		Log.info("点击修改头像");
	}
	
	//选择上传图片
	public void inputImage(String text) throws InterruptedException {
		page.type(pPage.inputImage,text);
		Log.info("选择上传图片："+text);
	}
		
	//点击确定图片按钮
	public void submitImage() throws InterruptedException {
		page.click(pPage.buttonSubmitImage);
		Log.info("确定图片");
	}
		
	//点击关闭修改图片框
	public void closeFrame() throws InterruptedException {
		page.click(pPage.buttonCloseFrame);
		Log.info("关闭修改图片框");
	}
	
	//点击进入待付款订单页面
	public void openWaitPayOrderPage() throws InterruptedException {
		page.click(pPage.linkOrderWaitPay);
		Log.info("进入待付款订单页面");
	}
	
	//点击进入待发货订单页面
	public void openWaitDeliverOrderPage() throws InterruptedException {
		page.click(pPage.linkOrderWaitDeliver);
		Log.info("进入待发货订单页面");
	}
	
	//点击进入待收货订单页面
	public void openWaitReceiveOrderPage() throws InterruptedException {
		page.click(pPage.linkOrderWaitReceive);
		Log.info("进入待收货订单页面");
	}
	
	//点击进入待评价订单页面
	public void openWaitCriticOrderPage() throws InterruptedException {
		page.click(pPage.linkOrderWaitCritic);
		Log.info("进入待评价订单页面");
	}
	
	//点击进入售后订单页面
	public void openAftersaleOrderPage() throws InterruptedException {
		page.click(pPage.linkOrderAfterSale);
		Log.info("进入售后订单页面");
	}
	
	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
