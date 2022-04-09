package algorithmcomparison;

public class Bubblesort {
    static void bubblesort(int[] array){
        int len = array.length;
        int memory = 0;

        //Loop
        for (int a=0; a < len; a++){
            for(int i=1; i < (len-1); i++){
                //If the element in the smaller index is greater, the elements switch places
                if(array[i-1] > array[i]){
                    //Memorize the greater value
                    memory = array[i-1];
                    //Put the smaller element in the smaller index
                    array[i-1] = array[i];
                    //Insert the greater value to its new index from the memory-variable
                    array[i] = memory;
                }
            }
        }
        //If last element is smaller than the second last one
        //TEMPORARY SOLUTION
        if(array[len-2] > array[len-1]){
            memory = array[len-2];
            //Put the smaller element in the smaller index
            array[len-2] = array[len-1];
            //Insert the greater value to its new index from the memory-variable
            array[len-1] = memory;
        }
    }
}