package com.capgemini.day4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day4.Television;

class TelevisionTest {
	Television television;

	@BeforeEach
	void setup() {
		television = new Television(true, 10, 20);
	}

	@Test
	void testincreaseVolume() {
		assertEquals(11, television.incVolume());

	}

	@Test
	void testdecreaseVolume() {
		assertEquals(9, television.decVolume());

	}

	@Test
	void testchangeChannel() {
		assertEquals(100, television.changeChannel(100));
		assertEquals(200, television.changeChannel(200));
		
	}

	@Test
	void testturnOnOff() {
		assertEquals(false, television.turnOnOff());
	}

	@AfterEach
	void tearDown() {
		television = null;
	}
}
