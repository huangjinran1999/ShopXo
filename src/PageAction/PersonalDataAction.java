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
	String title="�������� - ShopXO";
	
	public PersonalDataAction(BasePage page){
		this.page=page;
		this.pPage=PageFactory.initElements(page.getDriver(), PersonalDataPage.class);
	}
		
	public void load() {
		// TODO Auto-generated method stub
	}
	
	//��ȡurl
	public String getUrl() {
		return url;
	}
	
	//����༭��������
	public void clickEditData() throws InterruptedException {
		page.click(pPage.linkEditData);
		Log.info("�༭��������");
	}
	
	//����޸�ͷ��
	public void clickEditImage() throws InterruptedException {
		page.click(pPage.linkEditHead);
		Log.info("����޸�ͷ��");
	}
	
	//����޸��ֻ�����
	public void clickEditPhone() throws InterruptedException {
		page.click(pPage.linkEditPhone);
		Log.info("�޸��ֻ�����");
	}

	//����޸ĵ�������
	public void clickEditEmail() throws InterruptedException {
		page.click(pPage.linkEditEmail);
		Log.info("�޸ĵ�������");
	}
	
	//ѡ���ϴ�ͼƬ
	public void inputImage(String text) throws InterruptedException {
		page.type(pPage.inputImage,text);
		Log.info("ѡ���ϴ�ͼƬ��"+text);
	}
	
	//�Ŵ�ͼƬ
	public void clickPlusImage() throws InterruptedException {
		page.click(pPage.buttonPlus);
		Log.info("�Ŵ�ͼƬ");
	}
	
	//��СͼƬ
	public void clickMinusImage() throws InterruptedException {
		page.click(pPage.buttonMinus);
		Log.info("��СͼƬ");
	}
	
	//���ȷ��ͼƬ��ť
	public void submitImage() throws InterruptedException {
		page.click(pPage.buttonSubmitImage);
		Log.info("���ȷ��ͼƬ");
	}
	
	//����ر��޸�ͼƬ��
	public void closeFrame() throws InterruptedException {
		page.click(pPage.buttonCloseFrame);
		Log.info("�ر��޸�ͼƬ��");
	}
	
	String iurl="http://127.0.0.1/index.php?s=/index/personal/saveinfo.html";
	String ititle="�������ϱ༭ - ShopXO";
	
	//���������һ��ҳ��
	public void clickReturn() throws InterruptedException {
		page.click(pPage.linkReturn);
		Log.info("���ظ�������ҳ��");
	}
	
	//�����ǳ�
	public void inputNickName(String text) throws InterruptedException {
		page.type(pPage.inputNickName, text);
		Log.info("�����ǳƣ�"+text);
	}
	
	//ѡ���Ա�
	public void selectGender(String text) throws InterruptedException {
		if(text=="����") {
			page.click(pPage.selectGenderSecrecy);
			Log.info("�Ա�"+text);
		}else if(text=="Ů") {
			page.click(pPage.selectGenderWomen);
			Log.info("�Ա�"+text);
		}else if(text=="��") {
			page.click(pPage.selectGenderMan);
			Log.info("�Ա�"+text);
		}else {
			Log.info("�Ա��������");
		}
	}
	
	//��������
	public void inputBirthday(String year,String month,String day) throws InterruptedException {
		page.dataPick(pPage.inputBirthday, year, month, day);
		Log.info("�������գ�"+year+month+day);
	}
	
	//����ύ����
	public void submitPersonalData() throws InterruptedException {
		page.click(pPage.buttonSubmit);
		Log.info("�ύ����");
	}
	
	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}

}
