package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.CollectionAction;
import PageAction.GoodsAction;
import utils.Log;

public class AddGoodsCartCase extends DriverBase{
	GoodsAction action;
	LoginCase login;
	
	@BeforeMethod
	public void setup(){
		action=new GoodsAction(page);
		login=new LoginCase();
	}
	
	//����Ʒ���빺�ﳵ/String pac,String color,String cap,String number
	@Test
	public void cancelCollectionTest() throws InterruptedException{
		if(page.isTextExist("��¼")) {
			login.setup();
			login.loginTest("admin", "123456");
			Thread.sleep(3000);
		}
		Thread.sleep(3000);
		//action.clickSelectGoods2Package("�ײ�һ");
		//Thread.sleep(3000);
		//action.clickSelectGoods2Color("��ɫ");
		//Thread.sleep(3000);
		//action.clickSelectGoods2Capacity("64G");
		action.inputGoodsNumber("2");
		action.clickJoinCart();
		Log.info("��Ʒ���빺�ﳵ�ɹ�");
	}

}
