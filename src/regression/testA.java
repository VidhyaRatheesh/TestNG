package regression;


import org.testng.annotations.Test;

public class testA 
{
	@Test(groups= {"regression"})
	public void homeLogin()
	{
		System.out.println("Home Insurance Login");
	}
		

	@Test
	public void homeLogout()
	{
		System.out.println("Home Insurance Logout");
	}
	
	@Test
	public void gardenlogin()
	{
		System.out.println("garden login");
	}
	@Test
	public void gardenlogout()
	{
		System.out.println("garden logout");
	}


}
