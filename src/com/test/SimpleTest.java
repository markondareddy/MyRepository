package com.test;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class SimpleTest {

	private Collection collection;

	@BeforeClass
	public static void oneTimeSetUp() {
		// one-time initialization code
		System.out.println("Enter oneTimeSetUp()");
	}

	@AfterClass
	public static void oneTimeTearDown() {
		// one-time cleanup code
		System.out.println("oneTimeTearDown()");
	}

	@Before
	public void setUp() {
		collection = new ArrayList();
		System.out.println("Enter setUp()");
	}

	@After
	public void tearDown() {
		collection.clear();
		System.out.println("Enter tearDown() ");
	}

	@Test
	public void testEmptyCollection() {
		assertTrue(collection.isEmpty());
		System.out.println("Enter testEmptyCollection()");
	}

	@Test
	public void testOneItemCollection() {
		collection.add("itemA");
		collection.add("markonda");
		assertEquals(2, collection.size());
		System.out.println("Enter testOneItemCollection()");
	}
}