package algorithmcomparison;

import net.jqwik.api.*;

import java.util.Arrays;

public class InsertionsortTests {
	@Property
	boolean must_sort_correctly(@ForAll("array") Integer[]  arr) {
		
		int[] intArray = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
		
		int[] sorted = Insertionsort.insertionsort(intArray);
		Arrays.sort(intArray);
		return Arrays.equals(intArray, sorted);
	}
	
	@Provide
	Arbitrary<Integer[]> array() {
		Arbitrary<Integer> integerArbitrary = Arbitraries.integers().between(1, 100);
	    return integerArbitrary.array(Integer[].class).ofSize(10);
	}
}
