package netcrackerLab1SorychDmytro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

/**
 * This class is used to give an interface to user, where he can choose what should program do
 * 
 * @author Dmytro Sorych
 * 
 * @see compareAlgorithms
 * 
 * @see prepareDataForExcel
 *
 */

public class Lab1 {

	public static void main(String[] args) {

		System.out
				.println("This is a sort algorithms comparison program developed by Dmitry Sorych\n");

		while (true) {
			System.out
					.println("*******************************\n\nPlease switch the option\n"
							+ "1. Compare different algorithms\n" + "2. Create a data for Excel\n" + "3. Exit\n");
			try {
				char a = (char) new BufferedReader(new InputStreamReader(
						System.in)).read();
				switch (a) {
				case '1':
					compareAlgorithms();
					break;
				case '2':
					prepareDataForExcel();
					break;
				case '3':
					System.out.println("This application is over, Thank you");
					System.exit(0);
				default:
					System.out.println("you switched a wrong option, try again");
				}
			} catch (Exception e) {
				System.out.println("Some exception appeared\n" + e); // TODO some handling
			}

		}
		
	}
	
	
	/**
	 * is used to prepare data, which you can put to excel file and draw graphics
	 * 
	 * @author Dmytro Sorych
	 * 
	 * @see generateDataForExcel
	 * 
	 */

	private static void prepareDataForExcel() {
		List<SortAlgorithm> algorithmList = new ArrayList<SortAlgorithm>();
		algorithmList.add(new BubbleSort());
		algorithmList.add(new AdvancedBubbleSort());
		algorithmList.add(new SelectionSort());
		algorithmList.add(new MergeSort());
		algorithmList.add(new QuickSort());
		algorithmList.add(new StandardSort());
		
		for (int j = 1; j < 5; j++) { //TODO change to 5
			ArrayGenerator ag = ArrayGeneratorFactory.getArrayGenerator(j);
			generateDataForExcel(algorithmList, ag);
			
		}
		
		
				
	}
	
	/**
	 * is used to print data to console in special view for export to excel file
	 * 
	 * @author Dmytro Sorych
	 * 
	 * @param algorithmList
	 * List of sort algorithms to be tested
	 * 
	 * @param ag
	 * ArrayGenerator that is used to generate array for this test
	 * 
	 * @see testAlgorithm
	 */

	private static void generateDataForExcel(List<SortAlgorithm> algorithmList,	ArrayGenerator ag) {
		int size = 10;
		System.out.print("SIZE\t");
		for (SortAlgorithm algorithm : algorithmList)
			System.out.print(algorithm+"\t");
		System.out.println("\n");
		
		for (int i = 1; i < 20; i++) {
			System.out.print(size+"\t");
			int[] testArray=ag.generateArray(size);
			int[] testedArrayCopy = new int[size];
			for (SortAlgorithm algorithm : algorithmList) {
				System.arraycopy(testArray, 0, testedArrayCopy, 0,	testArray.length);
				System.out.print(testAlgorithm(algorithm, testedArrayCopy)+"\t");
			}
			System.out.println();
			
			size+=500;
		}
		
		System.out.println("\n");
		
	}
	
	
	/**
	 *is used to prepare a comparative information between a list of algorithms
	 * 
	 * @author Dmytro Sorych
	 * 
	 * @see createComparativeInformation
	 */

	private static void compareAlgorithms() {
		List<SortAlgorithm> algorithmList = new ArrayList<SortAlgorithm>();
		algorithmList.add(new BubbleSort());
		algorithmList.add(new AdvancedBubbleSort());
		algorithmList.add(new SelectionSort());
		algorithmList.add(new MergeSort());
		algorithmList.add(new QuickSort());
		algorithmList.add(new StandardSort());
		
		for (int j = 1; j < 4; j++) {
			System.out.println("For "+Math.pow(10, j)+ " elements in array");
			for (int i = 1; i < 5; i++) {
				ArrayGenerator ag = ArrayGeneratorFactory.getArrayGenerator(i);
				int[] testArray = ag.generateArray((int) Math.pow(10, j));
				System.out.println("RESULT TABLE FOR " + ag
						+ " array generator");
				createComparativeInformation(algorithmList, testArray);
				System.out.println("\n");

			}
		}
		
	}
	
	/**
	 * creates a result of sort algorithms comparison for the same test array and shows it on console
	 * 
	 * @author Dmytro Sorych
	 * @param algorithmList
	 * the list of algorithms to be tested
	 * @param testArray
	 * the array to be sorted by different algorithms
	 * 
	 * @see testAlgorithm
	 */

	private static void createComparativeInformation(List<SortAlgorithm> algorithmList, int[] testArray) {
		Map<String, Long> resultMap=new HashMap<String, Long>();
		int[] testedArrayCopy = new int[testArray.length];
		for (SortAlgorithm algorithm : algorithmList) {
			System.arraycopy(testArray, 0, testedArrayCopy, 0, testArray.length);
			resultMap.put(algorithm.toString(), testAlgorithm(algorithm, testedArrayCopy));
		}
		
		for(Entry<String, Long> mapentry : resultMap.entrySet()){
			System.out.println(mapentry.getKey()+" result is\t "+mapentry.getValue());
				
		}
		
		LinkedList<Entry<String, Long>> templist = sortByValue(resultMap);
		System.out.println("The fastest was "+ templist.getFirst().getKey()+" with result "+templist.getFirst().getValue());
		System.out.println("The slowest was "+ templist.getLast().getKey()+" with result "+templist.getLast().getValue());
	}
	
	/**
	 * tests how long it takes the algorithm to sort a test array
	 * 
	 * @author Dmytro Sorych 
	 * @param algorithm
	 * sort algorithm to be tested
	 * @param testArray
	 * test array to be sorted
	 * @return time of sort operation in nanoseconds 
	 */

	
	private static long testAlgorithm(SortAlgorithm algorithm, int[] testArray) {
		long start=System.nanoTime();
		algorithm.sort(testArray);
		long result=System.nanoTime();
		return result-start;
	}
	
	/**
	 * sorts a specific map by it's values
	 * 
	 * @param map
	 * map to be sorted
	 * @return
	 * a LinkedList of Map Entries that are sorted by values
	 * 
	 * @author Dmytro Sorych
	 */
	
	private static LinkedList<Entry<String, Long>> sortByValue(Map<String, Long> map) {
		LinkedList<Entry<String, Long>> list = new LinkedList<Map.Entry<String, Long>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Long>>() {
			public int compare(Map.Entry<String, Long> m1,	Map.Entry<String, Long> m2) {
				return (m1.getValue()).compareTo(m2.getValue());
			}
		});

		return list;
	}

}
