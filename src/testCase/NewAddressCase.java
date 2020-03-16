package testCase;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.AddressAction;
import PageAction.LoginAction;
import dataProvider.ExcelDataProvider;
import dataProvider.NsDataProvider;

public class NewAddressCase extends DriverBase{
	AddressAction action;
	LoginCase login;
	
	@BeforeMethod
	public void setup(){
		action=new AddressAction(page);
		login=new LoginCase();
	}
	
	//新建地址业务
	@Test(dataProvider="address",dataProviderClass=NsDataProvider.class)
	public void newAddressTest(String name,String phone,String province,String city,String county,String formAddress) throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.clickNewAddress();
		action.editAddress(name, phone, province, city, county, formAddress);
	}
	
}

