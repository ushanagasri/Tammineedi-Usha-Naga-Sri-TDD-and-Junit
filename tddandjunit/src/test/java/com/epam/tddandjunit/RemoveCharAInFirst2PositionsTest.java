package com.epam.tddandjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveCharAInFirst2PositionsTest {
  /*
   * To DO List
   * 1.one A in 1 position : “ABCD” => “BCD” ----> Success
   * 2.Two A's in first 2 positions  : “AACD” => “CD”  ----> Success
   * 3.1 A in second position : “BACD” => “BCD” ----> Success
   * 4.No A in first 2 positions : “BBAA” => “BBAA”  ----> Success
   * 5.Two A's in first 2 positions and other positions also :  “AABAA” => “BAA”  ----> Success
   * 6.Empty String : "" => ""    ----> Success
   * 7.Only 2 A's : "AA"=>"" ----> Success
   * 8. Only 1 A : "A" => "" ---->Success
   */
	RemoveCharAInFirst2Positions removecharAinfirst2positions;
	@BeforeEach
	void setUp() {
		removecharAinfirst2positions=new RemoveCharAInFirst2Positions();
	}
	@Test
	void test1Aat1position() {
		assertEquals(removecharAinfirst2positions.remove("ABCD"),"BCD");
	}
	@Test
	void testAatfirst2positions() {
		assertEquals(removecharAinfirst2positions.remove("AACD"),"CD");
		}
	@Test
	void test1Aat2position() {
		assertEquals(removecharAinfirst2positions.remove("BACD"),"BCD");
		}
	@Test
	void testAnotatfirst2positions() {
		assertEquals(removecharAinfirst2positions.remove("BBAA"),"BBAA");
		}
	@Test
	void testAatfirst2positionsandotherpositons() {
		assertEquals(removecharAinfirst2positions.remove("AABAA"),"BAA");
		}
	@Test
	void testAatfirst2positionsinEmptyString() {
		assertEquals(removecharAinfirst2positions.remove(""),"");
		}
	@Test
	void test1A() {
		assertEquals(removecharAinfirst2positions.remove("A"),"");
		}
	@Test
	void test2A() {
		assertEquals(removecharAinfirst2positions.remove("AA"),"");
		}

}
