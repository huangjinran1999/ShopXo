package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.google.common.io.Files;

import utils.Log;


//������������ʧ�ܣ�����

public class WebTestListener  extends TestListenerAdapter{

	  @Override
	  public void onTestFailure(ITestResult tr) {
		  
		  Log.error(tr.getInstance()+"-"+tr.getName()+"����ʧ�ܣ���Ҫ����");
		 // DriverBase tb = (DriverBase) tr.getInstance();
		 
         // WebDriver driver = tb.getDriver();    
		  try {
			new SeleniumScreenShot().screenShot(tr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		  
	  }
	  @Override
	  public void onTestSuccess(ITestResult tr) {
		  Log.info(tr.getInstance()+"-"+tr.getName()+"���гɹ�");
	  }
}
