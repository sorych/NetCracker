package netcrackerLab1SorychDmytro;

/**
 * class of advanced bubble sort algorithm, where algorithm stops if there were no substitutions while last iteration
 * 
 * @author Dmytro Sorych
 *
 */

public class AdvancedBubbleSort implements SortAlgorithm {

	@Override
	public void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			boolean swap = false;
			for (int j = 0; j < array.length - i-1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
					swap = true;
				}
			}
			if (!swap)
				break;
		}

	}
	
	@Override
	public String toString(){
		return "AdvancedBubbleSort";
	}

}
