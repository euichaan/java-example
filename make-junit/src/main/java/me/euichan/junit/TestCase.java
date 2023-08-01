package me.euichan.junit;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class TestCase {

	protected final String fName;

	public TestCase(final String fName) {
		this.fName = fName;
	}

	public abstract void run();
}
