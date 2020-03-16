package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.BrowseAction;
import PageAction.CartAction;
import PageAction.OrderSubmitAction;
import dataProvider.NsDataProvider;
import utils.Log;

public class CartBuyCase extends DriverBase{
	CartAction action;
	OrderSubmitAction action2;
	LoginCase login;
	
	@BeforeMethod
	public void setup(){
		action=new CartAction(page);
		action2=new OrderSubmitAction(page);
		login=new LoginCase();
	}
	
	//���ﳵ��Ʒ�޸���Ŀ������
	@Test(dataProvider="address",dataProviderClass=NsDataProvider.class)
	public void cartAccountTest(String name,String phone,String province,String city,String county,String formAddress) throws InterruptedException{
		if(page.isTextExist("��¼")) {
			login.setup();
			login.loginTest("admin", "123456");
			Thread.sleep(3000);
		}
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.clickSelectGoods();
		action.inputGoodsNumber("1");
		action.clickAccountCart();
		assertTrue(page.isTextExist("�����ȡ��"));
		Thread.sleep(3000);
		action2.clickEditAddress();
		action2.editAddress(name, phone, province, city, county, formAddress);
		action2.clickdefault("yes");
		action2.selectPayWay("�ֽ�֧��");
		action2.submitOrder();
		Thread.sleep(3000);
		action2.openMyOrder();
		Log.info("����ɹ�");
	}
	
	//�����ύ
/*	@Test(dataProvider="address",dataProviderClass=NsDataProvider.class)
	public void orderSubmitTest(String name,String phone,String province,String city,String county,String formAddress) throws InterruptedException{
		page.open(action.getOrderUrl());
		Thread.sleep(3000);
		action2.clickEditAddress();
		action2.editAddress(name, phone, province, city, county, formAddress);
		action2.selectPayWay("�ֽ�֧��");
		action2.submitOrder();
		assertTrue(page.isTextExist("֧���ɹ�"));
	}
*/	

}
