package netcrackerLab1SorychDmytro;

/**
 * simple Bubble sort class
 * 
 * {@link http://en.wikipedia.org/wiki/Bubble_sort}
 * 
 * @author Dmytro Sorych
 * 
 *
 */

public class BubbleSort implements SortAlgorithm {

	@Override
	public void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i-1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
			
		}

	}
	
	@Override
	public String toString(){
		return "BubbleSort";
	}

}
