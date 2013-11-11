package netcrackerLab1SorychDmytro;

/**
 * this class is used to generate an array of sorted ints, like [1,2,3,...29,30]
 * 
 * @author Dmytro Sorych
 * 
 * 
 */

public class SortedValuesArrayGenerator extends ArrayGenerator {

	@Override
	public int[] generateArray(int size) {
		int[] result = new int[size];
		
		for (int i=0; i<result.length; i++)
			result[i]=i;
		
		return result;
	}
	
	@Override
	public String toString(){
		return "Sorted Values";
	}


}
