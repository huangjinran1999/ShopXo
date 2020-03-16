package testCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.MessageAction;
import PageAction.OrderAftersaleAction;
import utils.Log;

public class CancelAftersaleCase extends DriverBase{
	OrderAftersaleAction action;
	LoginCase login;
	
	@BeforeMethod
	public void setup(){
		action=new OrderAftersaleAction(page);
		login=new LoginCase();
	}
	
	//ɾ���ۺ󶩵�
	@Test
	public void cancelAftersaleTest() throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.clickOpenMoreCondition();
		action.inputConditionType("���˿�");
		action.inputConditionStatus("�����");
		action.clickConditionSearch();
		if(page.isTextExist("û���������")) {
			Log.error("���ۺ󶩵�");
		}else {
			action.clickDeleteOrder("cancel");
			Log.info("ȡ���ۺ󶩵�");
		}
	}

}
