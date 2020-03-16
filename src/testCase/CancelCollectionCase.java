package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.CollectionAction;
import utils.Log;

public class CancelCollectionCase extends DriverBase{
	CollectionAction action;
	LoginCase login;
	
	@BeforeMethod
	public void setup(){
		action=new CollectionAction(page);
		login=new LoginCase();
	}
	
	//������ɾ���ղ���Ʒ
	@Test
	public void cancelCollectionTest() throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.inputSearchBody("С��");
		if(page.isTextExist(" û���������")) {
			Log.info("�޴���Ʒ");
		}else {
			action.clickDeleteGoods("yes");
			assertTrue(action.is_delete());
		}
	}

}
