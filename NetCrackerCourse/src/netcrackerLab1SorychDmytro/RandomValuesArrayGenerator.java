package netcrackerLab1SorychDmytro;

import java.util.Random;

/**
 * this class is used to generate an array of random ints
 * 
 * @author Dmytro Sorych
 * 
 * 
 *
 */

public class RandomValuesArrayGenerator extends ArrayGenerator {
	@Override
	public int[] generateArray(int size) {
		Random random = new Random();
		
		int[] result = new int[size];
		
		for (int i=0; i<result.length; i++)
			result[i]=random.nextInt();
		
		return result;
		
	}
	
	@Override
	public String toString(){
		return "Random Values";
	}


}
