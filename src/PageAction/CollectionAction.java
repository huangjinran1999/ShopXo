package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Page.CollectionPage;
import utils.Log;

public class CollectionAction extends LoadableComponent{
	private BasePage page;
	private CollectionPage cPage;
	String url="http://127.0.0.1/index.php?s=/index/userfavor/goods.html";
	String title="我的收藏 - ShopXO";
	
	public CollectionAction(BasePage page){
		this.page=page;
		this.cPage=PageFactory.initElements(page.getDriver(), CollectionPage.class);
	}
	
	//点击打开链接
	public void load() {}
	
	//获取url
	public String getUrl() {
		return url;
	}
	
	//检查我的收藏已打开
	public void checkCollectionPage() {
		if(page.isSelect(cPage.myCollection)) {
			System.out.println("我的收藏已打开");
		}else {
			Log.info("my colletion is close");
		}		
	}
	
	//输入搜索内容并点击搜索
	public void inputSearchBody(String text) throws InterruptedException {
		page.type(cPage.inputSearch, text);
		page.click(cPage.buttonSearch);
		Log.info("搜索："+text);
	}
	
	//点击浏览商品
	public void clickOpenGoods() throws InterruptedException {
		page.click(cPage.linkGoods);
		Log.info("浏览商品："+page.getElementAttribute(cPage.linkGoods, "text"));
	}
	
	//点击取消收藏商品
	public void clickDeleteGoods(String text) throws InterruptedException {
		page.click(cPage.buttonCancel);
		Log.info("点击取消收藏商品");
		if(text=="cancel") {
			page.click(cPage.buttonDeleteNo);
			Log.info("取消取消收藏");
		}else {
			page.click(cPage.buttonDeleteYes);
			Log.info("确认取消收藏");
		}
	}	
	
	//检查是否成功取消收藏
	public boolean is_delete() {
		if(page.isTextExist(" 没有相关数据")) {
			Log.error("收藏商品删除失败");
			return false;
		}else {
			Log.error("收藏商品删除成功");
			return true;
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
