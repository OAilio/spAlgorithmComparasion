package algorithmcomparison;

/**
 * Quicksort
 */
public class Quicksort implements Runnable {
	private int arr[];
	public Quicksort(int[] dataset) {
		this.arr = dataset;
	}

	public void run() {
		long start = System.nanoTime();
		System.out.println("Running a quicksort thread...");
		quickSort(arr);
		long end = System.nanoTime();
		int unit = -9;
		while (end - start > 1000) {
			start = start / 1000;
			end = end / 1000;
			unit = unit + 3;
		}
		System.out.println("Quicksort complete in " + (end - start) + "*10^" + unit + " seconds");
	}
    
    /**
     * Sorts the dataset using quicksort
     * 
     * @param arr The unsorted dataset
     * 
     * @return arr
     */
    public static int[] quickSort(int[] arr) {
        //Clones the array
        int[] array = arr.clone();
        
        int low = 0;
        int high = array.length -1;

        sort(arr,low,high);
        return arr;
    }   
    /**
     * sorts the cloned dataset
     * 
     * @param array 
     * @param low
     * @param high
     */
    static void sort(int array[], int low, int high ){
        //Determine the pivot value in the middle of the array
        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        int i = low, j = high;
        while (i <= j) {

            //if index i is greater than the pivot, increase i's value
            while (array[i] < pivot) {
                i++;
            }

            //if index j is greater than the pivot value, increase j's value
            while (array[j] > pivot) {
                j--;
            }
            
            if (i <= j) {
                //Memorize the greater value
                int memory = array[i];
                //Put the smaller element in the smaller index
                array[i] = array[j];
                //Insert the greater value to its new index from the memory
                array[j] = memory;

                //Raise i's value
                i++;
                //Decrease j's value
                j--;
            }
        }

        if (low < j)
                sort(array,low,j);
        if (high > i)
                sort(array,i,high);
    }
}
