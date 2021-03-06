package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import manchesterEncoding.ManchesterEncoding;

class MachesterEncodingTests {

	@Test
	void test0() {
		ManchesterEncoding me = new ManchesterEncoding("000101011111",false);
		me.Execute();
		assertEquals(me.getOutput().getTapeRemovedBlank(),"010101100110011010101010");
		assertEquals(me.getInput().getTapeRemovedBlank(),"000101011111");
	}

	@Test
	void test1() {
		ManchesterEncoding me = new ManchesterEncoding("10100111001",false);
		me.Execute();
		assertEquals(me.getOutput().getTapeRemovedBlank(),"1001100101101010010110");
		assertEquals(me.getInput().getTapeRemovedBlank(),"10100111001");
	}
	
	@Test
	void test2() {
		ManchesterEncoding me = new ManchesterEncoding("10100111001",true);
		me.Execute();
		assertEquals(me.getOutput().getTapeRemovedBlank(),"0110011010010101101001");
		assertEquals(me.getInput().getTapeRemovedBlank(),"10100111001");
	}
}
