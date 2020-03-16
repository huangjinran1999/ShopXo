package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.AddressAction;
import PageAction.BrowseAction;
import dataProvider.NsDataProvider;
import utils.Log;

public class CancelBrowseCase extends DriverBase{
	BrowseAction action;
	LoginCase login;
	
	@BeforeMethod
	public void setup(){
		action=new BrowseAction(page);
		login=new LoginCase();
	}
	
	//������ɾ�������¼
	@Test
	public void cancelBrowseTest(String search,String option) throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.inputSearchBody(search);
		if(page.isTextExist(" û���������")) {
			Log.info("�޴���Ʒ��¼");
		}else {
			action.clickDeleteGoods(option);
			assertTrue(action.is_delete());
		}
	}

}
