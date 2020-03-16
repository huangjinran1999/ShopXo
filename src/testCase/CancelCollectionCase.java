package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.CollectionAction;
import utils.Log;

public class CancelCollectionCase extends DriverBase{
	CollectionAction action;
	LoginCase login;
	
	@BeforeMethod
	public void setup(){
		action=new CollectionAction(page);
		login=new LoginCase();
	}
	
	//搜索并删除收藏商品
	@Test
	public void cancelCollectionTest() throws InterruptedException{
		login.setup();
		login.loginTest("admin", "123456");
		Thread.sleep(3000);
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.inputSearchBody("小米");
		if(page.isTextExist(" 没有相关数据")) {
			Log.info("无此商品");
		}else {
			action.clickDeleteGoods("yes");
			assertTrue(action.is_delete());
		}
	}

}
