package listenersPackage;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeListener 
{
	@Test
	public void homee()
	{
		System.out.println("output for listener error");
		Assert.assertTrue(false);
	}

	@Test
	public void homee1()
	{
		System.out.println("output for listener ");
		Assert.assertTrue(true);
	}
}
