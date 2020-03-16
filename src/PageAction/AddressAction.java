package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.AddressPage;
import Page.LoginPage;
import utils.Log;

public class AddressAction extends LoadableComponent{
	private BasePage page;
	private AddressPage aPage;
	String url="http://127.0.0.1/index.php?s=/index/useraddress/index.html";
	String title="我的地址 - ShopXO";

	public AddressAction(BasePage page){
		this.page=page;
		this.aPage=PageFactory.initElements(page.getDriver(), AddressPage.class);
	}

	public void load() {
		// TODO Auto-generated method stub
	}
	
	//获取url
	public String getUrl() {
		return url;
	}
	
	//检查我的地址已打开
	public void checkAddressPage() {
		if(page.isSelect(aPage.myAddress)) {
			Log.info("我的地址页面 已打开");
		}else {
			Log.error("我的地址页面 未打开");
		}
	}
		
	//点击新增地址
	public void clickNewAddress() throws InterruptedException {
		page.click(aPage.buttonNewAddress);
		if(page.isElementExist(aPage.buttonCanncelNewAddress)) {
			Log.info("点击新增地址按钮");
		}else {
			Log.error("点击新增地址按钮失败");
		}
	}
	
	//点击进入frame
	public void enterFrame() throws InterruptedException {
		page.enterFrame(aPage.iFrame);
		Log.info("进入编辑地址iframe");
	}
		
	//输入姓名
	public void inputName(String text) throws InterruptedException {
		page.type(aPage.inputName, text);
		Log.info("输入姓名："+text);
	}
		
	//输入电话
	public void inputPhone(String text) throws InterruptedException {
		page.type(aPage.inputPhone, text);
		Log.info("输入电话："+text);
	}
	
	//输入省
	public void inputProvince(String text) throws InterruptedException {
		page.click(aPage.clickProvince);
		page.type(aPage.inputProvince, text);
		page.enterKey();
		Log.info("输入省份："+text);
	}
		
	//输入城市
	public void inputCity(String text) throws InterruptedException {
		page.click(aPage.clickCity);
		page.type(aPage.inputCity, text);
		page.enterKey();
		Log.info("输入城市："+text);
	}
		
	//输入区、县
	public void inputCounty(String text) throws InterruptedException {
		page.elementWait(aPage.clickCounty);
		page.click(aPage.clickCounty);
		Log.info("dianji");
		page.type(aPage.inputCounty, text);
		page.enterKey();
		Log.info("输入区、县："+text);
	}
		
	//输入详细地址
	public void inputFormAddress(String text) throws InterruptedException {
		page.type(aPage.inputFormAddress, text);
		Log.info("输入详细地址："+text);
	}
		
	//输入别名
	public void inputAlias(String text) throws InterruptedException {
		page.type(aPage.inputAlias, text);
		Log.info("输入别名："+text);
	}
		
	//点击默认
	public void clickAddressDefault() throws InterruptedException {
		page.click(aPage.inputIsDefault);
		Log.info("设置此地址为默认地址");
	}
		
	//点击取消编辑地址
	public void clickExitEdit() throws InterruptedException {
		page.click(aPage.buttonCanncelNewAddress);
		Log.info("取消编辑地址");
	}
		
	//点击将地址设为默认（设置成功）
	public void clickdefault(String text) throws InterruptedException {
		page.click(aPage.buttonDefault);
		Log.info("点击将此地址设为默认");
		if(text=="cancel") {
			page.click(aPage.buttonDeleteNo);
			Log.info("取消将此地址设为默认");
		}else if(text=="yes") {
			page.click(aPage.buttonDeleteYes);
			Log.info("确认将此地址设为默认");
		}else {
			Log.error("地址设为默认失败");
		}
	}
		
	//点击编辑地址
	public void clickEditAddress() throws InterruptedException {
		page.click(aPage.buttonEdit);
		if(page.isElementExist(aPage.buttonCanncelNewAddress)) {
			Log.info("点击编辑地址按钮");
		}else {
			Log.error("点击编辑地址按钮失败");
		}
	}
	
	//点击删除地址
	public void clickDeleteAddress(String text) throws InterruptedException {
		page.click(aPage.buttonDelete);
		Log.info("点击删除地址");
		if(text=="cancel") {
			page.click(aPage.buttonDeleteNo);
			Log.info("取消删除此地址");
		}else if(text=="yes"){
			page.click(aPage.buttonDeleteYes);
			Log.info("删除地址成功");
		}else {
			Log.error("删除地址失败");
		}
	}
	
	//编辑地址
	public void editAddress(String name,String phone,String province,String city,String county,String formAddress) throws InterruptedException {
		this.enterFrame();
		this.inputName(name);
		this.inputPhone(phone);
		this.inputProvince(province);
		this.inputCity(city);
		//this.inputCounty(county);
		this.inputFormAddress(formAddress);
		page.click(aPage.buttonSave);
		Log.info("点击保存地址");
		page.leaveFrame();
		if(page.isTextExist(name)) {
			Log.info("地址编辑成功");
		}else {
			Log.error("地址编辑失败");
		}
		assertTrue(page.isTextExist(name));
	}
	
	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}
}	

