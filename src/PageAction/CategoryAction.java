package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.BrowsePage;
import Page.CartPage;
import Page.CategoryPage;
import utils.Log;

public class CategoryAction extends LoadableComponent{
	private BasePage page;
	private CategoryPage cPage;
	String url="http://127.0.0.1/index.php?s=/index/category/index.html";
	String title="商品分类 - ShopXO";
	
	public CategoryAction(BasePage page){
		this.page=page;
		this.cPage=PageFactory.initElements(page.getDriver(), CategoryPage.class);
	}
	
	//点击打开链接
	public void load() {
		page.open(url);
	}
	
	//点击打开分类 数码办公
	public void clickOpenSort1() throws InterruptedException {
		page.click(cPage.selectClassify1);
		Log.info("点击分类：数码办公");
	}
	
	//点击打开分类 手机通讯
	public void clickOpenSort2() throws InterruptedException {
		page.click(cPage.selectClassify2);
		if(page.isTextExist("Huawei/华为 H60-L01 荣耀6 移动4G版智能手机 安卓")) {
			Log.info("选择分类：手机通讯");
		}else {
			Log.error("选择分类手机通讯失败");
		}
		
	}
	
	//点击打开分类 手机
	public void clickOpenSort3() throws InterruptedException {
		page.click(cPage.selectClassify3);
		if(page.isTextExist("Huawei/华为 H60-L01 荣耀6 移动4G版智能手机 安卓")) {
			Log.info("选择分类：手机");
		}else {
			Log.error("选择分类手机失败");
		}
	}
	
	//打开商品页面
	public void openGoods() throws InterruptedException {
		page.click(cPage.goods);
		Thread.sleep(3000);
		if(page.isElementExist(cPage.check)) {
			Log.info("打开商品页面");
		}else {
			Log.error("打开商品页面失败");
		}
	}
	
	//查看是否打开商品页面
	public boolean checkGoods() {
		return page.isElementExist(cPage.check);
	}

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
