package netcrackerLab1SorychDmytro;

import java.util.Random;

/**
 * abstract class for different array generators
 * 
 * @author Dmytro Sorych
 *
 */

abstract class ArrayGenerator {
	
	/**
	 * default array generate method 
	 * 
	 * @return a random size array of ints
	 */
	int[] generateArray() {
		Random random = new Random();
		return generateArray(random.nextInt(100000) + 1);	//to get an array with length>0
	}
	
	/**
	 * abstract method to generate a set size array of ints
	 * 
	 * @param size
	 * the size of array
	 * @return
	 * an array of ints with set size
	 */

	abstract int[] generateArray(int size);

}
