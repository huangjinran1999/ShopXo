package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.GoodsAction;
import PageAction.IntegralAction;
import utils.Log;

public class ScanIntegralCase extends DriverBase{
	IntegralAction action;
	LoginCase login;
	
	@BeforeMethod
	public void setup(){
		action=new IntegralAction(page);
		login=new LoginCase();
	}
	
	//�鿴����
	@Test
	public void scanIntegralTest() throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.search("��¼");
		action.clickOpenMoreCondition();
		action.inputIntegralType("����");
		action.clickSearchCondition();
		if(page.isTextExist("û���������")) {
			Log.error("�޻���");
		}else {
			action.clickIntegralDetail();
			action.clickCloseIntegralDetail();
			Log.info("�鿴��Ʒ����ɹ�");
		}
	}

}
