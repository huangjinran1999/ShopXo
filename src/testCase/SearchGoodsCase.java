package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverBase;
import PageAction.LoginAction;
import PageAction.SearchAction;
import dataProvider.NsDataProvider;

public class SearchGoodsCase extends DriverBase{
	SearchAction action;
	
	@BeforeMethod
	public void setup(){
		action=new SearchAction(page);
	}
	
	//������Ʒ�������Ʒ
	@Test
	public void searchGoodsTest() throws InterruptedException{
		page.open(action.getUrl());
		Thread.sleep(3000);
		action.search("�ֻ�");
		action.selectSort("����칫");
		action.clickPricesOrder();
		action.openGoods1();
		assertTrue(page.isTextExist(page.getTitle()));
	}
	

}
