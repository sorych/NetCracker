package netcrackerLab1SorychDmytro;

import java.util.Arrays;

/**
 * 
 * Standard Java sort algorithm class
 * 
 * @see Arrays.sort
 * 
 * @author Dmytro Sorych
 * 
 */

public class StandardSort implements SortAlgorithm {

	@Override
	public void sort(int[] array) {
		Arrays.sort(array);

	}
	
	@Override
	public String toString(){
		return "StandardSort";
	}

}
