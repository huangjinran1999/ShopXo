package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.HomePage;
import Page.IntegralPage;
import utils.Log;

public class IntegralAction extends LoadableComponent{
	private BasePage page;
	private IntegralPage iPage;
	String url="http://127.0.0.1/index.php?s=/index/userintegral/index.html";
	String title="我的积分 - ShopXO";
	
	public IntegralAction(BasePage page){
		this.page=page;
		this.iPage=PageFactory.initElements(page.getDriver(), IntegralPage.class);
	}
	
	//点击打开链接
	public void load() {}
	
	//获取url
	public String getUrl() {
		Log.info("打开网页："+url);
		return url;
	}

	//检查我的积分已打开
	public void checkIntegralPage() {
		if(page.isSelect(iPage.myIntegral)) {
			Log.info("我的积分已打开");
		}else {
			Log.info("我的积分未打开");
		}		
	}
	
	//搜索积分
	public void search(String text) throws InterruptedException {
		page.type(iPage.inputSearch, text);
		page.click(iPage.buttonSearch);
		Log.info("搜索积分："+text);
	}
	
	//点击打开搜索条件
	public void clickOpenMoreCondition() throws InterruptedException {
		page.click(iPage.selectMoreCondition);
		Log.info("点击打开搜索条件");
	}
	
	//输入并搜索某种类型的积分
	public void inputIntegralType(String text) throws InterruptedException {
		page.click(iPage.clickType);
		page.type(iPage.inputType, text);
		page.enterKey();
		Log.info("输入积分类型："+text);
	}
	
	//点击更多条件搜索
	public void clickSearchCondition() throws InterruptedException {
		page.click(iPage.buttonTypeSearch);
		Log.info("更多条件搜索");
	}
	
	//点击清除条件搜索
	public void clickCleanCondition() throws InterruptedException {
		page.click(iPage.buttonCleanCondition);
		Log.info("点击清除条件");
	}
	
	//点击查看积分详情
	public void clickIntegralDetail() throws InterruptedException {
		page.click(iPage.buttonIntegralMore);
		Log.info("查看积分详情");
	}
	
	//点击关闭积分详情
	public void clickCloseIntegralDetail() throws InterruptedException {
		page.click(iPage.buttonCloseDetail);
		Log.info("关闭积分详情");
	}

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
