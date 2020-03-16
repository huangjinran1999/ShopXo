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
	
	//ɾ����Ϣ
	@Test
	public void deleteMessageTest() throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.openMoreCondition();
		action.inputConditionDisplay("����ʾ");
		action.inputConditionStatus("��");
		if(page.isTextExist("û���������")) {
			Log.error("���������");
		}else {
			action.openMessageDetail();
			assertTrue(page.isTextExist("��������"));
			action.closeMessageDetail();
			Thread.sleep(2000);
			action.clickDeleteMessage("cancel");
			Log.info("ɾ����Ϣ�ɹ�");
		}

		
	}

}
