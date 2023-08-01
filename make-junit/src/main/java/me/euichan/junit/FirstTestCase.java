package me.euichan.junit;

public class FirstTestCase {

	public static void main(String[] args) {
		new FirstTestCase().runTest();
	}

	public void runTest() {
		int sum = 10 + 10;
		Assert.assertTrue(sum == 20);
	}
}
