/**
 * Description: DepensTest.java
 * All Rights Reserved.
 * @version 1.0  2015-4-17 下午1:48:32  by 张富成（fc.zhang@zuche.com）创建
 */
package com.testNG.testNG;

import org.testng.annotations.Test;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-17 下午1:48:32  by 张富成（fc.zhang@zuche.com）创建
 */
public class DepensTest {

	
    
    @Test(dependsOnMethods = {"setupEnv"})
    public void testMessage(){
        System.out.println("this is test message");
    }
    
    @Test
    public void setupEnv(){
        System.out.println("this is setup Env");
    }
	
}
