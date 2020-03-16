package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.CartPage;
import Page.OrderManagePage;
import Page.OrderSubmitPage;
import utils.Log;

public class OrderSubmitAction extends LoadableComponent{
	private BasePage page;
	private OrderSubmitPage oPage;
	String url="http://127.0.0.1/index.php?s=/index/buy/index.html";
	String title="ShopXO";
	
	public OrderSubmitAction(BasePage page){
		this.page=page;
		this.oPage=PageFactory.initElements(page.getDriver(), OrderSubmitPage.class);
	}
	
	//点击打开链接
	public void load() {
		page.open(url);
	}
	
	//点击选择快递邮寄
	public void selectExpress() throws InterruptedException {
		page.click(oPage.selectExpress);
		Log.info("选择快递邮寄");
	}
	
	//点击选择自提
	public void selectPickUp() throws InterruptedException {
		page.click(oPage.selectPickup);
		Log.info("选择自提取货");
	}
	
	//点击新建地址
	public void clickNewAddress() throws InterruptedException {
		page.click(oPage.buttonNewAddress);
		if(page.isTextExist("新增地址")) {
			Log.info("打开新增地址成功");
		}else {
			Log.error("打开新增地址失败");
		}
	}

	//点击进入frame
	public void enterFrame() throws InterruptedException {
		page.enterFrame(oPage.iFrame);
		Log.info("进入编辑地址iframe");
	}
		
	//输入姓名
	public void inputName(String text) throws InterruptedException {
		page.type(oPage.inputName, text);
		Log.info("输入姓名："+text);
	}
		
	//输入电话
	public void inputPhone(String text) throws InterruptedException {
		page.type(oPage.inputPhone, text);
		Log.info("输入电话："+text);
	}
	
	//输入省
	public void inputProvince(String text) throws InterruptedException {
		page.click(oPage.clickProvince);
		page.type(oPage.inputProvince, text);
		page.enterKey();
		Log.info("输入省份："+text);
	}
		
	//输入城市
	public void inputCity(String text) throws InterruptedException {
		page.click(oPage.clickCity);
		page.type(oPage.inputCity, text);
		page.enterKey();
		Log.info("输入城市："+text);
	}
		
	//输入区、县
	public void inputCounty(String text) throws InterruptedException {
		page.click(oPage.clickCounty);
		page.type(oPage.inputCounty, text);
		page.enterKey();
		Log.info("输入区、县："+text);
	}
		
	//输入详细地址
	public void inputFormAddress(String text) throws InterruptedException {
		page.type(oPage.inputFormAddress, text);
		Log.info("输入详细地址："+text);
	}
		
	//输入别名
	public void inputAlias(String text) throws InterruptedException {
		page.type(oPage.inputAlias, text);
		Log.info("输入别名："+text);
	}
		
	//点击默认
	public void clickAddressDefault() throws InterruptedException {
		page.click(oPage.inputIsDefault);
		Log.info("设置此地址为默认地址");
	}
		
	//点击取消编辑地址
	public void clickExitEdit() throws InterruptedException {
		page.click(oPage.buttonCanncelNewAddress);
		Log.info("取消编辑地址");
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
		page.click(oPage.buttonSave);
		Log.info("点击保存地址");
		page.leaveFrame();
		if(page.isTextExist(name)) {
			Log.info("地址编辑成功");
		}else {
			Log.error("地址编辑失败");
		}
		assertTrue(page.isTextExist(name));
	}
			
	//点击将地址设为默认
	public void clickdefault(String text) throws InterruptedException {
		page.click(oPage.linkSetDefault);
		Log.info("将此地址设为默认");
		if(text=="cancel") {
			page.click(oPage.buttonDeleteNo);
			Log.info("取消将此地址设为默认");
		}else if(text=="yes") {
			page.click(oPage.buttonDeleteYes);
			Log.info("确认将此地址设为默认");
		}else {
			Log.error("将此地址设为默认失败");
		}
	}
			
	//点击编辑地址
	public void clickEditAddress() throws InterruptedException {
		page.click(oPage.linkEditAddress);
		if(page.isTextExist("编辑地址")) {
			Log.info("打开编辑地址成功");
		}else {
			Log.error("打开编辑地址失败");
		}
	}
		
	//点击删除地址
	public void clickDeleteAddress(String text) throws InterruptedException {
		page.click(oPage.linkDeleteAddress);
		Log.info("点击删除地址");
		if(text=="cancel") {
			page.click(oPage.buttonDeleteNo);
			Log.info("取消删除地址");
		}else if(text=="yes") {
			page.click(oPage.buttonDeleteYes);
			Log.info("确认删除地址");
		}else {
			Log.error("删除地址失败");
		}
	}
	
	//检查删除地址成功
	public boolean id_delete() {
		if(page.isElementExist(oPage.checkAddress)) {
			Log.error("删除地址失败");
			return false;
		}else {
			Log.info("删除地址成功");
			return true;
		}
	}
	
	//点击选择自提点
	public void selectPickupSite() throws InterruptedException {
		page.click(oPage.buttonSelectAddress);
		Log.info("打开选择自提点页面");
		page.click(oPage.buttonSelectSite);
		Log.info("选择自提点");
	}
	
	//点击关闭自提点
	public void closePickupSite() throws InterruptedException {
		page.click(oPage.buttonCloseSite);
		Log.info("关闭自提点页面");
	}
	
	//选择支付方式
	public void selectPayWay(String text) throws InterruptedException {
		if(text=="现金支付") {
			page.click(oPage.selectPayCash);
			Log.info("选择支付方式："+text);
		}else if(text=="支付宝") {
			page.click(oPage.selectPayZFB);
			Log.info("选择支付方式："+text);
		}else if(text=="微信") {
			page.click(oPage.selectPayWX);
			Log.info("选择支付方式："+text);
		}else if(text=="货到付款") {
			page.click(oPage.selectPayHDFK);
			Log.info("选择支付方式："+text);
		}else {
			Log.error("支付方式错误");
		}
	}
	
	//点击进入商品页面
	public void openGoodsPage() throws InterruptedException {
		page.click(oPage.linkGoods);
	}
	
	//输入留言内容
	public void inputMessage(String text) throws InterruptedException {
		page.type(oPage.inputMessage, text);
	}
	
	//点击提交订单按钮
	public void submitOrder() throws InterruptedException {
		page.click(oPage.buttonSubmitOrder);
		Log.info("提交订单");
	}
	
	//点击进入我的订单
	public void openMyOrder() throws InterruptedException {
		page.click(oPage.buttonMyOrder);
		assertTrue(page.isTextExist("商品操作"));
		Log.info("进入我的订单");
	}

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}

}
