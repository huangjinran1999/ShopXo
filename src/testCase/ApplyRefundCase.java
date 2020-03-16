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
	
	//订单管理-》退货退款
	@Test
	public void applyAftersaleTest() throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.openMoreCondition();
		action.inputOrderStatus("待发货");
		action.clickSearchCondition();
		if(page.isTextExist("没有相关数据")) {
			Log.error("没有相关订单");
		}else {
			action.clickApplyRefund();
			Thread.sleep(3000);
			page.getNewWindow();
			action2.clickOnlyRefund();
			action2.inputRefundReason("空包裹");
			action2.inputRefundMessage("aaaaaaaaaaaaaaaaa");
			action2.clickSubmitApply();
			Thread.sleep(3000);
			assertTrue(page.isTextExist("订单售后已退货"));
		}	
	}

}
