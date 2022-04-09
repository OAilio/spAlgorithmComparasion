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
    }
}