package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.OrderAftersaleDetailAction;
import PageAction.OrderManageAction;
import utils.Log;

public class ApplyRefundCase  extends DriverBase{
	OrderManageAction action;
	OrderAftersaleDetailAction action2;
	LoginCase login;
	
	@BeforeMethod
	public void setup(){
		action=new OrderManageAction(page);
		action2=new OrderAftersaleDetailAction(page);
		login=new LoginCase();
	}
	
	//��������-���˻��˿�
	@Test
	public void applyAftersaleTest() throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.openMoreCondition();
		action.inputOrderStatus("������");
		action.clickSearchCondition();
		if(page.isTextExist("û���������")) {
			Log.error("û����ض���");
		}else {
			action.clickApplyRefund();
			Thread.sleep(3000);
			page.getNewWindow();
			action2.clickOnlyRefund();
			action2.inputRefundReason("�հ���");
			action2.inputRefundMessage("aaaaaaaaaaaaaaaaa");
			action2.clickSubmitApply();
			Thread.sleep(3000);
			assertTrue(page.isTextExist("�����ۺ����˻�"));
		}	
	}

}
