package top.sde.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxLenWordTest {

	@Test
	public void testMatchLine1() {
		
		assertEquals((long)MaxLenWord.matchLine(null).getLength(), 0l);
	}
	
	@Test
	public void testMatchLine2() {

		String line = "Please input someword here";
		String expect = "someword";
		assertEquals(MaxLenWord.matchLine(line).getWord(), expect);
		assertEquals(MaxLenWord.matchLine(line).getLength(), expect.length());

	}
	
	@Test
	public void testMatchLine3() {
		
		String line = "Please abcdefgh someword here";
		String expect = "abcdefgh";
		assertEquals(MaxLenWord.matchLine(line).getWord(), expect);
		assertEquals(MaxLenWord.matchLine(line).getLength(), expect.length());
	}
	
	@Test
	public void testMatchLine4() {
		
		String line = "What's your name? My name is 'Peters'";
		String expect = "Peters";
		assertEquals(MaxLenWord.matchLine(line).getWord(), expect);
		assertEquals(MaxLenWord.matchLine(line).getLength(), expect.length());
	}
	
	@Test
	public void testMatchLine5() {
		
		String line = "你叫什么名字？‘汤姆’";
		String expect = "你叫什么名字";
		assertEquals(MaxLenWord.matchLine(line).getWord(), expect);
		assertEquals(MaxLenWord.matchLine(line).getLength(), expect.length());
	}

}
