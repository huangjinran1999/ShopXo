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
	
	//订单管理-》订单评论
	@Test
	public void criticTest() throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.openMoreCondition();
		action.inputCommentStatus("待评价");
		action.inputOrderStatus("已完成");
		action.clickSearchCondition();
		if(page.isTextExist("没有相关数据")) {
			Log.error("没有相关订单");
		}else {
			action.openOrderComment();
			Thread.sleep(3000);
			page.getNewWindow();
			action2.clickCommentStart();
			action2.inputCommentBody("aaaaaaaaaaaaaaaaaaaa");
			action2.submitComment();
			Thread.sleep(3000);
			assertTrue(page.isTextExist("更多筛选条件"));
		}
		
	}

}
