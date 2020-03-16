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
	
	//删除售后订单
	@Test
	public void cancelAftersaleTest() throws InterruptedException{
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
			action.clickDeleteOrder("cancel");
			Log.info("取消售后订单");
		}
	}

}
