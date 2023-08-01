package me.euichan.junit;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FirstTestCase extends TestCase {

	public FirstTestCase(final String fName) {
		super(fName);
	}

	public static void main(String[] args) {
		new FirstTestCase("runTest").run(); // 각각의 테스트 케이스를 Command로 보고, 이를 실행하는 것은 run 메서드
		new FirstTestCase("runTestMinus").run();
		new FirstTestCase("runTestFail").run();
	}

	public void runTest() {
		int sum = 10 + 10;
		Assert.assertTrue(sum == 20);
	}

	public void runTestMinus() {
		int sum = 10 - 10;
		Assert.assertTrue(sum == 0);
	}

	public void runTestFail() {
		int sum = 10 + 10;
		Assert.assertTrue(sum == 30);
	}
}
