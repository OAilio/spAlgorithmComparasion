package algorithmcomparison;

/**
 * Insertionsort
 */
public class Insertionsort {
	/**
	 * Sorts the given dataset using insertion sort
	 * 
	 * @param arr  The unsorted dataset
	 * 
	 * @return sorted  The sorted dataset
	 */
	public static int[] insertionsort(int[] arr) {
		//Clone array
		int[] sorted = arr.clone();
		
		int n = sorted.length;
		
		for(int i = 1; i < n; i++) {
			int key = sorted[i];
			int j = i - 1;
			
			//Compares key with each element on the left until smaller is found
			while(j >= 0 && sorted[j] > key) {
				sorted[j+1] = sorted[j];
				j = j - 1;
			}
			
			//Places key after the element smaller than it
			sorted[j+1] = key;
		}
		
		return sorted;
	}
}
