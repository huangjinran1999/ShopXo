package testCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.AddressAction;
import dataProvider.NsDataProvider;

public class EditAddressCase extends DriverBase{
	AddressAction action;
	LoginCase login;
	
	@BeforeMethod
	public void setup(){
		action=new AddressAction(page);
		login=new LoginCase();
	}
	
	//±à¼­µØÖ·ÒµÎñ
	@Test(dataProvider="address",dataProviderClass=NsDataProvider.class)
	public void editAddressTest(String name,String phone,String province,String city,String county,String formAddress) throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.clickEditAddress();
		action.editAddress(name, phone, province, city, county, formAddress);
	}
}
