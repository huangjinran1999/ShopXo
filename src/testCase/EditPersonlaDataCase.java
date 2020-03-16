package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.OrderCommentAction;
import PageAction.OrderManageAction;
import PageAction.PersonalDataAction;
import utils.Log;

public class EditPersonlaDataCase extends DriverBase{
	PersonalDataAction action;
	LoginCase login;
	
	@BeforeMethod
	public void setup(){
		action=new PersonalDataAction(page);
		login=new LoginCase();
	}
	
	//编辑个人资料
	@Test
	public void criticTest() throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.clickEditData();
		action.inputNickName("yuzu");
		action.selectGender("男");
		action.inputBirthday("1994", "12", "07");
		action.submitPersonalData();
		assertTrue(page.isTextExist("yuzu"));
	}

}
