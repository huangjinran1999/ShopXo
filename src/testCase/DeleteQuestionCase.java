package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.OrderCommentAction;
import PageAction.OrderManageAction;
import PageAction.QandAAction;
import utils.Log;

public class DeleteQuestionCase extends DriverBase{
	QandAAction action;
	LoginCase login;
	
	@BeforeMethod
	public void setup(){
		action=new QandAAction(page);
		login=new LoginCase();
	}
	
	//删除信息
	@Test
	public void deleteMessageTest() throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.openMoreCondition();
		action.inputConditionDisplay("不显示");
		action.inputConditionStatus("否");
		if(page.isTextExist("没有相关数据")) {
			Log.error("无相关数据");
		}else {
			action.openMessageDetail();
			assertTrue(page.isTextExist("详情内容"));
			action.closeMessageDetail();
			Thread.sleep(2000);
			action.clickDeleteMessage("cancel");
			Log.info("删除信息成功");
		}

		
	}

}
