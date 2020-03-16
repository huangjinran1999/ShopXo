package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.OrderAftersaleDetailAction;
import PageAction.OrderCommentAction;
import PageAction.OrderManageAction;
import utils.Log;

public class OrderCriticCase extends DriverBase{
	OrderManageAction action;
	OrderCommentAction action2;
	LoginCase login;
	
	@BeforeMethod
	public void setup(){
		action=new OrderManageAction(page);
		action2=new OrderCommentAction(page);
		login=new LoginCase();
	}
	
	//��������-����������
	@Test
	public void criticTest() throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.openMoreCondition();
		action.inputCommentStatus("������");
		action.inputOrderStatus("�����");
		action.clickSearchCondition();
		if(page.isTextExist("û���������")) {
			Log.error("û����ض���");
		}else {
			action.openOrderComment();
			Thread.sleep(3000);
			page.getNewWindow();
			action2.clickCommentStart();
			action2.inputCommentBody("aaaaaaaaaaaaaaaaaaaa");
			action2.submitComment();
			Thread.sleep(3000);
			assertTrue(page.isTextExist("����ɸѡ����"));
		}
		
	}

}
