/**
 * Description: DataProviderTest.java
 * All Rights Reserved.
 * @version 1.0  2015-4-17 下午1:44:59  by 张富成（fc.zhang@zuche.com）创建
 */
package com.testNG.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-17 下午1:44:59  by 张富成（fc.zhang@zuche.com）创建
 */
public class DataProviderTest {
	    @DataProvider(name="user")
	    public Object[][] Users(){
	        return new Object[][]{
	                {"root","passowrd"},
	                {"cnblogs.com", "tankxiao"},
	                {"tank","xiao"}
	        };
	    }
	    
	    @Test(dataProvider="user")
	    public void verifyUser(String userName, String password){
	        System.out.println("Username: "+ userName + " Password: "+ password);
	    }
}
