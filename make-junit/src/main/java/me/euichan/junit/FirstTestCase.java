package me.euichan.junit;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FirstTestCase extends TestCase {

	private static int base;

	public FirstTestCase(final String fName) {
		super(fName);
	}

	@Override
	public void setUp() {
		base = 10;
		log.info("setUp invoked");
	}

	public static void main(String[] args) {
		new FirstTestCase("runPlusTest").run(); // 각각의 테스트 케이스를 Command로 보고, 이를 실행하는 것은 run 메서드
		new FirstTestCase("runMinusTest").run();
	}

	public void runPlusTest() {
		int sum = base + 10;
		Assert.assertTrue(sum == 20);
	}

	public void runMinusTest() {
		int minus = base - 10;
		Assert.assertTrue(minus == 0);
	}
}
