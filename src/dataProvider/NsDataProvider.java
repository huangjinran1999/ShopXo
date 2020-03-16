package dataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class NsDataProvider {

	
	@DataProvider(name="txt")
	public  Object[][] getTxtData() throws IOException{
		return new  TxtDataProvider().getTxtUser(".\\data\\user.cvs");
	}
	@DataProvider(name="login")
	public  Object[][] getExcelData() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("C:/Users/Sybil/eclipseWorkspace/shopXo/src/data/login.xlsx","Sheet1");
	}
	
	@DataProvider(name="address")
	public Object[][] getExcelDada() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("C:/Users/Sybil/eclipseWorkspace/shopXo/src/data/address.xlsx","Sheet1");
	}
	
}
