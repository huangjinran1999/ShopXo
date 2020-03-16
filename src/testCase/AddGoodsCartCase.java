package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.CollectionAction;
import PageAction.GoodsAction;
import utils.Log;

public class AddGoodsCartCase extends DriverBase{
	GoodsAction action;
	LoginCase login;
	
	@BeforeMethod
	public void setup(){
		action=new GoodsAction(page);
		login=new LoginCase();
	}
	
	//将商品加入购物车/String pac,String color,String cap,String number
	@Test
	public void cancelCollectionTest() throws InterruptedException{
		if(page.isTextExist("登录")) {
			login.setup();
			login.loginTest("admin", "123456");
			Thread.sleep(3000);
		}
		Thread.sleep(3000);
		//action.clickSelectGoods2Package("套餐一");
		//Thread.sleep(3000);
		//action.clickSelectGoods2Color("金色");
		//Thread.sleep(3000);
		//action.clickSelectGoods2Capacity("64G");
		action.inputGoodsNumber("2");
		action.clickJoinCart();
		Log.info("商品加入购物车成功");
	}

}
