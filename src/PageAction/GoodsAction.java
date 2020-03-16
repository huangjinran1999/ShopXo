package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.CollectionPage;
import Page.GoodsPage;
import utils.Log;

public class GoodsAction extends LoadableComponent{
	private BasePage page;
	private GoodsPage gPage;
	String url;
	String title;
	
	public GoodsAction(BasePage page){
		this.page=page;
		this.gPage=PageFactory.initElements(page.getDriver(), GoodsPage.class);
	}
	
	//���������
	public void load() {}
	
	//��ȡurl
	public String getUrl(int goodsId) {
		if(goodsId==1) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/1.html";
			title="MIUI/С�� С���ֻ�4 С��4�� MI4����4G�ֻ����� ��ɫ D-LTE��4G��/TD-SCD";
		}else if(goodsId==2) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/2.html";
			title="ƻ����Apple��iPhone 6 Plus (A1524)�ƶ���ͨ����4G�ֻ� ��ɫ 16G";
		}else if(goodsId==3) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/3.html";
			title="Samsung/���� SM-G8508S GALAXY Alpha�ĺ������ֻ� ��Ʒ ��ҫ��";
		}else if(goodsId==4) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/4.html";
			title="Huawei/��Ϊ H60-L01 ��ҫ6 �ƶ�4G�������ֻ� ��׿";
		}else if(goodsId==5) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/5.html";
			title="Meizu/���� MX4 Pro�ƶ��� �˺˴��������ֻ� ��ɫ 16G";
		}else if(goodsId==6) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/6.html";
			title="vivo X5MAX L �ƶ�4G �˺˳�������5.5��˫���ֻ�vivoX5max";
		}else if(goodsId==7) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/7.html";
			title="Ŧ֥������Ůʿ2018�¿�ٴ��ʱ�е���б�����ŮС�������";
		}else if(goodsId==8) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/8.html";
			title="MARNI Trunk Ůʿ �к�ƴɫʮ����СţƤ б����ٰ�";
		}else if(goodsId==9) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/9.html";
			title="˯��Ů���䴺�＾���޺���Ůʿ���뱡��ļ�ȫ�޼Ҿӷ�������װ";
		}else if(goodsId==10) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/10.html";
			title="��װŮװ������������ͬ��һ����¶����ɫ��˿������������ȹ���";
		}else if(goodsId==11) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/11.html";
			title="�ļ�����ins�������SPͬ�� �����Բ������ɫ��˿�廨��������ȹ";
		}else if(goodsId==12) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/12.html";
			title="ZK��������ȹ";
		}
		return url;
	}
		
	//�����ƷͼƬ
	public void clickGoodsImage() throws InterruptedException {
		page.click(gPage.selectGoodsImage);
		Log.info("�����ƷͼƬ");
	}
	
	//�鿴��Ʒ��Ƶ
	public void checkGoodsVideo() throws InterruptedException {
		page.click(gPage.selectGoodsVideo);
		page.operateVideo(gPage.video);
		Log.info("�鿴��Ʒ��Ƶ");
	}
	
	//����ر���Ʒ��Ƶ
	public void clickCloseVideo() throws InterruptedException {
		page.click(gPage.buttonCloseVideo);
		Log.info("�ر���Ƶ");
	}
	
	//���ѡ����Ʒ2�ײ�
	public void clickSelectGoods2Package(String text) throws InterruptedException {
		if(text=="�ײ�һ") {
			page.click(gPage.selectPackage1);
			Log.info("ѡ��"+text);
		}else if(text=="�ײͶ�") {
			page.click(gPage.selectPackage2);
			Log.info("ѡ��"+text);
		}else {
			Log.error("�ײʹ���");
		}
	}
	
	//���ѡ����Ʒ2��ɫ
	public void clickSelectGoods2Color(String text) throws InterruptedException {
		if(text=="��ɫ") {
			page.click(gPage.selectColorGold);
			Log.info("ѡ��"+text);
		}else if(text=="��ɫ") {
			page.click(gPage.selectColorSilver);
			Log.info("ѡ��"+text);
		}else {
			Log.error("��ɫ����");
		}
	}
	
	//���ѡ����Ʒ9��ɫ
	public void clickSelectGoods9Color(String text) throws InterruptedException {
		if(text=="��ɫ") {
			page.click(gPage.selectColorWhite);
			Log.info("ѡ��"+text);
		}else if(text=="��ɫ") {
			page.click(gPage.selectColorPink);
			Log.info("ѡ��"+text);
		}else if(text=="��ɫ") {
			page.click(gPage.selectColorBlack);
			Log.info("ѡ��"+text);
		}else {
			Log.error("��ɫ����");
		}
	}
	
	//���ѡ����Ʒ12��ɫ
	public void clickSelectGoods12Color(String text) throws InterruptedException {
		if(text=="��ɫ") {
			page.click(gPage.selectColorPink);
			Log.info("ѡ��"+text);
		}else if(text=="��ɫ") {
			page.click(gPage.selectColorWhite);
			Log.info("ѡ��"+text);
		}else {
			Log.error("��ɫ����");
		}
	}
	
	//���ѡ����Ʒ2����
	public void clickSelectGoods2Capacity(String text) throws InterruptedException {
		if(text=="32G") {
			page.click(gPage.selectCapacity32);
			Log.info("ѡ��"+text);
		}else if(text=="64G") {
			page.click(gPage.selectCapacity64);
			Log.info("ѡ��"+text);
		}else if(text=="128G") {
			page.click(gPage.selectCapacity128);
			Log.info("ѡ��"+text);
		}else {
			Log.error("��������");
		}
	}
	
	//���ѡ����Ʒ12����
	public void clickSelectGoods12Size(String text) throws InterruptedException {
		if(text=="S") {
			page.click(gPage.selectSizeS);
			Log.info("ѡ��"+text);
		}else if(text=="M") {
			page.click(gPage.selectSizeM);
			Log.info("ѡ��"+text);
		}else if(text=="L") {
			page.click(gPage.selectSizeL);
			Log.info("ѡ��"+text);
		}else {
			Log.error("�������");
		}
	}
	
	//���ѡ����Ʒ11����
	public void clickSelectGoods11Size(String text) throws InterruptedException {
		if(text=="M") {
			page.click(gPage.selectSizeM);
			Log.info("ѡ��"+text);
		}else if(text=="L") {
			page.click(gPage.selectSizeL);
			Log.info("ѡ��"+text);
		}else if(text=="XL") {
			page.click(gPage.selectSizeXL);
			Log.info("ѡ��"+text);
		}else {
			Log.error("�������");
		}
	}
	
	//���ѡ����Ʒ9����
	public void clickSelectGoods9Size(String text) throws InterruptedException {
		if(text=="S") {
			page.click(gPage.selectSizeS);
			Log.info("ѡ��"+text);
		}else if(text=="M") {
			page.click(gPage.selectSizeM);
			Log.info("ѡ��"+text);
		}else if(text=="L") {
			page.click(gPage.selectSizeL);
			Log.info("ѡ��"+text);
		}else if(text=="XL") {
			page.click(gPage.selectSizeXL);
			Log.info("ѡ��"+text);
		}else {
			Log.error("�������");
		}
	}

	//������Ʒ����
	public void inputGoodsNumber(String number) throws InterruptedException {
		int n=Integer.parseInt(number);
		if(n>=0&&n<=this.checkGoodsInventory()) {
			page.type(gPage.inputNumber, number);
			Log.info("ѡ����Ʒ������"+number);
		}else {
			Log.error("��Ʒ��������");
		}
	}
	
	//�鿴��Ʒ��沢����
	public int checkGoodsInventory() {
		String inventory= page.getElementAttribute(gPage.getAttributeInventory, "data-original-stock");
		int store=Integer.parseInt(inventory);
		Log.info("�������Ϊ��"+inventory);
		return store;
	}
	
	//����ղ���Ʒ
	public void clickFavor() throws InterruptedException {
		page.click(gPage.buttonFavor);
		Log.info("����ղ���Ʒ");
	}
	
	//�������������Ʒ
	public void clickBuy() throws InterruptedException {
		page.click(gPage.buttonBuy);
		Log.info("�����������");
		
	}
	
	//�������Ʒ���빺�ﳵ
	public void clickJoinCart() throws InterruptedException {
		page.click(gPage.buttonJoinCart);
		Log.info("������빺�ﳵ");
	}
	
	//����frame
	public void enterFrame() throws InterruptedException {
		page.enterFrame(gPage.iframe);
		Log.info("�����¼frame");
	}
	
	//�������ע��ҳ��
	public void clickLinkRegister() throws InterruptedException {
		page.click(gPage.linkFrameRegister);
		Log.info("����ע��ҳ��");
	}
	
	//iframe�������˺�
	public void inputUserName(String text) throws InterruptedException {
		page.type(gPage.inputUserName, text);
		Log.info("�����¼�˺ţ�"+text);
	}
	
	//iframe����������
	public void inputPassword(String text) throws InterruptedException {
		page.type(gPage.inputPassword, text);
		Log.info("�����¼���룺"+text);
	}
	
	//iFrame�����¼
	public void clickIframeLogin() throws InterruptedException {
		page.click(gPage.buttonSubmit);
		Log.info("�����¼");
	}
	
	//���������������ҳ��
	public void clickLinkForgetPassword() throws InterruptedException {
		page.click(gPage.linkForgetPassword);
		Log.info("������������ҳ��");
	}
	
	//�˳�frame
	public void leaveFrame() throws InterruptedException {
		page.leaveFrame();
		Log.info("�˳���¼frame");
	}

	//����鿴��Ʒ����
	public void clickCheckDetail() throws InterruptedException {
		page.click(gPage.selectDetail);
		if(page.isTextExist("��Ʒϸ��")) {
			Log.info("�鿴��Ʒ����");
		}else {
			Log.error("�鿴��Ʒ����ʧ��");
		}
	}
	
	//����鿴��Ʒ����
	public void clickCheckComment() throws InterruptedException {
		page.click(gPage.selectComments);
		if(page.isTextExist("��̬����")) {
			Log.info("�鿴��Ʒ����");
		}else {
			Log.error("�鿴����ʧ��");
		}
		
	}
	
	//����鿴����ϲ��
	public void clickCheckGuess() throws InterruptedException {
		page.click(gPage.selectOtherGoods);
		Log.info("�鿴����ϲ��");
	}
	
	//����鿴������Ʒ
	public void clickOtherGoods() throws InterruptedException {
		page.click(gPage.linkOtherGoods);
		Log.info("�鿴������Ʒ");
	}

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}

}

