package automation.genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Section2.Enter;
import genericLib.override;

public class ListenerImplementation implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		String tcname=result.getName();
		TakesScreenshot ts=(TakesScreenshot)Enter.Listenerdriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		System.out.println(tcname);

		File trg=new File("./screenshot./"+tcname+".png");
		try {
			FileUtils.copyFile(src, trg);
		}
		catch(IOException e) {
			
		}
	
	}

}
