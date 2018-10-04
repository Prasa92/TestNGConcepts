package TestNG.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import retryanalyser.RetryAnalyser;

public class TestngPractice{

	@Test
	public void test1() {
		Assert.assertEquals(true,false);
		System.out.println("Test1");
	}
	@Test
	public void test2() {
		Assert.assertEquals(false,false);
		System.out.println("Result is Correct PASS");
	}
}
