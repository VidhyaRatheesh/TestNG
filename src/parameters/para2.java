package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class para2 {
	
 	@Parameters({"URL"})
	@Test
	public void ShopLogin(String url)
	{
		System.out.println("ShopLogin in parameters");
	    System.out.println(url);
	}
	

	@Test
	public void ShopLogout()
	{
		System.out.println("ShopLogout in parameters");
	}


}
