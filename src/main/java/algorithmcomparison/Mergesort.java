package algorithmcomparison;

/**
 * Mergesort
 */
public class Mergesort implements Runnable {
	private int arr[];
	public Mergesort(int[] dataset) {
		this.arr = dataset;
	}

	public void run() {
		long start = System.nanoTime();
		System.out.println("Running a mergesort thread...");
		mergesort(arr);
		long end = System.nanoTime();
		System.out.println("Mergesort complete in " + (end - start) + " nanoseconds");
	}
	
	/**
	 * Runs the mergesort
	 * 
	 * @param arr The unsorted array
	 * 
	 * @return sorted
	 */
	public static int[] mergesort(int[] arr) {
		//Clone array
		int[] sorted = arr.clone();
		
		//Call the sort method
		sort(sorted, 0, sorted.length - 1);
		
		return sorted;
		
	}
	
	/**
	 * Merges the arrays
	 * 
	 * @param arr, start, middle, end
	 */
	static void merge(int[] arr, int start, int middle, int end) {
		//Find the sizes of the subarrays
		int n1 = middle - start + 1;
		int n2 = end - middle;
		
		//Left and Right temp arrays
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		//Copy data to temp arrays
		for(int i = 0; i < n1; i++) {
			left[i] = arr[start+i];
		}
		for(int i = 0; i < n2; i++) {
			right[i] = arr[middle+1+i];
		}
		
		int i = 0, j = 0, k = start;
		
		//Merge temp arrays
		while(i < n1 && j < n2) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			
			k++;
		}
		
		//Copy the remaining elements of left[] and right[]
		while(i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	
	/**
	 * Sorts the arrays
	 * 
	 * @param arr, start, end
	 */
	static void sort(int[] arr, int start, int end) {
		if(start < end) {
			int middle = start + (end - start)/2;
			
			//Sort the first and the second halves
			sort(arr, start, middle);
			sort(arr, middle + 1, end);
			
			//Merge the sorted halves
			merge(arr, start, middle, end);
		}
	}
}
