package listenersPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener
{
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("This test case is passed");
	}
	
   public void onTestFailure(ITestResult result)
   {
	   
	   System.out.println("This test case is failed :  " +result.getTestName());
	   System.out.println("This test case is failed :  " +result.getName());
   }
   }

