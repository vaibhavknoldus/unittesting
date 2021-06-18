package test2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Assert {
	
	@Test
	public void testAssertions() {
		String str1 = "my name";
		String str2 = "my name";
		String str3 = null;
		int val1 = 5;
		int val2 = 6;
		String[] expectedArray = {"one", "two"};
		String[] resultArray = {"one", "two"};
		
		assertEquals(str1, str2);
		assertTrue(val1<val2);
		assertFalse(val2<val1);
		assertNotNull(str2);
		assertNull(str3);
		assertSame(str1, str2);
		assertNotSame(val1,val2);
		assertArrayEquals(expectedArray,resultArray);
		
	}

}
