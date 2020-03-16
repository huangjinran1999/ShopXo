package Base;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import utils.Log;

//基本元素操作
public class BasePage {
	
	WebDriver driver = null;
	Actions action  =null;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		driver.manage().window().maximize();
		action = new Actions(driver);
	}
	
	//获取driver
	public WebDriver getDriver() {
		return this.driver;
	}
	
	//打开网页
	public void open(String url) {
		try {
			driver.get(url);
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Log.info("打开网页：" + url);
	}
	
	//关闭浏览器
	public void closeBrowser() {
		driver.quit();
		Log.info("关闭浏览器");
	}
	
	//刷新网页
	public void refresh() {
		try {
			driver.navigate().refresh();
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Log.info("刷新此网页");
	}
	
	//返回上一个页面
	public void back() {
		try {
			driver.navigate().back();
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Log.info("返回上一个页面");
	}
	
	//获取页面title
	public String getTitle() {
		Log.info("获取页面title");
		return driver.getTitle();
		
	}
	
	//获取页面url
	public String getUrl() {
		Log.info("获取页面url");
		return driver.getCurrentUrl();
	}
	
	//定位到新的页面
	public void getNewWindow() {
		String FirstHandle = driver.getWindowHandle();     //首先得到最先的窗口 权柄
		for(String winHandle : driver.getWindowHandles()) {    //得到浏览器所有窗口的权柄为Set集合，遍历
			if (winHandle.equals(FirstHandle)) {				//如果为 最先的窗口 权柄跳出
				continue;
			}
			driver.switchTo().window(winHandle);             //如果不为 最先的窗口 权柄，将 新窗口的操作权柄  给 driver 
			Log.info(driver.getCurrentUrl());     //打印是否为新窗口
			break;  
		} 
	}
	
	//点击元素
	public void click(WebElement element) throws InterruptedException{
		if (element != null&&this.isElementExist(element)) {
			element.click();
			Thread.sleep(3000);
		}else {
			Log.error("点击元素"+element+"失败");
		}
	}
	
	//在输入框中输入信息
	public void type(WebElement element,String text) throws InterruptedException{
		if(element != null&&this.isElementExist(element)) {
			element.clear();
			Thread.sleep(3000);
			element.sendKeys(text);	
			Thread.sleep(3000);
		}else {
			Log.error("在元素"+element+"处输入信息失败");
		}
	}
	
	//提交表单
	public void submit(WebElement element) throws InterruptedException{
		if(element != null&&this.isElementExist(element)) {
			element.click();	
			Thread.sleep(3000);
		}else {
			Log.error("提交表单失败");
		}
	}
	
	//下拉框操作
	public void operateDropList(WebElement element,int index) throws InterruptedException{
		if(element != null&&this.isElementExist(element)) {
			Select dropList=new Select(element);
			dropList.selectByIndex(index);
			Log.info("选择："+index);
		}else {
			Log.error("下拉框操作失败");
		}
	}
	
	//下拉框操作
	public void operateDropList(WebElement element,String value) throws InterruptedException{
		if(element != null&&this.isElementExist(element)) {
			Select dropList=new Select(element);
			dropList.selectByVisibleText(value);
			Log.info("选择："+value);
		}else {
			Log.error("下拉框操作失败");
		}
	}
	
	//单选框操作
	public void operateCheckBox(WebElement element) {
		if(!element.isSelected()) {
			element.click();
		}
		assertTrue(element.isSelected());
	}
	
	//检查文本内容是否出现
	public boolean isTextExist(String text) {
		String itext = driver.getPageSource();
		if (itext.contains(text)) {
			return true;
		}
		return false;		
	}
	
	//拖拽页面元素
	public void dragPageElement(WebElement element,int x,int y) throws InterruptedException {
		Actions action = new Actions(driver);
		action.dragAndDropBy(element, x, y).build().perform();
		Thread.sleep(3000);
	}
	
	
	//检查页面元素是否出现
	public boolean isElementExist(WebElement element) {
		try {
			element.isDisplayed();
		} catch (Exception e) {
			Log.info(e.getMessage());
		}
		
		if (element != null) {
			return true;
		}else{
			return false;
		}
	}
	
	//日期选择
	public void dataPick(WebElement element,String year,String month,String day) throws InterruptedException{
		if(element != null&&this.isElementExist(element)) {
			element.sendKeys(year+"-"+month+"-"+day);
			Thread.sleep(3000);
		}else {
			Log.error("日期选择失败");
		}
	}
	
	//弹框处理
	public void alert(String text) {
		Alert alert = driver.switchTo().alert();
		if(text.equals("取消")) {
			alert.dismiss();
		}else if(text.equals("确定")) {
			alert.accept();
		}else{
			alert.sendKeys(text);
			alert.accept();
		}
	}
	
	//获取弹框中的内容
	/*public String alert() {
		Alert alert=driver.switchTo().alert();
		return alert.getText();
	}*/
	
	public String alert(WebElement element) {
		return element.getText();
	}
	
	//获取页面元素属性
	public String getElementAttribute(WebElement element,String attribute) {
		if(element.isDisplayed()) {
			return element.getAttribute(attribute);
		}
		return "元素属性获取失败";
		
	}
	
	//在指定元素进行鼠标悬浮
	public void mouseoverElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	//进入frame
	public void enterFrame(String frameID) throws InterruptedException {
		Thread.sleep(3000);
		driver.switchTo().frame(frameID);
		Log.info("进入iframe " + frameID);
	}
	public void enterFrame(int frameID) throws InterruptedException  {
		Thread.sleep(3000);
		driver.switchTo().frame(frameID);
		Log.info("进入iframe " + frameID);
	}
	public void enterFrame(WebElement element) throws InterruptedException {
		Thread.sleep(3000);
		driver.switchTo().frame(element);
		Log.info("进入iframe");
	}
	
	//退出frame
	public void leaveFrame() {
		driver.switchTo().defaultContent();
		Log.info("退出iframe");
	}
	
	
	//视频元素操作
	public void operateVideo(WebElement video) throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//获取视频的存储地址
		String source=(String) js.executeScript("return arguments[0].currentSrc;", video);
		System.out.println(source);
		assertEquals(source,"http://127.0.0.1/static/upload/video/goods/2019/01/14/1547458876723311.mp4");
		//获取播放时长
		Double videoDuration=(Double) js.executeScript("return arguments[0].duration", video);
		System.out.println(videoDuration.doubleValue());
		//播放
		js.executeScript("return arguments[0].play()", video);
		Thread.sleep(3000);
		//暂停
		js.executeScript("return arguments[0].pause()", video);
	}
	
	//元素是否显示
	public boolean isDisplay(WebElement element) {
		if (element != null) {
			System.out.println(element.isDisplayed());
		}
		return element.isDisplayed();
	}
	
	//显示display的页面元素('select')[0]
	public void displayElement(String elementPath) throws InterruptedException {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("document.querySelectorAll"+elementPath+".style.display='block';");
		Thread.sleep(3000);
	}
	
	//元素是否被选中
	public boolean isSelect(WebElement element) {
		if (element != null) {
			System.out.println(element.isDisplayed());
		}
		return element.isSelected();
	}
	
	//滚动页面到指定元素位置
	public void scrolling(WebElement element) throws InterruptedException{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		Thread.sleep(3000);
	}
	
	//键盘的回车
	public void enterKey() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
	}
	
	//高亮显示被操作的元素
	public void highlightElement(WebElement element) throws InterruptedException{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"background:yellow;border:3px solid yellow;");
		Thread.sleep(3000);
	}
	
	//失败用例截屏
	public void screennShot() {
		SimpleDateFormat now=new SimpleDateFormat("yyyyMMdd-HHmmss");
		String nowDate=now.format(new Date());
		File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(file, new File("E:\\shopxoTest\\"+nowDate+".jpg"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//显式等待元素出现
	public void elementWait(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
}
