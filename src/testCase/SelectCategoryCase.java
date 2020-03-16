package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.CartAction;
import PageAction.CategoryAction;
import PageAction.OrderSubmitAction;
import dataProvider.NsDataProvider;

public class SelectCategoryCase extends DriverBase{
	CategoryAction action;
	
	@BeforeMethod
	public void setup(){
		action=new CategoryAction(page);
	}
	
	//通过分类查看商品
	@Test
	public void categoryGoodsTest() throws InterruptedException{
		action.load();
		action.clickOpenSort1();
		action.clickOpenSort2();
		action.openGoods();
		assertTrue(action.checkGoods());
	}

}
