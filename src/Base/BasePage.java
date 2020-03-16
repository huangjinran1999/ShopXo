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

//����Ԫ�ز���
public class BasePage {
	
	WebDriver driver = null;
	Actions action  =null;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		driver.manage().window().maximize();
		action = new Actions(driver);
	}
	
	//��ȡdriver
	public WebDriver getDriver() {
		return this.driver;
	}
	
	//����ҳ
	public void open(String url) {
		try {
			driver.get(url);
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Log.info("����ҳ��" + url);
	}
	
	//�ر������
	public void closeBrowser() {
		driver.quit();
		Log.info("�ر������");
	}
	
	//ˢ����ҳ
	public void refresh() {
		try {
			driver.navigate().refresh();
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Log.info("ˢ�´���ҳ");
	}
	
	//������һ��ҳ��
	public void back() {
		try {
			driver.navigate().back();
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Log.info("������һ��ҳ��");
	}
	
	//��ȡҳ��title
	public String getTitle() {
		Log.info("��ȡҳ��title");
		return driver.getTitle();
		
	}
	
	//��ȡҳ��url
	public String getUrl() {
		Log.info("��ȡҳ��url");
		return driver.getCurrentUrl();
	}
	
	//��λ���µ�ҳ��
	public void getNewWindow() {
		String FirstHandle = driver.getWindowHandle();     //���ȵõ����ȵĴ��� Ȩ��
		for(String winHandle : driver.getWindowHandles()) {    //�õ���������д��ڵ�Ȩ��ΪSet���ϣ�����
			if (winHandle.equals(FirstHandle)) {				//���Ϊ ���ȵĴ��� Ȩ������
				continue;
			}
			driver.switchTo().window(winHandle);             //�����Ϊ ���ȵĴ��� Ȩ������ �´��ڵĲ���Ȩ��  �� driver 
			Log.info(driver.getCurrentUrl());     //��ӡ�Ƿ�Ϊ�´���
			break;  
		} 
	}
	
	//���Ԫ��
	public void click(WebElement element) throws InterruptedException{
		if (element != null&&this.isElementExist(element)) {
			element.click();
			Thread.sleep(3000);
		}else {
			Log.error("���Ԫ��"+element+"ʧ��");
		}
	}
	
	//���������������Ϣ
	public void type(WebElement element,String text) throws InterruptedException{
		if(element != null&&this.isElementExist(element)) {
			element.clear();
			Thread.sleep(3000);
			element.sendKeys(text);	
			Thread.sleep(3000);
		}else {
			Log.error("��Ԫ��"+element+"��������Ϣʧ��");
		}
	}
	
	//�ύ��
	public void submit(WebElement element) throws InterruptedException{
		if(element != null&&this.isElementExist(element)) {
			element.click();	
			Thread.sleep(3000);
		}else {
			Log.error("�ύ��ʧ��");
		}
	}
	
	//���������
	public void operateDropList(WebElement element,int index) throws InterruptedException{
		if(element != null&&this.isElementExist(element)) {
			Select dropList=new Select(element);
			dropList.selectByIndex(index);
			Log.info("ѡ��"+index);
		}else {
			Log.error("���������ʧ��");
		}
	}
	
	//���������
	public void operateDropList(WebElement element,String value) throws InterruptedException{
		if(element != null&&this.isElementExist(element)) {
			Select dropList=new Select(element);
			dropList.selectByVisibleText(value);
			Log.info("ѡ��"+value);
		}else {
			Log.error("���������ʧ��");
		}
	}
	
	//��ѡ�����
	public void operateCheckBox(WebElement element) {
		if(!element.isSelected()) {
			element.click();
		}
		assertTrue(element.isSelected());
	}
	
	//����ı������Ƿ����
	public boolean isTextExist(String text) {
		String itext = driver.getPageSource();
		if (itext.contains(text)) {
			return true;
		}
		return false;		
	}
	
	//��קҳ��Ԫ��
	public void dragPageElement(WebElement element,int x,int y) throws InterruptedException {
		Actions action = new Actions(driver);
		action.dragAndDropBy(element, x, y).build().perform();
		Thread.sleep(3000);
	}
	
	
	//���ҳ��Ԫ���Ƿ����
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
	
	//����ѡ��
	public void dataPick(WebElement element,String year,String month,String day) throws InterruptedException{
		if(element != null&&this.isElementExist(element)) {
			element.sendKeys(year+"-"+month+"-"+day);
			Thread.sleep(3000);
		}else {
			Log.error("����ѡ��ʧ��");
		}
	}
	
	//������
	public void alert(String text) {
		Alert alert = driver.switchTo().alert();
		if(text.equals("ȡ��")) {
			alert.dismiss();
		}else if(text.equals("ȷ��")) {
			alert.accept();
		}else{
			alert.sendKeys(text);
			alert.accept();
		}
	}
	
	//��ȡ�����е�����
	/*public String alert() {
		Alert alert=driver.switchTo().alert();
		return alert.getText();
	}*/
	
	public String alert(WebElement element) {
		return element.getText();
	}
	
	//��ȡҳ��Ԫ������
	public String getElementAttribute(WebElement element,String attribute) {
		if(element.isDisplayed()) {
			return element.getAttribute(attribute);
		}
		return "Ԫ�����Ի�ȡʧ��";
		
	}
	
	//��ָ��Ԫ�ؽ����������
	public void mouseoverElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	//����frame
	public void enterFrame(String frameID) throws InterruptedException {
		Thread.sleep(3000);
		driver.switchTo().frame(frameID);
		Log.info("����iframe " + frameID);
	}
	public void enterFrame(int frameID) throws InterruptedException  {
		Thread.sleep(3000);
		driver.switchTo().frame(frameID);
		Log.info("����iframe " + frameID);
	}
	public void enterFrame(WebElement element) throws InterruptedException {
		Thread.sleep(3000);
		driver.switchTo().frame(element);
		Log.info("����iframe");
	}
	
	//�˳�frame
	public void leaveFrame() {
		driver.switchTo().defaultContent();
		Log.info("�˳�iframe");
	}
	
	
	//��ƵԪ�ز���
	public void operateVideo(WebElement video) throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//��ȡ��Ƶ�Ĵ洢��ַ
		String source=(String) js.executeScript("return arguments[0].currentSrc;", video);
		System.out.println(source);
		assertEquals(source,"http://127.0.0.1/static/upload/video/goods/2019/01/14/1547458876723311.mp4");
		//��ȡ����ʱ��
		Double videoDuration=(Double) js.executeScript("return arguments[0].duration", video);
		System.out.println(videoDuration.doubleValue());
		//����
		js.executeScript("return arguments[0].play()", video);
		Thread.sleep(3000);
		//��ͣ
		js.executeScript("return arguments[0].pause()", video);
	}
	
	//Ԫ���Ƿ���ʾ
	public boolean isDisplay(WebElement element) {
		if (element != null) {
			System.out.println(element.isDisplayed());
		}
		return element.isDisplayed();
	}
	
	//��ʾdisplay��ҳ��Ԫ��('select')[0]
	public void displayElement(String elementPath) throws InterruptedException {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("document.querySelectorAll"+elementPath+".style.display='block';");
		Thread.sleep(3000);
	}
	
	//Ԫ���Ƿ�ѡ��
	public boolean isSelect(WebElement element) {
		if (element != null) {
			System.out.println(element.isDisplayed());
		}
		return element.isSelected();
	}
	
	//����ҳ�浽ָ��Ԫ��λ��
	public void scrolling(WebElement element) throws InterruptedException{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		Thread.sleep(3000);
	}
	
	//���̵Ļس�
	public void enterKey() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
	}
	
	//������ʾ��������Ԫ��
	public void highlightElement(WebElement element) throws InterruptedException{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"background:yellow;border:3px solid yellow;");
		Thread.sleep(3000);
	}
	
	//ʧ����������
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
	
	//��ʽ�ȴ�Ԫ�س���
	public void elementWait(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
}
