/**
 * Description: GroupTest.java
 * All Rights Reserved.
 * @version 1.0  2015-4-17 下午1:17:04  by 张富成（fc.zhang@zuche.com）创建
 */
package com.testNG.testNG;

import org.testng.annotations.Test;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-17 下午1:17:04  by 张富成（fc.zhang@zuche.com）创建
 */
public class GroupTest {

	    @Test(groups = {"systemtest"})
	    public void testLogin(){
	        System.out.println("this is test login");
	    }
	    
	    @Test(groups = {"functiontest"})
	    public void testOpenPage(){
	        System.out.println("functiontest");
	    }
}
