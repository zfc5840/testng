/**
 * Description: DemoTest.java
 * All Rights Reserved.
 * @version 1.0  2015-4-17 上午11:23:27  by 张富成（fc.zhang@zuche.com）创建
 */
package com.testNG.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-17 上午11:23:27  by 张富成（fc.zhang@zuche.com）创建
 */
public class DemoTest {

	@BeforeSuite
	public void beforeSuite(){
		System.out.println("beforeSuite");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("beforeClass");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("beforeTest");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("beforeMethod");
	}
	
	@Test
	public void test(){
		System.out.println("test");
	}
	
	@Test
	public void test2(){
		System.out.println("test2");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("afterMethod");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("afterTest");
	}
	
	
	@AfterClass
	public void afterClass(){
		System.out.println("afterClass");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("afterSuite");
	}
}
