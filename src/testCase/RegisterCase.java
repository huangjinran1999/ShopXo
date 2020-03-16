package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.OrderCommentAction;
import PageAction.OrderManageAction;
import PageAction.RegisterAction;
import utils.Log;

public class RegisterCase extends DriverBase{
	RegisterAction action;
	
	@BeforeMethod
	public void setup(){
		action=new RegisterAction(page);
	}
	
	//×¢²á
	@Test
	public void registerTest() throws InterruptedException{
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.inputUserName("user26");
		action.inputPassword("123456");
		action.clickAgreement();
		action.submitRegister();
		Thread.sleep(3000);
		assertTrue(page.isTextExist("user26"));
		Log.info("×¢²á³É¹¦");
	}

}
