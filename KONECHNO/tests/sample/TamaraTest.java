package sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class TamaraTest {

	@Test
	public void testEqual() {
		
		assertTrue(Tamara.equal(new int[]{}, new int[]{}));
		assertTrue(Tamara.equal(new int[]{0}, new int[]{0}));
		assertTrue(Tamara.equal(new int[]{1,2,3}, new int[]{1,2,3}));
		assertTrue(Tamara.equal(new int[]{8,11,35,4}, new int[]{8,11,35,4}));
		
		assertFalse(Tamara.equal(new int[]{}, new int[]{0}));
		assertFalse(Tamara.equal(new int[]{2}, new int[]{2,2}));
		assertFalse(Tamara.equal(new int[]{1,2,3}, new int[]{3,2,1}));

		
		
	}
	

}
