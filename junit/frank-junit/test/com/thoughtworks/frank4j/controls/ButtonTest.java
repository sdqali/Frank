package com.thoughtworks.frank4j.controls;

import static org.junit.Assert.*;

import org.junit.Test;

public class ButtonTest {

	@Test
	public void testQuery() {
		FrankButton button = new FrankButton("foo");
		assertEquals("button marked:foo", button.controlQuery());
	}

	@Test
	public void testExists() {
		FrankButton button = new FrankButton("foo");
		assertEquals("accessibilityLabel", button.existsMethod());
	}
}
