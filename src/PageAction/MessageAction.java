package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.BrowsePage;
import Page.MessagePage;
import utils.Log;

public class MessageAction extends LoadableComponent{
	private BasePage page;
	private MessagePage mPage;
	String url="http://127.0.0.1/index.php?s=/index/message/index.html";
	String title="我的消息 - ShopXO";
	
	public MessageAction(BasePage page){
		this.page=page;
		this.mPage=PageFactory.initElements(page.getDriver(), MessagePage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//获取url
	public String getUrl() {
		return url;
	}
	
	//输入搜索内容并点击搜索
	public void search(String text) throws InterruptedException {
		page.type(mPage.inputSearch, text);
		page.click(mPage.buttonSearch);
		Log.info("搜索 ："+text);
	}
	
	//点击打开更多搜索条件
	public void clickOpenMoreCondition() throws InterruptedException {
		page.click(mPage.selectMoreCondition);
		Log.info("打开更多搜索条件");
	}
	
	//输入搜索条件Type
	public void inputConditionType(String text) throws InterruptedException {
		page.click(mPage.clickType);
		page.type(mPage.inputType, text);
		page.enterKey();
		Log.info("搜索类型："+text);
	}
	
	//输入搜索条件Business
	public void inputConditionBusiness(String text) throws InterruptedException {
		page.click(mPage.clickTraffic);
		page.type(mPage.inputTraffic, text);
		page.enterKey();
		Log.info("搜索业务："+text);
	}
	
	//输入搜索条件Status
	public void inputConditionStatus(String text) throws InterruptedException {
		page.click(mPage.clickStatus);
		page.type(mPage.inputStatus, text);
		page.enterKey();
		Log.info("搜索状态："+text);
	}
	
	//点击搜索更多条件
	public void clickSearchCondition() throws InterruptedException {
		page.click(mPage.selectMoreCondition);
		Log.info("点击搜索更多条件");
	}	
	
	//点击清除条件
	public void clickCleanCondition() throws InterruptedException {
		page.click(mPage.buttonCleanCondition);
		Log.info("清除条件");
	}
	
	//点击查看消息详情
	public void clickMessageDetail() throws InterruptedException {
		page.click(mPage.buttonMessageMore);
		Log.info("查看消息详情");
	}
	
	//点击关闭消息详情
	public void clickCloseMessageDetail() throws InterruptedException {
		page.click(mPage.buttonCloseDetail);
		Log.info("关闭消息详情");
	}

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}
