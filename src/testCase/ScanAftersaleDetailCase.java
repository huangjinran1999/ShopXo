package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.OrderAftersaleAction;
import utils.Log;

public class ScanAftersaleDetailCase extends DriverBase{
	OrderAftersaleAction action;
	LoginCase login;
	
	@BeforeMethod
	public void setup(){
		action=new OrderAftersaleAction(page);
		login=new LoginCase();
	}
	
	//�鿴�ۺ󶩵�����
	@Test
	public void scanAftersaleTest() throws InterruptedException{
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
			action.openOrderDetail();
			assertTrue(page.isTextExist("�����ۺ����˻�"));
			Log.info("���ۺ󶩵�����");
		}
	}

}
