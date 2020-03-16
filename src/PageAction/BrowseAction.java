package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.AddressPage;
import Page.BrowsePage;
import utils.Log;

public class BrowseAction extends LoadableComponent{
	private BasePage page;
	private BrowsePage bPage;
	String url="http://127.0.0.1/index.php?s=/index/usergoodsbrowse/index.html";
	String title="我的足迹 - ShopXO";
		
	public BrowseAction(BasePage page){
		this.page=page;
		this.bPage=PageFactory.initElements(page.getDriver(), BrowsePage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//获取url
	public String getUrl() {
		return url;
	}
	
	//检查我的足迹已打开
	public void checkBrowsePage() {
		if(page.isSelect(bPage.myBrowse)) {
			Log.info("我的足迹已打开");
		}else {
			Log.info("我的足迹未打开");
		}		
	}
	
	//输入搜索内容并点击搜索
	public void inputSearchBody(String text) throws InterruptedException {
		page.type(bPage.inputSearch, text);
		page.click(bPage.buttonSearch);
		Log.info("搜索："+text);
	}
	
	//点击删除商品的浏览记录
	public void clickDeleteGoods(String text) throws InterruptedException {
		page.click(bPage.buttonDelete);
		Log.info("点击删除浏览记录");
		if(text=="cancel") {
			page.click(bPage.buttonDeleteNo);
			Log.info("取消删除记录");
		}else if(text=="yes") {
			page.click(bPage.buttonDeleteYes);
			Log.info("确认删除记录");
		}else {
			Log.error("删除浏览记录失败");
		}
	}
	
	//点击浏览商品
	public void clickGoods() throws InterruptedException {
		page.click(bPage.goodsLink);
	}
	
	//点击清空商品浏览记录
	public void clickClearGoods(String text) throws InterruptedException {
		page.click(bPage.buttonEmpty);
		Log.info("点击清空浏览记录");
		if(text=="cancel") {
			page.click(bPage.buttonDeleteNo);
			Log.info("取消清空记录");
		}else if(text=="yes") {
			page.click(bPage.buttonDeleteYes);
			Log.info("确认清空记录");
		}else {
			Log.error("清空浏览记录失败");
		}
	}
	
	//检查商品是否删除
	public boolean is_delete(){
		if(page.isTextExist(" 没有相关数据")) {
			Log.error("浏览记录删除失败");
			return false;
		}else {
			Log.info("浏览记录删除成功");
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
