package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.OrderAftersalePage;
import Page.OrderCommentPage;
import utils.Log;

public class OrderCommentAction extends LoadableComponent{
	private BasePage page;
	private OrderCommentPage oPage;
	String url="http://127.0.0.1/index.php?s=/index/order/comments/id/18.html";//18是可修改的订单号
	String title="ShopXO";
	
	public OrderCommentAction(BasePage page){
		this.page=page;
		this.oPage=PageFactory.initElements(page.getDriver(), OrderCommentPage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//获取url
	public String getUrl() {
		return page.getUrl();
	}
	
	//点击打开商品页面
	public void clickOpenGoodsPage() throws InterruptedException {
		page.click(oPage.linkGoods);
		Log.info("打开商品页面");
	}

	//点击评论星星
	public void clickCommentStart() throws InterruptedException {
		page.click(oPage.buttonStar);
		Log.info("评论星级");
	}
	
	//输入评论内容
	public void inputCommentBody(String text) throws InterruptedException {
		page.type(oPage.inputComment, text);
		Log.info("输入评论内容："+text);
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
		Log.info("关闭frame");
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
	
	//点击匿名按钮
	public void clickAnonymity() throws InterruptedException {
		page.click(oPage.buttonIsAnonymity);
		Log.info("点击匿名评论");
	}
	
	//点击提交评论
	public void submitComment() throws InterruptedException {
		page.click(oPage.buttonSubmitComment);
		Log.info("点击提交评论");
	}	
	
	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}

}
