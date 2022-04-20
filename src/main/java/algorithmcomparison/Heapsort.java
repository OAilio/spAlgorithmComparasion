package algorithmcomparison;

import java.util.Date;

/**
 * Heapsort
 */
public class Heapsort implements Runnable {
	// Class where data is sorted with heap sort
	private int dataset[];
	public Heapsort(int[] dataset) {
		this.dataset = dataset;
	}

	public void run() {
		long start = System.nanoTime();
		System.out.println("Running a heapsort thread...");
		sort(dataset);
		long end = System.nanoTime();
		System.out.println("Heapsort complete in " + (end - start) + " nanoseconds");
	}
	
	/**
	 * Sorts the data with heap sort
	 * 
	 * @param data The unsorted data
	 * 
	 * @return arr
	 */
	public static int[] sort(int dataset[]) {
		// Clone the array
		int arr[] = dataset.clone();
 
        // Build heap (rearrange array)
        for (int i = arr.length / 2 - 1; i >= 0; i--)
            heapify(arr, arr.length, i);
 
        // One by one extract an element from heap
        for (int i = arr.length - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
        
        return arr;
    }
	
	/**
	 * Builds a heap from array
	 */
	public static void heapify(int arr[], int n, int i)
    {
        int biggest = i; // Initialize biggest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (left < n && arr[left] > arr[biggest])
            biggest = left;
 
        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[biggest])
            biggest = right;
 
        // If largest is not root
        if (biggest != i) {
            int swap = arr[i];
            arr[i] = arr[biggest];
            arr[biggest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, n, biggest);
        }
    }

}
