package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.GoodsAction;
import PageAction.SecuritySetAction;
import utils.Log;

public class EditPasswordCase extends DriverBase{
	SecuritySetAction action;
	LoginCase login;
	
	@BeforeMethod
	public void setup(){
		action=new SecuritySetAction(page);
		login=new LoginCase();
	}
	
	//修改密码
	@Test
	public void editPasswordTest() throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		action.clickEditPassword();
		action.inputCurrentPassword("123456");
		action.inputNewPassword("123456");
		action.reputNewPassword("123456");
		action.submitPassword();
		assertTrue(page.isTextExist("互联网存在被盗风险"));
		Log.info("密码修改成功");
	}

}
