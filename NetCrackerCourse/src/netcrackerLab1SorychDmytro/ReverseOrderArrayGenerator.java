package netcrackerLab1SorychDmytro;

/**
 * this class is used to generate an array of reverse order ints, like [10,9,8...1]
 * 
 * @author Dmytro Sorych
 * 
 * 
 *
 */

public class ReverseOrderArrayGenerator extends ArrayGenerator {

	@Override
	public int[] generateArray(int size) {
		int[] result = new int[size];
		
		for (int i=0; i<result.length; i++)
			result[i]=result.length-i;
		
		return result;
	}
	
	@Override
	public String toString(){
		return "Reverse Order";
	}



}
