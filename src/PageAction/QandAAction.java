package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.IntegralPage;
import Page.PersonalDataPage;
import Page.QandAPage;
import utils.Log;

public class QandAAction extends LoadableComponent{
	private BasePage page;
	private QandAPage qPage;
	String url="http://127.0.0.1/index.php?s=/index/answer/index.html";
	String title="问答/留言 - ShopXO";
	
	public QandAAction(BasePage page){
		this.page=page;
		this.qPage=PageFactory.initElements(page.getDriver(), QandAPage.class);
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
		page.type(qPage.inputSearch, text);
		page.click(qPage.buttonSearch);
		Log.info("搜索："+text);
	}
	
	//点击打开更多条件
	public void openMoreCondition() throws InterruptedException {
		page.click(qPage.selectMoreCondition);
		Log.info("打开更多条件");
	}
	
	//输入条件Display
	public void inputConditionDisplay(String text) throws InterruptedException {
		page.click(qPage.selectDisplay);
		page.type(qPage.inputDisplay, text);
		page.enterKey();
		Log.info("输入显示："+text);
	}
	
	//输入条件Status
	public void inputConditionStatus(String text) throws InterruptedException {
		page.click(qPage.selectStatus);
		page.type(qPage.inputStatus, text);
		page.enterKey();
		Log.info("输入状态："+text);
	}
	
	//点击搜索更多条件
	public void searchCondition() throws InterruptedException {
		page.click(qPage.buttonConditionSearch);
		Log.info("搜索更多条件");
	}
	
	//点击清除条件
	public void cleanCondition() throws InterruptedException {
		page.click(qPage.buttonCleanCondition);
		Log.info("清除条件");
	}
	
	//点击查看消息详情
	public void openMessageDetail() throws InterruptedException {
		page.click(qPage.buttonMessageMore);
		Log.info("查看消息详情");
	}
	
	//点击关闭消息详情
	public void closeMessageDetail() throws InterruptedException {
		page.click(qPage.buttonCloseDetail);
		Log.info("关闭消息详情");
	}
	
	//点击删除信息
	public void clickDeleteMessage(String text) throws InterruptedException {
		page.click(qPage.buttonMessageDelete);
		Log.info("点击删除信息");
		if(text=="cancel") {
			page.click(qPage.buttonDeleteNo);
			Log.info("取消删除信息");
		}else if(text=="yes") {
			page.click(qPage.buttonDeleteYes);
			Log.info("确认删除信息");
		}else {
			Log.error("删除信息失败");
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
