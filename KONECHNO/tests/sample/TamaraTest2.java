package sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class TamaraTest2 {

	@Test
	public void testScalarMultiplication() {
		
		assertEquals(0,Tamara.scalarMultiplication(new int[]{0}, new int[]{0}));
		assertEquals(0,Tamara.scalarMultiplication(new int[]{0}, new int[]{3}));
		assertEquals(5,Tamara.scalarMultiplication(new int[]{1,2}, new int[]{1,2}));
		assertEquals(12,Tamara.scalarMultiplication(new int[]{3,2}, new int[]{2,3}));
		assertEquals(12,Tamara.scalarMultiplication(new int[]{-3,2}, new int[]{-2,3}));
		assertEquals(20,Tamara.scalarMultiplication(new int[]{4,-2}, new int[]{4,-2}));
		
		
		
	}

}
