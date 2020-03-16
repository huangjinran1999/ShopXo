package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.RegisterPage;
import Page.SearchPage;
import utils.Log;

public class SearchAction extends LoadableComponent{
	private BasePage page;
	private SearchPage sPage;
	String url="http://127.0.0.1/index.php?s=/index/search/index.html";
	String title="商品搜索 - ShopXO";
	
	public SearchAction(BasePage page){
		this.page=page;
		this.sPage=PageFactory.initElements(page.getDriver(), SearchPage.class);
	}
	
	//点击打开链接
	public void load() {}
	
	//获取url
	public String getUrl() {
		Log.info("打开网页："+url);
		return url;
	}
	
	//输入搜索内容并点击搜索
	public void search(String text) throws InterruptedException {
		page.type(sPage.inputSearch, text);
		page.click(sPage.buttonSearch);
		Log.info("搜索："+text);
	}
	
	//点击选择品牌
	public void selectBrand(String text) throws InterruptedException {
		if(text=="不限") {
			page.click(sPage.selectBrandAll);
		}else if(text=="强生") {
			page.click(sPage.selectBrandQS);
		}else if(text=="佳洁士") {
			page.click(sPage.selectBrandJJS);
		}else {
			page.click(sPage.selectBrandAll);
		}
		Log.info("选择品牌："+text);
	}
	
	//点击选择分类
	public void selectSort(String text) throws InterruptedException {
		if(text=="不限") {
			page.click(sPage.selectSortAll);
		}else if(text=="数码办公") {
			page.click(sPage.selectSortSMBG);
		}else if(text=="服饰鞋包") {
			page.click(sPage.selectSortFSXB);
		}else if(text=="食品饮料") {
			page.click(sPage.selectSortSPYL);
		}else {
			page.click(sPage.selectBrandAll);
		}
		Log.info("选择分类："+text);
	}
	
	//点击总和排序
	public void clickAllOrder() throws InterruptedException {
		page.click(sPage.buttonAll);
		Log.info("综合排序");
	}
	
	//点击销量排序
	public void clickSalesOrder() throws InterruptedException {
		page.click(sPage.buttonSales);
		Log.info("销量排序");
	}
	
	//点击价格排序
	public void clickPricesOrder() throws InterruptedException {
		page.click(sPage.buttonPrices);
		Log.info("价格排序");
	}
	
	//点击进入第一个商品页面
	public void openGoods1() throws InterruptedException {
		page.click(sPage.linkGoods1);
		Thread.sleep(3000);
		page.getNewWindow();
		Log.info("进入商品页面："+page.getTitle());
	}
	
	//点击进入第二个商品页面
	public void openGoods2() throws InterruptedException {
		page.click(sPage.linkGoods2);
		Thread.sleep(3000);
		page.getNewWindow();
		Log.info("进入商品页面："+page.getTitle());
	}
	
	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
