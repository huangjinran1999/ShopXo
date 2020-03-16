package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.OrderManagePage;
import Page.PersonalDataPage;
import utils.Log;

public class PersonalDataAction extends LoadableComponent{
	private BasePage page;
	private PersonalDataPage pPage;
	String url="http://127.0.0.1/index.php?s=/index/personal/index.html";
	String title="个人资料 - ShopXO";
	
	public PersonalDataAction(BasePage page){
		this.page=page;
		this.pPage=PageFactory.initElements(page.getDriver(), PersonalDataPage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//获取url
	public String getUrl() {
		return url;
	}
	
	//点击编辑个人资料
	public void clickEditData() throws InterruptedException {
		page.click(pPage.linkEditData);
		Log.info("编辑个人资料");
	}
	
	//点击修改头像
	public void clickEditImage() throws InterruptedException {
		page.click(pPage.linkEditHead);
		Log.info("点击修改头像");
	}
	
	//点击修改手机号码
	public void clickEditPhone() throws InterruptedException {
		page.click(pPage.linkEditPhone);
		Log.info("修改手机号码");
	}

	//点击修改电子邮箱
	public void clickEditEmail() throws InterruptedException {
		page.click(pPage.linkEditEmail);
		Log.info("修改电子邮箱");
	}
	
	//选择上传图片
	public void inputImage(String text) throws InterruptedException {
		page.type(pPage.inputImage,text);
		Log.info("选择上传图片："+text);
	}
	
	//放大图片
	public void clickPlusImage() throws InterruptedException {
		page.click(pPage.buttonPlus);
		Log.info("放大图片");
	}
	
	//缩小图片
	public void clickMinusImage() throws InterruptedException {
		page.click(pPage.buttonMinus);
		Log.info("缩小图片");
	}
	
	//点击确定图片按钮
	public void submitImage() throws InterruptedException {
		page.click(pPage.buttonSubmitImage);
		Log.info("点击确定图片");
	}
	
	//点击关闭修改图片框
	public void closeFrame() throws InterruptedException {
		page.click(pPage.buttonCloseFrame);
		Log.info("关闭修改图片框");
	}
	
	String iurl="http://127.0.0.1/index.php?s=/index/personal/saveinfo.html";
	String ititle="个人资料编辑 - ShopXO";
	
	//点击返回上一个页面
	public void clickReturn() throws InterruptedException {
		page.click(pPage.linkReturn);
		Log.info("返回个人资料页面");
	}
	
	//输入昵称
	public void inputNickName(String text) throws InterruptedException {
		page.type(pPage.inputNickName, text);
		Log.info("输入昵称："+text);
	}
	
	//选择性别
	public void selectGender(String text) throws InterruptedException {
		if(text=="保密") {
			page.click(pPage.selectGenderSecrecy);
			Log.info("性别："+text);
		}else if(text=="女") {
			page.click(pPage.selectGenderWomen);
			Log.info("性别："+text);
		}else if(text=="男") {
			page.click(pPage.selectGenderMan);
			Log.info("性别："+text);
		}else {
			Log.info("性别输入错误");
		}
	}
	
	//输入生日
	public void inputBirthday(String year,String month,String day) throws InterruptedException {
		page.dataPick(pPage.inputBirthday, year, month, day);
		Log.info("输入生日："+year+month+day);
	}
	
	//点击提交资料
	public void submitPersonalData() throws InterruptedException {
		page.click(pPage.buttonSubmit);
		Log.info("提交资料");
	}
	
	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}

}
