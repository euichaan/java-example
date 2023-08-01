package me.euichan.junit;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Assert {

	public static void assertTrue(boolean condition) {
		if (!condition) {
			throw new AssertionFailedError();
		}
		log.info("Test Passed");
	}
}
