package algorithmcomparison;

/**
 * Quicksort
 */
public class Quicksort {
	
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
        
        //Return the sorted array
        return array;
    }
}
