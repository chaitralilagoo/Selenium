package testng;

import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automation.Parameterization;

public class TestAnnotation 
{
	String [] iArr = new String [15];
	String [] jArr = new String [15];
	String [] [] arr;
	
	@BeforeClass
	public void beforeClass() throws EncryptedDocumentException, IOException
	{
		System.out.println("Before Class");
		for(int i=0,j=0; i<10; i++,j++)
		{
			//for(int j=0; j<5; j++)
			{
				iArr[i] =Parameterization.getData("Sheet1", i, 0);
				jArr[j] =Parameterization.getData("Sheet1", i, 2);
			}
		}
//		System.out.println(Arrays.toString(iArr));
//		System.out.println(Arrays.toString(jArr));
	}
	@Test(priority = 1, timeOut = 4000)
	public void xtest1()
	{
		System.out.println("Test1");
	}
	@Test(invocationCount = 2)
	public void atest2()
	{
		System.out.println("Test2");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
//	@AfterClass
//	public void afterClass2()
//	{
//		System.out.println("After Class2");
//	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod//(invocationCount = 5): gives error
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	@Test(dependsOnMethods = {"test4"})
	public void mtest3()
	{
		System.out.println("Test3");
	}
	@Test(enabled = false)
	public void test4()
	{
		System.out.println("Test4");
	}
	@Test (timeOut = 2000)//, enabled = false)
	public void test5() throws InterruptedException
	{
		//Thread.sleep(4000);
		System.out.println("Test4");
	}
	@DataProvider (name = "IntData")
	public Object [] [] intData()
	{
		return new Object [] []  {{1,2},{3,4},{5,6}};
	}
	@Test  (dataProvider = "IntData")
	public void parameteriseAnno(int a, int b) //throws InterruptedException
	{
		//Thread.sleep(4000);
		System.out.println(a+b);
	}
	@DataProvider (name = "StringData")
	public Object [] [] strData()
	{
		return new Object [] []  {{"Hello","Everyone!"},{"Welcome","Everyone."},{"What's","up?"}};
	}
	@Test  (dataProvider = "StringData")
	public void parameteriseAnnoStr(String a, String b) //throws InterruptedException
	{
		//Thread.sleep(4000);
		System.out.println(a+" "+b);
	}
	@DataProvider (name = "ArrayData")
	public Object [] [] arrData()
	{
		return new Object [] []  {{iArr[0],jArr[0]},{iArr[1],jArr[1]},{iArr[2],jArr[2]}};
	}
	@Test  (dataProvider = "ArrayData")
	public void parameteriseAnnoArr(String a, String b) //throws InterruptedException
	{
		//Thread.sleep(4000);
		System.out.println(a+" "+b);
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
}
