package me.euichan.junit;

import java.lang.reflect.Method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FirstTestCase extends TestCase {

	public FirstTestCase(final String fName) {
		super(fName);
	}

	public static void main(String[] args) {
		new FirstTestCase("runTest").run(); // 각각의 테스트 케이스를 Command로 보고, 이를 실행하는 것은 run 메서드
	}

	public void runTest() {
		int sum = 10 + 10;
		Assert.assertTrue(sum == 20);
	}

	@Override
	public void run() {
		try {
			Method method = this.getClass().getMethod(super.fName, null);
			log.info("super.fName= {}", super.fName);
			method.invoke(this, null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
