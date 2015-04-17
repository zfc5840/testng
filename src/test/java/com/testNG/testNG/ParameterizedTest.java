/**
 * Description: ParameterizedTest.java
 * All Rights Reserved.
 * @version 1.0  2015-4-17 下午1:42:00  by 张富成（fc.zhang@zuche.com）创建
 */
package com.testNG.testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-17 下午1:42:00  by 张富成（fc.zhang@zuche.com）创建
 */
public class ParameterizedTest {

	@Test
    @Parameters("test1")
    public void ParaTest(String test1){
        System.out.println("This is " + test1);
    }
	
}
