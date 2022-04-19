package algorithmcomparison;

import java.util.Random;

/**
 * Generates the dataset
 */
public class Data {
	
	/**
	 * Creates random dataset
	 * 
	 * @param size The size of the dataset
	 * 
	 * @return dataSet
	 */
	public static int[] createData(double size) {
		int[] dataSet = new int[(int) size];
		
		for (int i = 0; i < size; i++) {
			Random r = new Random();
			int low = 0;
			int high = (int) size;
			int result = r.nextInt(high-low) + low;
			dataSet[i] = result;
		}
		
		return dataSet;
	}

}
