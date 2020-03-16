package testCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.IntegralAction;
import PageAction.MessageAction;
import utils.Log;

public class ScanMessageCase extends DriverBase{
	MessageAction action;
	LoginCase login;
	
	@BeforeMethod
	public void setup(){
		action=new MessageAction(page);
		login=new LoginCase();
	}
	
	//�鿴��Ϣ
	@Test
	public void scanIntegralTest() throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.search("����");
		action.clickOpenMoreCondition();
		action.inputConditionType("Ĭ��");
		action.inputConditionBusiness("Ĭ��");
		action.inputConditionStatus("�Ѷ�");
		action.clickSearchCondition();
		if(page.isTextExist("û���������")) {
			Log.error("����Ϣ");
		}else {
			action.clickMessageDetail();
			action.clickCloseMessageDetail();
			Log.info("�鿴��Ϣ�ɹ�");
		}
	}

}
