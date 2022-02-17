package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class para3 {
	
	@Parameters({"URL"})
	@Test
	public void GardenLogin(String url)
	{
		System.out.println("GardenLogin in parameters");
		System.out.println(url);
	}	
	
	@Test
	public void GardenLogout()
	{
		System.out.println("GardenLogout in parameters");
	}

}
