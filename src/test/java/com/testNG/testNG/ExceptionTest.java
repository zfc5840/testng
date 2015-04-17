/**
 * Description: ExceptionTest.java
 * All Rights Reserved.
 * @version 1.0  2015-4-17 下午1:14:19  by 张富成（fc.zhang@zuche.com）创建
 */
package com.testNG.testNG;

import org.testng.annotations.Test;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-17 下午1:14:19  by 张富成（fc.zhang@zuche.com）创建
 */
public class ExceptionTest {

	 @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp="NullPoint")
	    public void testException(){
		 System.out.println("testException");
	        throw new IllegalArgumentException("NullPoint");
	    }
	
}
