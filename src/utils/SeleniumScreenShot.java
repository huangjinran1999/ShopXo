package utils;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

import com.google.common.io.Files;

import Base.DriverBase;

//½ØÆÁ
public class SeleniumScreenShot {

	public void screenShot(ITestResult tr) throws IOException{
		//Ê§°ÜÓÃÀý½ØÆÁ
		SimpleDateFormat now=new SimpleDateFormat("yyyyMMdd-HHmmss");
		String nowDate=now.format(new Date());
		File file=((TakesScreenshot) DriverBase.driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(file, new File("E:\\shopxoTest\\"+nowDate+".jpg"));
			Log.info("½ØÆÁµØÖ·Îª£ºE:\\shopxoTest\\"+nowDate+".jpg");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
	
