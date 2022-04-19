package algorithmcomparison;

/**
 * Bubblesort
 */
public class Bubblesort {
	/**
	 * Sorts the dataset using bubblesort
	 * 
	 *  @param arr The unsorted dataset
	 *  
	 *  @return array
	 */
    static int[] bubblesort(int[] arr){
    	//Clones the array
    	int[] array = arr.clone();
    	
        int len = array.length;

        //Loop
        for (int a=0; a < len -1; a++){
            for(int i=0; i < (len-a-1); i++){
                //If the element in the smaller index is greater, the elements switch places
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        
        return array;
    }
}