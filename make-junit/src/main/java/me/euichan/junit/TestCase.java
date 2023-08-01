package me.euichan.junit;

import java.lang.reflect.Method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class TestCase {

	protected final String fName;

	public TestCase(final String fName) {
		this.fName = fName;
	}

	protected void setUp() {}

	public void run() {
		setUp();
		runTest();
		tearDown();
	}

	protected void runTest() {
		try {
			Method method = this.getClass().getMethod(fName, null);
			log.info("{} execute", fName);
			method.invoke(this, null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected void tearDown() {}
}
