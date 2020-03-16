package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.BrowsePage;
import Page.CartPage;
import utils.Log;

public class CartAction extends LoadableComponent{
	private BasePage page;
	private CartPage cPage;
	String url="http://127.0.0.1/index.php?s=/index/cart/index.html";
	String title="购物车 - ShopXO";
	
	public CartAction(BasePage page){
		this.page=page;
		this.cPage=PageFactory.initElements(page.getDriver(), CartPage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//获取url
	public String getUrl() {
		return url;
	}
	
	//点击选择商品
	public void clickSelectGoods() throws InterruptedException {
		page.click(cPage.selectCartGoods);
		Log.info("选择商品："+page.getElementAttribute(cPage.linkGoods, "text"));
	}
	
	//点击浏览购物车中的商品
	public void clickGoods() throws InterruptedException {
		page.click(cPage.linkGoods);
		Log.info("浏览商品："+page.getElementAttribute(cPage.linkGoods, "text"));
	}
	
	//输入商品数量
	public void inputGoodsNumber(String text) throws InterruptedException {
		page.type(cPage.inputGoodsNumber, text);
		Log.info("输入商品数量："+text);
	}
	
	//点击删除购物车中的商品
	public void clickDeleteGoods(String text) throws InterruptedException {
		page.click(cPage.buttonDeleteGoods);
		Log.info("点击删除商品："+page.getElementAttribute(cPage.linkGoods, "text"));
		if(text=="cancel") {
			page.click(cPage.buttonDeleteNo);
			Log.info("取消删除商品");
		}else if(text=="yes") {
			page.click(cPage.buttonDeleteYes);
			Log.info("确认删除商品");
		}else {
			Log.error("商品删除失败");
		}
	}
	
	//检查是否删除商品
	public boolean is_delete() {
		String checkid=page.getElementAttribute(cPage.checkGoods, "id");
		if(page.isElementExist(page.getDriver().findElement(By.id(checkid)))) {
			return false;
		}else {
			return true;
		}
	}
	
	//点击全选购物车中的商品
	public void clickSelectAllGoods() throws InterruptedException {
		page.click(cPage.buttonCheckAll);
		Log.info("点击商品全选");
	}
	
	//点击清空购物车
	public void clickClearCart(String text) throws InterruptedException {
		page.click(cPage.buttonEmpty);
		Log.info("点击清空购物车");
		if(text=="cancel") {
			page.click(cPage.buttonDeleteNo);
			Log.info("取消清空购物车");
		}else if(text=="yes") {
			page.click(cPage.buttonDeleteYes);
			Log.info("确认清空购物车");
		}else {
			Log.error("清空购物车失败");
		}
	}
	
	//点击结算购物车中的商品
	public void clickAccountCart() throws InterruptedException {
		page.click(cPage.buttonAccount);
		Log.info("点击结算商品");
	}
	
	//查看订单url
	public String getOrderUrl() {
		return page.getUrl();
	}
	
	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
