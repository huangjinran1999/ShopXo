package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.OrderAftersaleDetailPage;
import Page.OrderDetailPage;
import Page.OrderManagePage;
import utils.Log;

public class OrderAftersaleDetailAction extends LoadableComponent{
	private BasePage page;
	private OrderAftersaleDetailPage oPage;
	String url="http://127.0.0.1/index.php?s=/index/orderaftersale/aftersale/oid/12/did/12.html";//18是可修改的订单号
	String title="ShopXO";
	
	public OrderAftersaleDetailAction(BasePage page){
		this.page=page;
		this.oPage=PageFactory.initElements(page.getDriver(), OrderAftersaleDetailPage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//获取url
	public String getUrl() {
		return page.getUrl();
	}

	//点击打开商品页面
	public void openGoodsPage() throws InterruptedException {
		page.click(oPage.linkgoods);
		Log.info("打开商品页面："+page.getElementAttribute(oPage.linkgoods, "text"));
	}
	
	//点击仅退款
	public void clickOnlyRefund() throws InterruptedException {
		page.click(oPage.buttonOnlyRefund);
		Log.info("仅退款");
	}
	
	//点击退货
	public void clickReturn() throws InterruptedException {
		page.click(oPage.buttonOnlyReturn);
		Log.info("退货");
	}
	
	//输入退款/退货原因
	public void inputRefundReason(String text) throws InterruptedException {
		page.click(oPage.clickRefundReason);
		page.type(oPage.inputRefundReason, text);
		page.enterKey();
		Log.info("输入退款/退货原因："+text);
	}
	
	//输入退款/退货数量
	public void inputRefundNumber(String text) throws InterruptedException {
		String smax=page.getElementAttribute(oPage.inputRefundNumber, "value");
		int max=Integer.parseInt(smax);
		int itext=Integer.parseInt(text);
		if(itext>=0&&itext<=max) {
			page.type(oPage.inputRefundNumber, text);
			Log.info("输入退款/退货数量："+text);
		}else{
			Log.info("退款数量错误");
		}
		
	}
	
	//输入退款/退货金额
	public void inputRefundPrice(String text) throws InterruptedException {
		String smax=page.getElementAttribute(oPage.inputRefundPrice, "value");
		int max=Integer.parseInt(smax);
		int itext=Integer.parseInt(text);
		if(itext>=0&&itext<=max) {
			page.type(oPage.inputRefundPrice, text);
			Log.info("输入退款/退货金额："+text);
		}else{
			Log.info("退款金额错误");
		}
	}
	
	//输入退款/退货说明
	public void inputRefundMessage(String text) throws InterruptedException {
		page.type(oPage.inputRefundMessage, text);
		Log.info("输入退款/退货说明："+text);
	}
	
	//点击上传图片按钮
	public void clickUploadImage() throws InterruptedException {
		page.click(oPage.buttonUploadImage);
		Log.info("点击上传图片");
	}	
	
	//定位到上传图片的frame
	public void enterFrame() throws InterruptedException {
		page.enterFrame("edui3_iframe");
	}
		
	//上传图片
	public void inputUploadImage(String text) throws InterruptedException {
		page.type(oPage.inputUploadImage, text);
		Log.info("上传图片："+text);
	}
		
	//点击继续上传图片
	public void clickContinueAddImage(String text) throws InterruptedException {
		page.type(oPage.buttonContinueAddImage,text);
		Log.info("上传图片："+text);
	}	
		
	//点击开始上传
	public void clickStartUpload() throws InterruptedException {
		page.click(oPage.buttonStartUpload);
		Log.info("点击开始上传");
	}	
		
	//点击关闭frame
	public void clickCloseFrame() throws InterruptedException {
		page.click(oPage.buttonCloseFrame);
	}
		
	//点击frame确认
	public void clickYesFrame() throws InterruptedException {
		page.click(oPage.buttonImageYes);
		Log.info("确认上传图片");
	}
		
	//点击frame取消
	public void clickNoFrame() throws InterruptedException {
		page.click(oPage.buttonImageNo);
		Log.info("取消上传图片");
	}
		
	//点击提交退货/退款申请
	public void clickSubmitApply() throws InterruptedException {
		page.click(oPage.buttonSubmitRefund);
		Log.info("提交退货/退款申请");
	}	

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
