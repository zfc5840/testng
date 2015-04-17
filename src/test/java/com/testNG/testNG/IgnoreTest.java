/**
 * Description: IgnoreTest.java
 * All Rights Reserved.
 * @version 1.0  2015-4-17 下午1:46:43  by 张富成（fc.zhang@zuche.com）创建
 */
package com.testNG.testNG;

import org.testng.annotations.Test;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-17 下午1:46:43  by 张富成（fc.zhang@zuche.com）创建
 */
public class IgnoreTest {
   
	@Test(enabled=false)
	public void ignore(){
		System.out.println("ignore");
	}
}
