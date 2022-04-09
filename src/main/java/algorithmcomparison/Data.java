package algorithmcomparison;

import java.util.Random;

public class Data {
	
	// Class where a random data set is created
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
