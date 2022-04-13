package algorithmcomparison;

import net.jqwik.api.*;

import java.util.Arrays;


public class MergesortTests {
	/**
	 *Tests if mergesort sorts the dataset correctly 
	 * 
	 * @param arr  The given test array
	 * 
	 * @return True if sorts correctly, otherwise returns false
	 */
	@Property
	boolean must_sort_correctly(@ForAll("array") Integer[]  arr) {
		
		int[] intArray = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
		
		int[] sorted = Mergesort.mergesort(intArray);
		Arrays.sort(intArray);
		return Arrays.equals(intArray, sorted);
	}
	
	/**
	 *Generates the test dataset
	 *
	 *@return The test dataset
	 */
	@Provide
	Arbitrary<Integer[]> array() {
		Arbitrary<Integer> integerArbitrary = Arbitraries.integers().between(1, 100);
	    return integerArbitrary.array(Integer[].class).ofSize(100);
	}
}
