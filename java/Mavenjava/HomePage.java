package Mavenjava;

import java.io.IOException;

import org.testng.annotations.Test;

import resources.base;

public class HomePage extends base{
	
	@Test
	public void basepagenavigation() throws IOException 
	{
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
	}

}
