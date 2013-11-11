package netcrackerLab1SorychDmytro;

import java.util.Random;

/**
 * this class is used to generate an array of sorted ints and last random one, like [1,2,3,...99,100,85]
 * 
 * @author Dmytro Sorych
 * 
 * 
 *
 */

public class SortedWithLastRandomArrayGenerator extends ArrayGenerator {

	@Override
	public int[] generateArray(int size) {
		Random random = new Random();
		int[] result = new int[size];
		
		for (int i=0; i<result.length-1; i++)
			result[i]=i;
		
		result[result.length-1]=random.nextInt(result.length-2);
		
		return result;
	}
	
	@Override
	public String toString(){
		return "Sorted+Last Random";
	}


}
