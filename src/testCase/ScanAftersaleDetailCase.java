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
	
	//查看售后订单详情
	@Test
	public void scanAftersaleTest() throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.clickOpenMoreCondition();
		action.inputConditionType("仅退款");
		action.inputConditionStatus("待审核");
		action.clickConditionSearch();
		if(page.isTextExist("没有相关数据")) {
			Log.error("无售后订单");
		}else {
			action.openOrderDetail();
			assertTrue(page.isTextExist("订单售后已退货"));
			Log.info("打开售后订单详情");
		}
	}

}
