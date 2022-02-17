package dependsOn;

import org.testng.annotations.Test;

public class TestB {
	
	// vehi1 is enabled so 
	@Test(enabled=false)
	public void Vehi1()
	{
		System.out.println("Vehicle Insurance Login is enabled");
	}
	

	@Test
	public void vehi2()
	{
		System.out.println("Vehicle Insurance Logout is not enabled");
	}

}
