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
	
	//查看消息
	@Test
	public void scanIntegralTest() throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.search("积分");
		action.clickOpenMoreCondition();
		action.inputConditionType("默认");
		action.inputConditionBusiness("默认");
		action.inputConditionStatus("已读");
		action.clickSearchCondition();
		if(page.isTextExist("没有相关数据")) {
			Log.error("无消息");
		}else {
			action.clickMessageDetail();
			action.clickCloseMessageDetail();
			Log.info("查看消息成功");
		}
	}

}
