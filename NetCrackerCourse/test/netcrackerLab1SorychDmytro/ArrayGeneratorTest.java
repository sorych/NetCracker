package netcrackerLab1SorychDmytro;

import static org.junit.Assert.*;

/**
 * This class uses JUnit tests to test that ArrayGenerators generate correct arrays
 * 
 * @author Dmytro Sorych
 */

import java.util.Arrays;
import java.util.Collections;

import netcrackerLab1SorychDmytro.RandomValuesArrayGenerator;
import netcrackerLab1SorychDmytro.ReverseOrderArrayGenerator;
import netcrackerLab1SorychDmytro.SortedValuesArrayGenerator;

import org.junit.Test;

public class ArrayGeneratorTest {
	
	
	/**
	 * this test generate random array and than checks if it is not sorted
	 * 
	 * @see RandomValuesArrayGenerator
	 * 
	 */
	@Test
	public void randomArrayGeneratorTest() {
		// Given
		int[] a;

		// When
		a = new RandomValuesArrayGenerator().generateArray();
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		Arrays.sort(b);

		// Then
		assertFalse(Arrays.equals(a, b));
	}
	
	/**
	 * this test generate sorted array and than checks is it really sorted
	 * 
	 * @see SortedValuesArrayGenerator
	 * 
	 */

	@Test
	public void sortedArrayGeneratorTest() {
		// Given
		int[] a = new SortedValuesArrayGenerator().generateArray();
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);

		// When
		Arrays.sort(b);

		// Then
		assertArrayEquals(a, b);
	}
	
	/**
	 * this test generate reverse order array and than checks is it really reverse order by sorting a copy of this 
	 * array with standard sort algorithm 
	 * 
	 * @see ReverseOrderArrayGenerator
	 * 
	 */

	@Test
	public void reverseOrderArrayGeneratorTest() {
		// Given
		int[] a = new ReverseOrderArrayGenerator().generateArray();
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);

		// When
		Integer[] c = new Integer[b.length];
		for (int i = 0; i < c.length; i++)
			c[i] = new Integer(b[i]);
		Arrays.sort(c, Collections.reverseOrder());
		for (int i = 0; i < c.length; i++)
			b[i] = c[i].intValue();

		// Then
		assertArrayEquals(a, b);
	}

}
