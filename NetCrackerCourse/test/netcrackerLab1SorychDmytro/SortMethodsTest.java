package netcrackerLab1SorychDmytro;

import static org.junit.Assert.*;

import java.util.Arrays;

import netcrackerLab1SorychDmytro.AdvancedBubbleSort;
import netcrackerLab1SorychDmytro.BubbleSort;
import netcrackerLab1SorychDmytro.MergeSort;
import netcrackerLab1SorychDmytro.QuickSort;
import netcrackerLab1SorychDmytro.RandomValuesArrayGenerator;
import netcrackerLab1SorychDmytro.SelectionSort;

import org.junit.Test;

/**
 * this class is used to test different sort algorithm classes
 * tests here compare a result of standard Java sort method and our custom methods
 * 
 * @author Dmytro Sorych
 *
 */

public class SortMethodsTest {

	@Test
	public void advancedBubbleSortTest() {

		// Given
		int[] a = new RandomValuesArrayGenerator().generateArray();
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		
		// When
		new AdvancedBubbleSort().sort(a);
		Arrays.sort(b);
		
		// Then
		assertArrayEquals(a, b);
	}

	
	@Test
	public void bubbleSortTest() {

		// Given
		int[] a = new RandomValuesArrayGenerator().generateArray();
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		
		// When
		new BubbleSort().sort(a);
		Arrays.sort(b);
		
		// Then
		assertArrayEquals(a, b);
	}
	
	
	@Test
	public void selectionSortTest() {

		// Given
		int[] a = new RandomValuesArrayGenerator().generateArray();
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		
		// When
		new SelectionSort().sort(a);
		Arrays.sort(b);
		
		// Then
		assertArrayEquals(a, b);
	}
	
	@Test
	public void mergeSortTest() {

		// Given
		int[] a = new RandomValuesArrayGenerator().generateArray();
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		
		// When
		new MergeSort().sort(a);
		Arrays.sort(b);
		
		// Then
		assertArrayEquals(a, b);
	}
	
	
	@Test
	public void quickSortTest() {

		// Given
		int[] a = new RandomValuesArrayGenerator().generateArray();
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		
		// When
		new QuickSort().sort(a);
		Arrays.sort(b);
		
		// Then
		assertArrayEquals(a, b);
	}

	
}
