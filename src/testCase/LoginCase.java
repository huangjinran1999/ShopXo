package testCase;



import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.LoginAction;
import dataProvider.NsDataProvider;

public class LoginCase extends DriverBase{
	static LoginAction action;
	
	@BeforeMethod
	public void setup(){
		action=new LoginAction(page);
	}
	
	//µÇÂ¼ÒµÎñ
	@Test(dataProvider="login",dataProviderClass=NsDataProvider.class)
	public static void loginTest(String name,String password) throws InterruptedException{
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.login(name, password);
		assertTrue(action.is_login());
	}
	
}
