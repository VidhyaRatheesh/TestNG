package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class home1 {
	

	@Test(dataProvider="getData")
	public void demo(String uname,String pass)
	{
		System.out.println("Home Insurance Login");	
		System.out.println(uname);
		System.out.println(pass);
		
	}		

	@Parameters({"URL","username","password"})
	@Test
	public void demo1(String url, String uname,String pass)
	{
		System.out.println("Output from url");
		System.out.println(url);
		System.out.println(uname);
		System.out.println(pass);
		
		
	}	 
	
	@Test
	public void demo2()
	{
		System.out.println("Home Insurance clearing");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object [][] data = new Object[3][2];
		data[0][0]="Suser";
		data[0][1]="Spswd";
		data[1][0]="Auser";
		data[1][1]="Apswd";
		data[2][0]="Nuser";
		data[2][1]="Npswd";
		return data;
	}
	
	

}
