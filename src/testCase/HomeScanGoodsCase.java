package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.CategoryAction;
import PageAction.HomeAction;

public class HomeScanGoodsCase extends DriverBase{
	HomeAction action;
	
	@BeforeMethod
	public void setup(){
		action=new HomeAction(page);
	}
	
	// ◊“≥‰Ø¿¿…Ã∆∑
	@Test
	public void scanGoodsTest() throws InterruptedException{
		action.load();
		action.clickGoodsPage(1);
		Thread.sleep(3000);
	}

}
