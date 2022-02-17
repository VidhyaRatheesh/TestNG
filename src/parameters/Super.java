package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Super
{
	@Parameters({"URL","username", "pass"})
	@Test
	public void superLogin(String url, String uname, String psw)
	{
		System.out.println("printing super login");
		System.out.print(url);
		System.out.print(uname);
		System.out.print(psw);
	}


}
