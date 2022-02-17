package dependsOn;

import org.testng.annotations.Test;

public class TestC {
	@Test
	public void dogLogin()
	{
		System.out.println("Dog Insurance Login in depends on");
	}
	

	@Test(dependsOnMethods={"dogLogin"})
	public void dogLogout()
	{
		System.out.println("Dog Insurance Logout in depends on");
	}

}
