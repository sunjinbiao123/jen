package com.webtest.dataprovider;

import org.testng.annotations.Test;

public class DEmo222 {
	@Test(dataProvider="para2",dataProviderClass=NSDataProvider.class)
	public void test1(String a1,String a2) {

		System.out.print("a1");
	//	System.out.println(a2);
		
		
		
		
	}
	

}
