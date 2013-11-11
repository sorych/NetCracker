package netcrackerLab1SorychDmytro;

/**
 * 
 * Selection sort algorithm class
 * 
 * {@link http://en.wikipedia.org/wiki/Selection_sort}
 * 
 * @author Dmytro Sorych
 * 
 */


public class SelectionSort implements SortAlgorithm {

	@Override
	public void sort(int[] array) {
		int min;
		for (int i=0; i< array.length-1; i++) {
			min=i;
			for (int j=i+1; j<array.length; j++)
				if(array[j] < array[min])
					min=j;
			if(min!=i) {
				int temp=array[i];
				array[i]=array[min];
				array[min]=temp;
			}
		}

	}
	
	@Override
	public String toString(){
		return "SelectionSort";
	}

}

