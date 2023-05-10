package testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class FetchClass extends BaseClass{
	@Test
	public void itle()
	cu.titleWait("Enter Time-Track",driver);
	System.out.println(driver.getTitle());
	Reporter.log("fetch title successful");
	Reporter.log("tc is passed",true);
	
}
}
