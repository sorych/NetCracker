package netcrackerLab1SorychDmytro;

/**
* Class with a factory method to return different ArrayGenerator depends on parameter 
*
* @author Dmytro Sorych
* 
*/


public class ArrayGeneratorFactory {
	
	/**
	* factory method to get an ArrayGenerator
	* 
	* @param parameter key to choose what ArrayGenerator should be returned 
	* 
	* @return ArrayGenerator 
	* 
	* @throws IllegalArgumentException if wrong parameter was given
	*     
	*/
	public static ArrayGenerator getArrayGenerator(int parameter) {
		switch (parameter) {
		case 1:
			return new SortedValuesArrayGenerator();
		case 2:
			return new SortedWithLastRandomArrayGenerator();
		case 3:
			return new ReverseOrderArrayGenerator();
		case 4:
			return new RandomValuesArrayGenerator();
			
		default:
			throw new IllegalArgumentException("an illegal argument in factory method");

		}

	}

}
